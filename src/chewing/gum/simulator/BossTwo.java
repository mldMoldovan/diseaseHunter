
package chewing.gum.simulator;

import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.Color;
import java.util.Random;


public class BossTwo extends GameObject{
    
    private Handler handler;
    
    Random r = new Random();
    
    private int timer=80;
    
    private int timer2 = 50;
    private float Boss2Health = 200;
    private float anothergreenvalue = 254f;
    
    
    
    public BossTwo(float x, float y, ID id, Handler handler){
        super(x,y,id);
        this.handler = handler;
        
        
        velX = 0;
        velY = 1;
    }
    
    
    public void tick(){
        x+=velX;
        y+=velY;
        Boss2Health = ChewingGumSimulator.clamp(Boss2Health,0,200);
        anothergreenvalue = Boss2Health;
        
        if(timer <= 0) velY = 0;
        else
            timer--;
      
        if(timer <= 0) timer2--;
        if(timer2 <= 0) {
            if(velX==0){
                velX=2;
            
            }
            if(this.getX()<ChewingGumSimulator.WIDTH/2 && velX<0){
                velY=0.2f;
            }
            else if(this.getX()<ChewingGumSimulator.WIDTH/2 && velX>0){
                velY=-0.2f;
            }
            else if(this.getX()>ChewingGumSimulator.WIDTH/2 && velX>0){
                velY=0.2f;
            }
            else if(this.getX()>ChewingGumSimulator.WIDTH/2 && velX<0){
                velY=-0.2f;
            }
            int spawn = r.nextInt(15);
            if(spawn == 0) 
                if(velX > 0)
                {
                handler.addObject(new BossTwoBullet((int)x+32,(int) y+15, ID.BossTwoBullet,handler));}
                else if(velX < 0)
                {       
                handler.addObject(new BossTwoBullet((int)x,(int) y+15, ID.BossTwoBullet,handler));}
                    }         
        //if(y<= 0 || y >= ChewingGumSimulator.HEIGHT-32) velY *= -1;
        if(x<= 0 || x >= ChewingGumSimulator.WIDTH-25) velX *= -1;
        
        //handler.addObject( new Trail(x,y,ID.Trail,Color.blue,30,30,0.02f,handler));
        collision();
        if(Boss2Health==70 && ChewingGumSimulator.gameState!=ChewingGumSimulator.STATE.AdventureTwo)
        {   if(ChewingGumSimulator.gameState!=ChewingGumSimulator.STATE.AdventureOne){
            handler.addObject(new BossTwoSucker((ChewingGumSimulator.WIDTH / 2)-48,0,ID.BossTwoSucker,handler));
        }
        }
        
        if(Boss2Health==0)
        {   ChewingGumSimulator.trophiesStatus[1]=true;
            if(ChewingGumSimulator.gameState==ChewingGumSimulator.STATE.AdventureTwo){
         
               ChewingGumSimulator.gameState=ChewingGumSimulator.STATE.AdventureTwoWon;
               ChewingGumSimulator.adventureStatus[2]=true;
               ChewingGumSimulator.SaveGame();
            
        
        }
            
            
            handler.addObject(new GoldSoftTreasure((int)x,(int) y+80, ID.GoldSoftTreasure,handler));
            handler.removeObject(this);}
    
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
                ChewingGumSimulator.playerXP+=10;}
                Boss2Health--;
            }
        }
        
        
        
        
        
        
        if(tempObject.getId() == ID.ParticleDisengage2)
        {
            if(getBounds().intersects(tempObject.getBounds()))
            {
                if(ChewingGumSimulator.playerXP<100000){
                ChewingGumSimulator.playerXP+=50;}
                Boss2Health--;
        }
        
        
        
        
        }
        
        if(tempObject.getId() == ID.PlayerLightning)
        {
            if(getBounds().intersects(tempObject.getBounds()))
            {
                
                if(ChewingGumSimulator.playerXP<100000){
                ChewingGumSimulator.playerXP+=30;}
                Boss2Health-=2;
            
        }
        }
        
        
        
        
        
    }}
    
    
    public void render(Graphics g){
        g.setColor(Color.gray);
        g.fillRoundRect((int)x,(int)y,30,30,10,10);
        
        g.setColor(Color.gray);
        g.fillRect((int)x+5,(int)y-20, 20, 3);
        
        g.setColor(Color.black);
        g.fillRect((int)x+5,(int)y+20, 20, 3);
        
        g.fillRect((int)x+5,(int)y+5, 5, 5);
        g.fillRect((int)x+20,(int)y+5, 5, 5);
        
        g.fillRect((int)x+5,(int)y+13, 5, 5);
        g.fillRect((int)x+20,(int)y+13, 5, 5);
        
        g.setColor(new Color(75,(int)anothergreenvalue,0));
        g.fillRect((int)x+5, (int)y-20,(int) Boss2Health /10, 3);
        g.setColor(Color.white);
        g.drawRect((int)x+5, (int)y-20,(int) Boss2Health /10, 3);
    }
    
}

