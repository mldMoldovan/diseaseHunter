
package chewing.gum.simulator;


import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.Random;


public class BossFourSucker extends GameObject{
    
    private Handler handler;
    private Random r = new Random();
    private int TimeSucks=80;
    private int TimeSucks2=50;
    private float Sucker4Health = 100;
    private float blingreenvalue = 254f;
    private Color col=Color.black;
    
    public BossFourSucker(int x, int y, ID id, Handler handler){
        super(x,y,id);
        this.handler = handler;
        velX=0;
        velY=2;
    }
    
    
    
    
    public Rectangle getBounds(){
        
        return new Rectangle((int)x,(int)y,30,30);
    }
        
    public void tick(){
        x+=velX;
        y+=velY;
        Sucker4Health = ChewingGumSimulator.clamp(Sucker4Health,0,100);
        blingreenvalue = Sucker4Health;
        
        if(TimeSucks <= 0) velY = 0;
        else
            TimeSucks--;
      
        if(TimeSucks <= 0) TimeSucks2--;
        
        if(TimeSucks2 <= 0) {
            if(velX==0) velX = 1;
            
            if(velX>15) velX = 15;
            
            int spawn = r.nextInt(20);
            if(spawn == 0) 
            handler.addObject(new BossOneBullet((int)x+32,(int) y+15, ID.BossOneBullet,handler));
            collision();
            if(Sucker4Health==0)
        {   ChewingGumSimulator.trophiesStatus[8]=true;
            handler.addObject(new SoftTreasure((int)x+10,(int) y+50, ID.SoftTreasure,handler));
            handler.removeObject(this);
            Sucker4Health=100;}
        }
                
                    
        if(x<= 0 || x >= ChewingGumSimulator.WIDTH-25) velX *= -1;}
        
        
        private void collision(){
        for(int i=0;i < handler.object.size(); i++){
            GameObject tempObject = handler.object.get(i);
            
        if(tempObject.getId() == ID.PlayerRocket || tempObject.getId() == ID.PlayerRocketH)
        {
            if(getBounds().intersects(tempObject.getBounds()))
            {
                
                if(ChewingGumSimulator.playerXP<100000){
                ChewingGumSimulator.playerXP+=33;}
                Sucker4Health--;
            }
        }
        
        
        
        
       
        
        
        
        if(tempObject.getId() == ID.ParticleDisengage2)
        {
            if(getBounds().intersects(tempObject.getBounds()))
            {
                if(ChewingGumSimulator.playerXP<100000){
                ChewingGumSimulator.playerXP+=177;}
                handler.removeObject(this);
        }
        
        
        
        
        }
        
        
        if(tempObject.getId() == ID.PlayerLightning)
        {
            if(getBounds().intersects(tempObject.getBounds()))
            {
                
                if(ChewingGumSimulator.playerXP<100000){
                ChewingGumSimulator.playerXP+=89;}
                Sucker4Health-=2;
            }
        }
        
        
        
        
        
    }}
    
    
    public void render(Graphics g){
        
        g.setColor(Color.magenta);
        g.fillRoundRect((int)x,(int)y,30,30,10,10);
        
        g.setColor(Color.gray);
        g.fillRect((int)x+5,(int)y-20, 20, 3);
        
        g.setColor(col);
        g.fillRect((int)x+5,(int)y+20, 20, 3);
        
        g.fillRect((int)x+5,(int)y+5, 5, 5);
        g.fillRect((int)x+20,(int)y+5, 5, 5);
        
        g.fillRect((int)x+5,(int)y+23, 5, 5);
        g.fillRect((int)x+20,(int)y+23, 5, 5);
        
        g.setColor(new Color(75,(int)blingreenvalue,0));
        g.fillRect((int)x+5, (int)y-20,(int) Sucker4Health *2/10, 3);
        g.setColor(Color.white);
        g.drawRect((int)x+5, (int)y-20,(int) Sucker4Health *2/10, 3);
        
    }
    
    
    
    
    }
    
    

