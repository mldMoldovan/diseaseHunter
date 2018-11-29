
package chewing.gum.simulator;


import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.util.Random;


public class FakePlayer extends GameObject{
    
    private Handler handler;
    private Random r = new Random();
    private float alpha = 0.7f;
    private boolean fakeShield=false;
    private boolean speedBoost=false;
    
    public FakePlayer(int x, int y, ID id, Handler handler){
        super(x,y,id);
        this.handler = handler;
        if(x>=ChewingGumSimulator.WIDTH-100 && y<=100)
        {velX=0;
         velY=6;}
        if(x>=100 && y>=ChewingGumSimulator.HEIGHT-100)
        {velX=-6;
         velY=0;}
        if(x<=100 && y>=ChewingGumSimulator.HEIGHT-100)
        {velX=0;
         velY=-6;}
        if(x<=100 && y<=100)
        {velX=6;
         velY=0;}
        
        
    }
    
    
    
    
    public Rectangle getBounds(){
        
        return new Rectangle((int)x,(int)y,17,17);
    }
    
    private AlphaComposite makeTransparent(float alpha){
        int type = AlphaComposite.SRC_OVER;
        return AlphaComposite.getInstance(type, alpha);
    }
        
    public void tick(){
        x+=velX;
        y+=velY;
        
        x = ChewingGumSimulator.clamp((int)x,98,ChewingGumSimulator.WIDTH-102);
        y = ChewingGumSimulator.clamp((int)y,98,ChewingGumSimulator.HEIGHT-102);
        if(x==538 && y==98)
        {  velX=0;
          if(speedBoost==true){
            velY=12;
          }
          else{
              velY=6;}
           }
        
        if(x==538 && y==375)
        {velY=0;
         if(speedBoost==true){
                velX=-12;}
         else{
             velX=-6;}
         }
        
        
        if(x<=100 && y<=ChewingGumSimulator.HEIGHT-100)
        {velX=0;
        if(speedBoost==true){
            velY=-12;
        }
        else{
         velY=-6;}
        }
        if((x==98 && y==98)||(x==100 && y==98))
        {velY=0;
        if(speedBoost==true){
            velX=12;
        }
        else{
            velX=6;}
         }
        
        if(ChewingGumSimulator.gameState == ChewingGumSimulator.STATE.ShieldHelp){
            fakeShield=true;
        }
        if(ChewingGumSimulator.gameState == ChewingGumSimulator.STATE.SpeedHelp){
            speedBoost=true;
        }
    
    
    }
    
    public void render(Graphics g){
        
        Graphics2D g2d = (Graphics2D) g;
        
        g2d.setComposite(makeTransparent(alpha));
        
        if(fakeShield==true)
        {   g.setColor(Color.cyan);
            g.drawOval((int)x-3,(int)y-3,23,23);}
        
        Font fnt = new Font("calibri",1,10);
        
        g.setColor(Color.white);
        g.fillOval((int)x,(int) y, 17, 17);
        
        
        
        
    }
    
    
    
    
    }

