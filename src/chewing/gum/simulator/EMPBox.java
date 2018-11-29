
package chewing.gum.simulator;


import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.util.Random;


public class EMPBox extends GameObject{
    
    private Handler handler;
    private Random r = new Random();
    private int Timer=1000;
    private float alpha=0.3f;
    private int DisTimer = 4000;
    private int DisTimer2 = 500;
    private boolean playerOn=false;
    
    public EMPBox(int x, int y, ID id, Handler handler){
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
        if(Timer>0)
        {
            Timer--;
        }
        if(Timer==0)
        {
            Timer=1000;
        }
        
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
        
        Font fnt = new Font("calibri",1,15);
        g.setFont(fnt);
        g.setColor(Color.blue);
        g.fillRoundRect((int)x,(int) y, 30, 30,10,10);
        if(Timer%5==0)
        {g.setColor(Color.cyan);}
        else
        {g.setColor(Color.yellow);}
        g.drawString("EMP",(int)x+1,(int)y+20);
        
        
        
    }
    
    
    
    
    }
