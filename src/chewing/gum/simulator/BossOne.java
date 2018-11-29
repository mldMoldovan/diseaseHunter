
package chewing.gum.simulator;

import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.Color;
import java.util.Random;


public class BossOne extends GameObject{
    
    private Handler handler;
    
    Random r = new Random();
    
    private int timer=80;
    private GameObject player;
    private int timer2 = 50;
    private float BossHealth = 100;
    private float anothergreenvalue = 254f;
    
    
    
    public BossOne(float x, float y, ID id, Handler handler){
        super(x,y,id);
        this.handler = handler;
        
        
        velX = 0;
        velY = 1;
        
        for(int i=0;i<handler.object.size();i++)
        {if(handler.object.get(i).getId() == ID.Player)
            player = handler.object.get(i);
            
        }
            
        
    }
    
    public float getBossOneHealth(){
        return BossHealth;
    }
    
    
    public void tick(){
        x+=velX;
        y+=velY;
        BossHealth = ChewingGumSimulator.clamp(BossHealth,0,100);
        anothergreenvalue = BossHealth *2;
        
        if(timer <= 0) velY = 0;
        else
            timer--;
      
        if(timer <= 0) timer2--;
        if(timer2 <= 0) {
            if(velX==0) velX = 1;
           
            int spawn = r.nextInt(15);
            if(spawn == 0) 
                if(velX > 0)
                {
                handler.addObject(new BossOneBullet((int)x+32,(int) y+15, ID.BossOneBullet,handler));}
                else if(velX < 0)
                {       
                handler.addObject(new BossOneBullet((int)x,(int) y+15, ID.BossOneBullet,handler));}
                    }         
        //if(y<= 0 || y >= ChewingGumSimulator.HEIGHT-32) velY *= -1;
        if(x<= 0 || x >= ChewingGumSimulator.WIDTH-25) velX *= -1;
        
        //handler.addObject( new Trail(x,y,ID.Trail,Color.blue,30,30,0.02f,handler));
        collision();
        if(BossHealth==70)
        {  if(ChewingGumSimulator.gameState==ChewingGumSimulator.STATE.Game){
            handler.addObject(new BossSucker((ChewingGumSimulator.WIDTH / 2)-48,0,ID.BossSucker,handler));
        }
        }
        
        if(BossHealth==0)
            
        {   ChewingGumSimulator.trophiesStatus[0]=true;
            
            if(ChewingGumSimulator.gameState==ChewingGumSimulator.STATE.AdventureOne){
         
               ChewingGumSimulator.gameState=ChewingGumSimulator.STATE.AdventureOneWon;
               ChewingGumSimulator.adventureStatus[1]=true;
               ChewingGumSimulator.SaveGame();
               
            
        
        }
            else if(ChewingGumSimulator.gameState==ChewingGumSimulator.STATE.Tutorial){
         
               ChewingGumSimulator.gameState=ChewingGumSimulator.STATE.FinishTutorial;
               
               ChewingGumSimulator.SaveGame();
               
            
        
        }
        else{
            if(x<100){
            handler.addObject(new GoldSoftTreasure((int)x+100,(int) y+120, ID.GoldSoftTreasure,handler));}
            if(x>ChewingGumSimulator.WIDTH-100){
            handler.addObject(new GoldSoftTreasure((int)x-100,(int) y+120, ID.GoldSoftTreasure,handler));}
            else{
                handler.addObject(new GoldSoftTreasure((int)x,(int) y+120, ID.GoldSoftTreasure,handler));
            }
            handler.removeObject(this);
            BossHealth=100;}
        }
    
    }
    
    public Rectangle getBounds(){
        return new Rectangle((int)x,(int)y,30,30);
    }
    
    private void collision(){
        for(int i=0;i < handler.object.size(); i++){
            GameObject tempObject = handler.object.get(i);
            
        if(tempObject.getId() == ID.PlayerRocket || tempObject.getId() == ID.PlayerRocketH)
        {
            if(getBounds().intersects(tempObject.getBounds()))
            {
                if(ChewingGumSimulator.playerXP<100000){
                ChewingGumSimulator.playerXP+=5;}
                
                BossHealth--;
            }
        }
        
        
        
        
        
        
        if(tempObject.getId() == ID.ParticleDisengage2)
        {
            if(getBounds().intersects(tempObject.getBounds()))
            {
                if(ChewingGumSimulator.playerXP<100000){
                ChewingGumSimulator.playerXP+=25;}
                BossHealth--;
        }
        
        
        
        
        }
        
        if(tempObject.getId() == ID.PlayerLightning)
        {
            if(getBounds().intersects(tempObject.getBounds()))
            {
                
                if(ChewingGumSimulator.playerXP<100000){
                ChewingGumSimulator.playerXP+=15;}
                BossHealth-=2;
            }
        }
        
        
        
        
        
    }}
    
    
    public void render(Graphics g){
        g.setColor(Color.green);
        g.fillRoundRect((int)x,(int)y,30,30,10,10);
        
        g.setColor(Color.gray);
        g.fillRect((int)x+5,(int)y-20, 20, 3);
        
        g.setColor(Color.black);
        g.fillRect((int)x+5,(int)y+20, 20, 3);
        
        g.fillRect((int)x+5,(int)y+5, 5, 5);
        g.fillRect((int)x+20,(int)y+5, 5, 5);
        
        g.fillRect((int)x+5,(int)y+23, 5, 5);
        g.fillRect((int)x+20,(int)y+23, 5, 5);
        
        g.setColor(new Color(75,(int)anothergreenvalue,0));
        g.fillRect((int)x+5, (int)y-20,(int) BossHealth * 2 /10, 3);
        g.setColor(Color.white);
        g.drawRect((int)x+5, (int)y-20,(int) BossHealth * 2 /10, 3);
    }
    
}
