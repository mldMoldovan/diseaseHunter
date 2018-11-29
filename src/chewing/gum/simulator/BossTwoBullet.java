
package chewing.gum.simulator;

import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.util.Random;








public class BossTwoBullet extends GameObject{
    
    private Handler handler;
    Random r = new Random();
    Color col;
    private float alpha = 0.5f;
    
    
    public BossTwoBullet(float x, float y, ID id, Handler handler){
        super(x,y,id);
        this.handler = handler;
        
        velX=(r.nextInt(5 - -5)+ -5)*2;
        velY=3;
    }
    
    
    public Rectangle getBounds(){
        return new Rectangle((int)x,(int)y,3,3);
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
    
    
    private AlphaComposite makeTransparent(float alpha){
        int type = AlphaComposite.SRC_OVER;
        return AlphaComposite.getInstance(type, alpha);
    }
    
    
    public void tick(){
        x+=velX;
        y+=velY;
        
        if(y >= ChewingGumSimulator.HEIGHT-20)
            handler.removeObject(this);
        
        handler.addObject( new Trail(x,y,ID.Trail,Color.black,3,3,0.02f,handler));
        collision();
    }
    
    
    public void render(Graphics g){
        Graphics2D g2d = (Graphics2D) g;
        
        g2d.setComposite(makeTransparent(alpha));
        g.setColor(Color.black);
        g.fillRect((int)x,(int)y,5,5);
        g2d.setComposite(makeTransparent(1));
    }
    
    
    
    
}
