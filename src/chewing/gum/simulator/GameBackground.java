
package chewing.gum.simulator;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;





public class GameBackground{
    Handler handler;
    ChewingGumSimulator Game;
    
    
   
    private Random r;
    
    
    
    public GameBackground(ChewingGumSimulator Game,Handler handler){
        this.Game = Game;
        this.handler = handler;
        
    }
    
    
    
    public void tick(){
        
        
        
    }
    
    
    
    
    
    public void render(Graphics g){
        
       
        
        Font fnt = new Font("arial",1,15);
        Font fnt2 = new Font("calibri",1,12);
        g.setFont(fnt);
        
        Game.savedBackground = Game.backgroundSelection;
           if(Game.backgroundSelection==0)
           {
               g.setColor(Color.black);
               g.fillRect(0,0,Game.WIDTH,Game.HEIGHT);
           }
           else if(Game.backgroundSelection==2)
           {
               g.setColor(Color.green);
               g.fillRect(0,0,Game.WIDTH,Game.HEIGHT);
           }
           else if(Game.backgroundSelection==3)
           {
               g.setColor(Color.magenta);
               g.fillRect(0,0,Game.WIDTH,Game.HEIGHT);
           }
           else if(Game.backgroundSelection==1){
           Color skyColor = new Color(132,112,255);
           Color brownColor = new Color(140,20,0);
           g.setColor(skyColor);
           g.fillRect(0,0,Game.WIDTH,Game.HEIGHT-80);
           
           g.setColor(Color.green);
           g.fillRect(0,Game.HEIGHT-80,Game.WIDTH,20);
           
           g.setColor(brownColor);
           g.fillRect(0,Game.HEIGHT-60,Game.WIDTH,60);}
           
           else if(Game.backgroundSelection==4){
           Color skyColor = new Color(132,112,255);
           Color brownColor = new Color(140,20,0);
           Color sandColor = new Color	(237, 201, 175);
           
           g.setColor(skyColor);
           g.fillRect(0,0,Game.WIDTH,Game.HEIGHT-80);
           
           g.setColor(sandColor);
           g.fillRect(0,Game.HEIGHT-80,Game.WIDTH,20);
           
           g.setColor(brownColor);
           g.fillRect(0,Game.HEIGHT-60,Game.WIDTH,60);
           
           g.setColor(Color.orange);
           g.fillRect(Game.WIDTH/2-50,Game.HEIGHT-130,100,50);}
           
           else if(Game.backgroundSelection==5){
           Color skyColor = new Color(132,112,255);
           Color brownColor = new Color(140,20,0);
           Color sandColor = new Color	(237, 201, 175);
           
           g.setColor(skyColor);
           g.fillRect(0,0,Game.WIDTH,Game.HEIGHT-80);
           
           g.setColor(sandColor);
           g.fillRect(0,Game.HEIGHT-80,Game.WIDTH,20);
           
           g.setColor(brownColor);
           g.fillRect(0,Game.HEIGHT-60,Game.WIDTH,60);
           
           g.setColor(Color.yellow);
           g.fillOval(Game.WIDTH-150,150,100,100);
           
           g.setColor(sandColor);
           g.fillRect(0,Game.HEIGHT-100,Game.WIDTH/3,20);
           g.fillRect((Game.WIDTH-(Game.WIDTH/3)),Game.HEIGHT-100,Game.WIDTH/3,20);
           
           }
           
           else if(Game.backgroundSelection==6){
           Color skyColor = new Color(132,112,255);
           Color brownColor = new Color(140,20,0);
           Color sandColor = new Color	(237, 201, 175);
           
           g.setColor(skyColor);
           g.fillRect(0,0,Game.WIDTH,Game.HEIGHT-80);
           
           g.setColor(Color.green);
           g.fillRect(0,Game.HEIGHT-80,Game.WIDTH,20);
           
           g.setColor(Color.DARK_GRAY);
           g.fillRect(0,Game.HEIGHT-60,Game.WIDTH,60);
           
           g.setColor(Color.yellow);
           g.fillRect(150,150,100,100);
           
           g.setColor(Color.DARK_GRAY);
           g.fillRect(0,Game.HEIGHT-140,20,60);
           
           g.fillRect(Game.WIDTH/3,Game.HEIGHT-140,20,60);
           
           g.fillRect(Game.WIDTH/3*2,Game.HEIGHT-140,20,60);
           
           g.fillRect(Game.WIDTH-30,Game.HEIGHT-140,20,60);
           
           g.fillRect(0,Game.HEIGHT-160,75,20);
           
           g.fillRect(Game.WIDTH/3-85,Game.HEIGHT-160,75,20);
           g.fillRect(Game.WIDTH/3-10,Game.HEIGHT-160,55,20);
           g.fillRect((Game.WIDTH/3*2)-55,Game.HEIGHT-160,45,20);
           g.fillRect((Game.WIDTH/3*2)-10,Game.HEIGHT-160,35,20);
           }
           
           else if(Game.backgroundSelection==7){
           Color skyColor = new Color(132,112,255);
           Color brownColor = new Color(140,20,0);
           Color sandColor = new Color	(237, 201, 175);
           
           g.setColor(skyColor);
           g.fillRect(0,0,Game.WIDTH,Game.HEIGHT-150);
           
           g.setColor(Color.blue);
           g.fillRect(0,Game.HEIGHT-150,Game.WIDTH,70);
           
           g.setColor(sandColor);
           g.fillRect(0,Game.HEIGHT-80,Game.WIDTH,20);
           
           g.setColor(brownColor);
           g.fillRect(0,Game.HEIGHT-60,Game.WIDTH,60);
           
           g.setColor(Color.orange);
           g.fillRect(Game.WIDTH/2-50,Game.HEIGHT-200,100,50);}
           
           else if(Game.backgroundSelection==8){
           Color skyColor = new Color(132,112,255);
           Color brownColor = new Color(140,20,0);
           g.setColor(skyColor);
           g.fillRect(0,0,Game.WIDTH,Game.HEIGHT-80);
           
           g.setColor(Color.green);
           g.fillRect(0,Game.HEIGHT-80,Game.WIDTH,20);
           
           g.setColor(brownColor);
           g.fillRect(0,Game.HEIGHT-60,Game.WIDTH,60);
           
           g.setColor(Color.green);
           g.fillRect(0,Game.HEIGHT-100,Game.WIDTH/3,20);
           g.fillRect((Game.WIDTH-(Game.WIDTH/3)),Game.HEIGHT-100,Game.WIDTH/3,20);
           
           g.fillRect(0,Game.HEIGHT-120,Game.WIDTH/4,20);
           g.fillRect((Game.WIDTH-(Game.WIDTH/3)),Game.HEIGHT-120,Game.WIDTH/4,20);
           
           g.fillRect(0,Game.HEIGHT-140,Game.WIDTH/5,20);
           g.fillRect((Game.WIDTH-(Game.WIDTH/3)),Game.HEIGHT-140,Game.WIDTH/5,20);
           
           g.fillRect(0,Game.HEIGHT-160,Game.WIDTH/7,20);
           g.fillRect((Game.WIDTH-(Game.WIDTH/3)),Game.HEIGHT-160,Game.WIDTH/7,20);
           
           g.setColor(Color.orange);
           g.fillRect(Game.WIDTH/2-50,Game.HEIGHT-130,100,50);
           
           
           
           
           }
           //NORMAND SEA
           else if(Game.backgroundSelection==9){
           Color skyColor = new Color(132,112,255);
           Color brownColor = new Color(140,20,0);
           Color sandColor = new Color	(237, 201, 175);
           g.setColor(skyColor);
           g.fillRect(0,0,Game.WIDTH,Game.HEIGHT-80);
           
           g.setColor(Color.yellow);
           g.fillRect(150,150,100,100);
           
           g.setColor(sandColor);
           g.fillRect(0,Game.HEIGHT-80,Game.WIDTH,60);
           
           }
           
           //NORMAND SUNSET
           else if(Game.backgroundSelection==10){
           Color skyColor = new Color(132,112,255);
           Color brownColor = new Color(140,20,0);
           g.setColor(skyColor);
           g.fillRect(0,0,Game.WIDTH,Game.HEIGHT-80);
           
           g.setColor(Color.green);
           g.fillRect(0,Game.HEIGHT-80,Game.WIDTH,20);
           
           g.setColor(brownColor);
           g.fillRect(0,Game.HEIGHT-60,Game.WIDTH,60);}
           
           
           else if(Game.backgroundSelection==11)
           {   Color randCol = new Color(r.nextInt(255),r.nextInt(255),r.nextInt(255));
               
               
                   for(int j=0;j<16;j++)
                   {g.setColor(randCol);
               g.fillRect(0+(Game.WIDTH/16*j),0+(Game.HEIGHT/16*j),Game.WIDTH/16,Game.HEIGHT/16);
                   g.fillRect(r.nextInt(Game.WIDTH), r.nextInt(Game.HEIGHT), r.nextInt(150),r.nextInt(130));}
               
           }
           
           else if(Game.backgroundSelection==12)
           {   
               
               
                   for(int j=0;j<32;j++)
                   {g.setColor(Color.white);
               //g.fillRect(0+(Game.WIDTH/16*j),0+(Game.HEIGHT/16*j),Game.WIDTH/16,Game.HEIGHT/16);
                   g.fillRect(r.nextInt(Game.WIDTH), r.nextInt(Game.HEIGHT), r.nextInt(6),r.nextInt(6));}
               
           
           }
    
     }
}
