
package chewing.gum.simulator;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;



public class BasicEnemy extends GameObject{
    
    private Handler handler;
    private Color col = new Color(220, 30, 30);
    private GameObject player;
    
    private int lifeTimer=500;
    
    
    
    public BasicEnemy(float x, float y, ID id,Handler handler){
        super(x,y,id);
        this.handler = handler;
    
        
        if(ChewingGumSimulator.gameState==ChewingGumSimulator.STATE.AdventureOne || ChewingGumSimulator.gameState==ChewingGumSimulator.STATE.AdventureTwo || ChewingGumSimulator.gameState==ChewingGumSimulator.STATE.AdventureThree || ChewingGumSimulator.gameState==ChewingGumSimulator.STATE.AdventureFour || ChewingGumSimulator.gameState==ChewingGumSimulator.STATE.AdventureFive || ChewingGumSimulator.gameState==ChewingGumSimulator.STATE.AdventureSix || ChewingGumSimulator.gameState==ChewingGumSimulator.STATE.AdventureSeven || ChewingGumSimulator.gameState==ChewingGumSimulator.STATE.AdventureEight || ChewingGumSimulator.gameState==ChewingGumSimulator.STATE.AdventureNine || ChewingGumSimulator.gameState==ChewingGumSimulator.STATE.AdventureTen){
            velX=-2;
            velY=0;
        }
        else{
        velX = 3;
        velY = 2;}
        for(int i=0;i<handler.object.size();i++)
        {if(handler.object.get(i).getId() == ID.Player)
            player = handler.object.get(i);
            
            
        }
    }
    
