
package chewing.gum.simulator;


import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.util.Random;


public class StraightParticle extends GameObject{
    
    private Handler handler;
    private Random r = new Random();
    private float alpha = 0.3f;
    private Color turColor = new Color(0,250,154);
    private int lifeTimer = 200;
    private int randomDirection = r.nextInt(4);
    
    
    public StraightParticle(int x, int y, ID id, Handler handler){
        super(x,y,id);
        this.handler = handler;
        if(randomDirection==1){
        velX=7;
        velY=0;
        }
        if(randomDirection==2){
        velX=-7;
        velY=0;
        }
        if(randomDirection==3){
        velX=0;
        velY=7;
        }
        if(randomDirection==4){
        velX=7;
        velY=0;
        }
    }
    
    
    
    
    public Rectangle getBounds(){
        
        return new Rectangle((int)x,(int)y,20,20);
    }
    
    private AlphaComposite makeTransparent(float alpha){
        int type = AlphaComposite.SRC_OVER;
        return AlphaComposite.getInstance(type, alpha);
    }
        
    public void tick(){
        x+=velX;
        y+=velY;
        if(lifeTimer>0)
        {
            lifeTimer--;
        }
        if(lifeTimer==0)
        {
            handler.removeObject(this);
        }
        x+=velX;
        y+=velY;
        
        if(y >= ChewingGumSimulator.HEIGHT-20 || y <= 80 || x <= 3 || x>= ChewingGumSimulator.WIDTH-20)
            handler.removeObject(this);
        
        handler.addObject( new Trail(x,y,ID.Trail,Color.green,3,3,0.08f,handler));
        
        
        
    }
    
    public void render(Graphics g){
        
        Graphics2D g2d = (Graphics2D) g;
        
        
        
            g2d.setComposite(makeTransparent(1));
        
        
        g.setColor(Color.green);
        g.fillOval((int)x,(int) y, 3, 3);
        
        
        
        
    }
    
    
    
    
    }
    
    

