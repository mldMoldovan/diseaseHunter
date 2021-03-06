
package chewing.gum.simulator;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.Random;








public class PlayerPee extends GameObject{
    
    private Handler handler;
    Random r = new Random();
    
    
    
    public PlayerPee(float x, float y, ID id, Handler handler){
        super(x,y,id);
        this.handler = handler;
        
        velX=(r.nextInt(5 - -5)+ -5);
        velY=5;
    }
    
    
    public Rectangle getBounds(){
        return new Rectangle((int)x,(int)y,3,3);
    }
    
    
    public void tick(){
        x+=velX;
        y+=velY;
        
        if(y >= ChewingGumSimulator.HEIGHT-20)
            handler.removeObject(this);
        
        handler.addObject( new Trail(x,y,ID.Trail,Color.yellow,3,3,0.02f,handler));
    }
    
    
    public void render(Graphics g){
        
        g.setColor(Color.yellow);
        g.fillRect((int)x,(int)y,3,3);
    }
    
    
    
    
}
