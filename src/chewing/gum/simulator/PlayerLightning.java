
package chewing.gum.simulator;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.Random;




public class PlayerLightning extends GameObject{
    
    private Handler handler;
    private Random r = new Random();
    private int lightTimer=150;
    private Color lightColor = new Color(79,214,223);
    private Color darkColor = new Color(2,166,178);
    
    static int Lightdirection =1;
    
    public PlayerLightning(int x, int y, ID id, Handler handler){
        super(x,y,id);
        this.handler = handler;
        if(Lightdirection==1)
        {velX=0;
        velY=5;}
        if(Lightdirection==2)
        {
            velX=0;
            velY= -5;
        }
        if(Lightdirection==3)
        {
            velX=5;
            velY= 0;
        }
        if(Lightdirection==4)
        {
            velX=-5;
            velY= 0;
        }
    }
    
    
    public Rectangle getBounds(){
        if(Lightdirection == 1 || Lightdirection == 2)
        {return new Rectangle((int)x,(int)y,6,20);}
        else
        {return new Rectangle((int)x,(int)y,20,6);}
    }
    
    public void collision(){
        for(int i=0;i < handler.object.size(); i++){
            GameObject tempObject = handler.object.get(i);
            
        if(tempObject.getId() == ID.SoftTreasure || tempObject.getId() == ID.SilverSoftTreasure || tempObject.getId() == ID.GoldSoftTreasure || tempObject.getId() == ID.SoftCoin || tempObject.getId() == ID.SilverSoftCoin || tempObject.getId() == ID.GoldSoftCoin || tempObject.getId() == ID.AmmoBox || tempObject.getId() == ID.HealthBox || tempObject.getId() == ID.SpeedBooster || tempObject.getId() == ID.SodaBox || tempObject.getId() == ID.NukeBox || tempObject.getId() == ID.GrenadeBox || tempObject.getId() == ID.LightningBox)
        {
            if(getBounds().intersects(tempObject.getBounds()))
            {
                
                this.setVelY(getVelY()*(-1));
                this.setVelX(getVelX()*(-1));
        }
        
        
        
        
        }}
    }
    
    public void tick(){
        x+=velX;
        y+=velY;
        
        if(y >= ChewingGumSimulator.HEIGHT-20 || y <= 0 || x <= 0 || x >= ChewingGumSimulator.WIDTH-20)
        {   handler.removeObject(this); }
        else{
            if(lightTimer>0){
                lightTimer--;
            }
            else if(lightTimer<=0){
                handler.removeObject(this);
            }
        }
        
        
        
        
        
        //handler.addObject( new Trail(x,y,ID.Trail,Color.gray,6,6,0.5f,handler));
        //collision();
    
    }
    
    public void render(Graphics g){
        if(lightTimer%7==0){
        g.setColor(darkColor);}
        if(lightTimer%5==0){
        g.setColor(lightColor); 
        }
        if(Lightdirection==1 || Lightdirection==2)
        {g.fillRect((int)x+6,(int)y,6,20);}
        else
            {g.fillRect((int)x,(int)y+6,20,6);}
    }
    
    
    
}
