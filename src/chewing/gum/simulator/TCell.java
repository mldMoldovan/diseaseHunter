
package chewing.gum.simulator;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;




public class TCell extends GameObject{
    
    private Handler handler;
    private GameObject player;
    private GameObject fakePlayer;
    private float TCellHealth=50;
    private int ShootTimer = 1000;
    private int antinumber=0;
    private int turretnumber=0;
    
    private Color col = new Color(210,157,33);
    
    public TCell(float x, float y, ID id, Handler handler){
        super(x,y,id);
        this.handler = handler;
        
        
        for(int i=0;i<handler.object.size();i++)
        {if(handler.object.get(i).getId() == ID.Player)
            player = handler.object.get(i);
            
        }
        
        
        for(int i=0;i<handler.object.size();i++)
        {if(handler.object.get(i).getId() == ID.FakePlayer)
            fakePlayer = handler.object.get(i);
            
        }
        
        
        
        
    }
    public Rectangle getBounds(){
        return new Rectangle((int)x,(int)y,12,12);
    }
    
    public void tick(){
        x+=velX;
        y+=velY;
        TCellHealth = ChewingGumSimulator.clamp(TCellHealth,0,50);
        if(ShootTimer%60==0 && antinumber<16){
            handler.addObject(new Antibody((int)x+7,(int)y+7,ID.Antibody,handler));
            
            antinumber++;
            if(turretnumber<4){
                if(ChewingGumSimulator.gameState!=ChewingGumSimulator.STATE.TCellHelp){
                handler.addObject(new ParticleTurret((int)x+7,(int)y+7,ID.ParticleTurret,handler));
                turretnumber++;
                }
                }
        }
        if(ChewingGumSimulator.paused==false){
        if(player!=null){
        
        float diffX = x - player.getX() - 8;
        float diffY = y - player.getY() - 8;
        double distance = Math.sqrt((x-player.getX())*(x-player.getX())+(y-player.getY())*(y-player.getY()));
        
        velX=(float)(-1.0/distance)*2*diffX;
        velY=(float)(-1.0/distance)*2*diffY;}
            else if(player==null && fakePlayer!=null){
        
        float diffX = x - fakePlayer.getX() - 8;
        float diffY = y - fakePlayer.getY() - 8;
        double distance = Math.sqrt((x-fakePlayer.getX())*(x-fakePlayer.getX())+(y-fakePlayer.getY())*(y-fakePlayer.getY()));
        
        velX=(float)(-1.0/distance)*2*diffX;
        velY=(float)(-1.0/distance)*2*diffY;}}
        else if(ChewingGumSimulator.paused==true){
        velX=0;
        velY=0;}
        
        if(y<= 0 || y >= ChewingGumSimulator.HEIGHT-20) velY *= -1;
        if(x<= 0 || x >= ChewingGumSimulator.WIDTH-18) velX *= -1;
        
        handler.addObject( new Trail(x,y,ID.Trail,col,15,15,0.01f,handler));
        collision();
        if(TCellHealth==0)
        {
            handler.removeObject(this);
        }
        if(ShootTimer >0 )
        {
            ShootTimer--;
        }
        else if(ShootTimer==0)
        {
            ShootTimer=1000;
        }
        else if(ShootTimer%20==0){
            handler.addObject(new Antibody((int)x+7,(int)y+7,ID.Antibody,handler));
        }
        else if(ShootTimer%30==0){
            if(ChewingGumSimulator.gameState!=ChewingGumSimulator.STATE.TCellHelp){
            handler.addObject(new ParticleTurret((int)x+7,(int)y+7,ID.ParticleTurret,handler));
            }
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
                TCellHealth--;
                handler.removeObject(tempObject);
        }
        
        
        
        
        }
        
        if(tempObject.getId() == ID.PlayerLightning)
        {
            if(getBounds().intersects(tempObject.getBounds()))
            {
                if(ChewingGumSimulator.playerXP<100000){
                ChewingGumSimulator.playerXP+=15;}
                TCellHealth-=2;
                handler.removeObject(tempObject);
        
        
        
        }
    }
        
        if(tempObject.getId() == ID.ParticleDisengage2)
        {
            if(getBounds().intersects(tempObject.getBounds()))
            {
                if(ChewingGumSimulator.playerXP<100000){
                ChewingGumSimulator.playerXP+=20;}
                TCellHealth-=5;
                handler.removeObject(tempObject);
        
        
        
        
        }
    }
        
        }}
    
    public void render(Graphics g){
        g.setColor(Color.blue);
        g.fillRect((int)x,(int)y,15,15);
    }
    
    
    
    
    
    
}
