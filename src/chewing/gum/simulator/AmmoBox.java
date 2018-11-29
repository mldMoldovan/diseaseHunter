
package chewing.gum.simulator;


import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.util.Random;


public class AmmoBox extends GameObject{
    
    private Handler handler;
    private Random r = new Random();
    private int Timer=1000;
    private float alpha = 0.3f;
    private int DisTimer = 4000;
    private int DisTimer2 = 500;
    private GameObject player;
    
    
    
    public AmmoBox(int x, int y, ID id, Handler handler){
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
        
        return new Rectangle((int)x,(int)y,32,32);
    }
    
    private AlphaComposite makeTransparent(float alpha){
        int type = AlphaComposite.SRC_OVER;
        return AlphaComposite.getInstance(type, alpha);
    }
        
    public void tick(){
        x+=velX;
        y+=velY;
        if(Timer>0)
        {
            Timer--;
        }
        if(Timer==0)
        {
            Timer=1000;
        }
        
        if(DisTimer>0)
        {
            DisTimer--;
        }
        if(DisTimer==0)
        {
            DisTimer2--;
        }
        if(DisTimer2==0)
        {
            handler.removeObject(this);
        }
        
        if(ChewingGumSimulator.gameState == ChewingGumSimulator.STATE.AdventureOne || ChewingGumSimulator.gameState == ChewingGumSimulator.STATE.AdventureTwo || ChewingGumSimulator.gameState == ChewingGumSimulator.STATE.AdventureThree || ChewingGumSimulator.gameState == ChewingGumSimulator.STATE.AdventureFour || ChewingGumSimulator.gameState == ChewingGumSimulator.STATE.AdventureFive || ChewingGumSimulator.gameState==ChewingGumSimulator.STATE.AdventureSix || ChewingGumSimulator.gameState==ChewingGumSimulator.STATE.AdventureSeven || ChewingGumSimulator.gameState==ChewingGumSimulator.STATE.AdventureEight || ChewingGumSimulator.gameState==ChewingGumSimulator.STATE.AdventureNine || ChewingGumSimulator.gameState==ChewingGumSimulator.STATE.AdventureTen){
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
    
    
    
    
    private void collision(){
        
        
        for(int i=0;i < handler.object.size(); i++){
            GameObject iaraObject = handler.object.get(i);
            
            if(iaraObject.getId() == ID.SoftCoin && (ChewingGumSimulator.gameState == ChewingGumSimulator.STATE.AdventureOne || ChewingGumSimulator.gameState == ChewingGumSimulator.STATE.AdventureTwo || ChewingGumSimulator.gameState == ChewingGumSimulator.STATE.AdventureThree || ChewingGumSimulator.gameState == ChewingGumSimulator.STATE.AdventureFour || ChewingGumSimulator.gameState == ChewingGumSimulator.STATE.AdventureFive)){
            
            if(getBounds().intersects(iaraObject.getBounds()))
            {
                iaraObject.setX(iaraObject.getX()-20);
                
            }
            
            
        }
            
            if(iaraObject.getId() == ID.PlayerRocket || iaraObject.getId() == ID.PlayerRocketH || iaraObject.getId() == ID.PlayerLightning || iaraObject.getId() == ID.ParticleDisengage2){
            
            if(getBounds().intersects(iaraObject.getBounds()))
            {
                iaraObject.setVelY(iaraObject.getVelY()*(-1));
                iaraObject.setVelX(iaraObject.getVelX()*(-1));
                
            }
            
            
        }
        
        
        
        
        
        
    }
    }
    
    public void render(Graphics g){
        
        Graphics2D g2d = (Graphics2D) g;
        if(DisTimer==0){
        g2d.setComposite(makeTransparent(alpha));}
        if(DisTimer>0)
        {
            g2d.setComposite(makeTransparent(1));
        }
        
        Font fnt = new Font("calibri",1,10);
        
        g.setColor(Color.DARK_GRAY);
        g.fillRoundRect((int)x,(int) y, 32, 32,10,10);
        
        g.setFont(fnt);
        if(Timer%2==0)
        {g.setColor(Color.white);}
        else
        {g.setColor(Color.yellow);}
        //g.drawString("AMMO",(int)x+1,(int)y+10);
        g.drawString("AMMO",(int)x+1,(int)y+20);
        
    }
    
    
    
    
    }
