
package chewing.gum.simulator;


import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.Random;


public class DangerousCactus extends GameObject{
    
    private Handler handler;
    private int CactusHealth=300;
    private Random r = new Random();
    private GameObject player;
    private Color maroon = new Color(50,20,0);
    private boolean XPresence=false;
    private boolean YPresence=false;
    
    public DangerousCactus(int x, int y, ID id, Handler handler){
        super(x,y,id);
        this.handler = handler;
        velX=0;
        velY=0;
        
        
        
    }
    
    
    
    
    public Rectangle getBounds(){
        
        return new Rectangle((int)x,(int)y,47,62);
    }
        
    public void tick(){
        x+=velX;
        y+=velY;
        
        
        
        
        if(ChewingGumSimulator.gameState != ChewingGumSimulator.STATE.CactusHelp)
        {collision();}
        if(CactusHealth==0)
        { handler.removeObject(this);}
    }
    
    
    
    
    private void collision(){
        for(int i=0;i < handler.object.size(); i++){
            GameObject tempObject = handler.object.get(i);
            
        if(tempObject.getId() == ID.PlayerPee)
        {
            if(getBounds().intersects(tempObject.getBounds()))
            {
                
                CactusHealth-=1;
                break;
        }
        
        
        
        
        }
        
        if(tempObject.getId() == ID.ParticleDisengage2)
        {
            if(getBounds().intersects(tempObject.getBounds()))
            {
                
                handler.removeObject(this);
        }
        
        
        
        
        }
        
        if(tempObject.getId() == ID.PlayerLightning)
        {
            if(getBounds().intersects(tempObject.getBounds()))
            {
                
                CactusHealth-=1.5;
                break;
        }
        
        
        
        
        }
        
        if(tempObject.getId() == ID.PlayerPoo)
        {
            if(getBounds().intersects(tempObject.getBounds()))
            {
                
                CactusHealth-=2;
                break;
        }
        
        
        
        
        }
        
        if(tempObject.getId() == ID.PlayerGuano)
        {
            if(getBounds().intersects(tempObject.getBounds()))
            {
                
                CactusHealth-=3;
                break;
        }
        
        
        
        
        }
        
        if(tempObject.getId() == ID.PlayerBalega)
        {
            if(getBounds().intersects(tempObject.getBounds()))
            {
                
                CactusHealth-=5;
                break;
        }
        
        
        
        
        }
    }}
    
    public void render(Graphics g){
        
        g.setColor(Color.green);
        g.fillRoundRect((int)x,(int) y, 37, 62,10,10);
        
        g.setColor(Color.DARK_GRAY);
        g.fillRect((int)x+7,(int) y, 3, 62);
        g.fillRect((int)x+17,(int) y, 3, 62);
        g.fillRect((int)x+27,(int) y, 3, 62);
        
        g.fillRect((int)x+37,(int) y+5, 5, 2);
        g.fillRect((int)x+37,(int) y+12, 5, 2);
        g.fillRect((int)x+37,(int) y+19, 5, 2);
        g.fillRect((int)x+37,(int) y+26, 5, 2);
        g.fillRect((int)x+37,(int) y+34, 5, 2);
        g.fillRect((int)x+37,(int) y+41, 5, 2);
        g.fillRect((int)x+37,(int) y+48, 5, 2);
        g.fillRect((int)x+37,(int) y+55, 5, 2);
        
        g.fillRect((int)x-5,(int) y+5, 5, 2);
        g.fillRect((int)x-5,(int) y+12, 5, 2);
        g.fillRect((int)x-5,(int) y+19, 5, 2);
        g.fillRect((int)x-5,(int) y+26, 5, 2);
        g.fillRect((int)x-5,(int) y+34, 5, 2);
        g.fillRect((int)x-5,(int) y+41, 5, 2);
        g.fillRect((int)x-5,(int) y+48, 5, 2);
        g.fillRect((int)x-5,(int) y+55, 5, 2);
        
        
    }
    
    
    
    
    }
    
    

