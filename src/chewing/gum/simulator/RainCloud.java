
package chewing.gum.simulator;

import java.awt.AlphaComposite;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.Color;
import java.awt.Graphics2D;
import java.util.Random;


public class RainCloud extends GameObject{
    
    private Handler handler;
    
    Random r = new Random();
    
    private int snowtimer=65;
    
    private int snowtimer2 = 50;
    static int BossHealth = 100;
    float alpha = 0.5f;
    
    
    
    
    public RainCloud(float x, float y, ID id, Handler handler){
        super(x,y,id);
        this.handler = handler;
        
        
        velX = 0;
        velY = 1;
    }
    
    
    public void tick(){
        x+=velX;
        y+=velY;
        
        
        if(snowtimer <= 0) velY = 0;
        else
            snowtimer--;
      
        if(snowtimer <= 0) snowtimer2--;
        if(snowtimer2 <= 0) {
            if(velX==0) {velX = 5;}
            
            int spawn = r.nextInt(10);
            if(spawn == 0) 
                if(velX>0){
                handler.addObject(new RainDrop((int)x+32,(int) y+15, ID.RainDrop,handler));
                }
                else if(velX < 0){
                handler.addObject(new RainDrop((int)x+26,(int) y+15, ID.RainDrop,handler));
                }
                
                
                    }         
        //if(y<= 0 || y >= ChewingGumSimulator.HEIGHT-32) velY *= -1;
        if(x<= 0 || x >= ChewingGumSimulator.WIDTH-50) velX *= -1;
        
        //handler.addObject( new Trail(x,y,ID.Trail,Color.blue,30,30,0.02f,handler));
        collision();
        if(BossHealth==70)
        { handler.addObject(new BossSucker((ChewingGumSimulator.WIDTH / 2)-48,0,ID.BossSucker,handler));
           }
        
        if(BossHealth==0)
        { handler.removeObject(this);}
    
    }
    
    public Rectangle getBounds(){
        return new Rectangle((int)x,(int)y,50,30);
    }
    
    private AlphaComposite makeTransparent(float alpha){
        int type = AlphaComposite.SRC_OVER;
        return AlphaComposite.getInstance(type, alpha);
    }
    
    private void collision(){
        for(int i=0;i < handler.object.size(); i++){
            GameObject tempObject = handler.object.get(i);
            
        if(tempObject.getId() == ID.PlayerRocket)
        {
            if(getBounds().intersects(tempObject.getBounds()))
            {
                
                for(int j=0;j < handler.object.size(); j++){
                GameObject tempoObject = handler.object.get(j);
                if(tempoObject.getId()==ID.BossOne)
                {BossHealth--;}
            }
        }
        
        
        
        
        }
        
        if(tempObject.getId() == ID.PlayerLightning)
        {
            if(getBounds().intersects(tempObject.getBounds()))
            {
                
                for(int j=0;j < handler.object.size(); j++){
                GameObject tempoObject = handler.object.get(j);
                if(tempoObject.getId()==ID.BossOne)
                {BossHealth-=2;}
            }
        }
        
        
        
        
        }
    }}
    
    
    public void render(Graphics g){
        Graphics2D g2d = (Graphics2D) g;
        g2d.setComposite(makeTransparent(alpha));
        g.setColor(Color.gray);
        g.fillRoundRect((int)x,(int)y,50,30,40,10);
        g2d.setComposite(makeTransparent(1));
        
    }
    
}
