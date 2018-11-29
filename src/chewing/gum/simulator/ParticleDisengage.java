
package chewing.gum.simulator;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.Random;








public class ParticleDisengage extends GameObject{
    
    private Handler handler;
    Random r = new Random();
    Color col = new Color(125, 249, 200);
    private int LifeTimer=3000;
    private int randomDirection;
    
    
    
    public ParticleDisengage(float x, float y, ID id, Handler handler){
        super(x,y,id);
        this.handler = handler;
        
        velX=(r.nextInt(5 - -5)+ -5)*3;
        velY=(r.nextInt(5 - -5)+ -5)*3;
        
        
    }
    
    
    public Rectangle getBounds(){
        return new Rectangle((int)x,(int)y,3,3);
    }
    
    
    public void tick(){
        randomDirection = r.nextInt(3);
        if(LifeTimer>0)
        {
            LifeTimer--;
        }
        if(LifeTimer==0)
        {
            handler.removeObject(this);
        }
        x+=velX;
        y+=velY;
        
        if(y >= ChewingGumSimulator.HEIGHT-20 || y <= 80 || x <= 3 || x>= ChewingGumSimulator.WIDTH-20)
            handler.removeObject(this);
        
        handler.addObject( new Trail(x,y,ID.Trail,col,3,3,0.01f,handler));
    }
    
    
    public void render(Graphics g){
        
        g.setColor(col);
        g.fillRect((int)x,(int)y,3,3);
    }
    
    
    
    
}
