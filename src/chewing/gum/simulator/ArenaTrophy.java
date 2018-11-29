
package chewing.gum.simulator;


import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.Random;


public class ArenaTrophy extends GameObject{
    
    private Handler handler;
    private Random r = new Random();
    
    public ArenaTrophy(int x, int y, ID id, Handler handler){
        super(x,y,id);
        this.handler = handler;
        velX=0;
        velY=0;
    }
    
    
    
    
    public Rectangle getBounds(){
        
        return new Rectangle((int)x,(int) y-30, 30, 25);
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
        
    public void tick(){
        x+=velX;
        y+=velY;
        collision();
    }
    
    public void render(Graphics g){
        
        g.setColor(Color.orange);
        g.fillRect((int)x,(int) y, 30, 15);
        
        g.fillRect((int)x+12,(int) y-15, 5, 15);
        
        g.fillRect((int)x,(int) y-30, 30, 25);
        
        g.fillRect((int)x+40,(int) y-25, 5, 15);
        g.fillRect((int)x-15,(int) y-25, 5, 15);
        
        g.fillRect((int)x-10,(int) y-25, 20, 5);
        g.fillRect((int)x-10,(int) y-15, 20, 5);
        
        g.fillRect((int)x+20,(int) y-25, 20, 5);
        g.fillRect((int)x+20,(int) y-15, 20, 5);
        
        g.setColor(Color.red);
        if(this.getId()==ID.ArenaTrophy){
            g.drawString("1",(int)x+12,(int)y-15);
        }
        else if(this.getId()==ID.ArenaTrophy2){
            g.drawString("2",(int)x+12,(int)y-15);
        }
        
        //g.setColor(Color.LIGHT_GRAY);
        //g.fillRect((int)x+5,(int) y+12, 20, 5);
        //g.fillRect((int)x+12,(int) y +5, 5, 20);
        
    }
    
    
    
    
    }
    
    

