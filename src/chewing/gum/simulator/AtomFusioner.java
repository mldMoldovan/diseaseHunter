
package chewing.gum.simulator;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;




public class AtomFusioner extends GameObject{
    
    private Handler handler;
    private GameObject fusionCore;
    public boolean fusionReady = false;
    private int fuseTimer = 1000;
    private int animTimer = 1000;
    private int OnTimer = 1000;
    private int lastTimer = 2000;
    private Color col = new Color(127,255,212);
    private float CenterX = 0;
    private float CenterY = 0;
    
    public AtomFusioner(float x, float y, ID id, Handler handler){
        super(x,y,id);
        this.handler = handler;
        
        
        for(int i=0;i<handler.object.size();i++)
        {if(handler.object.get(i).getId() == ID.fusionCenter)
            fusionCore = handler.object.get(i);
            
        }
        
        
        
        
    }
    public Rectangle getBounds(){
        return new Rectangle((int)x,(int)y,12,12);
    }
    
    public void tick(){
        
        
        if(fuseTimer>0)
        {fuseTimer--;}
        
        if(animTimer>0)
        {animTimer--;}
        if(animTimer==0){
            animTimer=1000;
        }
        if(fusionReady==true){
            if(OnTimer>0){
                    OnTimer--;
                }
            if(lastTimer>0)
            {
                lastTimer--;
            }
            
            
            
            
            if(this.getId()==ID.fusionOngoing){
                if(lastTimer>0){
                if(OnTimer==0 && animTimer%5==0){
                    handler.addObject(new ParticleDisengage((int)x+10,(int)y+10,ID.ParticleDisengage,handler));
                }
                
                } 
                
                if(lastTimer==0){
                handler.removeObject(this);
                
                }
            }
        }
        if(fusionReady==false){
        x+=velX;
        y+=velY;
        if(ChewingGumSimulator.paused==false){
            if(this.getId()==ID.AtomFusioner){
        float diffX = x - ChewingGumSimulator.WIDTH/2 - 8;
        float diffY = y - ChewingGumSimulator.HEIGHT/2 - 8;
        double distance = Math.sqrt((x-ChewingGumSimulator.WIDTH/2)*(x-ChewingGumSimulator.WIDTH/2)+(y-ChewingGumSimulator.HEIGHT/2)*(y-ChewingGumSimulator.HEIGHT/2));
        
        velX=(float)(-1.0/distance)*diffX;
        velY=(float)(-1.0/distance)*diffY;}
        for(int k=0;k<handler.object.size();k++){
            
            GameObject tempObject = handler.object.get(k);
         
        if(fuseTimer==0 && tempObject.getId()==ID.AtomFusioner)
        {   
                handler.removeObject(tempObject);
                fusionReady=true;
            
        }
        
                
                    
        if(tempObject.getId()==ID.fusionCenter){
                        
                        handler.addObject(new AtomFusioner(ChewingGumSimulator.WIDTH/2,tempObject.getY(),ID.fusionOngoing,handler));
                        handler.removeObject(tempObject);
                    }
                
                
                    
                
            
        }
        }}
        else if(ChewingGumSimulator.paused==true){
        velX=0;
        velY=0;}
        
        if(y<= 0 || y >= ChewingGumSimulator.HEIGHT-20) velY *= -1;
        if(x<= 0 || x >= ChewingGumSimulator.WIDTH-18) velX *= -1;
        
        handler.addObject( new Trail(x,y,ID.Trail,col,5,5,0.02f,handler));
        collision();
    }
    
    
    private void collision(){
        for(int i=0;i < handler.object.size(); i++){
            GameObject tempObject = handler.object.get(i);
            
        if(tempObject.getId() == ID.PlayerRocket || tempObject.getId() == ID.PlayerRocketH)
        {
            if(getBounds().intersects(tempObject.getBounds()))
            {
                
                handler.removeObject(this);
        }
        
        
        
        
        }
        
        
        if(tempObject.getId() == ID.ParticleDisengage2)
        {
            if(getBounds().intersects(tempObject.getBounds()))
            {
                
                handler.removeObject(this);
        }
        
        
        
        
        }
        
        if(tempObject.getId() == ID.PlayerLightning)
        {
            if(getBounds().intersects(tempObject.getBounds()))
            {
                
                handler.removeObject(this);
        }
        
        
        
        
        }
        
        
    }}
    
    public void render(Graphics g){
        if(this.getId()==ID.AtomFusioner){
        g.setColor(col);
        g.fillRect((int)x,(int)y,5,5);}
        if(this.getId()==ID.fusionCenter){
            g.setColor(Color.red);
        g.fillRect((int)x,(int)y,1,1);
        }
        
        if(this.getId()==ID.fusionOngoing){
            if(animTimer%3==0){
            g.setColor(Color.orange);
        g.fillRect((int)x,(int)y,20,20);}
            else if(animTimer%3==1){
            g.setColor(Color.red);
        g.fillRect((int)x,(int)y,20,20);}
            else if(animTimer%3==2){
            g.setColor(Color.yellow);
        g.fillRect((int)x,(int)y,20,20);}
        
        
        }
    }
    
    
    
    
    
    
}
