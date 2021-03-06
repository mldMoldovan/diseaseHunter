
package chewing.gum.simulator;

import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;



public class GreaseBall extends GameObject{
    
    private Handler handler;
    private double greaseHealth = 100;
    private Color col = new Color (218,165,32) ;
    
    
    
    public GreaseBall(float x, float y, ID id,Handler handler){
        super(x,y,id);
        this.handler = handler;
        if(this.getId()==ID.GreaseBall){
        velX = -2;
        velY = 0;}
        if(this.getId()==ID.GreaseBallBack){
        velX = +2;
        velY = 0;}
    }
    
    public Rectangle getBounds(){
        return new Rectangle((int)x,(int)y,100,80);
    }
    
    
    public void tick(){
        x+=velX;
        y+=velY;
        if(velX==0){
            if(this.getId()==ID.GreaseBall){
            velX=-2;}
            if(this.getId()==ID.GreaseBallBack){
            velX=+2;}
        }
        if(velY!=0){
            velY=0;
        }
        if(ChewingGumSimulator.gameState!=ChewingGumSimulator.STATE.Tutorial){
        if(y<= 80 || y >= ChewingGumSimulator.HEIGHT-50) velY *= -1;
        if(x<= -150 || x >= ChewingGumSimulator.WIDTH+150){
            handler.removeObject(this);
        } }
        
        if(ChewingGumSimulator.gameState==ChewingGumSimulator.STATE.Tutorial){
        if(y<= 80 || y >= ChewingGumSimulator.HEIGHT-150) velY *= -1;
        if(x<= -150 || x >= ChewingGumSimulator.WIDTH+150){
            velX=-1*this.getVelX();
        } }
        
        
        collision();
        if(greaseHealth<=0){
            if(ChewingGumSimulator.gameState == ChewingGumSimulator.STATE.Tutorial && ChewingGumSimulator.tutorialStages[4]==true  && ChewingGumSimulator.tutorialStages[5]==false){
                ChewingGumSimulator.tutorialStages[5]=true;
                }
            handler.removeObject(this);
            greaseHealth=100;
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
                ChewingGumSimulator.playerXP++;}
                if(ChewingGumSimulator.gameState == ChewingGumSimulator.STATE.Tutorial){
                    greaseHealth-=10;
                }
                else{
                greaseHealth-=2;}
                handler.removeObject(tempObject);
        }
        
        
        
        
        }
        
        
        if(tempObject.getId() == ID.PlayerLightning)
        {
            if(getBounds().intersects(tempObject.getBounds()))
            {
                if(ChewingGumSimulator.playerXP<100000){
                ChewingGumSimulator.playerXP+=2;}
                greaseHealth-=5;
                handler.removeObject(tempObject);
        }
        
        
        
        
        }
        
        if(tempObject.getId() == ID.ParticleDisengage2)
        {
            if(getBounds().intersects(tempObject.getBounds()))
            {
                if(ChewingGumSimulator.playerXP<100000){
                ChewingGumSimulator.playerXP+=3;}
                greaseHealth-=3;
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
