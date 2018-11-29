
package chewing.gum.simulator;


import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.util.Random;


public class RadioactiveVerticalWall extends GameObject{
    
    private Handler handler;
    private Random r = new Random();
    private float alpha=0.3f;
    private GameObject player;
    
    public RadioactiveVerticalWall(int x, int y, ID id, Handler handler){
        super(x,y,id);
        this.handler = handler;
        velX=0;
        velY=0;
        
        for(int i=0;i<handler.object.size();i++)
        {if(handler.object.get(i).getId() == ID.Player)
            player = handler.object.get(i);
            
        }
    }
    
    
    
    
    public Rectangle getBounds(){
        
        return new Rectangle((int)x,(int)y,10,50);
    }
    
    
    
    private AlphaComposite makeTransparent(float alpha){
        int type = AlphaComposite.SRC_OVER;
        return AlphaComposite.getInstance(type, alpha);
    }
        
    public void tick(){
        x+=velX;
        y+=velY;
        x = ChewingGumSimulator.clamp((int)x,5,ChewingGumSimulator.WIDTH-28);
        y = ChewingGumSimulator.clamp((int)y,80,ChewingGumSimulator.HEIGHT-49);
        if(ChewingGumSimulator.gameState==ChewingGumSimulator.STATE.ArenaEditor && ChewingGumSimulator.editSelected==true){
            velX=player.getVelX();
            velY=player.getVelY();
        }
    }
    
    public void render(Graphics g){
        
        Graphics2D g2d = (Graphics2D) g;
        if(ChewingGumSimulator.editSelected==false){
        g2d.setComposite(makeTransparent(1));}
        else if(ChewingGumSimulator.editSelected==true){
        g2d.setComposite(makeTransparent(alpha));}
        
        g.setColor(Color.green);
        g.fillRect((int)x,(int) y, 10, 50);
        
        
        
        
    }
    
    
    
    
    }
    
    

