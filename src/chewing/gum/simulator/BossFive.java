
package chewing.gum.simulator;

import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.Color;
import java.util.Random;


public class BossFive extends GameObject{
    
    private Handler handler;
    
    Random r = new Random();
    
    private int timer=80;
    
    private int timer2 = 50;
    private float Boss5Health = 100;
    private float anothergreenvalue = 254f;
    
    
    
    public BossFive(float x, float y, ID id, Handler handler){
        super(x,y,id);
        this.handler = handler;
        
        
        velX = 0;
        velY = 1;
    }
    
    
    public void tick(){
        x+=velX;
        y+=velY;
        Boss5Health = ChewingGumSimulator.clamp(Boss5Health,0,100);
        anothergreenvalue = Boss5Health *2;
        
        if(timer <= 0) velY = 0;
        else
            timer--;
      
        if(timer <= 0) timer2--;
        if(timer2 <= 0) {
            if(velX==0) velX = 1;
            if(this.getX()<100 && this.getVelY()==0){
                velX=0;
                velY=1;
            }
            if(this.getY()>150 && this.getVelY()!=0){
                velX=0;
                velY=-1*velY;
            }
            if(this.getY()<150 && this.getVelY()<0){
                velX=-1;
                velY=0;
            }
            
            int spawn = r.nextInt(8);
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
        if(Boss5Health==70 && ChewingGumSimulator.gameState!=ChewingGumSimulator.STATE.AdventureFive)
        { handler.addObject(new BossFiveSucker((ChewingGumSimulator.WIDTH / 2)-48,0,ID.BossThreeSucker,handler));
           }
        
        if(Boss5Health==0)
            
        {   ChewingGumSimulator.trophiesStatus[4]=true;
            
            
            if(ChewingGumSimulator.gameState==ChewingGumSimulator.STATE.AdventureFive){
         
               ChewingGumSimulator.gameState=ChewingGumSimulator.STATE.AdventureFiveWon;
               ChewingGumSimulator.adventureStatus[5]=true;
               ChewingGumSimulator.SaveGame();
               
            
        
        }
            
            
            
            if(x<100){
            handler.addObject(new GoldSoftTreasure((int)x+100,(int) y+120, ID.GoldSoftTreasure,handler));}
            if(x>ChewingGumSimulator.WIDTH-100){
            handler.addObject(new GoldSoftTreasure((int)x-100,(int) y+120, ID.GoldSoftTreasure,handler));}
            else{
                handler.addObject(new GoldSoftTreasure((int)x,(int) y+120, ID.GoldSoftTreasure,handler));
            }
            handler.removeObject(this);
            Boss5Health=100;}
    
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
                ChewingGumSimulator.playerXP+=100;}
                Boss5Health-=0.3f;
            }
        }
        
        
        
        
        
        
        if(tempObject.getId() == ID.ParticleDisengage2)
        {
            if(getBounds().intersects(tempObject.getBounds()))
            {
                if(ChewingGumSimulator.playerXP<100000){
                ChewingGumSimulator.playerXP+=400;}
                Boss5Health-=0.5f;
        }
        
        
        
        
        }
        
        if(tempObject.getId() == ID.PlayerLightning)
        {
            if(getBounds().intersects(tempObject.getBounds()))
            {
                
                if(ChewingGumSimulator.playerXP<100000){
                ChewingGumSimulator.playerXP+=250;}
                Boss5Health-=0.6f;
            }
        }
        
        
        
        
        
    }}
    
    
    public void render(Graphics g){
        g.setColor(Color.pink);
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
        g.fillRect((int)x+5, (int)y-20,(int) Boss5Health * 2 /10, 3);
        g.setColor(Color.white);
        g.drawRect((int)x+5, (int)y-20,(int) Boss5Health * 2 /10, 3);
    }
    
}
