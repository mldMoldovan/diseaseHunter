
package chewing.gum.simulator;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;




public class FastEnemy extends GameObject{
    
    private Handler handler;
    private Color col = new Color(125, 249, 255);
    
    public FastEnemy(float x, float y, ID id, Handler handler){
        super(x,y,id);
        this.handler = handler;
        
        velX=6;
        velY=9;
        
        
    }
    
    public Rectangle getBounds(){
        return new Rectangle((int)x,(int)y,5,5);
    }
    
    public void tick(){
        x+=velX;
        y+=velY;
        
        
        if(velX==0){
            velX=6;
        }
        if(velY==0){
            velY=9;
        }
        if(ChewingGumSimulator.gameState==ChewingGumSimulator.STATE.Tutorial){
        if(y<= 80 || y >= ChewingGumSimulator.HEIGHT-150) velY *= -1;
        if(x<= 0 || x >= ChewingGumSimulator.WIDTH-18) velX *= -1;
        }
        else{
        if(y<= 85 || y >= ChewingGumSimulator.HEIGHT-20) velY *= -1;
        if(x<= 0 || x >= ChewingGumSimulator.WIDTH-18) velX *= -1;}
        
        handler.addObject( new Trail(x,y,ID.Trail,col,5,5,0.02f,handler));
    }
    
    public void render(Graphics g){
        g.setColor(col);
        g.fillRect((int)x,(int)y,5,5);
    }
    
}
