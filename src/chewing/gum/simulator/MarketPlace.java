
package chewing.gum.simulator;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;





public class MarketPlace extends MouseAdapter{
    Handler handler;
    ChewingGumSimulator Game;
    
    private int Timer = 200;
    private int Timer2 = 200;
    private boolean Enough=false;
    private boolean NotEnough = false;
    private Color marketColor = new Color(69, 102, 142);
    
    
    
    public MarketPlace(ChewingGumSimulator Game,Handler handler){
        this.Game = Game;
        this.handler = handler;
        
    }
    
    
    
    
    public void mousePressed(MouseEvent e){
        int mx = e.getX();
        int my = e.getY();//
        //REFILL HEALTH
        if(mouseOver(mx,my,10,10,200,60) && Game.gameState == ChewingGumSimulator.STATE.MarketPlace){
            if(HUD.COINS>=100){
                if(HUD.HEALTH<100){
                HUD.COINS-=100;
                HUD.HEALTH=100;
                Game.gameState = ChewingGumSimulator.STATE.Game;
                ChewingGumSimulator.paused = false;}
                else if(HUD.HEALTH==100)
                {
                    Enough=true;
                    
                }
            }
            else{
            NotEnough=true;}
      }
        
        //REFILL AMMO
        if(mouseOver(mx,my,10,80,200,60) && Game.gameState == ChewingGumSimulator.STATE.MarketPlace){
            if(HUD.COINS>=50){
                if(HUD.AMMO<100){
                HUD.COINS-=50;
                HUD.AMMO=100;
            Game.gameState = ChewingGumSimulator.STATE.Game;
            ChewingGumSimulator.paused = false;}
                else if(HUD.AMMO==100)
                {
                    Enough=true;
                }}
            else{
            NotEnough=true;}
      }
        
        
        //REFILL BLADDER
        if(mouseOver(mx,my,10,150,200,60) && Game.gameState == ChewingGumSimulator.STATE.MarketPlace){
            if(HUD.COINS>=75){
                if(HUD.BLADDER<100){
                HUD.COINS-=75;
                HUD.BLADDER=100;
            Game.gameState = ChewingGumSimulator.STATE.Game;
            ChewingGumSimulator.paused = false;}
                else if(HUD.BLADDER==100){
                    Enough=true;
                }}
            else{
            NotEnough=true;}
      }
        
        //SHIELD BOOST
        if(mouseOver(mx,my,220,10,200,60) && Game.gameState == ChewingGumSimulator.STATE.MarketPlace){
            if(HUD.COINS>=200){
                HUD.COINS-=200;
                if(Player.Shield==false)
                {Player.Shield=true;}
                else if(Player.Shield==true)
                {
                    Player.Timer=3000;
                }
            Game.gameState = ChewingGumSimulator.STATE.Game;
            ChewingGumSimulator.paused = false;}
            else{
            NotEnough=true;}
      }
        
        
        
        //SPEED BOOST
        if(mouseOver(mx,my,220,80,200,60) && Game.gameState == ChewingGumSimulator.STATE.MarketPlace){
            if(HUD.COINS>=300){
                HUD.COINS-=300;
                if(Player.SpeedBoosted==false)
                {
                    Player.SpeedBoosted=true;
                }
                
                else if(Player.SpeedBoosted==true)
                {
                    Player.SpeedBoosted=false;
                    Player.SpeedBoosted=true;
                }
            Game.gameState = ChewingGumSimulator.STATE.Game;
            ChewingGumSimulator.paused = false;}
            else{
            NotEnough=true;}
      }
        
        
        //DAMAGE BOOST
        if(mouseOver(mx,my,220,150,200,60) && Game.gameState == ChewingGumSimulator.STATE.MarketPlace){
            if(HUD.COINS>=250){
                HUD.COINS-=250;
                if(Player.Thunderstruck==false)
                {
                    Player.Thunderstruck=true;
                }
                
                else if(Player.Thunderstruck==true)
                {   Player.Thunderstruck=false;
                    Player.Thunderstruck=true;
                }
            Game.gameState = ChewingGumSimulator.STATE.Game;
            ChewingGumSimulator.paused = false;}
            else{
            NotEnough=true;}
      }
        
        //NANO EMP
        if(mouseOver(mx,my,430,10,200,60) && Game.gameState == ChewingGumSimulator.STATE.MarketPlace){
            if(HUD.COINS>=150){
                if(HUD.EMPCount<10){
                HUD.COINS-=150;
                HUD.EMPCount++;
            Game.gameState = ChewingGumSimulator.STATE.Game;
            ChewingGumSimulator.paused = false;}
                else if(HUD.EMPCount==10){
                    Enough=true;
                }}
            else{
            
            NotEnough=true;}
      }
        
        //UNIVERSAL NUKE
        if(mouseOver(mx,my,430,80,200,60) && Game.gameState == ChewingGumSimulator.STATE.MarketPlace){
            if(HUD.COINS>=1000){
                
                if(HUD.NUKES<5)
                {HUD.NUKES++;
                HUD.COINS-=1000;
                Game.gameState = ChewingGumSimulator.STATE.Game;
            ChewingGumSimulator.paused = false;}
                else if(HUD.NUKES==5)
                {
                    Enough=true;
                }
            }
            else{
            NotEnough=true;}
      }
        
        //ATOMIC FISSION
        if(mouseOver(mx,my,430,150,200,60) && Game.gameState == ChewingGumSimulator.STATE.MarketPlace){
            if(HUD.COINS>=150){
                if(HUD.ATOMS<25){
                HUD.COINS-=150;
                HUD.ATOMS++;
            Game.gameState = ChewingGumSimulator.STATE.Game;
            ChewingGumSimulator.paused = false;}
                else if(HUD.ATOMS==25){
                    Enough=true;
                }}
            else{
            NotEnough=true;}
      }
        
        
        
        //BACK BUTTON
        if(mouseOver(mx,my,220,290,200,60) && Game.gameState == ChewingGumSimulator.STATE.MarketPlace){
            
            Game.gameState = ChewingGumSimulator.STATE.Game;
            ChewingGumSimulator.paused = false;
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
        
        if(Timer > 0 && NotEnough==true)
        {
            Timer--;
        }
        if(Timer==0)
        {   
            NotEnough=false;
            Timer=200;
        }
        if(Timer2 > 0 && Enough==true)
        {
            Timer2--;
        }
        if(Timer2==0)
        {
            Enough=false;
            Timer2=200;
        }
        
    }
    
    
    
    
    
    public void render(Graphics g){
        
       
        
        Font fnt = new Font("arial",1,15);
        Font fnt2 = new Font("calibri",1,12);
        g.setFont(fnt);
        
        g.setColor(marketColor);
        g.fillRoundRect(10,10,200,60,20,20);
        g.setColor(Color.white);
        
        g.drawRoundRect(10,10,200,60,20,20);
        g.drawString("Refill Health",70,30);
        g.setFont(fnt2);
        g.setColor(Color.yellow);
        g.drawString("100 Coins",90,50);
        g.setFont(fnt);
        
        
        
        g.setColor(marketColor);
        g.fillRoundRect(220,10,200,60,20,20);
        g.setColor(Color.white);
        g.drawRoundRect(220,10,200,60,20,20);
        g.drawString("Shield Boost",270,30);
        g.setFont(fnt2);
        g.setColor(Color.yellow);
        g.drawString("200 Coins",290,50);
        g.setFont(fnt);
        
        
        
        
        g.setColor(marketColor);
        g.fillRoundRect(430,10,200,60,20,20);
        g.setColor(Color.white);
        
        g.drawRoundRect(430,10,200,60,20,20);
        g.drawString("Nano EMP",495,30);
        g.setFont(fnt2);
        g.setColor(Color.yellow);
        g.drawString("150 Coins",505,50);
        g.setFont(fnt);
        
        
        
        g.setColor(marketColor);
        g.fillRoundRect(10,80,200,60,20,20);
        g.setColor(Color.white);
        
        
        
        g.drawRoundRect(10,80,200,60,20,20);
        g.drawString("Refill Ammo",75,100);
        g.setFont(fnt2);
        g.setColor(Color.yellow);
        g.drawString("50 Coins",95,120);
        g.setFont(fnt);
        
        
        
        
        g.setColor(marketColor);
        g.fillRoundRect(220,80,200,60,20,20);
        g.setColor(Color.white);
        
        g.drawRoundRect(220,80,200,60,20,20);
        g.drawString("Speed Boost",270,100);
        g.setFont(fnt2);
        g.setColor(Color.yellow);
        g.drawString("300 Coins",290,120);
        g.setFont(fnt);
        
        
        
        
        g.setColor(marketColor);
        g.fillRoundRect(430,80,200,60,20,20);
        g.setColor(Color.white);
        
        g.drawRoundRect(430,80,200,60,20,20);
        g.drawString("Universal Cure",480,100);
        g.setFont(fnt2);
        g.setColor(Color.yellow);
        g.drawString("1000 Coins",500,120);
        g.setFont(fnt);
        
        
        
        
        g.setColor(marketColor);
        g.fillRoundRect(10,150,200,60,20,20);
        g.setColor(Color.white);
        
        
        
        g.drawRoundRect(10,150,200,60,20,20);
        g.drawString("Refill Bladder",70,170);
        g.setFont(fnt2);
        g.setColor(Color.yellow);
        g.drawString("75 Coins",95,190);
        g.setFont(fnt);
        g.setColor(Color.white);
        
        
        g.setColor(marketColor);
        g.fillRoundRect(220,150,200,60,20,20);
        g.setColor(Color.white);
        
        
        g.drawRoundRect(220,150,200,60,20,20);
        g.drawString("Damage Boost",270,170);
        g.setFont(fnt2);
        g.setColor(Color.yellow);
        g.drawString("250 Coins",290,190);
        g.setFont(fnt);
        
        
        
        g.setColor(marketColor);
        g.fillRoundRect(430,150,200,60,20,20);
        g.setColor(Color.white);
        g.drawRoundRect(430,150,200,60,20,20);
        g.drawString("Fissing Atom",480,170);
        g.setFont(fnt2);
        g.setColor(Color.yellow);
        g.drawString("150 Coins",500,190);
        g.setFont(fnt);
        
        
        
        g.setColor(Color.red);
        g.fillRoundRect(220,290,200,60,20,20);
        g.setColor(Color.white);
        
        
        g.drawRoundRect(220,290,200,60,20,20);
        g.drawString("Back To Game",270,330);
        
        if(Enough==true && Timer2 > 0)
        {   g.setColor(Color.red);
            g.drawString("You already have maximum value for this item",185,370);
        }
        if(NotEnough==true && Timer > 0)
        {   g.setColor(Color.yellow);
            g.drawString("You do not have the required currency",190,370);
            
        }
    }
    
}
