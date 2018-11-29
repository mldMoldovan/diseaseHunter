
package chewing.gum.simulator;


import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.Random;


public class Nuke extends GameObject{
    
    private Handler handler;
    private Random r = new Random();
    private int Timer1=1000;
    private int Timer2=300;
    
    private boolean loading = false;
    private boolean loaded = false;
    
    public Nuke(int x, int y, ID id, Handler handler){
        super(x,y,id);
        this.handler = handler;
        velX=0;
        velY=0;
    }
    
    
    
    
    public Rectangle getBounds(){
        
        return new Rectangle((int)x+10,(int)y-20,25,55);
    }
        
    public void tick(){
        x+=velX;
        y+=velY;
        if(ChewingGumSimulator.gameState==ChewingGumSimulator.STATE.Tutorial){
            if(y<ChewingGumSimulator.HEIGHT-80)
        {
            velY=2;
        }
        else if(y<=ChewingGumSimulator.HEIGHT-250)
        {
            velY=0;
        }
        else{
            velX=0;
            velY=0;
        }
        }
        else if (ChewingGumSimulator.gameState!=ChewingGumSimulator.STATE.Tutorial){
        if(y<ChewingGumSimulator.HEIGHT-80)
        {
            velY=2;
        }
        else if(y<=ChewingGumSimulator.HEIGHT-250)
        {
            velY=0;
        }
        else{
            velX=0;
            velY=0;
        }
        }
        
        
        if(Timer1>0)
        {Timer1--;
         loading = true;
        
        }
        if(Timer1==0)
        {   loading = false;
            Timer2--;
            loaded = true;
        }
        
        
        if(Timer2==299)
        {
            handler.wipeBoss();
            
            if(ChewingGumSimulator.gameState == ChewingGumSimulator.STATE.Tutorial && ChewingGumSimulator.tutorialStages[11]==true && ChewingGumSimulator.tutorialStages[12]==false){
                 ChewingGumSimulator.tutorialStages[12]=true;
            }
            
        }
        
        if(Timer2==0)
        {
            loaded=false;
            handler.removeObject(this);
            
        }
        if(loaded)
        {   if(Player.Shield==false)
           {HUD.HEALTH-=0.1;
            HUD.HEALTH2-=0.1;
            for(int i=0;i<10;i++){
                handler.wipeNeutrino();
                handler.wipeHiggsBoson();
            }}
            HUD.BLADDER=0;
        }
        
    }
    
    public void render(Graphics g){
        if(loading){
        g.setColor(Color.gray);
        g.fillRoundRect((int)x,(int)y,25,35,10,10);
        g.fillRoundRect((int)x+5,(int)y-10,15,10,10,10);
        
        g.fillRect((int)x+3,(int)y+35,5,10);
        g.fillRect((int)x+8,(int)y+35,5,5);
        
        g.fillRect((int)x+17,(int)y+35,5,10);
        g.fillRect((int)x+12,(int)y+35,5,5);
        
        
        g.setColor(Color.yellow);
        g.fillRect((int)x+10,(int)y-20,5,10);
        
        
        if(Timer1%5==0)
        {g.setColor(Color.green);
        g.fillRect((int)x+10,(int)y-5,5,40);}
        
        else if(Timer1%5!=0)
        {g.setColor(Color.yellow);
        g.fillRect((int)x+10,(int)y-5,5,40);}
        }
        
        if(loaded)
        {if(Timer2%5==0)
        {g.setColor(Color.white);
        g.fillRect(0,80,ChewingGumSimulator.WIDTH,ChewingGumSimulator.HEIGHT);}
        
        else if(Timer2%5!=0)
        {g.setColor(Color.black);
        g.fillRect(0,80,ChewingGumSimulator.WIDTH,ChewingGumSimulator.HEIGHT);}
            
        }
        
        
        
    }
    
    
    
    
    }
    
    

