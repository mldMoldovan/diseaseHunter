
package chewing.gum.simulator;

import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.Color;
import java.util.Random;


public class MalignCell extends GameObject{
    
    private Handler handler;
    
    Random r = new Random();
    
    private int timer=80;
    
    private int timer2 = 50;
    private int malignTimer = 5000;
    private float MalignHealth = 100;
    private float anothergreenvalue = 254f;
    
    
    
    public MalignCell(float x, float y, ID id, Handler handler){
        super(x,y,id);
        this.handler = handler;
        
        
        velX = 0;
        velY = 1;
    }
    
    
    public void tick(){
        if(malignTimer>0){
            malignTimer--;
        }
        
        x+=velX;
        y+=velY;
        anothergreenvalue = MalignHealth *2;
        MalignHealth = ChewingGumSimulator.clamp(MalignHealth,0,100);
        if(timer <= 0) velY = 0;
        else
            timer--;
      
        if(timer <= 0) timer2--;
        if(timer2 <= 0) {
            if(velX==0) velX = 1;
            
            int spawn = r.nextInt(10);
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
        
        
        if(MalignHealth==0)
        {   if(malignTimer<0){
                Spawn.eventRunning=false;
            }
            handler.addObject(new GoldSoftTreasure((int)x,(int) y+80, ID.GoldSoftTreasure,handler));
            handler.removeObject(this);
            MalignHealth=100;
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
                handler.removeObject(tempObject);
                for(int j=0;j < handler.object.size(); j++){
                GameObject tempoObject = handler.object.get(j);
                if(tempoObject.getId()==ID.MalignCell)
                {MalignHealth--;}
            }
        }
        
        
        
        
        }
        
        if(tempObject.getId() == ID.ParticleDisengage2)
        {
            if(getBounds().intersects(tempObject.getBounds()))
            {
                handler.removeObject(tempObject);
                if(MalignHealth<3){
                    MalignHealth=0;
                }
                else
                    MalignHealth-=3;
        }
        
        
        
        
        }
        
        if(tempObject.getId() == ID.PlayerLightning)
        {
            if(getBounds().intersects(tempObject.getBounds()))
            {
                handler.removeObject(tempObject);
                for(int j=0;j < handler.object.size(); j++){
                GameObject tempoObject = handler.object.get(j);
                if(tempoObject.getId()==ID.MalignCell)
                {   if(MalignHealth<2){
                    MalignHealth=0;
                }else
                    MalignHealth-=2;}
            }
        }
        
        
        
        
        }
    }}
    
    
    public void render(Graphics g){
        g.setColor(Color.cyan);
        g.fillRect((int)x,(int)y,30,30);
        
        g.setColor(Color.gray);
        g.fillRect((int)x+5,(int)y-20, 20, 3);
        
        g.setColor(Color.black);
        g.fillRect((int)x+5,(int)y+20, 20, 3);
        
        g.fillRect((int)x+5,(int)y+5, 5, 5);
        g.fillRect((int)x+20,(int)y+5, 5, 5);
        
        g.fillRect((int)x+5,(int)y+23, 5, 5);
        g.fillRect((int)x+20,(int)y+23, 5, 5);
        
        g.setColor(new Color(75,(int)anothergreenvalue,0));
        g.fillRect((int)x+5, (int)y-20,(int) MalignHealth * 2 /10, 3);
        g.setColor(Color.white);
        g.drawRect((int)x+5, (int)y-20,(int) MalignHealth * 2 /10, 3);
    }
    
}
