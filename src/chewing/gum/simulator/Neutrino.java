
package chewing.gum.simulator;

import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;




public class Neutrino extends GameObject{
    
    private Handler handler;
    private Color col = new Color(125, 249, 255);
    private int Timer=1000;
    private float alpha = 0.3f;
    
    public Neutrino(float x, float y, ID id, Handler handler){
        super(x,y,id);
        this.handler = handler;
        
        velX=10;
        velY=12;
        
        
    }
    
    public Rectangle getBounds(){
        return new Rectangle((int)x,(int)y,7,7);
    }
    
    private AlphaComposite makeTransparent(float alpha){
        int type = AlphaComposite.SRC_OVER;
        return AlphaComposite.getInstance(type, alpha);
    }
    
    public void tick(){
        x+=velX;
        y+=velY;
        
        if(velX==0){
            velX=10;
        }
        if(velY==0){
            velY=12;
        }
        
        if(y<= 85 || y >= ChewingGumSimulator.HEIGHT-20) velY *= -1;
        if(x<= 0 || x >= ChewingGumSimulator.WIDTH-18) velX *= -1;
        
        handler.addObject( new Trail(x,y,ID.Trail,col,7,7,0.05f,handler));
        if(Timer>0)
        {
            Timer--;
        }
        if(Timer==0)
        {
            Timer=1000;
        }
    }
    
    public void render(Graphics g){
        g.setColor(col);
        Graphics2D g2d = (Graphics2D) g;
        if(Timer%5==0){
        g2d.setComposite(makeTransparent(alpha));}
        else if(Timer%5!=0)
        {
            g2d.setComposite(makeTransparent(1));
        }
        g.setColor(col);
        g.fillRect((int)x,(int)y,7,7);
    }
    
}
