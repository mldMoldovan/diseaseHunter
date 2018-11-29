
package chewing.gum.simulator;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;







public class PlayerGrenade extends GameObject{
    
    Handler handler;
    
    static boolean charging = false;
    
    static boolean charged = false;
    
    private int Timer1=1000;
    
    private int Timer2=500;
    
    
    public PlayerGrenade(float x, float y, ID id, Handler handler)
    {
        super(x,y,id);
        this.handler=handler;
    }
    public Rectangle getBounds(){
        return new Rectangle((int)x,(int)y,20,20);
    }
    
    public void tick(){
        
        
        
        if(Timer1>0)
        {Timer1--;
         charging = true;}
        if(Timer1==0)
        { charging = false;
          Timer2--;
          charged = true;
        }
        if(Timer2==0)
        {   if(ChewingGumSimulator.gameState==ChewingGumSimulator.STATE.Tutorial && ChewingGumSimulator.tutorialStages[7]==true && ChewingGumSimulator.tutorialStages[8]==false){
                         
                         ChewingGumSimulator.tutorialStages[8]=true;
                       }
            charged=false;
            handler.removeObject(this);
        }
        if(charged==true)
        {   if(Timer2 % 7 == 0)
            handler.addObject(new ParticleDisengage((int)x+10,(int)y+10,ID.ParticleDisengage2,handler));
        }
        
        
        
    }
    
    public void render(Graphics g){
        g.setColor(Color.green);
        g.drawRoundRect((int)x, (int)y, 20, 20,10,10);
        
        if(charged == true){
            g.setColor(Color.green);
            g.drawRect((int)x, (int)y, 20, 20);
        }
        if(charging==true){
            if(Timer1%5==0){
            g.setColor(Color.yellow);
            g.drawRect((int)x, (int)y, 5, 5);
            
            g.setColor(Color.orange);
            g.drawRect((int)x+5, (int)y, 5, 5);
            
            g.setColor(Color.red);
            g.drawRect((int)x+10, (int)y, 5, 5);
            
            g.setColor(Color.white);
            g.drawRect((int)x+15, (int)y, 5, 5);
            
            
            // dgdfgd
            
            g.setColor(Color.white);
            g.drawRect((int)x, (int)y+5, 5, 5);
            
            g.setColor(Color.red);
            g.drawRect((int)x+5, (int)y+5, 5, 5);
            
            g.setColor(Color.yellow);
            g.drawRect((int)x+10, (int)y+5, 5, 5);
            
            g.setColor(Color.orange);
            g.drawRect((int)x+15, (int)y+5, 5, 5);
            
            
            
            
            g.setColor(Color.red);
            g.drawRect((int)x, (int)y+10, 5, 5);
            
            g.setColor(Color.yellow);
            g.drawRect((int)x+5, (int)y+10, 5, 5);
            
            g.setColor(Color.orange);
            g.drawRect((int)x+10, (int)y+10, 5, 5);
            
            g.setColor(Color.white);
            g.drawRect((int)x+15, (int)y+10, 5, 5);
            
            
            
            g.setColor(Color.orange);
            g.drawRect((int)x, (int)y+15, 5, 5);
            
            g.setColor(Color.white);
            g.drawRect((int)x+5, (int)y+15, 5, 5);
            
            g.setColor(Color.yellow);
            g.drawRect((int)x+10, (int)y+15, 5, 5);
            
            g.setColor(Color.red);
            g.drawRect((int)x+15, (int)y+15, 5, 5);}
            else
            {
                g.setColor(Color.green);
                g.drawRect((int)x, (int)y, 20, 20);
            }
        }
    }
    
}