    public Rectangle getBounds(){
        return new Rectangle((int)x,(int)y,20,20);
    }
    
    
    public void tick(){
        x+=velX;
        y+=velY;
        
            //if(player.getVelX()>0){
            //    velX=-6;
            //}
            //else if(player.getVelX()<0){
            //    velX=-4;
            //}
        if(ChewingGumSimulator.gameState==ChewingGumSimulator.STATE.Tutorial){
        if(y<= 80 || y >= ChewingGumSimulator.HEIGHT-150) velY *= -1;
        if(x<= 0 || x >= ChewingGumSimulator.WIDTH-18) velX *= -1;
        }
        if(ChewingGumSimulator.gameState==ChewingGumSimulator.STATE.Game || ChewingGumSimulator.gameState==ChewingGumSimulator.STATE.BasicEnemyHelp){// ChewingGumSimulator.gameState!=ChewingGumSimulator.STATE.AdventureTwo || ChewingGumSimulator.gameState!=ChewingGumSimulator.STATE.AdventureThree || ChewingGumSimulator.gameState!=ChewingGumSimulator.STATE.AdventureFour || ChewingGumSimulator.gameState!=ChewingGumSimulator.STATE.AdventureFive){
        if(velX==0){
            velX=3;
        }
        if(velY==0){
            velY=2;
        }
        
        
        if(y<= 80 || y >= ChewingGumSimulator.HEIGHT-40) velY *= -1;
        if(x<= 0 || x >= ChewingGumSimulator.WIDTH-18) velX *= -1;
        
        }
        handler.addObject( new Trail(x+6,y+6,ID.Trail,col,8,8,0.08f,handler));
        collision();
        
        if(ChewingGumSimulator.gameState==ChewingGumSimulator.STATE.AdventureOne || ChewingGumSimulator.gameState==ChewingGumSimulator.STATE.AdventureTwo || ChewingGumSimulator.gameState==ChewingGumSimulator.STATE.AdventureThree || ChewingGumSimulator.gameState==ChewingGumSimulator.STATE.AdventureFour || ChewingGumSimulator.gameState==ChewingGumSimulator.STATE.AdventureFive || ChewingGumSimulator.gameState==ChewingGumSimulator.STATE.AdventureSix || ChewingGumSimulator.gameState==ChewingGumSimulator.STATE.AdventureSeven || ChewingGumSimulator.gameState==ChewingGumSimulator.STATE.AdventureEight || ChewingGumSimulator.gameState==ChewingGumSimulator.STATE.AdventureNine || ChewingGumSimulator.gameState==ChewingGumSimulator.STATE.AdventureTen){
            if(lifeTimer>0){
                lifeTimer--;
            }
            else if(lifeTimer<=0){
                handler.removeObject(this);
                lifeTimer=500;
            }
            if(this.getX()<=0){
                handler.removeObject(this);
            }
        }
    
    }
    
    
    private void collision(){
        for(int i=0;i < handler.object.size(); i++){
            GameObject tempObject = handler.object.get(i);
            
        if(tempObject.getId() == ID.PlayerRocket || tempObject.getId() == ID.PlayerRocketH)
        {
            if(getBounds().intersects(tempObject.getBounds()))
            {   
                if(ChewingGumSimulator.gameState==ChewingGumSimulator.STATE.Tutorial && ChewingGumSimulator.tutorialStages[0]==true){
                    ChewingGumSimulator.tutorialStages[1]=true;
                }
                if(ChewingGumSimulator.playerXP<100000){
                ChewingGumSimulator.playerXP++;}
                handler.removeObject(tempObject);
                handler.removeObject(this);
        }
        
        
        
        
        }
        
        
        if(tempObject.getId() == ID.PlayerLightning)
        {
            if(getBounds().intersects(tempObject.getBounds()))
            {
                if(ChewingGumSimulator.playerXP<100000){
                ChewingGumSimulator.playerXP+=2;}
                handler.removeObject(tempObject);
                handler.removeObject(this);
        }
        
        
        
        
        }
        
        if(tempObject.getId() == ID.ParticleDisengage2)
        {
            if(getBounds().intersects(tempObject.getBounds()))
            {
                if(ChewingGumSimulator.playerXP<100000){
                ChewingGumSimulator.playerXP+=5;}
                handler.removeObject(tempObject);
                handler.removeObject(this);
        }
        
        
        
        
        }
        
        if(tempObject.getId() == ID.BlueberryBush || tempObject.getId() == ID.RedberryBush || tempObject.getId() == ID.BlackberryBush || tempObject.getId() == ID.UnfruityTree || tempObject.getId() == ID.FruityTree || tempObject.getId() == ID.SnowTree || tempObject.getId() == ID.AutumnTree || tempObject.getId() == ID.DeadTree || tempObject.getId() == ID.DangerousCactus || tempObject.getId() == ID.SoftTreasure || tempObject.getId() == ID.SilverSoftTreasure || tempObject.getId() == ID.GoldSoftTreasure  || tempObject.getId() == ID.BossSucker  || tempObject.getId() == ID.BossOne || tempObject.getId() == ID.SoftCoin || tempObject.getId() == ID.SilverSoftCoin || tempObject.getId() == ID.GoldSoftCoin )
        {
            if(getBounds().intersects(tempObject.getBounds()))
            {
                
                
                if(ChewingGumSimulator.gameState == ChewingGumSimulator.STATE.AdventureOne || ChewingGumSimulator.gameState == ChewingGumSimulator.STATE.AdventureTwo || ChewingGumSimulator.gameState == ChewingGumSimulator.STATE.AdventureThree || ChewingGumSimulator.gameState == ChewingGumSimulator.STATE.AdventureFour || ChewingGumSimulator.gameState == ChewingGumSimulator.STATE.AdventureFive  || ChewingGumSimulator.gameState==ChewingGumSimulator.STATE.AdventureSix || ChewingGumSimulator.gameState==ChewingGumSimulator.STATE.AdventureSeven || ChewingGumSimulator.gameState==ChewingGumSimulator.STATE.AdventureEight || ChewingGumSimulator.gameState==ChewingGumSimulator.STATE.AdventureNine || ChewingGumSimulator.gameState==ChewingGumSimulator.STATE.AdventureTen){
                    
                    handler.removeObject(this);
                
                }
        }
        
        
        
        
        }
    }}
    
    
    
    
    public void render(Graphics g){
        
        g.setColor(col);
        g.fillOval((int)x,(int)y,20,20);
        
    }
    
}
