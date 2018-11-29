
package chewing.gum.simulator;


import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.util.Random;


public class NukeBox extends GameObject{
    
    private Handler handler;
    private Random r = new Random();
    private float alpha = 0.3f;
    private int DisTimer = 4000;
    private int DisTimer2 = 500;
    
    public NukeBox(int x, int y, ID id, Handler handler){
        super(x,y,id);
        this.handler = handler;
        velX=0;
        velY=0;
    }
    
    private void collision(){
        
        
        
        for(int i=0;i < handler.object.size(); i++){
            GameObject iaraObject = handler.object.get(i);
            if(iaraObject.getId() == ID.PlayerRocket || iaraObject.getId() == ID.PlayerRocketH || iaraObject.getId() == ID.PlayerLightning || iaraObject.getId() == ID.ParticleDisengage2){
            
            if(getBounds().intersects(iaraObject.getBounds()))
            {
                iaraObject.setVelY(iaraObject.getVelY()*(-1));
                iaraObject.setVelX(iaraObject.getVelX()*(-1));
                
            }
            
            
        }
        
        
        
        
        
        
    }
    }
    
    
    public Rectangle getBounds(){
        
        return new Rectangle((int)x,(int)y,25,25);
    }
    
    private AlphaComposite makeTransparent(float alpha){
        int type = AlphaComposite.SRC_OVER;
        return AlphaComposite.getInstance(type, alpha);
    }
        
    public void tick(){
        x+=velX;
        y+=velY;
        
        
        if(DisTimer>0)
        {
            DisTimer--;
        }
        if(DisTimer==0)
        {
            DisTimer2--;
        }
        if(DisTimer2==0)
        {
            handler.removeObject(this);
        }
        
        collision();
    }
    
    public void render(Graphics g){
        
        if(this.getId()==ID.NukeBox){
        Graphics2D g2d = (Graphics2D) g;
        if(DisTimer==0){
        g2d.setComposite(makeTransparent(alpha));}
        if(DisTimer>0)
        {
            g2d.setComposite(makeTransparent(1));
        }
        
        g.setColor(Color.yellow);
        g.fillRoundRect((int)x,(int) y, 25, 25,10,10);
        
        
        g.setColor(Color.black);
        g.fillRect((int)x+3,(int)y+4,8,8);
        g.fillRect((int)x+14,(int)y+4,8,8);
        g.fillRect((int)x+9,(int)y+15,8,8);
        g.setColor(Color.cyan);
        g.drawRect((int)x-1,(int)y-1,26,26);}
        
        
        if(this.getId()==ID.GrenadeBox){
            Graphics2D g2d = (Graphics2D) g;
        if(DisTimer==0){
        g2d.setComposite(makeTransparent(alpha));}
        if(DisTimer>0)
        {
            g2d.setComposite(makeTransparent(1));
        }
        
        g.setColor(Color.yellow);
        g.fillRoundRect((int)x,(int) y, 25, 25,10,10);
        
        
        g.setColor(Color.black);
        g.fillRect((int)x+3,(int)y+4,8,8);
        g.fillRect((int)x+14,(int)y+4,8,8);
        g.fillRect((int)x+9,(int)y+15,8,8);
        g.setColor(Color.cyan);
        g.drawRect((int)x-1,(int)y-1,26,26);
        }
        
        
        
    }
    
    
    
    
    }
    
    

