
package chewing.gum.simulator;


import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.util.Random;


public class LightningBox extends GameObject{
    
    private Handler handler;
    private Random r = new Random();
    private float alpha = 0.3f;
    private int DisTimer = 4000;
    private int DisTimer2 = 500;
    private boolean playerOn=false;
    
    public LightningBox(int x, int y, ID id, Handler handler){
        super(x,y,id);
        this.handler = handler;
        velX=0;
        velY=0;
    }
    
    private void collision(){
        for(int i=0;i < handler.object.size(); i++){
            GameObject iaraObject = handler.object.get(i);
            
            if(iaraObject.getId() == ID.PlayerRocket || iaraObject.getId() == ID.PlayerRocketH || iaraObject.getId() == ID.PlayerLightning || iaraObject.getId() == ID.ParticleDisengage2){
            
            if(getBounds().intersects(iaraObject.getBounds()) && playerOn==false)
            {
                iaraObject.setVelY(-1*iaraObject.getVelY());
                iaraObject.setVelX(-1*iaraObject.getVelX());
                
            }
            
            
        }
        
        
        
        
        
        
    }
    }
    
    
    public Rectangle getBounds(){
        
        return new Rectangle((int)x,(int)y,30,30);
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
        
        Graphics2D g2d = (Graphics2D) g;
        if(DisTimer==0){
        g2d.setComposite(makeTransparent(alpha));}
        if(DisTimer>0)
        {
            g2d.setComposite(makeTransparent(1));
        }
        
        g.setColor(Color.blue);
        g.fillRoundRect((int)x,(int) y, 30, 30,10,10);
        
        
        g.setColor(Color.yellow);
        g.fillRect((int)x+5,(int) y+12, 20, 5);
        g.fillRect((int)x+12,(int) y +5, 5, 20);
        
    }
    
    
    
    
    }
    
    

