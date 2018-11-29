
package chewing.gum.simulator;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.Random;








public class BossOneBullet extends GameObject{
    
    private Handler handler;
    Random r = new Random();
    Color col;
    
    
    public BossOneBullet(float x, float y, ID id, Handler handler){
        super(x,y,id);
        this.handler = handler;
        
        velX=(r.nextInt(5 - -5)+ -5);
        velY=5;
    }
    
    private void collision(){
        
        
        
        for(int i=0;i < handler.object.size(); i++){
            GameObject iaraObject = handler.object.get(i);
            if(iaraObject.getId() == ID.SmallLift || iaraObject.getId() == ID.MediumLift || iaraObject.getId() == ID.BigLift){
            
            if(getBounds().intersects(iaraObject.getBounds()))
            {
                handler.removeObject(this);
                
            }
            
            
        }
        
        
        
        
        
        
    }
    }
    
    
    public Rectangle getBounds(){
        return new Rectangle((int)x,(int)y,3,3);
    }
    
    
    public void tick(){
        x+=velX;
        y+=velY;
        
        if(y >= ChewingGumSimulator.HEIGHT-20)
            handler.removeObject(this);
        
        handler.addObject( new Trail(x,y,ID.Trail,col,3,3,0.02f,handler));
        
        collision();
    }
    
    
    public void render(Graphics g){
        col = new Color(r.nextInt(255),r.nextInt(255),r.nextInt(255));
        g.setColor(col);
        g.fillRect((int)x,(int)y,3,3);
    }
    
    
    
    
}
