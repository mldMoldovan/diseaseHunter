
package chewing.gum.simulator;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;



public class Logo {
    private Handler handler;
    private ChewingGumSimulator Game;
    private int logoTimer=150;
    
    public Logo(ChewingGumSimulator Game, Handler handler){
        this.handler = handler;
        this.Game=Game;
    }
    
    public void tick(){
        if(logoTimer>0){
            logoTimer--;
        }
        if(logoTimer==0){
            Game.gameState = ChewingGumSimulator.STATE.Menu;
        }
    }
    
    public void render(Graphics g){
        Font logofnt = new Font("calibri",1,40);
        Font logofnt1280 = new Font("calibri",1,80);
        Font logofnt1920 = new Font("calibri",1,120);
        Font minifnt = new Font("calibri",1,20);
        
        g.setColor(Color.white);
        if(Game.WIDTH==640){
            g.setFont(logofnt);
        g.drawString("MLD Corporation",160,ChewingGumSimulator.HEIGHT/2-50);
        g.setFont(minifnt);
        g.drawString("© Copyright 2017",220,ChewingGumSimulator.HEIGHT-50);
        }
        
        if(Game.WIDTH==960){
        g.drawString("MLD Corporation",160,ChewingGumSimulator.HEIGHT/2-50);
        g.setFont(minifnt);
        g.drawString("© Copyright 2017",240,ChewingGumSimulator.HEIGHT-50);
        }
        
        
        if(Game.WIDTH==1280){
        g.setFont(logofnt1280);
        g.drawString("MLD Corporation",320,ChewingGumSimulator.HEIGHT/2-100);
        g.setFont(minifnt);
        g.drawString("© Copyright 2017",530,ChewingGumSimulator.HEIGHT-100);
        }
        
        if(Game.WIDTH==1920){
            g.setFont(logofnt1920);
        g.drawString("MLD Corporation",480,ChewingGumSimulator.HEIGHT/2-150);
        g.setFont(minifnt);
        g.drawString("© Copyright 2017",720,ChewingGumSimulator.HEIGHT-150);
        }
    }
    
}
