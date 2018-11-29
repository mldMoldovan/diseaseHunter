
package chewing.gum.simulator;


import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.util.Random;


public class GoldSoftTreasure extends GameObject{
    
    private Handler handler;
    private Random r = new Random();
    Color col = new Color(50,20,0);
    Color col2 = new Color(60,25,10);
    private GameObject player;
    private float alpha=0.3f;
    private boolean Placed=false;
    private boolean playerOn=false;
    
    public GoldSoftTreasure(int x, int y, ID id, Handler handler){
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
        
        return new Rectangle((int)x,(int)y-15,50,45);
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
    
    
    
    
    
    private AlphaComposite makeTransparent(float alpha){
        int type = AlphaComposite.SRC_OVER;
        return AlphaComposite.getInstance(type, alpha);
    }
        
    public void tick(){
        x+=velX;
        y+=velY;
        
        
        
        x = ChewingGumSimulator.clamp((int)x,5,ChewingGumSimulator.WIDTH-28);
        y = ChewingGumSimulator.clamp((int)y,80,ChewingGumSimulator.HEIGHT-49);
        
        if(ChewingGumSimulator.gameState==ChewingGumSimulator.STATE.ArenaEditor && ChewingGumSimulator.editSelected==true && Placed==false){
            velX=player.getVelX();
            velY=player.getVelY();
        }
        
        if(ChewingGumSimulator.gameState == ChewingGumSimulator.STATE.AdventureOne || ChewingGumSimulator.gameState == ChewingGumSimulator.STATE.AdventureTwo || ChewingGumSimulator.gameState == ChewingGumSimulator.STATE.AdventureThree || ChewingGumSimulator.gameState == ChewingGumSimulator.STATE.AdventureFour || ChewingGumSimulator.gameState == ChewingGumSimulator.STATE.AdventureFive){
        if(player.getVelX()>0){
            this.setVelX((-1)*player.getVelX());
        }
        else if(player.getVelX()<=0){
            this.setVelX(0);
        }
        if(x<-50){
            handler.removeObject(this);
            
        }
        
        }
        
        collision();
        
    }
    
    public void render(Graphics g){
        
        
        Graphics2D g2d = (Graphics2D) g;
        if(ChewingGumSimulator.editSelected==false){
        g2d.setComposite(makeTransparent(1));
        Placed=true;}
        else if(ChewingGumSimulator.editSelected==true && Placed==false){
        g2d.setComposite(makeTransparent(alpha));}
        
        g.setColor(col);
        g.fillRect((int)x,(int) y, 50, 30);
        g.setColor(col2);
        g.fillRect((int)x,(int) y-15, 50, 15);
        
        g.setColor(Color.yellow);
        
        g.fillRect((int)x-5,(int)y+5,60,5);
        
        g.fillRect((int)x-5,(int)y+20,60,5);
        
        g.fillRect((int)x+23,(int)y-2,4,4);
        g.setColor(Color.black);
        g.fillRect((int)x+24,(int)y-1,2,2);
        
        
        
        
    }
    
    
    
    
    }
    
    

