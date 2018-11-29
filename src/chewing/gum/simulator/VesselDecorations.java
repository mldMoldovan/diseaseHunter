
package chewing.gum.simulator;


import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.util.Random;


public class VesselDecorations extends GameObject{
    
    private Handler handler;
    private Random r = new Random();
    private float alpha = 0.3f;
    private int DisTimer = 4000;
    private int DisTimer2 = 500;
    private GameObject player;
    
    public VesselDecorations(int x, int y, ID id, Handler handler){
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
        if(this.getId()==ID.GreaseDecoration){
        return new Rectangle((int)x,(int)y,50,50);
        }
        else if(this.getId()==ID.GreaseDecoration2){
        return new Rectangle((int)x,(int)y,70,70);
        }
        else if(this.getId()==ID.GreaseDecoration3){
        return new Rectangle((int)x,(int)y,50,70);
        }
        
        else if(this.getId()==ID.PlateletDecoration){
        return new Rectangle((int)x,(int)y,50,50);
        }
        else if(this.getId()==ID.PlateletDecoration2){
        return new Rectangle((int)x,(int)y,70,50);
        }
        else if(this.getId()==ID.PlateletDecoration3){
        return new Rectangle((int)x,(int)y,30,90);
        }
        
        else if(this.getId()==ID.RedClothDecoration){
        return new Rectangle((int)x,(int)y,50,50);
        }
        else if(this.getId()==ID.RedClothDecoration2){
        return new Rectangle((int)x,(int)y,70,50);
        }
        else if(this.getId()==ID.RedClothDecoration3){
        return new Rectangle((int)x,(int)y,30,90);
        }
        
        
        else if(this.getId()==ID.WhiteClothDecoration){
        return new Rectangle((int)x,(int)y,50,50);
        }
        else if(this.getId()==ID.WhiteClothDecoration2){
        return new Rectangle((int)x,(int)y,70,50);
        }
        else if(this.getId()==ID.WhiteClothDecoration3){
        return new Rectangle((int)x,(int)y,30,90);
        }
        
        
        else{
        return new Rectangle((int)x,(int)y,33,33);}
    }
    
    private AlphaComposite makeTransparent(float alpha){
        int type = AlphaComposite.SRC_OVER;
        return AlphaComposite.getInstance(type, alpha);
    }
    
     private void collision(){
        for(int j=0;j < handler.object.size(); j++){
        GameObject tempObject = handler.object.get(j);
        
        
        if(tempObject.getId()==ID.PlayerRocket){
            if(getBounds().intersects(tempObject.getBounds())){
            
            
            
            tempObject.setVelX(tempObject.getVelX()/2);
            tempObject.setVelY(tempObject.getVelY()/2);}
            
            }
        
        
        if(tempObject.getId()==ID.PlayerLightning){
            if(getBounds().intersects(tempObject.getBounds())){
            
            tempObject.setVelX(tempObject.getVelX()/2);
            tempObject.setVelY(tempObject.getVelY()/2);}
            
            }
        
        if(tempObject.getId()==ID.ParticleDisengage2){
            if(getBounds().intersects(tempObject.getBounds())){
            
            tempObject.setVelX(tempObject.getVelX()/2);
            tempObject.setVelY(tempObject.getVelY()/2);}
            
            }
    }}
        
    public void tick(){
        x+=velX;
        y+=velY;
        
        
        
        if(player.getVelX()>0){
            this.setVelX((-1)*player.getVelX());
        }
        else if(player.getVelX()<=0){
            this.setVelX(0);
        }
        
        if(x<(-50)){
            handler.removeObject(this);
            if(this.getId()==ID.GreaseDecoration){
            handler.addObject(new VesselDecorations((int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.WIDTH),640,1280),(int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.HEIGHT),80,ChewingGumSimulator.HEIGHT), ID.GreaseDecoration,handler));
            }
            
