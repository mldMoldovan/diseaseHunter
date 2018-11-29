
package chewing.gum.simulator;

import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;







public class AtomDisengage extends GameObject{
    
    Handler handler;
    
    static boolean charging = false;
    
    static boolean charged = false;
    
    private int Timer1=1000;
    
    private int Timer2=500;
    private GameObject player;
    private float alpha = 0.3f;
    
    
    
    
    public AtomDisengage(float x, float y, ID id, Handler handler)
    {
        super(x,y,id);
        this.handler=handler;
        
        for(int i=0;i<handler.object.size();i++)
        {if(handler.object.get(i).getId() == ID.Player)
            player = handler.object.get(i);
            
        }
    }
    public Rectangle getBounds(){
        return new Rectangle((int)x,(int)y,20,20);
    }
    
    
    
    
    private AlphaComposite makeTransparent(float alpha){
        int type = AlphaComposite.SRC_OVER;
        return AlphaComposite.getInstance(type, alpha);
    }
    
    
    
    
    
    public void tick(){
        x+=velX;
        y+=velY;
        if(Timer1>0)
        {Timer1--;
         charging = true;}
        if(Timer1==0)
        { charging = false;
          Timer2--;
          charged = true;
        }
        if(Timer2==0)
        {   
            
            if(ChewingGumSimulator.gameState==ChewingGumSimulator.STATE.Tutorial && ChewingGumSimulator.tutorialStages[6]==true && ChewingGumSimulator.tutorialStages[7]==false){
                         
                         ChewingGumSimulator.tutorialStages[7]=true;
                         HUD.ATOMS++;
                       }
            charged=false;
            handler.removeObject(this);
        }
        if(charged==true)
        {   if(Timer2 % 9 == 0)
            handler.addObject(new ParticleDisengage((int)x+10,(int)y+10,ID.ParticleDisengage,handler));
        }
        
        
        x = ChewingGumSimulator.clamp((int)x,5,ChewingGumSimulator.WIDTH-28);
        y = ChewingGumSimulator.clamp((int)y,80,ChewingGumSimulator.HEIGHT-49);
        if(ChewingGumSimulator.gameState==ChewingGumSimulator.STATE.ArenaEditor && ChewingGumSimulator.editSelected==true){
            velX=player.getVelX();
            velY=player.getVelY();
        }
        
    }
    
    public void render(Graphics g){
        
        
        Graphics2D g2d = (Graphics2D) g;
        if(ChewingGumSimulator.editSelected==false){
        g2d.setComposite(makeTransparent(1));}
        else if(ChewingGumSimulator.editSelected==true){
        g2d.setComposite(makeTransparent(alpha));}
        
        
        
        g.setColor(Color.green);
        g.drawRect((int)x, (int)y, 20, 20);
        
        if(charged == true){
            g.setColor(Color.green);
            g.drawRoundRect((int)x, (int)y, 20, 20,7,7);
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
