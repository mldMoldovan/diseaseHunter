
package chewing.gum.simulator;

import java.awt.AlphaComposite;
import java.awt.Color;
import static java.awt.Color.white;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.event.KeyEvent;
import java.util.Random;


public class Player extends GameObject{
    
    Random r = new Random();
    Handler handler;
    ChewingGumSimulator Game;
    static boolean Shield = false;
    static boolean touchingWall = false;
    static boolean SpeedBoosted=false;
    static boolean Thunderstruck=false;
    static boolean playerJumping=false;
    static boolean onPlatform=false;
    public static float distanceTraveled=0;
    public static int Timer = 3000;
    private int Timer2 = 2000;
    private int Timer3 = 2000;
    private int jumpTimer = 10;
    private float alpha=0.2f;
    private int playerLevel;
    private int playerXp;
    private GameObject liftu;
    private GameObject eul;
    
    
    
    public Player(float x, float y, ID id, Handler handler) {
        super(x, y, id);
        this.handler = handler;
        
        for(int i=0;i<handler.object.size();i++)
        {if(handler.object.get(i).getId() == ID.MediumLift)
        {liftu = handler.object.get(i);}
         if(handler.object.get(i).getId() == ID.Player)
         {eul = handler.object.get(i);}
            
        }
        
        
        
        
    }
    
    public Rectangle getBounds(){
        return new Rectangle((int)x,(int)y,17,17);
    }
    
    
    

    
    public void tick() {
        
        x += velX;
        y += velY;
        
        if(Game.gameState==ChewingGumSimulator.STATE.Tutorial){
            x = ChewingGumSimulator.clamp(x,2,ChewingGumSimulator.WIDTH-24);
            y = ChewingGumSimulator.clamp(y,80,ChewingGumSimulator.HEIGHT-150);
        }
        
        if(Shield == true)
        {  x = ChewingGumSimulator.clamp(x,5,ChewingGumSimulator.WIDTH-28);
           y = ChewingGumSimulator.clamp(y,80,ChewingGumSimulator.HEIGHT-49);
            
           if(Timer>0)
           {Timer--;}
           else
           {Shield = false;
            Timer=3000;}
            }
        
        if(SpeedBoosted == true)
        { if(Timer2>0)
           {Timer2--;}
           else
           {SpeedBoosted = false;
            Timer2=2000;}
            }
        
        if(Thunderstruck == true)
        { if(Timer3>0)
           {Timer3--;}
           else
           {Thunderstruck = false;
            Timer3=2000;}
            }
        if(Game.gameState == ChewingGumSimulator.STATE.AdventureOne || Game.gameState==ChewingGumSimulator.STATE.AdventureTwo || Game.gameState==ChewingGumSimulator.STATE.AdventureThree || Game.gameState==ChewingGumSimulator.STATE.AdventureFour || Game.gameState==ChewingGumSimulator.STATE.AdventureFive || Game.gameState==ChewingGumSimulator.STATE.AdventureSix || Game.gameState==ChewingGumSimulator.STATE.AdventureSeven || Game.gameState==ChewingGumSimulator.STATE.AdventureEight || Game.gameState==ChewingGumSimulator.STATE.AdventureNine || Game.gameState==ChewingGumSimulator.STATE.AdventureTen){
            if(velX>0){
                distanceTraveled+=velX;
            }
            if(velX<0){
                distanceTraveled+=velX;
            }
            x = ChewingGumSimulator.clamp((int)x,5,ChewingGumSimulator.WIDTH/2+100);
            
            
            if(playerJumping==true){
            if(jumpTimer>0){
                jumpTimer--;
            }
            if(jumpTimer==0)
            {
                playerJumping=false;
                jumpTimer=10;
            }
        }
            
            
            if(this.getY()<Game.HEIGHT-66 && onPlatform==false && playerJumping==false){
               
                velY = 2;
            }
            
        }
        
        if(Shield==false){
            x = ChewingGumSimulator.clamp((int)x,2,ChewingGumSimulator.WIDTH-24);
            y = ChewingGumSimulator.clamp((int)y,80,ChewingGumSimulator.HEIGHT-47);
            /*if(this.getId() == ID.Player){
            if(ChewingGumSimulator.PlayerColor == 0)
            {handler.addObject( new Trail(x,y,ID.Trail,Color.white,17,17,0.1f,handler));}
            else if(ChewingGumSimulator.PlayerColor == 1)
            {
                if(velX!=0 || velY!=0)
                {handler.addObject( new Trail(x,y,ID.Trail,Color.orange,17,17,0.1f,handler));}
            }
            
            else if(ChewingGumSimulator.PlayerColor == 2)
            {handler.addObject( new Trail(x,y,ID.Trail,Color.green,17,17,0.1f,handler));}
            else if(ChewingGumSimulator.PlayerColor == 3)
            {handler.addObject( new Trail(x,y,ID.Trail,Color.cyan,17,17,0.1f,handler));}
            else if(ChewingGumSimulator.PlayerColor == 4)
            {handler.addObject( new Trail(x,y,ID.Trail,Color.red,17,17,0.1f,handler));}
            else if(ChewingGumSimulator.PlayerColor == 5)
            {handler.addObject( new Trail(x,y,ID.Trail,Color.yellow,17,17,0.1f,handler));}
            else if(ChewingGumSimulator.PlayerColor == 6)
            {handler.addObject( new Trail(x,y,ID.Trail,Color.magenta,17,17,0.1f,handler));}
            else if(ChewingGumSimulator.PlayerColor == 7)
            {handler.addObject( new Trail(x,y,ID.Trail,Color.blue,17,17,0.1f,handler));}
            else if(ChewingGumSimulator.PlayerColor == 8)
            {handler.addObject( new Trail(x,y,ID.Trail,Color.pink,17,17,0.1f,handler));}
            
            } */
        }
        collision();
        
    }
    
