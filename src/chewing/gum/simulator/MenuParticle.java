
package chewing.gum.simulator;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.Random;



public class MenuParticle extends GameObject{
    
    private Handler handler;
    private Random r = new Random();
    private Color col;
    int dir = 0;
    
    public MenuParticle(int x, int y, ID id,Handler handler){
        
        super(x,y,id);
        
        this.handler = handler;
        
        dir = r.nextInt(2);
        if(dir==0){
        velX=20;
        velY=4;}
        else if(dir==1){
        velX=5;
        velY=26;
        }
        
        if(velX==0 && velY !=0) velX=17;
        if(velY==0 && velX !=0) velY=45;
        if(velX == 0 && velY == 0) velY = 23; velX = 42;
        
        col = new Color(r.nextInt(255),r.nextInt(255),r.nextInt(255));
        
    }
    
    public Rectangle getBounds(){
        return new Rectangle((int)x,(int)y,20,20);
    }
    
    public void tick(){
        x+=velX;
        y+=velY;
        
        if(y<= 0 || y >= ChewingGumSimulator.HEIGHT-32) velY *= -1;
        if(x<= 0 || x >= ChewingGumSimulator.WIDTH-32) velX *= -1;
        
        handler.addObject( new Trail(x,y,ID.Trail,col,20,20,0.02f,handler));
    }
    
    public void render(Graphics g){
        g.setColor(col);
        g.fillRect((int)x,(int)y,20,20);
    }
    
}