            if(this.getId()==ID.GreaseDecoration2){
            handler.addObject(new VesselDecorations((int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.WIDTH),640,1280),(int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.HEIGHT),80,ChewingGumSimulator.HEIGHT), ID.GreaseDecoration2,handler));
            }
            
            if(this.getId()==ID.GreaseDecoration3){
            handler.addObject(new VesselDecorations((int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.WIDTH),640,1280),(int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.HEIGHT),80,ChewingGumSimulator.HEIGHT), ID.GreaseDecoration3,handler));
            }
            
            if(this.getId()==ID.PlateletDecoration){
            handler.addObject(new VesselDecorations((int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.WIDTH),640,1280),(int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.HEIGHT),80,ChewingGumSimulator.HEIGHT), ID.PlateletDecoration,handler));
            }
            
            if(this.getId()==ID.PlateletDecoration2){
            handler.addObject(new VesselDecorations((int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.WIDTH),640,1280),(int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.HEIGHT),80,ChewingGumSimulator.HEIGHT), ID.PlateletDecoration2,handler));
            }
            
            if(this.getId()==ID.PlateletDecoration3){
            handler.addObject(new VesselDecorations((int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.WIDTH),640,1280),(int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.HEIGHT),80,ChewingGumSimulator.HEIGHT), ID.PlateletDecoration3,handler));
            }
            
            
            if(this.getId()==ID.RedClothDecoration){
            handler.addObject(new VesselDecorations((int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.WIDTH),640,1280),(int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.HEIGHT),80,ChewingGumSimulator.HEIGHT), ID.RedClothDecoration,handler));
            }
            
            if(this.getId()==ID.RedClothDecoration2){
            handler.addObject(new VesselDecorations((int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.WIDTH),640,1280),(int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.HEIGHT),80,ChewingGumSimulator.HEIGHT), ID.RedClothDecoration2,handler));
            }
            
            if(this.getId()==ID.RedClothDecoration3){
            handler.addObject(new VesselDecorations((int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.WIDTH),640,1280),(int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.HEIGHT),80,ChewingGumSimulator.HEIGHT), ID.RedClothDecoration3,handler));
            }
            
            
            
            if(this.getId()==ID.WhiteClothDecoration){
            handler.addObject(new VesselDecorations((int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.WIDTH),640,1280),(int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.HEIGHT),80,ChewingGumSimulator.HEIGHT), ID.WhiteClothDecoration,handler));
            }
            
            if(this.getId()==ID.WhiteClothDecoration2){
            handler.addObject(new VesselDecorations((int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.WIDTH),640,1280),(int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.HEIGHT),80,ChewingGumSimulator.HEIGHT), ID.WhiteClothDecoration2,handler));
            }
            
            if(this.getId()==ID.WhiteClothDecoration3){
            handler.addObject(new VesselDecorations((int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.WIDTH),640,1280),(int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.HEIGHT),80,ChewingGumSimulator.HEIGHT), ID.WhiteClothDecoration3,handler));
            }
            
            
            }
        //collision();
        
    }
    
    public void render(Graphics g){
        
        Graphics2D g2d = (Graphics2D) g;
        g2d.setComposite(makeTransparent(alpha));
        
        
        
        
        if(this.getId()==ID.GreaseDecoration){
            //Graphics2D g2d = (Graphics2D) g;
            g2d.setComposite(makeTransparent(alpha));
        g.setColor(Color.yellow);
        g.fillRoundRect((int)x,(int)y, 50, 50,25,25);}
        
        
        if(this.getId()==ID.GreaseDecoration2){
            //Graphics2D g2d = (Graphics2D) g;
            g2d.setComposite(makeTransparent(alpha));
        g.setColor(Color.yellow);
        g.fillRoundRect((int)x,(int)y, 70, 70,30,30);}
        
        if(this.getId()==ID.GreaseDecoration3){
            //Graphics2D g2d = (Graphics2D) g;
            g2d.setComposite(makeTransparent(alpha));
        g.setColor(Color.yellow);
        g.fillRoundRect((int)x,(int)y, 50, 70,40,25);}
        
        
        if(this.getId()==ID.PlateletDecoration){
            //Graphics2D g2d = (Graphics2D) g;
            g2d.setComposite(makeTransparent(alpha));
        g.setColor(Color.white);
        g.fillOval((int)x,(int)y, 50, 50);}
        
        
        if(this.getId()==ID.PlateletDecoration2){
            //Graphics2D g2d = (Graphics2D) g;
            g2d.setComposite(makeTransparent(alpha));
        g.setColor(Color.white);
        g.fillOval((int)x,(int)y, 70, 50);}
        
        if(this.getId()==ID.PlateletDecoration3){
            //Graphics2D g2d = (Graphics2D) g;
            g2d.setComposite(makeTransparent(alpha));
        g.setColor(Color.white);
        g.fillOval((int)x,(int)y, 30, 90);}
        
        
        if(this.getId()==ID.RedClothDecoration){
            //Graphics2D g2d = (Graphics2D) g;
            g2d.setComposite(makeTransparent(alpha));
        g.setColor(Color.red);
        g.fillOval((int)x,(int)y, 50, 50);}
        
        
        if(this.getId()==ID.RedClothDecoration2){
            //Graphics2D g2d = (Graphics2D) g;
            g2d.setComposite(makeTransparent(alpha));
        g.setColor(Color.red);
        g.fillOval((int)x,(int)y, 70, 50);}
        
        if(this.getId()==ID.RedClothDecoration3){
            //Graphics2D g2d = (Graphics2D) g;
            g2d.setComposite(makeTransparent(alpha));
        g.setColor(Color.red);
        g.fillRoundRect((int)x,(int)y, 30, 90,20,30);}
        
        
        if(this.getId()==ID.WhiteClothDecoration){
            //Graphics2D g2d = (Graphics2D) g;
            g2d.setComposite(makeTransparent(alpha));
        g.setColor(Color.orange);
        g.fillOval((int)x,(int)y, 50, 50);}
        
        
        if(this.getId()==ID.WhiteClothDecoration2){
            //Graphics2D g2d = (Graphics2D) g;
            g2d.setComposite(makeTransparent(alpha));
        g.setColor(Color.orange);
        g.fillOval((int)x,(int)y, 70, 50);}
        
        if(this.getId()==ID.WhiteClothDecoration3){
            //Graphics2D g2d = (Graphics2D) g;
            g2d.setComposite(makeTransparent(alpha));
        g.setColor(Color.orange);
        g.fillRoundRect((int)x,(int)y, 30, 90,20,30);}
        
        
        g2d.setComposite(makeTransparent(1));
        
        
        
        
        
    }
    
    
    
    
    }
    
    

