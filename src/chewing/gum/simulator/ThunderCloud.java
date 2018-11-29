

package chewing.gum.simulator;

import java.awt.AlphaComposite;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.Color;
import java.awt.Graphics2D;
import java.util.Random;


public class ThunderCloud extends GameObject{
    
    private Handler handler;
    
    Random r = new Random();
    
    private int snowtimer=65;
    
    private int snowtimer2 = 50;
    
    float alpha = 0.5f;
    
    
    
    
    
    public ThunderCloud(float x, float y, ID id, Handler handler){
        super(x,y,id);
        this.handler = handler;
        
        
        velX = 0;
        velY = 1;
    }
    
    
    public void tick(){
        x+=velX;
        y+=velY;
        
        
        if(snowtimer <= 0) velY = 0;
        else
            snowtimer--;
      
        if(snowtimer <= 0) snowtimer2--;
        if(snowtimer2 <= 0) {
            if(velX==0) velX = 7;
            
            int spawn = r.nextInt(30);
            if(spawn == 0) 
                handler.addObject(new ThunderDrop((int)x+32,(int) y+15, ID.RainDrop,handler));
                
                
                    }         
        //if(y<= 0 || y >= ChewingGumSimulator.HEIGHT-32) velY *= -1;
        if(x<= 0 || x >= ChewingGumSimulator.WIDTH-50) velX *= -1;
        
        //handler.addObject( new Trail(x,y,ID.Trail,Color.blue,30,30,0.02f,handler));
        
        
    
    }
    
    public Rectangle getBounds(){
        return new Rectangle((int)x,(int)y,50,30);
    }
    
    
    private AlphaComposite makeTransparent(float alpha){
        int type = AlphaComposite.SRC_OVER;
        return AlphaComposite.getInstance(type, alpha);
    }
    
    
    
    
    public void render(Graphics g){
        Graphics2D g2d = (Graphics2D) g;
        g2d.setComposite(makeTransparent(alpha));
        g.setColor(Color.DARK_GRAY);
        g.fillRoundRect((int)x,(int)y,50,30,30,15);
        
        g2d.setComposite(makeTransparent(1));
        
        
    }
    
}
