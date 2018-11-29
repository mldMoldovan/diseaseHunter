
package chewing.gum.simulator;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.Random;




public class PlayerRocket extends GameObject{
    
    private Handler handler;
    private Random r = new Random();
    private int rockTimer = 150;
    
    static int direction =1;
    
    public PlayerRocket(int x, int y, ID id, Handler handler){
        super(x,y,id);
        this.handler = handler;
        if(direction==1)
        {velX=0;
        velY=5;}
        if(direction==2)
        {
            velX=0;
            velY= -5;
        }
        
    }
    
    
    public Rectangle getBounds(){
        
        return new Rectangle((int)x,(int)y,6,20);
        
    }
    
    public void tick(){
        x+=velX;
        y+=velY;
        
        if(y >= ChewingGumSimulator.HEIGHT-20 || y <= 0 || x <= 0 || x >= ChewingGumSimulator.WIDTH-20)
        {   handler.removeObject(this); }
        else
        {
            if(rockTimer>0){
                rockTimer--;
            }
            else if(rockTimer<=0){
                handler.removeObject(this);
            }
        }
        
        
        
        //handler.addObject( new Trail(x,y,ID.Trail,Color.gray,6,6,0.5f,handler));
        
    
    }
    
    
    
    public void render(Graphics g){
        g.setColor(Color.DARK_GRAY);
        
        g.fillRect((int)x+6,(int)y,6,20);
        
    }
    
    
    
}
