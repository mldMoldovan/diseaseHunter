
package chewing.gum.simulator;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.Random;








public class SnowDrop extends GameObject{
    
    private Handler handler;
    Random r = new Random();
    private int snowdTimer=500;
    
    
    
    public SnowDrop(float x, float y, ID id, Handler handler){
        super(x,y,id);
        this.handler = handler;
        
        velX=(r.nextInt(5 - -5)+ -5);
        velY=7;
    }
    
    
    public Rectangle getBounds(){
        return new Rectangle((int)x,(int)y,3,3);
    }
    
    
    public void tick(){
        x+=velX;
        y+=velY;
        if(snowdTimer>0){
            snowdTimer--;
        }
        y+=velY;
        if(snowdTimer==0){
            handler.removeObject(this);
            snowdTimer=500;
        }
        
        if(y >= ChewingGumSimulator.HEIGHT-20)
            handler.removeObject(this);
        
        handler.addObject( new Trail(x,y,ID.Trail,Color.white,3,3,0.08f,handler));
    }
    
    
    public void render(Graphics g){
        
        g.setColor(Color.white);
        g.fillRect((int)x,(int)y,3,3);
    }
    
    
    
    
}
