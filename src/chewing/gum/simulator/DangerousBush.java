
package chewing.gum.simulator;


import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.Random;


public class DangerousBush extends GameObject{
    
    private Handler handler;
    private int BushHealth=200;
    private Random r = new Random();
    
    public DangerousBush(int x, int y, ID id, Handler handler){
        super(x,y,id);
        this.handler = handler;
        velX=0;
        velY=0;
    }
    
    
    
    
    public Rectangle getBounds(){
        
        return new Rectangle((int)x,(int)y,45,45);
    }
        
    public void tick(){
        x+=velX;
        y+=velY;
        collision();
        if(BushHealth==0)
        { handler.removeObject(this);}
    }
    
    
    
    
    private void collision(){
        for(int i=0;i < handler.object.size(); i++){
            GameObject tempObject = handler.object.get(i);
            
        if(tempObject.getId() == ID.PlayerPee)
        {
            if(getBounds().intersects(tempObject.getBounds()))
            {
                
                BushHealth--;
                break;
        }
        
        
        
        
        }
        
        if(tempObject.getId() == ID.ParticleDisengage2)
        {
            if(getBounds().intersects(tempObject.getBounds()))
            {
                
                handler.removeObject(this);
        }
        
        
        
        
        }
        
        if(tempObject.getId() == ID.PlayerLightning)
        {
            if(getBounds().intersects(tempObject.getBounds()))
            {
                
                BushHealth-=1.5;
                break;
        }
        
        
        
        
        }
        
        if(tempObject.getId() == ID.PlayerPoo)
        {
            if(getBounds().intersects(tempObject.getBounds()))
            {
                
                BushHealth-=2;
                
        }
        
        
        
        
        }
        
        if(tempObject.getId() == ID.PlayerGuano)
        {
            if(getBounds().intersects(tempObject.getBounds()))
            {
                
                BushHealth-=3.5;
                
        }
        
        
        
        
        }
        
        if(tempObject.getId() == ID.PlayerBalega)
        {
            if(getBounds().intersects(tempObject.getBounds()))
            {
                
                BushHealth-=5;
                
        }
        
        
        
        
        }
    }}
    
    public void render(Graphics g){
        
        if(this.getId()==ID.RedberryBush){
        g.setColor(Color.green);
        g.fillRoundRect((int)x,(int) y, 45, 45,10,10);
        
        
        g.setColor(Color.red);
        g.fillOval((int)x+5,(int) y+5, 5, 5);
        g.fillOval((int)x+15,(int) y +5, 5, 5);
        g.fillOval((int)x+25,(int) y +5, 5, 5);
        g.fillOval((int)x+35,(int) y +5, 5, 5);
        
        g.fillOval((int)x+5,(int) y+15, 5, 5);
        g.fillOval((int)x+15,(int) y +15, 5, 5);
        g.fillOval((int)x+25,(int) y +15, 5, 5);
        g.fillOval((int)x+35,(int) y +15, 5, 5);
        
        g.fillOval((int)x+5,(int) y+25, 5, 5);
        g.fillOval((int)x+15,(int) y +25, 5, 5);
        g.fillOval((int)x+25,(int) y +25, 5, 5);
        g.fillOval((int)x+35,(int) y +25, 5, 5);
        
        g.fillOval((int)x+5,(int) y+35, 5, 5);
        g.fillOval((int)x+15,(int) y +35, 5, 5);
        g.fillOval((int)x+25,(int) y +35, 5, 5);
        g.fillOval((int)x+35,(int) y +35, 5, 5);}
        
        
        if(this.getId()==ID.BlueberryBush){
        g.setColor(Color.green);
        g.fillRoundRect((int)x,(int) y, 45, 45,10,10);
        
        
        g.setColor(Color.blue);
        g.fillOval((int)x+5,(int) y+5, 5, 5);
        g.fillOval((int)x+15,(int) y +5, 5, 5);
        g.fillOval((int)x+25,(int) y +5, 5, 5);
        g.fillOval((int)x+35,(int) y +5, 5, 5);
        
        g.fillOval((int)x+5,(int) y+15, 5, 5);
        g.fillOval((int)x+15,(int) y +15, 5, 5);
        g.fillOval((int)x+25,(int) y +15, 5, 5);
        g.fillOval((int)x+35,(int) y +15, 5, 5);
        
        g.fillOval((int)x+5,(int) y+25, 5, 5);
        g.fillOval((int)x+15,(int) y +25, 5, 5);
        g.fillOval((int)x+25,(int) y +25, 5, 5);
        g.fillOval((int)x+35,(int) y +25, 5, 5);
        
        g.fillOval((int)x+5,(int) y+35, 5, 5);
        g.fillOval((int)x+15,(int) y +35, 5, 5);
        g.fillOval((int)x+25,(int) y +35, 5, 5);
        g.fillOval((int)x+35,(int) y +35, 5, 5);}
        
        
        
        if(this.getId()==ID.BlackberryBush){
        g.setColor(Color.green);
        g.fillRoundRect((int)x,(int) y, 45, 45,10,10);
        
        
        g.setColor(Color.black);
        g.fillOval((int)x+5,(int) y+5, 5, 5);
        g.fillOval((int)x+15,(int) y +5, 5, 5);
        g.fillOval((int)x+25,(int) y +5, 5, 5);
        g.fillOval((int)x+35,(int) y +5, 5, 5);
        
        g.fillOval((int)x+5,(int) y+15, 5, 5);
        g.fillOval((int)x+15,(int) y +15, 5, 5);
        g.fillOval((int)x+25,(int) y +15, 5, 5);
        g.fillOval((int)x+35,(int) y +15, 5, 5);
        
        g.fillOval((int)x+5,(int) y+25, 5, 5);
        g.fillOval((int)x+15,(int) y +25, 5, 5);
        g.fillOval((int)x+25,(int) y +25, 5, 5);
        g.fillOval((int)x+35,(int) y +25, 5, 5);
        
        g.fillOval((int)x+5,(int) y+35, 5, 5);
        g.fillOval((int)x+15,(int) y +35, 5, 5);
        g.fillOval((int)x+25,(int) y +35, 5, 5);
        g.fillOval((int)x+35,(int) y +35, 5, 5);}
        
    }
    
    
    
    
    }
    
    

