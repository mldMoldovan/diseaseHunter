
package chewing.gum.simulator;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;





public class TutorialRender{
    Handler handler;
    ChewingGumSimulator Game;
    
    
   
    private Random r;
    
    
    
    public TutorialRender(ChewingGumSimulator Game,Handler handler){
        this.Game = Game;
        this.handler = handler;
        
    }
    
    
    
    public void tick(){
        
        
        
    }
    
    
    
    
    
    public void render(Graphics g){
        
       Font Bigfnt = new Font("calibri",1,40);
       Font Mediumfnt = new Font("calibri",1,20);
       Font Smallfnt = new Font("calibri",1,15);
        
        if(Game.tutorialStages[0]==false && Game.tutorialStages[1]==false){
           
           
           g.setFont(Mediumfnt);
           g.setColor(Color.blue);
           g.fillRoundRect(10,Game.HEIGHT-120,Game.WIDTH-20,80,20,20);
           g.setColor(Color.white);
           g.drawRoundRect(10,Game.HEIGHT-120,Game.WIDTH-20,80,20,20);
           
           g.drawString("Use Arrow Keys To Move",20,Game.HEIGHT-100);
           g.setFont(Smallfnt);
           g.drawString("You can freely move in any direction",20,Game.HEIGHT-80);
           
       }
               
           if(Game.tutorialStages[0]==true && Game.tutorialStages[1]==false){
           
           
           g.setFont(Mediumfnt);
           g.setColor(Color.blue);
           g.fillRoundRect(10,Game.HEIGHT-120,Game.WIDTH-20,80,20,20);
           g.setColor(Color.white);
           g.drawRoundRect(10,Game.HEIGHT-120,Game.WIDTH-20,80,20,20);
           
           g.drawString("You will encounter Blood Cells on your way",20,Game.HEIGHT-100);
           g.setFont(Smallfnt);
           g.drawString("You can freely move in any direction",20,Game.HEIGHT-80);
       }
               
             if(Game.tutorialStages[1]==true && Game.tutorialStages[2]==false){
           
           
           g.setFont(Mediumfnt);
           g.setColor(Color.blue);
           g.fillRoundRect(10,Game.HEIGHT-120,Game.WIDTH-20,80,20,20);
           g.setColor(Color.white);
           g.drawRoundRect(10,Game.HEIGHT-120,Game.WIDTH-20,80,20,20);
           
           g.drawString("You will encounter Blood Cells on your way",20,Game.HEIGHT-100);
           g.setFont(Smallfnt);
           g.drawString("Avoid it or use W A S D to shoot it",20,Game.HEIGHT-80);
       }
               
            if(Game.tutorialStages[2]==true && Game.tutorialStages[3]==false){
           
           
           g.setFont(Mediumfnt);
           g.setColor(Color.blue);
           g.fillRoundRect(10,Game.HEIGHT-120,Game.WIDTH-20,80,20,20);
           g.setColor(Color.white);
           g.drawRoundRect(10,Game.HEIGHT-120,Game.WIDTH-20,80,20,20);
           
           g.drawString("For crying out loud ! A photon !",20,Game.HEIGHT-100);
           g.setFont(Smallfnt);
           g.drawString("Very fast particle that cannot be damaged by normal nanobots",20,Game.HEIGHT-80);
           
       }
               
            if(Game.tutorialStages[3]==true && Game.tutorialStages[4]==false){
           
           
           g.setFont(Mediumfnt);
           g.setColor(Color.blue);
           g.fillRoundRect(10,Game.HEIGHT-120,Game.WIDTH-20,80,20,20);
           g.setColor(Color.white);
           g.drawRoundRect(10,Game.HEIGHT-120,Game.WIDTH-20,80,20,20);
           
           g.drawString("Press Enter to deploy an EMP",20,Game.HEIGHT-100);
           g.setFont(Smallfnt);
           g.drawString("Electromagnetic pulses can destroy some particles",20,Game.HEIGHT-80);
       }
               
               
             if(Game.tutorialStages[4]==true && Game.tutorialStages[5]==false){
           
           
           g.setFont(Mediumfnt);
           g.setColor(Color.blue);
           g.fillRoundRect(10,Game.HEIGHT-120,Game.WIDTH-20,80,20,20);
           g.setColor(Color.white);
           g.drawRoundRect(10,Game.HEIGHT-120,Game.WIDTH-20,80,20,20);
           
           g.drawString("That's a grease ball floating",20,Game.HEIGHT-100);
           g.setFont(Smallfnt);
           g.drawString("You must shoot it before it gets you",20,Game.HEIGHT-80);
       }
               
               
             if(Game.tutorialStages[5]==true && Game.tutorialStages[6]==false){
           
           
           g.setFont(Mediumfnt);
           g.setColor(Color.blue);
           g.fillRoundRect(10,Game.HEIGHT-120,Game.WIDTH-20,80,20,20);
           g.setColor(Color.white);
           g.drawRoundRect(10,Game.HEIGHT-120,Game.WIDTH-20,80,20,20);
           
           g.drawString("Shoot the new electrical nanobots",20,Game.HEIGHT-100);
           g.setFont(Smallfnt);
           g.drawString("These 20000-Volt nanobots are able to shortcircuit any cell type",20,Game.HEIGHT-80);
       }
               
            if(Game.tutorialStages[6]==true && Game.tutorialStages[7]==false){
           
           
           g.setFont(Mediumfnt);
           g.setColor(Color.blue);
           g.fillRoundRect(10,Game.HEIGHT-120,Game.WIDTH-20,80,20,20);
           g.setColor(Color.white);
           g.drawRoundRect(10,Game.HEIGHT-120,Game.WIDTH-20,80,20,20);
           
           g.drawString("A fission is occuring right now ! Stay away !",20,Game.HEIGHT-100);
           g.setFont(Smallfnt);
           g.drawString("The fission process will eliminate a lot of energy, be aware around them",20,Game.HEIGHT-80);
       }
               
               
             if(Game.tutorialStages[7]==true && Game.tutorialStages[8]==false){
           
           
           g.setFont(Mediumfnt);
           g.setColor(Color.blue);
           g.fillRoundRect(10,Game.HEIGHT-120,Game.WIDTH-20,80,20,20);
           g.setColor(Color.white);
           g.drawRoundRect(10,Game.HEIGHT-120,Game.WIDTH-20,80,20,20);
           
           g.drawString("You can start an Artificial Fission by pressing G",20,Game.HEIGHT-100);
           g.setFont(Smallfnt);
           g.drawString("Launch the fission and watch it damaging cells.",20,Game.HEIGHT-80);
           g.drawString("The frequency of the energy is different so it won't damage you !",20,Game.HEIGHT-60);
             }
               
               
            if(Game.tutorialStages[8]==true && Game.tutorialStages[9]==false){
           
           
           g.setFont(Mediumfnt);
           g.setColor(Color.blue);
           g.fillRoundRect(10,Game.HEIGHT-120,Game.WIDTH-20,80,20,20);
           g.setColor(Color.white);
           g.drawRoundRect(10,Game.HEIGHT-120,Game.WIDTH-20,80,20,20);
           
           g.drawString("In order to survive, you must Collect Resources",20,Game.HEIGHT-100);
           g.setFont(Smallfnt);
           g.drawString("You will find all kind of boxes - for health, ammo, electrical nanobots and boosts",20,Game.HEIGHT-80);
       }
               
               
              if(Game.tutorialStages[9]==true && Game.tutorialStages[10]==false){
           
           
           g.setFont(Mediumfnt);
           g.setColor(Color.blue);
           g.fillRoundRect(10,Game.HEIGHT-120,Game.WIDTH-20,80,20,20);
           g.setColor(Color.white);
           g.drawRoundRect(10,Game.HEIGHT-120,Game.WIDTH-20,80,20,20);
           
           g.drawString("You can access the shop anytime by pressing M",20,Game.HEIGHT-100);
           g.setFont(Smallfnt);
           g.drawString("Use the shop to fulfill all your needs ( if you have the money, of course )",20,Game.HEIGHT-80);
       }
               
            if(Game.tutorialStages[10]==true && Game.tutorialStages[11]==false){
           
           
           g.setFont(Mediumfnt);
           g.setColor(Color.blue);
           g.fillRoundRect(10,Game.HEIGHT-120,Game.WIDTH-20,80,20,20);
           g.setColor(Color.white);
           g.drawRoundRect(10,Game.HEIGHT-120,Game.WIDTH-20,80,20,20);
           
           g.drawString("A Mutated Chicken Pox virus appeared !",20,Game.HEIGHT-100);
           g.setFont(Smallfnt);
           g.drawString("Destroy the virus and collect the treasure for more coins",20,Game.HEIGHT-80);
       }
               
            if(Game.tutorialStages[11]==true && Game.tutorialStages[12]==false){
           
           
           g.setFont(Mediumfnt);
           g.setColor(Color.blue);
           g.fillRoundRect(10,Game.HEIGHT-120,Game.WIDTH-20,80,20,20);
           g.setColor(Color.white);
           g.drawRoundRect(10,Game.HEIGHT-120,Game.WIDTH-20,80,20,20);
           
           g.drawString("The main strain of the Chicken Pox is here !",20,Game.HEIGHT-100);
           g.setFont(Smallfnt);
           g.drawString("Use the innovative universal atomic cure to get out of the shittiest situations by pressing N",20,Game.HEIGHT-80);
       }
    
     }
}
