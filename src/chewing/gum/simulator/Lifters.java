
package chewing.gum.simulator;


import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.util.Random;


public class Lifters extends GameObject{
    
    private Handler handler;
    private Random r = new Random();
    private int chestSpawn;
    private float alpha = 1;
    private int DisTimer = 4000;
    private int DisTimer2 = 500;
    private GameObject player;
    
    public Lifters(int x, int y, ID id, Handler handler){
        super(x,y,id);
        this.handler = handler;
        velX=0;
        velY=0;
        
        
        chestSpawn = r.nextInt(6);
        
        if(id==ID.SmallLift||id==ID.MediumLift||id==ID.BigLift){
        if(chestSpawn<3){
            handler.addObject(new SoftCoin((int)x+40,(int)y-40,ID.SoftCoin,handler));
        }
        else if(chestSpawn==3){
            handler.addObject(new HealthBox((int)x+40,(int)y-30,ID.HealthBox,handler));
        }
        
        else if(chestSpawn==4){
            handler.addObject(new AmmoBox((int)x+40,(int)y-30,ID.AmmoBox,handler));
        }
        
        }
        for(int i=0;i<handler.object.size();i++)
        {if(handler.object.get(i).getId() == ID.Player)
            player = handler.object.get(i);
            
        }
        
    }
    
    
    
    
    
    public Rectangle getBounds(){
        if(this.getId()==ID.SmallLift){
        return new Rectangle((int)x,(int)y,70,5);}
        if(this.getId()==ID.MediumLift){
        return new Rectangle((int)x,(int)y,120,5);}
        if(this.getId()==ID.BigLift){
        return new Rectangle((int)x,(int)y,180,5);}
        else
          return new Rectangle((int)x,(int)y,70,5);
    }
    
    private AlphaComposite makeTransparent(float alpha){
        int type = AlphaComposite.SRC_OVER;
        return AlphaComposite.getInstance(type, alpha);
    }
        
    public void tick(){
        x+=velX;
        y+=velY;
        if(player.getVelX()>0){
            this.setVelX((-1)*player.getVelX());
        }
        else if(player.getVelX()<=0){
            this.setVelX(0);
        }
        
        if(x<(-50)){
            handler.removeObject(this);
            if(this.getId()==ID.SmallLift){
            handler.addObject(new Lifters((int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.WIDTH),640,1280),(int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.HEIGHT),120,ChewingGumSimulator.HEIGHT-60), ID.SmallLift,handler));
            }
            
            if(this.getId()==ID.MediumLift){
            handler.addObject(new Lifters((int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.WIDTH),640,1280),(int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.HEIGHT),120,ChewingGumSimulator.HEIGHT-60), ID.MediumLift,handler));
            }
            
            if(this.getId()==ID.BigLift){
            handler.addObject(new Lifters((int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.WIDTH),640,1280),(int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.HEIGHT),120,ChewingGumSimulator.HEIGHT-60), ID.BigLift,handler));
            }
            
            
            
            }
        
        collision();
        
    }
    
    
    
    public void collision(){
        for(int i=0;i < handler.object.size(); i++){
            GameObject tempObject = handler.object.get(i);
            
        if(tempObject.getId() == ID.SmallLift)
        {
            if(getBounds().intersects(tempObject.getBounds()))
            {
                
                
                //handler.removeObject(tempObject);
         }
        }
        if(tempObject.getId() == ID.PlayerRocket || tempObject.getId() == ID.PlayerRocketH || tempObject.getId() == ID.PlayerLightning || tempObject.getId() == ID.ParticleDisengage2){
            
            if(getBounds().intersects(tempObject.getBounds()))
            {
                tempObject.setVelY(tempObject.getVelY()*(-1));
                tempObject.setVelX(tempObject.getVelX()*(-1));
                
            }
            
            
        }
        
        if(tempObject.getId() == ID.AcidDecoration || tempObject.getId() == ID.AcidDecoration2 || tempObject.getId() == ID.AcidDecoration3 || tempObject.getId() == ID.SacidDecoration || tempObject.getId() == ID.SacidDecoration2 || tempObject.getId() == ID.SacidDecoration3 || tempObject.getId() == ID.InsulinDecoration || tempObject.getId() == ID.InsulinDecoration2 || tempObject.getId() == ID.InsulinDecoration3 || tempObject.getId() == ID.FatDecoration || tempObject.getId() == ID.FatDecoration2 || tempObject.getId() == ID.FatDecoration3)
        {
            if(getBounds().intersects(tempObject.getBounds()))
            {
                
                if(tempObject.getY()>this.getY()+5 && tempObject.getY()<this.getY()-10)
                {
                    tempObject.setY(tempObject.getY()+20);
                }
                //handler.removeObject(tempObject);
         }
        }
        
        
        
        
        
        
        
         }
    }
    
    public void render(Graphics g){
        
        
        
        
        if(this.getId()==ID.SmallLift){
        g.setColor(Color.DARK_GRAY);
        g.fillRoundRect((int)x,(int)y,70,5,10,10);}
        
        if(this.getId()==ID.MediumLift){
        g.setColor(Color.DARK_GRAY);
        g.fillRoundRect((int)x,(int)y,120,5,10,10);}
        
        
        if(this.getId()==ID.BigLift){
        g.setColor(Color.DARK_GRAY);
        g.fillRoundRect((int)x,(int)y,180,5,10,10);}
        
        
        
        
        
        
    }
    
    
    
    
    }
    
    

