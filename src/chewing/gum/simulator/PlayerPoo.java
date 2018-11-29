
package chewing.gum.simulator;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.Random;




public class PlayerPoo extends GameObject{
    
    private Handler handler;
    private Random r = new Random();
    
    Color col = new Color(50,20,0);
    
    public PlayerPoo(int x, int y, ID id, Handler handler){
        super(x,y,id);
        this.handler = handler;
        
            velX= 0;
            velY= 2;
        
    }
    
    
    public Rectangle getBounds(){
        
        return new Rectangle((int)x,(int)y,7,9);
    }
    
    public void tick(){
        x+=velX;
        y+=velY;
        
        if(y >= ChewingGumSimulator.HEIGHT-20 || y <= 0 || x <= 0 || x >= ChewingGumSimulator.WIDTH-20)
            handler.removeObject(this);
        
        
        
        //handler.addObject( new Trail(x,y,ID.Trail,Color.gray,6,6,0.5f,handler));
        
    
    }
    
    public void render(Graphics g){
        g.setColor(col);
        
            g.fillRect((int)x+8,(int)y+17,7,9);
    }
    
    
    
}
