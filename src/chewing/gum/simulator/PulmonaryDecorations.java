
package chewing.gum.simulator;


import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.util.Random;


public class PulmonaryDecorations extends GameObject{
    
    private Handler handler;
    private Random r = new Random();
    private float alpha = 0.3f;
    private int DisTimer = 4000;
    private int DisTimer2 = 500;
    private GameObject player;
    
    public PulmonaryDecorations(int x, int y, ID id, Handler handler){
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
        
        if(this.getId()==ID.EdemaDecoration){
        return new Rectangle((int)x,(int)y,50,50);
        }
        else if(this.getId()==ID.EdemaDecoration2){
        return new Rectangle((int)x,(int)y,70,70);
        }
        else if(this.getId()==ID.EdemaDecoration3){
        return new Rectangle((int)x,(int)y,50,70);
        }
        
        else if(this.getId()==ID.WaterDecoration){
        return new Rectangle((int)x,(int)y,50,50);
        }
        else if(this.getId()==ID.WaterDecoration2){
        return new Rectangle((int)x,(int)y,70,50);
        }
        else if(this.getId()==ID.WaterDecoration3){
        return new Rectangle((int)x,(int)y,30,90);
        }
        
        else if(this.getId()==ID.PTissueDecoration){
        return new Rectangle((int)x,(int)y,50,50);
        }
        else if(this.getId()==ID.PTissueDecoration2){
        return new Rectangle((int)x,(int)y,70,50);
        }
        else if(this.getId()==ID.PTissueDecoration3){
        return new Rectangle((int)x,(int)y,30,90);
        }
        
        
        else if(this.getId()==ID.AirDecoration){
        return new Rectangle((int)x,(int)y,50,50);
        }
        else if(this.getId()==ID.AirDecoration2){
        return new Rectangle((int)x,(int)y,70,50);
        }
        else if(this.getId()==ID.AirDecoration3){
        return new Rectangle((int)x,(int)y,30,90);
        }
        
        
        else{
        return new Rectangle((int)x,(int)y,33,33);}
    }
    
