
package chewing.gum.simulator;


import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.Random;


public class DangerousTree extends GameObject{
    
    private Handler handler;
    private int TreeHealth=30;
    private Random r = new Random();
    private Color maroon = new Color(50,20,0);
    
    public DangerousTree(int x, int y, ID id, Handler handler){
        super(x,y,id);
        this.handler = handler;
        velX=0;
        velY=0;
    }
    
    
    
    
    public Rectangle getBounds(){
        
        return new Rectangle((int)x,(int)y,30,80);
    }
        
    public void tick(){
        x+=velX;
        y+=velY;
        collision();
        if(TreeHealth==0)
        { handler.removeObject(this);}
    }
    
    
    
    
    private void collision(){
        for(int i=0;i < handler.object.size(); i++){
            GameObject tempObject = handler.object.get(i);
            
        if(tempObject.getId() == ID.PlayerPee)
        {
            if(getBounds().intersects(tempObject.getBounds()))
            {
                
                TreeHealth--;
                break;
        }
        
        
        
        
        }
        
        if(tempObject.getId() == ID.PlayerLightning)
        {
            if(getBounds().intersects(tempObject.getBounds()))
            {
                
                TreeHealth-=2;
                break;
        }
        
        
        
        
        }
        
        if(tempObject.getId() == ID.PlayerPoo)
        {
            if(getBounds().intersects(tempObject.getBounds()))
            {
                
                TreeHealth-=3;
                break;
        }
        
        
        
        
        }
        
        if(tempObject.getId() == ID.PlayerGuano)
        {
            if(getBounds().intersects(tempObject.getBounds()))
            {
                
                TreeHealth-=4;
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
        
        if(tempObject.getId() == ID.PlayerBalega)
        {
            if(getBounds().intersects(tempObject.getBounds()))
            {
                
                TreeHealth-=5;
                break;
        }
        
        
        
        
        }
    }}
    
    public void render(Graphics g){
        
        if(this.getId()==ID.UnfruityTree){
        
        g.setColor(Color.green);
        g.fillRoundRect((int)x,(int) y, 30, 50,20,20);
        
        g.setColor(maroon);
        g.fillRect((int)x+10,(int) y+50, 10, 30);}
        
        
        if(this.getId()==ID.FruityTree){
        
        g.setColor(Color.green);
        g.fillRoundRect((int)x,(int) y, 30, 50,20,20);
        
        g.setColor(maroon);
        g.fillRect((int)x+10,(int) y+50, 10, 30);}
        
        
        if(this.getId()==ID.AutumnTree){
        
        g.setColor(Color.orange);
        g.fillRoundRect((int)x,(int) y, 30, 50,20,20);
        
        g.setColor(maroon);
        g.fillRect((int)x+10,(int) y+50, 10, 30);}
        
        
        if(this.getId()==ID.SnowTree){
        
        g.setColor(Color.white);
        g.fillRoundRect((int)x,(int) y, 30, 50,20,20);
        
        g.setColor(maroon);
        g.fillRect((int)x+10,(int) y+50, 10, 30);}
        
        if(this.getId()==ID.DeadTree){
        
        g.setColor(Color.green);
        g.fillRoundRect((int)x,(int) y, 30, 50,20,20);
        
        g.setColor(maroon);
        g.fillRect((int)x+10,(int) y+50, 10, 30);}
        
        
        
    }
    
    
    
    
    }
    
    

