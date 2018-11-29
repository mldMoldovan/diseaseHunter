
package chewing.gum.simulator;


import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.util.Random;


public class ParticleTurret extends GameObject{
    
    private Handler handler;
    private Random r = new Random();
    private float alpha = 0.3f;
    private Color turColor = new Color(0,250,154);
    private int lifeTimer = 2000;
    private double particleTurretLife=40;
    private GameObject player;
    private boolean Placed=false;
    
    
    
    public ParticleTurret(int x, int y, ID id, Handler handler){
        super(x,y,id);
        this.handler = handler;
        velX=0;
        velY=0;
        
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
        if(ChewingGumSimulator.gameState==ChewingGumSimulator.STATE.ArenaEditor){
        x = ChewingGumSimulator.clamp((int)x,5,ChewingGumSimulator.WIDTH-28);
        y = ChewingGumSimulator.clamp((int)y,80,ChewingGumSimulator.HEIGHT-49);
        if(ChewingGumSimulator.gameState==ChewingGumSimulator.STATE.ArenaEditor && ChewingGumSimulator.editSelected==true && Placed==false){
            velX=player.getVelX();
            velY=player.getVelY();
        }
        }
        else{
        if(lifeTimer>0)
        {
            lifeTimer--;
        }
        
        if(lifeTimer%20==0){
            handler.addObject(new ParticleDisengage((int)x+10,(int)y+10,ID.ParticleDisengage,handler));
        }
        
        if(lifeTimer==0)
        {
            handler.removeObject(this);
        }
        if(particleTurretLife<=0){
            handler.removeObject(this);
            
            
        }
        
        collision();}
        
    }
    
    
    private void collision(){
        for(int j=0;j < handler.object.size(); j++){
        GameObject tempObject = handler.object.get(j);
        if(tempObject.getId()==ID.PlayerRocket || tempObject.getId() == ID.PlayerRocketH){
            if(getBounds().intersects(tempObject.getBounds())){
            
            if(ChewingGumSimulator.playerXP<100000){
                ChewingGumSimulator.playerXP+=2;}
            particleTurretLife--;
            handler.removeObject(tempObject);}
            }
        
        
        if(tempObject.getId()==ID.PlayerLightning){
            if(getBounds().intersects(tempObject.getBounds())){
            if(ChewingGumSimulator.playerXP<100000){
                ChewingGumSimulator.playerXP+=4;}
            particleTurretLife-=2;
            handler.removeObject(tempObject);}
            }
        
        if(tempObject.getId()==ID.ParticleDisengage2){
            
            if(getBounds().intersects(tempObject.getBounds())){
            if(ChewingGumSimulator.playerXP<100000){
                ChewingGumSimulator.playerXP+=8;}
            particleTurretLife-=2;
            handler.removeObject(tempObject);}
            }
    }}
    
    public void render(Graphics g){
        
        Graphics2D g2d = (Graphics2D) g;
        if(ChewingGumSimulator.editSelected==false){
        g2d.setComposite(makeTransparent(1));
        Placed=true;}
        else if(ChewingGumSimulator.editSelected==true && Placed==false){
        g2d.setComposite(makeTransparent(alpha));}
        
        
        g.setColor(turColor);
        g.fillOval((int)x,(int) y, 20, 20);
        
        
        
        
    }
    
    
    
    
    }
    
    