    private AlphaComposite makeTransparent(float alpha){
        int type = AlphaComposite.SRC_OVER;
        return AlphaComposite.getInstance(type, alpha);
    }
        
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
            if(this.getId()==ID.EdemaDecoration){
            handler.addObject(new VesselDecorations((int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.WIDTH),640,1280),(int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.HEIGHT),80,ChewingGumSimulator.HEIGHT), ID.GreaseDecoration,handler));
            }
            
            if(this.getId()==ID.EdemaDecoration2){
            handler.addObject(new VesselDecorations((int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.WIDTH),640,1280),(int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.HEIGHT),80,ChewingGumSimulator.HEIGHT), ID.GreaseDecoration2,handler));
            }
            
            if(this.getId()==ID.EdemaDecoration3){
            handler.addObject(new VesselDecorations((int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.WIDTH),640,1280),(int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.HEIGHT),80,ChewingGumSimulator.HEIGHT), ID.GreaseDecoration3,handler));
            }
            
            if(this.getId()==ID.WaterDecoration){
            handler.addObject(new VesselDecorations((int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.WIDTH),640,1280),(int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.HEIGHT),80,ChewingGumSimulator.HEIGHT), ID.PlateletDecoration,handler));
            }
            
            if(this.getId()==ID.WaterDecoration2){
            handler.addObject(new VesselDecorations((int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.WIDTH),640,1280),(int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.HEIGHT),80,ChewingGumSimulator.HEIGHT), ID.PlateletDecoration2,handler));
            }
            
            if(this.getId()==ID.WaterDecoration3){
            handler.addObject(new VesselDecorations((int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.WIDTH),640,1280),(int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.HEIGHT),80,ChewingGumSimulator.HEIGHT), ID.PlateletDecoration3,handler));
            }
            
            
            if(this.getId()==ID.PTissueDecoration){
            handler.addObject(new VesselDecorations((int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.WIDTH),640,1280),(int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.HEIGHT),80,ChewingGumSimulator.HEIGHT), ID.RedClothDecoration,handler));
            }
            
            if(this.getId()==ID.PTissueDecoration2){
            handler.addObject(new VesselDecorations((int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.WIDTH),640,1280),(int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.HEIGHT),80,ChewingGumSimulator.HEIGHT), ID.RedClothDecoration2,handler));
            }
            
            if(this.getId()==ID.PTissueDecoration3){
            handler.addObject(new VesselDecorations((int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.WIDTH),640,1280),(int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.HEIGHT),80,ChewingGumSimulator.HEIGHT), ID.RedClothDecoration3,handler));
            }
            
            
            
            if(this.getId()==ID.AirDecoration){
            handler.addObject(new VesselDecorations((int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.WIDTH),640,1280),(int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.HEIGHT),80,ChewingGumSimulator.HEIGHT), ID.WhiteClothDecoration,handler));
            }
            
            if(this.getId()==ID.AirDecoration2){
            handler.addObject(new VesselDecorations((int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.WIDTH),640,1280),(int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.HEIGHT),80,ChewingGumSimulator.HEIGHT), ID.WhiteClothDecoration2,handler));
            }
            
            if(this.getId()==ID.AirDecoration3){
            handler.addObject(new VesselDecorations((int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.WIDTH),640,1280),(int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.HEIGHT),80,ChewingGumSimulator.HEIGHT), ID.WhiteClothDecoration3,handler));
            }
            
            
            }
        
    }
    
    public void render(Graphics g){
        
        
        Graphics2D g2d = (Graphics2D) g;
            g2d.setComposite(makeTransparent(alpha));
        
        
        
        
        if(this.getId()==ID.EdemaDecoration){
            //Graphics2D g2d = (Graphics2D) g;
            g2d.setComposite(makeTransparent(alpha));
        g.setColor(Color.LIGHT_GRAY);
        g.fillRoundRect((int)x,(int)y, 50, 50,25,25);}
        
        
        if(this.getId()==ID.EdemaDecoration2){
            //Graphics2D g2d = (Graphics2D) g;
            g2d.setComposite(makeTransparent(alpha));
        g.setColor(Color.LIGHT_GRAY);
        g.fillRoundRect((int)x,(int)y, 70, 70,30,30);}
        
        if(this.getId()==ID.EdemaDecoration3){
            //Graphics2D g2d = (Graphics2D) g;
            g2d.setComposite(makeTransparent(alpha));
        g.setColor(Color.LIGHT_GRAY);
        g.fillRoundRect((int)x,(int)y, 50, 70,40,25);}
        
        
        if(this.getId()==ID.WaterDecoration){
            //Graphics2D g2d = (Graphics2D) g;
            g2d.setComposite(makeTransparent(alpha));
        g.setColor(Color.blue);
        g.fillOval((int)x,(int)y, 50, 50);}
        
        
        if(this.getId()==ID.WaterDecoration2){
            //Graphics2D g2d = (Graphics2D) g;
            g2d.setComposite(makeTransparent(alpha));
        g.setColor(Color.blue);
        g.fillOval((int)x,(int)y, 70, 50);}
        
        if(this.getId()==ID.WaterDecoration3){
            //Graphics2D g2d = (Graphics2D) g;
            g2d.setComposite(makeTransparent(alpha));
        g.setColor(Color.blue);
        g.fillOval((int)x,(int)y, 30, 90);}
        
        
        if(this.getId()==ID.PTissueDecoration){
            //Graphics2D g2d = (Graphics2D) g;
            g2d.setComposite(makeTransparent(alpha));
        g.setColor(Color.white);
        g.fillOval((int)x,(int)y, 50, 50);}
        
        
        if(this.getId()==ID.PTissueDecoration2){
            //Graphics2D g2d = (Graphics2D) g;
            g2d.setComposite(makeTransparent(alpha));
        g.setColor(Color.white);
        g.fillOval((int)x,(int)y, 70, 50);}
        
        if(this.getId()==ID.PTissueDecoration3){
            //Graphics2D g2d = (Graphics2D) g;
            g2d.setComposite(makeTransparent(alpha));
        g.setColor(Color.white);
        g.fillRoundRect((int)x,(int)y, 30, 90,20,30);}
        
        
        if(this.getId()==ID.AirDecoration){
            //Graphics2D g2d = (Graphics2D) g;
            g2d.setComposite(makeTransparent(alpha-0.1f));
        g.setColor(Color.white);
        g.fillOval((int)x,(int)y, 50, 50);}
        
        
        if(this.getId()==ID.AirDecoration2){
            //Graphics2D g2d = (Graphics2D) g;
            g2d.setComposite(makeTransparent(alpha-0.1f));
        g.setColor(Color.white);
        g.fillOval((int)x,(int)y, 70, 50);}
        
        if(this.getId()==ID.AirDecoration3){
            //Graphics2D g2d = (Graphics2D) g;
            g2d.setComposite(makeTransparent(alpha-0.1f));
        g.setColor(Color.white);
        g.fillRoundRect((int)x,(int)y, 30, 90,20,30);}
        
        
        g2d.setComposite(makeTransparent(1));
        
        
        
        
        
    }
    
    
    
    
    }
    
    

