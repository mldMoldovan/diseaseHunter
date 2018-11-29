
package chewing.gum.simulator;

import java.awt.AlphaComposite;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.Color;
import java.awt.Graphics2D;
import java.util.Random;


public class SnowCloud extends GameObject{
    
    private Handler handler;
    
    Random r = new Random();
    
    private int raintimer=45;
    
    private int raintimer2 = 50;
    static int BossHealth = 100;
    float alpha = 0.5f;
    
    
    
    
    public SnowCloud(float x, float y, ID id, Handler handler){
        super(x,y,id);
        this.handler = handler;
        
        
        velX = 0;
        velY = 1;
    }
    
    
    public void tick(){
        x+=velX;
        y+=velY;
        
        
        if(raintimer <= 0) velY = 0;
        else
            raintimer--;
      
        if(raintimer <= 0) raintimer2--;
        if(raintimer2 <= 0) {
            if(velX==0) velX = 3;
            
            int spawn = r.nextInt(10);
            if(spawn == 0) 
                handler.addObject(new SnowDrop((int)x+32,(int) y+15, ID.SnowDrop,handler));
                
                
                    }         
        //if(y<= 0 || y >= ChewingGumSimulator.HEIGHT-32) velY *= -1;
        if(x<= 0 || x >= ChewingGumSimulator.WIDTH-55) velX *= -1;
        
        //handler.addObject( new Trail(x,y,ID.Trail,Color.blue,30,30,0.02f,handler));
        collision();
        if(BossHealth==70)
        { handler.addObject(new BossSucker((ChewingGumSimulator.WIDTH / 2)-48,0,ID.BossSucker,handler));
           }
        
        if(BossHealth==0)
        { handler.removeObject(this);}
    
    }
    
    public Rectangle getBounds(){
        return new Rectangle((int)x,(int)y,60,40);
    }
    
    private AlphaComposite makeTransparent(float alpha){
        int type = AlphaComposite.SRC_OVER;
        return AlphaComposite.getInstance(type, alpha);
    }
    
    private void collision(){
        for(int i=0;i < handler.object.size(); i++){
            GameObject tempObject = handler.object.get(i);
            
        if(tempObject.getId() == ID.PlayerRocket)
        {
            if(getBounds().intersects(tempObject.getBounds()))
            {
                
                for(int j=0;j < handler.object.size(); j++){
                GameObject tempoObject = handler.object.get(j);
                if(tempoObject.getId()==ID.BossOne)
                {BossHealth--;}
            }
        }
        
        
        
        
        }
        
        if(tempObject.getId() == ID.PlayerLightning)
        {
            if(getBounds().intersects(tempObject.getBounds()))
            {
                
                for(int j=0;j < handler.object.size(); j++){
                GameObject tempoObject = handler.object.get(j);
                if(tempoObject.getId()==ID.BossOne)
                {BossHealth-=2;}
            }
        }
        
        
        
        
        }
    }}
    
    
    public void render(Graphics g){
        Graphics2D g2d = (Graphics2D) g;
        g2d.setComposite(makeTransparent(alpha));
        
        
        
        g.setColor(Color.DARK_GRAY);
        g.fillRoundRect((int)x,(int)y,60,40,25,40);
        
        g2d.setComposite(makeTransparent(1));
        
    }
    
}
