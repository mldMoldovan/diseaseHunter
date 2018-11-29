
package chewing.gum.simulator;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;





public class WorkingTime extends MouseAdapter{
    Handler handler;
    ChewingGumSimulator Game;
    int TimerOne=300;
    int TimerTwo=2000;
    boolean firstDone,secondDone = false;
    
    
    
    public WorkingTime
        (ChewingGumSimulator Game,Handler handler){
        this.Game = Game;
        this.handler = handler;
    }
    
    
    
    
    public void mousePressed(MouseEvent e){
        int mx = e.getX();
        int my = e.getY();
        
        if(mouseOver(mx,my,210,290, 200, 64) && Game.gameState == ChewingGumSimulator.STATE.MarketPlace){
            
            if(HUD.COINS>3)
            {HUD.COINS-=3;
             HUD.AMMO+=50;
            Game.gameState = ChewingGumSimulator.STATE.Game;}
            else{
            Game.gameState = ChewingGumSimulator.STATE.Game;}
      }
        
        
    }
    
    
    private boolean mouseOver(int mx, int my,int x,int y,int width, int height) {
        if(mx > x && mx < (x + width))
        {
            if(my > y && my < (y + height)){
                return true;
            }else return false;
            
        }else return false;
        
    }
    
    public void tick(){
        if(TimerOne>0){
            TimerOne--;
        }
        if(TimerOne==0){
            if(TimerTwo>0){
                TimerTwo--;
                firstDone=true;
            }
            if(TimerTwo==0){
                secondDone=true;
            }
        }
    }
    
    
    
    
    
    public void render(Graphics g){
        
        Font fakefnt = new Font("calibri",1,15);
        g.setFont(fakefnt);
        
        g.setColor(Color.white);
        
        g.drawString("© Microsoft Windows Version 10 Build 10240",10,20);
        if(firstDone==true){
        g.drawString("Attempting to connect to Microsoft servers...",20,40);}
        if(secondDone==true){
        g.drawString("Connection failed.Please try to update later.",20,60);
        }
        
        
    }
    
}
