
package chewing.gum.simulator;

import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;



public class AcidPuddle extends GameObject{
    
    private Handler handler;
    private double puddleHealth = 100;
    private Color col = new Color (0,250,154) ;
    
    
    
    public AcidPuddle(float x, float y, ID id,Handler handler){
        super(x,y,id);
        this.handler = handler;
        if(this.getId()==ID.AcidPuddle){
        velX = -2;}
        else if(this.getId()==ID.AcidPuddleBack){
        velX = 2;}
        velY = 0;
    }
    
    public Rectangle getBounds(){
        return new Rectangle((int)x,(int)y,100,80);
    }
    
    
    public void tick(){
        x+=velX;
        y+=velY;
        if(velX==0){
            if(this.getId()==ID.AcidPuddle){
            velX=-2;}
            else if(this.getId()==ID.AcidPuddleBack){
            velX=2;}
        }
        if(velY!=0){
            velY=0;
        }
        
        if(y<= 80 || y >= ChewingGumSimulator.HEIGHT-50) velY *= -1;
        if(x<= -150){
            handler.removeObject(this);
        }
        
        
        collision();
        if(puddleHealth<=0){
            handler.removeObject(this);
            puddleHealth=100;
        }
        
    
    }
    
    
    private void collision(){
        for(int i=0;i < handler.object.size(); i++){
            GameObject tempObject = handler.object.get(i);
            
        if(tempObject.getId() == ID.PlayerRocket || tempObject.getId() == ID.PlayerRocketH)
        {
            if(getBounds().intersects(tempObject.getBounds()))
            {
                if(ChewingGumSimulator.playerXP<100000){
                ChewingGumSimulator.playerXP+=5;}
                puddleHealth-=2;
                handler.removeObject(tempObject);
        }
        
        
        
        
        }
        
        
        if(tempObject.getId() == ID.PlayerLightning)
        {
            if(getBounds().intersects(tempObject.getBounds()))
            {
                if(ChewingGumSimulator.playerXP<100000){
                ChewingGumSimulator.playerXP+=10;}
                puddleHealth-=5;
                handler.removeObject(tempObject);
        }
        
        
        
        
        }
        
        if(tempObject.getId() == ID.ParticleDisengage2)
        {
            if(getBounds().intersects(tempObject.getBounds()))
            {
                if(ChewingGumSimulator.playerXP<100000){
                ChewingGumSimulator.playerXP+=15;}
                puddleHealth-=3;
                handler.removeObject(tempObject);
        }
        
        
        
        
        }
        
        
    }}
    private AlphaComposite makeTransparent(float alpha){
        int type = AlphaComposite.SRC_OVER;
        return AlphaComposite.getInstance(type, alpha);
    }
    
    
    
    public void render(Graphics g){
        
        Graphics2D g2d = (Graphics2D) g;
        g2d.setComposite(makeTransparent(0.45f));
        g.setColor(col);
        g.fillRoundRect((int)x,(int)y,100,80,30,30);
        g2d.setComposite(makeTransparent(1));
        
    }
    
}