    private void collision(){
        if(this.getId()==ID.Player2){
            for(int j=0;j < handler.object.size(); j++){
            GameObject iaraObject = handler.object.get(j);
            if(iaraObject.getId() == ID.PlayerRocket){
            
            if(getBounds().intersects(iaraObject.getBounds()))
            {
                HUD.HEALTH2--;
                
            }
            
            
        }
            
            if(iaraObject.getId() == ID.SoftCoin){
            
            if(getBounds().intersects(iaraObject.getBounds()))
            {
                HUD.COINS++;
                
            }
            
            
        }
            if(iaraObject.getId() == ID.RedberryBush || iaraObject.getId() == ID.BlackberryBush || iaraObject.getId() == ID.BlueberryBush){
            
            if(getBounds().intersects(iaraObject.getBounds()))
            {   if(Shield==false){
                HUD.HEALTH2-=0.3;}
                
                
            }
            
            
        }
            
            if(iaraObject.getId() == ID.FruityTree || iaraObject.getId() == ID.UnfruityTree || iaraObject.getId() == ID.SnowTree || iaraObject.getId() == ID.AutumnTree || iaraObject.getId() == ID.DeadTree){
            
            if(getBounds().intersects(iaraObject.getBounds()))
            {   if(Shield==false){
                HUD.HEALTH2-=0.7;}
                
                
            }
            
            
            
        }
            
            if(iaraObject.getId() == ID.DangerousCactus){
            
            if(getBounds().intersects(iaraObject.getBounds()))
            {  if(Shield==false){
                HUD.HEALTH2--;}
                
                
            }
            
            
        }
            
            if(iaraObject.getId() == ID.RainDrop){
            
            if(getBounds().intersects(iaraObject.getBounds()))
            {
                HUD.HEALTH2-=0.1;
                handler.removeObject(iaraObject);
                
            }
            
            
        }
            
            
            
            if(iaraObject.getId() == ID.SnowDrop){
            
            if(getBounds().intersects(iaraObject.getBounds()))
            {
                HUD.HEALTH2-=0.2;
                handler.removeObject(iaraObject);
                
            }
            
            
        }
            
            if(iaraObject.getId() == ID.FalloutDrop){
            
            if(getBounds().intersects(iaraObject.getBounds()))
            {
                HUD.HEALTH2-=0.1;
                handler.removeObject(iaraObject);
                
            }
            
            
        }
            if(iaraObject.getId() == ID.ArenaTrophy){
            
            if(getBounds().intersects(iaraObject.getBounds()))
            {
                Game.gameState = ChewingGumSimulator.STATE.ArenaWP2;
                handler.clearEnemies();
            }
            
            
        }
            if(iaraObject.getId() == ID.VerticalWall || iaraObject.getId() == ID.HorizontalWall){
            
            /*if(getBounds().intersects(incaObject.getBounds()))
            {   if(Game.gameState!=ChewingGumSimulator.STATE.ArenaEditor){
                velX*=-1;
                velY*=-1;
                touchingWall = true;
                HUD.HEALTH-=0.1;}
            }
            else
                touchingWall = false;*/
            if(iaraObject.getId()==ID.VerticalWall){
            if(iaraObject.getY()<this.getY() && iaraObject.getY()+50>this.getY()){
                if(this.getX()>iaraObject.getX()+5 && this.getX()<iaraObject.getX()+10){
                    this.setX(iaraObject.getX()+10);
                }
                if(this.getX()+17<iaraObject.getX()+5 && this.getX()+17>iaraObject.getX()){
                    this.setX(iaraObject.getX()-17);
                }
                
                
            }
            if(this.getX()>iaraObject.getX()-16 && this.getX()+17<iaraObject.getX()+18){
            if(this.getY()+17>iaraObject.getY() && this.getY()+17<iaraObject.getY()+50){
                this.setY(iaraObject.getY()-17);
            }
            if(this.getY()<iaraObject.getY()+50 && this.getY()>iaraObject.getY()){
                this.setY(iaraObject.getY()+50);
            }
            
            }
            }
            if(iaraObject.getId()==ID.HorizontalWall){
            if(iaraObject.getX()<this.getX() && iaraObject.getX()+50>this.getX()){
                if(this.getY()+17>iaraObject.getY() && this.getY()+17<iaraObject.getY()+5){
                    this.setY(iaraObject.getY()-17);
                }
                if(this.getY()<iaraObject.getY()+10 && this.getY()>iaraObject.getY()+5){
                    this.setY(iaraObject.getY()+10);
                }
            }
            
            if(this.getY()>iaraObject.getY()-18 && this.getY()+17<iaraObject.getY()+18){
                if(this.getX() + 17 > iaraObject.getX() && this.getX()+17 < iaraObject.getX()+4){
                    this.setX(iaraObject.getX()-17);
                }
                if(this.getX() < iaraObject.getX()+50 && this.getX() > iaraObject.getX()+45){
                    this.setX(iaraObject.getX()+50);
                }
            }
            
            }
            
            
        }
            
            if(iaraObject.getId() == ID.RadioactiveVerticalWall || iaraObject.getId() == ID.RadioactiveHorizontalWall){
            
            if(iaraObject.getId()==ID.RadioactiveVerticalWall){
            if(iaraObject.getY()<this.getY() && iaraObject.getY()+50>this.getY()){
                if(this.getX()>iaraObject.getX()+5 && this.getX()<iaraObject.getX()+10){
                    this.setX(iaraObject.getX()+10);
                }
                if(this.getX()+17<iaraObject.getX()+5 && this.getX()+17>iaraObject.getX()){
                    this.setX(iaraObject.getX()-17);
                }
                
                
            }
            if(this.getX()>iaraObject.getX()-16 && this.getX()+17<iaraObject.getX()+18){
            if(this.getY()+17>iaraObject.getY() && this.getY()+17<iaraObject.getY()+50){
                this.setY(iaraObject.getY()-17);
            }
            if(this.getY()<iaraObject.getY()+50 && this.getY()>iaraObject.getY()){
                this.setY(iaraObject.getY()+50);
            }
            
            }
            }
            
            if(iaraObject.getId()==ID.RadioactiveHorizontalWall){
            if(iaraObject.getX()<this.getX() && iaraObject.getX()+50>this.getX()){
                if(this.getY()+17>iaraObject.getY() && this.getY()+17<iaraObject.getY()+5){
                    this.setY(iaraObject.getY()-17);
                }
                if(this.getY()<iaraObject.getY()+10 && this.getY()>iaraObject.getY()+5){
                    this.setY(iaraObject.getY()+10);
                }
            }
            if(this.getY()>iaraObject.getY()-18 && this.getY()+17<iaraObject.getY()+18){
                if(this.getX() + 17 > iaraObject.getX() && this.getX()+17 < iaraObject.getX()+4){
                    this.setX(iaraObject.getX()-17);
                }
                if(this.getX() < iaraObject.getX()+50 && this.getX() > iaraObject.getX()+45){
                    this.setX(iaraObject.getX()+50);
                }
            }
            
            }
            
            
        }
            
            
        }}
       if(this.getId()==ID.Player){
            for(int j=0;j < handler.object.size(); j++){
            GameObject incaObject = handler.object.get(j);
            
            
            if(incaObject.getId() == ID.PlayerRocket2){
            
            if(getBounds().intersects(incaObject.getBounds()))
            {
                HUD.HEALTH--;
                
            }
            
            
        }
            
            
            
            if(incaObject.getId() == ID.StraightParticle || incaObject.getId() == ID.GreaseDecoration || incaObject.getId() == ID.GreaseDecoration2 || incaObject.getId() == ID.GreaseDecoration3 || incaObject.getId() == ID.RedClothDecoration  || incaObject.getId() == ID.RedClothDecoration2 || incaObject.getId() == ID.RedClothDecoration3 || incaObject.getId() == ID.WhiteClothDecoration || incaObject.getId() == ID.WhiteClothDecoration2 || incaObject.getId() == ID.WhiteClothDecoration3 || incaObject.getId() == ID.PlateletDecoration || incaObject.getId() == ID.PlateletDecoration2 || incaObject.getId() == ID.PlateletDecoration3){
            
            if(getBounds().intersects(incaObject.getBounds()))
            { 
                if(Shield==false){
                    
                HUD.HEALTH--;}
                
            }
            
            
        }
            
            if(incaObject.getId() == ID.SmallLift){
            
            if(getBounds().intersects(incaObject.getBounds()))
            { 
                
                if(this.getY()>incaObject.getY()-17){
                    this.setY(incaObject.getY()-17);
                onPlatform = true;}
                
                
                if(incaObject.getY()<y)
                {
                    playerJumping = false;
                    
                    
                }
                
            }
            else if(this.getX()>incaObject.getX()-5 && this.getX()<incaObject.getX()+70 && this.getY()>incaObject.getY() && this.getY()<incaObject.getY()+9){
                this.setY(incaObject.getY()+9);
                
            }
            else
            {
                onPlatform = false;
                
            }
            
            
        }
            
            if(incaObject.getId() == ID.MediumLift){
            
            if(getBounds().intersects(incaObject.getBounds()))
            { 
                
                
                if(this.getY()>incaObject.getY()-17){
                    this.setY(incaObject.getY()-17);
                onPlatform = true;}
                
            }
            
            else if(this.getX()>incaObject.getX()-5 && this.getX()<incaObject.getX()+120 && this.getY()>incaObject.getY() && this.getY()<incaObject.getY()+9){
                this.setY(incaObject.getY()+9);
                
            }
            else
            {
                onPlatform = false;
            }
            /*if(this.getY()+17>incaObject.getY() && this.getY()<incaObject.getY()){
               if((this.getX()>incaObject.getX())&&(this.getX()+17<incaObject.getX()+120)){
                    this.setY(incaObject.getY()+10);
                }
                if(this.getX()<incaObject.getX() && this.getX()+17<incaObject.getX()+120){
                    this.setX(incaObject.getX()-17);
                }
                if(this.getX()<incaObject.getX()+120 && this.getX()+17>incaObject.getX()+120){
                    this.setX(incaObject.getX()+120);
                }
           }
            if((this.getY()<incaObject.getY()+5)&&(this.getY()+17>incaObject.getY()+10)){
                if((this.getX()>incaObject.getX())&&(this.getX()+17<incaObject.getX()+120)){
                    this.setY(incaObject.getY()+10);
                }
                if(this.getX()<incaObject.getX() && this.getX()+17<incaObject.getX()+120){
                    this.setX(incaObject.getX()-17);
                }
                if(this.getX()<incaObject.getX()+120 && this.getX()+17>incaObject.getX()+120){
                    this.setX(incaObject.getX()+120);
                }
            }
            
            else if(this.getY()+17<incaObject.getY()+5 && this.getY()>incaObject.getY()-25){
                if(this.getVelY()>0){
                    this.setVelY(0);
                    
                }
                velY = ChewingGumSimulator.clamp(velY,0,8);
                y = ChewingGumSimulator.clamp(y,80,incaObject.getY());
                onPlatform=true;
            }*/
           
           
            
            
        }
            
            if(incaObject.getId() == ID.BigLift){
            
            if(getBounds().intersects(incaObject.getBounds()))
            { 
                
                
                if(this.getY()>incaObject.getY()-17){
                    this.setY(incaObject.getY()-17);
                onPlatform = true;}
                
                
                
                
            }
            
            else if(this.getX()>incaObject.getX()-5 && this.getX()<incaObject.getX()+180 && this.getY()>incaObject.getY() && this.getY()<incaObject.getY()+9){
                this.setY(incaObject.getY()+9);
                
            }
            else
            {
                onPlatform = false;
            }
            
            
        }
            
            if(incaObject.getId() == ID.StraightTurret){
            
            if(getBounds().intersects(incaObject.getBounds()))
            { 
                if(Shield==false){
                    
                HUD.HEALTH-=0.5f;}
                
            }
            
            
        }
            
            if(incaObject.getId() == ID.ParticleTurret || incaObject.getId() == ID.AcidDecoration || incaObject.getId() == ID.AcidDecoration2 || incaObject.getId() == ID.AcidDecoration3 || incaObject.getId() == ID.SacidDecoration || incaObject.getId() == ID.SacidDecoration2 || incaObject.getId() == ID.SacidDecoration3 || incaObject.getId() == ID.FatDecoration || incaObject.getId() == ID.FatDecoration2 || incaObject.getId() == ID.FatDecoration3 || incaObject.getId() == ID.InsulinDecoration || incaObject.getId() == ID.InsulinDecoration2 || incaObject.getId() == ID.InsulinDecoration3){
            
            if(getBounds().intersects(incaObject.getBounds()))
            { 
                if(Shield==false){
                    
                HUD.HEALTH-=0.7f;}
                
            }
            
            
        }
            
            if(incaObject.getId() == ID.ThunderDrop  || incaObject.getId() == ID.AirDecoration || incaObject.getId() == ID.AirDecoration2|| incaObject.getId() == ID.AirDecoration3 || incaObject.getId() == ID.WaterDecoration || incaObject.getId() == ID.WaterDecoration2 || incaObject.getId() == ID.WaterDecoration3 || incaObject.getId() == ID.EdemaDecoration || incaObject.getId() == ID.EdemaDecoration2 || incaObject.getId() == ID.EdemaDecoration3 || incaObject.getId() == ID.PTissueDecoration || incaObject.getId() == ID.PTissueDecoration2 || incaObject.getId() == ID.PTissueDecoration3){
            
            if(getBounds().intersects(incaObject.getBounds()))
            { 
                if(Shield==false){
                    
                HUD.HEALTH-=2.5;}
                
            }
            
            
        }
            
            if(incaObject.getId() == ID.AutoTurret){
            
            if(getBounds().intersects(incaObject.getBounds()))
            { 
                if(Shield==false){
                    
                HUD.HEALTH-=0.9f;}
                
            }
            
            
        }
            
                if(incaObject.getId() == ID.GreaseBall || incaObject.getId() == ID.GreaseBallBack){
            
            if(getBounds().intersects(incaObject.getBounds()))
            { 
                if(Shield==false){
                    
                HUD.HEALTH-=0.1;}
                
            }
            
            
        }
                if(incaObject.getId() == ID.BloodCloth || incaObject.getId() == ID.BloodClothBack){
            
            if(getBounds().intersects(incaObject.getBounds()))
            { 
                if(Shield==false){
                    
                HUD.HEALTH-=0.3;}
                
            }
            
            
        }
                
                if(incaObject.getId() == ID.AcidPuddle || incaObject.getId() == ID.AcidPuddleBack){
            
            if(getBounds().intersects(incaObject.getBounds()))
            { 
                if(Shield==false){
                    
                HUD.HEALTH-=0.8;}
                
            }
            
            
        }
            
            if(incaObject.getId() == ID.SodaBox){
            
            if(getBounds().intersects(incaObject.getBounds()))
            {
                HUD.BLADDER+=30;
                handler.removeObject(incaObject);
                
            }
            
            
        }
            
            if(incaObject.getId() == ID.Neutrino){
            
            if(getBounds().intersects(incaObject.getBounds()))
            {
                if(Shield==false){
                    HUD.HEALTH-=2;
                }
                
            }
            
            
        }
            
            if(incaObject.getId() == ID.HiggsBoson){
            
            if(getBounds().intersects(incaObject.getBounds()))
            {
                if(Shield==false){
                    HUD.HEALTH-=4;
                }
                
            }
            
            
        }
            
            if(incaObject.getId() == ID.AtomFusioner){
            
            if(getBounds().intersects(incaObject.getBounds()))
            {
                if(Shield==false){
                    HUD.HEALTH--;
                }
                
            }
            
            
        }
            
            if(incaObject.getId() == ID.BossTwo){
            
            if(getBounds().intersects(incaObject.getBounds()))
            {
                if(Shield==false){
                    HUD.HEALTH-=2;
                }
                
            }
            
            
        }
            
            if(incaObject.getId() == ID.BossTwoBullet){
            
            if(getBounds().intersects(incaObject.getBounds()))
            {
                if(Shield==false){
                    HUD.HEALTH-=2;
                }
                
            }
            
            
        }
            
            if(incaObject.getId() == ID.BossTwoSucker){
            
            if(getBounds().intersects(incaObject.getBounds()))
            {
                if(Shield==false){
                    HUD.HEALTH-=2;
                }
                
            }
            
            
        }
            
            if(incaObject.getId() == ID.Antibody){
            
            if(getBounds().intersects(incaObject.getBounds()))
            {    if(Shield==false){
                 HUD.HEALTH--;
                 handler.removeObject(incaObject);
           
            
            }
            else if(Shield==true){
                handler.removeObject(incaObject);
            }
                
            }
            
            
        }
            
            if(incaObject.getId() == ID.BCell){
            
            if(getBounds().intersects(incaObject.getBounds()))
            {    if(Shield==false){
                 HUD.HEALTH-=2;
                 
           
            
            }
            
                
            }
            
            
        }
            
            
            if(incaObject.getId() == ID.TCell){
            
            if(getBounds().intersects(incaObject.getBounds()))
            {    if(Shield==false){
                 HUD.HEALTH-=3;
                 
           
            
            }
            
                
            }
            
            
        }
            
            
            if(incaObject.getId() == ID.BCell){
            
            if(getBounds().intersects(incaObject.getBounds()))
            {    if(Shield==false){
                 HUD.HEALTH-=2;
                 
           
            
            }
            
                
            }
            
            
        }
            
            if(incaObject.getId() == ID.AtomDisengage){
            
            if(getBounds().intersects(incaObject.getBounds()))
            {if(Shield==false)
                HUD.HEALTH-=3;
                
                
            }
            
            
        }
            
            if(incaObject.getId() == ID.fusionOngoing){
            
            if(getBounds().intersects(incaObject.getBounds()))
            {if(Shield==false)
                HUD.HEALTH-=3;
                
                
            }
            
            
        }
            
            if(incaObject.getId() == ID.ParticleDisengage){
            
            if(getBounds().intersects(incaObject.getBounds()))
            {if(Shield==false)
                HUD.HEALTH--;
                
                
            }
            
            
        }
            
            if(incaObject.getId() == ID.LightningBox){
            
            if(getBounds().intersects(incaObject.getBounds()))
            {
                Thunderstruck=true;
                handler.removeObject(incaObject);
                
            }
            
            
        }
            
            if(incaObject.getId() == ID.RainDrop){
            
            if(getBounds().intersects(incaObject.getBounds()))
            {if(Shield==false){
                HUD.HEALTH-=0.1;}
                handler.removeObject(incaObject);
                
            }
            
            
        }
            
            if(incaObject.getId() == ID.SoftTreasure){
            
            if(getBounds().intersects(incaObject.getBounds()))
            {
                if(Game.gameState!=ChewingGumSimulator.STATE.ArenaEditor){
                handler.addObject(new SoftCoin((int)incaObject.getX(),(int)incaObject.getY(),ID.SoftCoin,handler));
                handler.addObject(new SoftCoin((int)incaObject.getX()+40,(int)incaObject.getY()+40,ID.SoftCoin,handler));
                handler.addObject(new SoftCoin((int)incaObject.getX()-40,(int)incaObject.getY()-40,ID.SoftCoin,handler));
                handler.addObject(new SoftCoin((int)incaObject.getX()+40,(int)incaObject.getY()-40,ID.SoftCoin,handler));
                handler.addObject(new SoftCoin((int)incaObject.getX()-40,(int)incaObject.getY()+40,ID.SoftCoin,handler));
                handler.removeObject(incaObject);}
                
            }
            
            
        }
            
            if(incaObject.getId() == ID.SilverSoftTreasure){
            
            if(getBounds().intersects(incaObject.getBounds()))
            {   if(Game.gameState!=ChewingGumSimulator.STATE.ArenaEditor){
                handler.addObject(new SilverSoftCoin((int)incaObject.getX(),(int)incaObject.getY(),ID.SilverSoftCoin,handler));
                handler.addObject(new SilverSoftCoin((int)incaObject.getX()+40,(int)incaObject.getY()+40,ID.SilverSoftCoin,handler));
                handler.addObject(new SilverSoftCoin((int)incaObject.getX()-40,(int)incaObject.getY()-40,ID.SilverSoftCoin,handler));
                handler.addObject(new SilverSoftCoin((int)incaObject.getX()+40,(int)incaObject.getY()-40,ID.SilverSoftCoin,handler));
                handler.addObject(new SilverSoftCoin((int)incaObject.getX()-40,(int)incaObject.getY()+40,ID.SilverSoftCoin,handler));
                handler.removeObject(incaObject);}
                
            }
            
            
        }
            
            
            
            if(incaObject.getId() == ID.SoftCoin){
            
            if(getBounds().intersects(incaObject.getBounds()))
            {   HUD.COINS+=1;
                Game.playerXP+=5;
                handler.removeObject(incaObject);
                
            }
            
            
        }
            
            if(incaObject.getId() == ID.SilverSoftCoin){
            
            if(getBounds().intersects(incaObject.getBounds()))
            {   HUD.COINS+=3;
                Game.playerXP+=15;
                handler.removeObject(incaObject);
                
            }
            
            
        }
            
                if(incaObject.getId() == ID.WhiteCell){
            
            if(getBounds().intersects(incaObject.getBounds()))
            {   if(Shield==false){HUD.HEALTH-=2;}
                
                
            }
            
            
        }
            
            
            if(incaObject.getId() == ID.GoldSoftTreasure){
            
            if(getBounds().intersects(incaObject.getBounds()))
            {   
                if(Game.gameState!=ChewingGumSimulator.STATE.ArenaEditor){
                handler.addObject(new GoldSoftCoin((int)incaObject.getX(),(int)incaObject.getY(),ID.GoldSoftCoin,handler));
                handler.addObject(new GoldSoftCoin((int)incaObject.getX()+40,(int)incaObject.getY()+40,ID.GoldSoftCoin,handler));
                handler.addObject(new GoldSoftCoin((int)incaObject.getX()-40,(int)incaObject.getY()-40,ID.GoldSoftCoin,handler));
                handler.addObject(new GoldSoftCoin((int)incaObject.getX()+40,(int)incaObject.getY()-40,ID.GoldSoftCoin,handler));
                handler.addObject(new GoldSoftCoin((int)incaObject.getX()-40,(int)incaObject.getY()+40,ID.GoldSoftCoin,handler));
                handler.removeObject(incaObject);}
                
            }
            
            
        }
            
            if(incaObject.getId() == ID.GoldSoftCoin){
            
            if(getBounds().intersects(incaObject.getBounds()))
            {   HUD.COINS+=5;
                Game.playerXP+=25;
                handler.removeObject(incaObject);
                
            }
            
            
        }
            
            if(incaObject.getId() == ID.SnowDrop){
            
            if(getBounds().intersects(incaObject.getBounds()))
            { if(Shield==false){
                HUD.HEALTH-=0.2;}
                handler.removeObject(incaObject);
                
            }
            
            
        }
            
            if(incaObject.getId() == ID.RedberryBush || incaObject.getId() == ID.BlackberryBush || incaObject.getId() == ID.BlueberryBush){
            
            if(getBounds().intersects(incaObject.getBounds()))
            {   if(Shield==false){
                HUD.HEALTH-=0.3;}
                
                
            }
            
            
        }
            
            if(incaObject.getId() == ID.FruityTree || incaObject.getId() == ID.UnfruityTree || incaObject.getId() == ID.SnowTree || incaObject.getId() == ID.AutumnTree || incaObject.getId() == ID.DeadTree){
            
            if(getBounds().intersects(incaObject.getBounds()))
            {   if(Shield==false){
                HUD.HEALTH-=0.7;}
                
                
            }
            
            
            
        }
            
            if(incaObject.getId() == ID.DangerousCactus){
            
            if(getBounds().intersects(incaObject.getBounds()))
            {  if(Shield==false){
                HUD.HEALTH--;}
                
                
            }
            
            
        }
            
            if(incaObject.getId() == ID.FalloutDrop){
            
            if(getBounds().intersects(incaObject.getBounds()))
            {  if(Shield==false){
                HUD.HEALTH--;}
                
                
            }
            
            
        }
            
            
            if(incaObject.getId() == ID.BossSucker){
            
            if(getBounds().intersects(incaObject.getBounds()))
            {
                if(Shield==false){
                HUD.HEALTH-=0.5;}
                }
            
            
        }
            
            if(incaObject.getId() == ID.BossTwoSucker){
            
            if(getBounds().intersects(incaObject.getBounds()))
            {
                if(Shield==false){
                HUD.HEALTH--;}
                }
            
            
        }
            
            if(incaObject.getId() == ID.BossThreeSucker){
            
            if(getBounds().intersects(incaObject.getBounds()))
            {
                if(Shield==false){
                HUD.HEALTH-=1.5;}
                }
            
            
        }
            
            if(incaObject.getId() == ID.BossFourSucker){
            
            if(getBounds().intersects(incaObject.getBounds()))
            {
                if(Shield==false){
                HUD.HEALTH-=2;}
                }
            
            
        }
            
            
            if(incaObject.getId() == ID.BossSucker){
            
            if(getBounds().intersects(incaObject.getBounds()))
            {
                if(Shield==false){
                HUD.HEALTH-=3;}
                }
            
            
        }
            
            if(incaObject.getId() == ID.NukeBox){
            
            if(getBounds().intersects(incaObject.getBounds()))
            {   if(HUD.NUKES<10){
                HUD.NUKES++;}
                handler.removeObject(incaObject);
            
            
        }}
            
            if(incaObject.getId() == ID.GrenadeBox){
            
            if(getBounds().intersects(incaObject.getBounds()))
            {
                if(HUD.ATOMS<25){
                HUD.ATOMS++;}
                handler.removeObject(incaObject);
            
            
        }}
            if(incaObject.getId() == ID.ArenaTrophy2){
            
            if(getBounds().intersects(incaObject.getBounds()))
            {
                Game.gameState = ChewingGumSimulator.STATE.ArenaWP1;
                handler.clearEnemies();
            }
            
            
        }
            if(incaObject.getId() == ID.VerticalWall || incaObject.getId() == ID.HorizontalWall){
            
            /*if(getBounds().intersects(incaObject.getBounds()))
            {   if(Game.gameState!=ChewingGumSimulator.STATE.ArenaEditor){
                velX*=-1;
                velY*=-1;
                touchingWall = true;
                HUD.HEALTH-=0.1;}
            }
            else
                touchingWall = false;*/
            if(incaObject.getId()==ID.VerticalWall){
            if(incaObject.getY()<this.getY() && incaObject.getY()+50>this.getY()){
                if(this.getX()>incaObject.getX()+5 && this.getX()<incaObject.getX()+10){
                    this.setX(incaObject.getX()+10);
                }
                if(this.getX()+17<incaObject.getX()+5 && this.getX()+17>incaObject.getX()){
                    this.setX(incaObject.getX()-17);
                }
                
                
            }
            if(this.getX()>incaObject.getX()-16 && this.getX()+17<incaObject.getX()+18){
            if(this.getY()+17>incaObject.getY() && this.getY()+17<incaObject.getY()+50){
                this.setY(incaObject.getY()-17);
            }
            if(this.getY()<incaObject.getY()+50 && this.getY()>incaObject.getY()){
                this.setY(incaObject.getY()+50);
            }
            
            }
            }
            if(incaObject.getId()==ID.HorizontalWall){
            if(incaObject.getX()<this.getX() && incaObject.getX()+50>this.getX()){
                if(this.getY()+17>incaObject.getY() && this.getY()+17<incaObject.getY()+5){
                    this.setY(incaObject.getY()-17);
                }
                if(this.getY()<incaObject.getY()+10 && this.getY()>incaObject.getY()+5){
                    this.setY(incaObject.getY()+10);
                }
            }
            
            if(this.getY()>incaObject.getY()-18 && this.getY()+17<incaObject.getY()+18){
                if(this.getX() + 17 > incaObject.getX() && this.getX()+17 < incaObject.getX()+4){
                    this.setX(incaObject.getX()-17);
                }
                if(this.getX() < incaObject.getX()+50 && this.getX() > incaObject.getX()+45){
                    this.setX(incaObject.getX()+50);
                }
            }
            
            }
            
            
        }
            
            if(incaObject.getId() == ID.RadioactiveVerticalWall || incaObject.getId() == ID.RadioactiveHorizontalWall){
            
            if(incaObject.getId()==ID.RadioactiveVerticalWall){
            if(incaObject.getY()<this.getY() && incaObject.getY()+50>this.getY()){
                if(this.getX()>incaObject.getX()+5 && this.getX()<incaObject.getX()+10){
                    this.setX(incaObject.getX()+10);
                }
                if(this.getX()+17<incaObject.getX()+5 && this.getX()+17>incaObject.getX()){
                    this.setX(incaObject.getX()-17);
                }
                
                
            }
            if(this.getX()>incaObject.getX()-16 && this.getX()+17<incaObject.getX()+18){
            if(this.getY()+17>incaObject.getY() && this.getY()+17<incaObject.getY()+50){
                this.setY(incaObject.getY()-17);
            }
            if(this.getY()<incaObject.getY()+50 && this.getY()>incaObject.getY()){
                this.setY(incaObject.getY()+50);
            }
            
            }
            }
            
            if(incaObject.getId()==ID.RadioactiveHorizontalWall){
            if(incaObject.getX()<this.getX() && incaObject.getX()+50>this.getX()){
                if(this.getY()+17>incaObject.getY() && this.getY()+17<incaObject.getY()+5){
                    this.setY(incaObject.getY()-17);
                }
                if(this.getY()<incaObject.getY()+10 && this.getY()>incaObject.getY()+5){
                    this.setY(incaObject.getY()+10);
                }
            }
            if(this.getY()>incaObject.getY()-18 && this.getY()+17<incaObject.getY()+18){
                if(this.getX() + 17 > incaObject.getX() && this.getX()+17 < incaObject.getX()+4){
                    this.setX(incaObject.getX()-17);
                }
                if(this.getX() < incaObject.getX()+50 && this.getX() > incaObject.getX()+45){
                    this.setX(incaObject.getX()+50);
                }
            }
            
            }
            
            
        }
            
            if(incaObject.getId() == ID.SpeedBooster){
            
            if(getBounds().intersects(incaObject.getBounds()))
            {
                if(SpeedBoosted==false){
                SpeedBoosted=true;
                }
                else if(SpeedBoosted==true){
                    Timer2=2000;
                }
                handler.removeObject(incaObject);
            }
            
            
        }
            
            if(incaObject.getId() == ID.AmmoBox){
            
            if(getBounds().intersects(incaObject.getBounds()))
            {   
                if(ChewingGumSimulator.gameState==ChewingGumSimulator.STATE.Tutorial && ChewingGumSimulator.tutorialStages[8]==true && ChewingGumSimulator.tutorialStages[9]==false){
                         
                         ChewingGumSimulator.tutorialStages[9]=true;
                       }
                HUD.AMMO = 100;
                handler.removeObject(incaObject);
            }
            
            
        }
        if(incaObject.getId() == ID.EMPBox){
            
            if(getBounds().intersects(incaObject.getBounds()))
            {
                HUD.EMPCount++;
                handler.removeObject(incaObject);
            }
            
            
        }
        
        if(incaObject.getId() == ID.HealthBox){
            
            if(getBounds().intersects(incaObject.getBounds()))
            {   
                if(ChewingGumSimulator.gameState==ChewingGumSimulator.STATE.Tutorial && ChewingGumSimulator.tutorialStages[8]==true && ChewingGumSimulator.tutorialStages[9]==false){
                         
                         ChewingGumSimulator.tutorialStages[9]=true;
                       }
                HUD.HEALTH = 100;
                handler.removeObject(incaObject);
            }
            
            
        }
        
        if(incaObject.getId() == ID.BossOneBullet){
            
            if(getBounds().intersects(incaObject.getBounds()))
            { if(Shield == false)
            {HUD.HEALTH -= 0.5;}
            }
            
            
        }
        
        
        
        if(incaObject.getId() == ID.BasicEnemy || incaObject.getId() == ID.FastEnemy || incaObject.getId() == ID.SmartEnemy || incaObject.getId() == ID.BossOne || incaObject.getId() == ID.BossTwo || incaObject.getId() == ID.BossThree || incaObject.getId() == ID.BossFour || incaObject.getId() == ID.BossFive || incaObject.getId() == ID.BossSix || incaObject.getId() == ID.BossSeven || incaObject.getId() == ID.BossEight || incaObject.getId() == ID.BossNine || incaObject.getId() == ID.BossTen)
        {
            if(getBounds().intersects(incaObject.getBounds()))
            {  if(Shield==false){
                if(incaObject.getId() == ID.BossThree || incaObject.getId() == ID.BossFour || incaObject.getId() == ID.BossFive || incaObject.getId() == ID.BossSix || incaObject.getId() == ID.BossSeven || incaObject.getId() == ID.BossEight || incaObject.getId() == ID.BossNine || incaObject.getId() == ID.BossTen )
                { HUD.HEALTH-=3;}
                else
                {HUD.HEALTH -= 1;}
            }
            }
        }
        
        if(incaObject.getId() == ID.ShieldPower){
            
            if(getBounds().intersects(incaObject.getBounds()))
            {
                if(Shield==true){
                handler.removeObject(incaObject);
                Timer=3000;
                }
                else if(Shield==false){
                handler.removeObject(incaObject);
                Shield=true;
                }
            }
            
            
        }
        
        
            
            
        }}
        
    }
    private AlphaComposite makeTransparent(float alpha){
        int type = AlphaComposite.SRC_OVER;
        return AlphaComposite.getInstance(type, alpha);
    }

    
    public void render(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        if(Game.gameState==ChewingGumSimulator.STATE.ArenaEditor){
            g.setColor(Color.red);
            g.drawLine((int)x, (int)y-5,(int)x, (int)y+6);
            g.drawLine((int)x-6, (int)y, (int)x+5, (int)y);
            
            g2d.setComposite(makeTransparent(alpha));
            
        }
        else{
            
            g2d.setComposite(makeTransparent(1));
        if(id == ID.Player){
            
            
        
        
            
        if(ChewingGumSimulator.PlayerColor==0){
        
        g.setColor(Color.white);
        g.fillOval((int)x,(int)y,17,17);
        if(Shield==true)
        {   g.setColor(Color.cyan);
            g.drawOval((int)x-3,(int)y-3,23,23);}
        }
        
        else if(ChewingGumSimulator.PlayerColor==1){
        
        g.setColor(Color.orange);
        g.fillOval((int)x,(int)y,17,17);
        g.setColor(Color.black);
        g.fillRect((int)x+3,(int)y+3,1,1);
        g.fillRect((int)x+13,(int)y+3,1,1);
        g.fillRect((int)x+3,(int)y+13,11,1);}
        
        else if(ChewingGumSimulator.PlayerColor==2){
        
        g.setColor(Color.green);
        g.fillOval((int)x,(int)y,17,17);}
        
        else if(ChewingGumSimulator.PlayerColor==3){
        
        g.setColor(Color.cyan);
        g.fillOval((int)x,(int)y,17,17);}
        
        else if(ChewingGumSimulator.PlayerColor==4){
        
        g.setColor(Color.red);
        g.fillOval((int)x,(int)y,17,17);}
        
        else if(ChewingGumSimulator.PlayerColor==5){
        
        g.setColor(Color.yellow);
        g.fillOval((int)x,(int)y,17,17);}
        
        else if(ChewingGumSimulator.PlayerColor==6){
        
        g.setColor(Color.magenta);
        g.fillOval((int)x,(int)y,17,17);}
        
        else if(ChewingGumSimulator.PlayerColor==7){
        
        g.setColor(Color.blue);
        g.fillOval((int)x,(int)y,17,17);}
        
        else if(ChewingGumSimulator.PlayerColor==8){
        
        g.setColor(Color.pink);
        g.fillOval((int)x,(int)y,17,17);}
         
        
        }
        if(id == ID.Player2)
        {
        g.setColor(Color.cyan);
        g.fillOval((int)x,(int)y,17,17);
        }
        }
        
        //DRAW PIXELS POSITION
        //g.drawString("X: "+(int)x,(int)x+20,(int)y+10);
        //g.drawString("Y: "+(int)y,(int)x+20,(int)y+20);
    
    }
    
    
        
}  
        
        
        
        
        
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

    
    
    

