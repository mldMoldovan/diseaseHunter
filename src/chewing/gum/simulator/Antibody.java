
package chewing.gum.simulator;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;




public class Antibody extends GameObject{
    
    private Handler handler;
    private GameObject player;
    private GameObject fakePlayer;
    
    private Color col = new Color(127,255,212);
    
    public Antibody(float x, float y, ID id, Handler handler){
        super(x,y,id);
        this.handler = handler;
        
        
        for(int i=0;i<handler.object.size();i++)
        {if(handler.object.get(i).getId() == ID.Player)
            player = handler.object.get(i);
            
        }
        
        for(int i=0;i<handler.object.size();i++)
        {if(handler.object.get(i).getId() == ID.FakePlayer)
            fakePlayer = handler.object.get(i);
            
        }
        
        
        
        
    }
    public Rectangle getBounds(){
        return new Rectangle((int)x,(int)y,5,5);
    }
    
    public void tick(){
        x+=velX;
        y+=velY;
        
        if(ChewingGumSimulator.paused==false){
            if(player!=null){
        
        float diffX = x - player.getX() - 8;
        float diffY = y - player.getY() - 8;
        double distance = Math.sqrt((x-player.getX())*(x-player.getX())+(y-player.getY())*(y-player.getY()));
        
        velX=(float)(-1.0/distance)*4*diffX;
        velY=(float)(-1.0/distance)*4*diffY;}
            else if(player==null && fakePlayer!=null){
        
        float diffX = x - fakePlayer.getX() - 8;
        float diffY = y - fakePlayer.getY() - 8;
        double distance = Math.sqrt((x-fakePlayer.getX())*(x-fakePlayer.getX())+(y-fakePlayer.getY())*(y-fakePlayer.getY()));
        
        velX=(float)(-1.0/distance)*4*diffX;
        velY=(float)(-1.0/distance)*4*diffY;}
        
        
        
        
        }
        else if(ChewingGumSimulator.paused==true){
        velX=0;
        velY=0;}
        
        if(y<= 0 || y >= ChewingGumSimulator.HEIGHT-20) velY *= -1;
        if(x<= 0 || x >= ChewingGumSimulator.WIDTH-18) velX *= -1;
        
        handler.addObject( new Trail(x,y,ID.Trail,Color.magenta,5,5,0.05f,handler));
        collision();
    }
    
    
    private void collision(){
        for(int i=0;i < handler.object.size(); i++){
            GameObject tempObject = handler.object.get(i);
            
        if(tempObject.getId() == ID.PlayerRocket)
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
        g.setColor(Color.magenta);
        g.fillRect((int)x,(int)y,5,5);
    }
    
    
    
    
    
    
}
