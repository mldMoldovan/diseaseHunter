
package chewing.gum.simulator;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;



public class PlateletCell extends GameObject{
    
    private Handler handler;
    public static boolean autodestroy=false;
    private Color col = new Color(219,219,219);
    
    
    
    public PlateletCell(float x, float y, ID id,Handler handler){
        super(x,y,id);
        this.handler = handler;
    
        velX = -7;
        velY = 4;
    }
    
    public Rectangle getBounds(){
        return new Rectangle((int)x,(int)y,35,35);
    }
    
    
    public void tick(){
        x+=velX;
        y+=velY;
        if(velX==0){
            velX=-7;
        }
        if(velY==0){
            velY=4;
        }
        
        if(y<= 80 || y >= ChewingGumSimulator.HEIGHT-50) velY *= -1;
        if(x<= 0 || x >= ChewingGumSimulator.WIDTH-40) velX *= -1;
        
        
        
        collision();
        if(autodestroy==true)
        {
            handler.removeObject(this);
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
                
                handler.removeObject(tempObject);
                handler.removeObject(this);
        }
        
        
        
        
        }
        
        
        if(tempObject.getId() == ID.PlayerLightning)
        {
            if(getBounds().intersects(tempObject.getBounds()))
            {
                if(ChewingGumSimulator.playerXP<100000){
                ChewingGumSimulator.playerXP+=2;}
                
                handler.removeObject(tempObject);
                handler.removeObject(this);
        }
        
        
        
        
        }
        
        if(tempObject.getId() == ID.ParticleDisengage2)
        {
            if(getBounds().intersects(tempObject.getBounds()))
            {
                if(ChewingGumSimulator.playerXP<100000){
                ChewingGumSimulator.playerXP+=5;}
                
                handler.removeObject(tempObject);
                handler.removeObject(this);
        }
        
        
        
        
        }
        
        if(tempObject.getId() == ID.SoftTreasure)
        {
            if( ((tempObject.getY()-this.getY())<0)&&((tempObject.getX()-this.getX())<0)&&((tempObject.getY()+45-this.getY()+35)>0)&&((tempObject.getX()+50-this.getX()+35)>0) )
            {
                if(tempObject.getX()<100){
                    this.setX(this.getX()+150);
                }
                else{
                    this.setX(this.getX()-100);
                }
        }
        
        
        
        
        }
        
        if(tempObject.getId() == ID.DangerousBush || tempObject.getId() == ID.DangerousTree || tempObject.getId() == ID.DangerousCactus || tempObject.getId() == ID.SoftTreasure || tempObject.getId() == ID.SilverSoftTreasure || tempObject.getId() == ID.GoldSoftTreasure  || tempObject.getId() == ID.BossSucker  || tempObject.getId() == ID.BossOne || tempObject.getId() == ID.SoftCoin || tempObject.getId() == ID.SilverSoftCoin || tempObject.getId() == ID.GoldSoftCoin )
        {
            if(getBounds().intersects(tempObject.getBounds()))
            {
                
                velX*=-1;
                velY*=-1;
        }
        
        
        
        
        }
    }}
    
    
    
    
    public void render(Graphics g){
        
        g.setColor(col);
        g.fillOval((int)x,(int)y,35,35);
        
        g.setColor(Color.orange);
        g.fillOval((int)x+10,(int)y+2,5,5);
        
        g.setColor(Color.yellow);
        g.fillOval((int)x+7,(int)y+15,8,8);
        
        g.setColor(Color.cyan);
        g.fillOval((int)x+15,(int)y+5,8,8);
        
    }
    
}
