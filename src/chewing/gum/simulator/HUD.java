
package chewing.gum.simulator;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;



public class HUD {
    
    public static float HEALTH = 100;
    public static float HEALTH2 = 100;
    public static float AMMO = 100;
    public static float BLADDER = 100;
    
    
    public static float ATOMS = 0;
    public static float EMPCount = 0;
    public static float NUKES = 0;
    public static float COINS = 0;
    public static float XP = 0;
    
    
    
    
    
    
    private float greenValue = 254f;
    private float newgreenValue = 254f;
    private float iargreenValue = 254f;
    private float xpgreenValue = 254f;
    ChewingGumSimulator Game;
    
    private float score = 0;
    private float level = 1;
    private int levelTimer=500;
    private boolean levelUp=false;
    float getLevel;
    
    
    public void tick(){
        
        if(Game.playerXP % 1000 == 0){
            levelUp=true;
            
        }
        if(levelUp==true){
            if(levelTimer>0){
                levelTimer--;
            }
            if(levelTimer<=0){
                levelUp=false;
                levelTimer=500;
            }
        }
        
        HEALTH = ChewingGumSimulator.clamp(HEALTH,0,100);
        AMMO = ChewingGumSimulator.clamp(AMMO,0,100);
        EMPCount = ChewingGumSimulator.clamp(EMPCount,0,100);
        NUKES = ChewingGumSimulator.clamp(NUKES,0,5);
        ATOMS = ChewingGumSimulator.clamp(ATOMS,0,25);
        if(Game.playerXP<1000)
        {XP = Game.playerXP;}
        else if(Game.playerXP>1000){
            XP=Game.playerXP%1000;
        }
        XP=ChewingGumSimulator.clamp(XP,0,1000);
        greenValue = ChewingGumSimulator.clamp(greenValue,0,255);
        greenValue = HEALTH * 2;
        newgreenValue = ChewingGumSimulator.clamp(newgreenValue,0,255);
        newgreenValue = AMMO *2;
        iargreenValue = ChewingGumSimulator.clamp(iargreenValue,0,255);
        iargreenValue = HEALTH2 *2;
        xpgreenValue = ChewingGumSimulator.clamp(xpgreenValue,0,255);
        xpgreenValue = XP/10 *2;
        
        score++;
        
    }
    
    public void render(Graphics g){
        Font bigFnt = new Font ("calibri",1,25);
        if(Game.gameState == ChewingGumSimulator.STATE.Game || Game.gameState == ChewingGumSimulator.STATE.Tutorial || Game.gameState == ChewingGumSimulator.STATE.ArenaEditor){
        g.setColor(Color.gray);
        g.fillRoundRect(250, 15, 200, 32,10,10);
        g.fillRoundRect(15, 15, 200, 32,10,10);
        
        if(levelUp==true){
            g.setFont(bigFnt);
            g.drawString("Rank Up ! ", Game.WIDTH/2-50, Game.HEIGHT/2-100);
            g.drawString("You are now Rank " + Game.playerLevel,Game.WIDTH/2-50,Game.HEIGHT/2-50);
        }
        
        
        g.setColor(new Color(75,(int)greenValue,0));
        g.fillRoundRect(15, 15,(int) HEALTH * 2, 32,10,10);
        g.setColor(Color.white);
        g.drawRoundRect(15, 15,(int) HEALTH * 2, 32,10,10);
        
        
        
        g.setColor(new Color(75,(int)newgreenValue,0));
        g.fillRoundRect(250, 15,(int) AMMO * 2, 32,10,10);
        g.setColor(Color.red);
        g.drawRoundRect(250, 15,(int) AMMO * 2, 32,10,10);
        g.setColor(Color.white);
        
        
        if(Game.bladderActive==true){
            
        g.setColor(Color.white);
        g.drawRoundRect(455, 15,(int) BLADDER/2, 32,10,10);
        g.setColor(Color.blue);
        g.fillRoundRect(455, 15,50, 32,10,10);
        g.setColor(Color.white);
        g.setColor(Color.yellow);
        g.fillRoundRect(455, 15,(int) BLADDER/2, 32,10,10);}
        
        
        
        Font hudfnt = new Font("calibri",1,15);
        g.setFont(hudfnt);
        g.setColor(Color.white);
        g.drawString("Score: " + (int)score,15,64);
        g.drawString("Level: " + (int)level,15,80);
        //g.drawString("MaxScore: " + Game.editSelected,15,100);
        if(Game.gameState!=ChewingGumSimulator.STATE.Tutorial){
        if(Game.bladderActive==false){
        g.drawString("XP: " + Game.playerXP,Game.WIDTH-95,50);
        g.drawString("Rank: " + Game.playerLevel,Game.WIDTH-95,65);}
        else if(Game.bladderActive==true){
        g.drawString("XP: " + Game.playerXP,Game.WIDTH-125,40);
        g.setColor(Color.yellow);
        g.drawString("Rank: " + Game.playerLevel,Game.WIDTH-65,40);}
        
        g.setColor(Color.blue);
        g.fillRoundRect(Game.WIDTH-105, 15, 80, 10,5,5);
        g.setColor(new Color(75,(int)xpgreenValue,0));
        g.fillRoundRect(Game.WIDTH-105, 15,(int) XP/25 * 2, 10,5,5);
        g.setColor(Color.cyan);
        g.drawRoundRect(Game.WIDTH-105, 15,(int) XP/25 * 2, 10,5,5);
        
        }
        g.setColor(Color.white);
        g.drawString("Ammo: " + (int)AMMO,250,64);
        g.drawString("EMP's: " + (int)EMPCount,250,80);
        //g.drawString("Background: " + Game.backgroundSelection,250,100);
        if(Game.bladderActive==true){
        g.drawString("Bladder: " + (int)BLADDER,455,60);}
        g.setColor(Color.cyan);
        if(Game.bladderActive==true){
        g.drawString("Nukes: " + (int)NUKES,560,60);
        g.setColor(Color.orange);
        g.drawString("Coins: " + (int)COINS,560,72);}
        else if(Game.bladderActive==false){
        g.drawString("Nukes: " + (int)NUKES,460,27);
        g.setColor(Color.orange);
        g.drawString("Coins: " + (int)COINS,460,39);
        
        }
        g.setColor(Color.white);
        if(ChewingGumSimulator.ShowFPS==true){
            if(Game.bladderActive==false){
                g.drawString("FPS: " + (int)ChewingGumSimulator.frameNumber,460,51);
                g.setColor(Color.red);
        g.drawString("Fissions: " + (int)ATOMS,460,63);
            }
        
            if(Game.bladderActive==true){
                g.drawString("FPS: " + (int)ChewingGumSimulator.frameNumber,455,74);
                g.setColor(Color.red);
                g.drawString("Fissions: " + (int)ATOMS,330,64);
            }}
        else
        { if(Game.bladderActive==false){
            g.setColor(Color.red);
        g.drawString("Fissions: " + (int)ATOMS,460,51);
        }
        else if(Game.bladderActive==true){
            g.setColor(Color.red);
        g.drawString("Fissions: " + (int)ATOMS,330,64);
        }
        
        
        }
        
        
        }
        
        
        
        else if(Game.gameState == ChewingGumSimulator.STATE.AdventureOne || Game.gameState == ChewingGumSimulator.STATE.AdventureTwo || Game.gameState == ChewingGumSimulator.STATE.AdventureThree || Game.gameState == ChewingGumSimulator.STATE.AdventureFour || Game.gameState == ChewingGumSimulator.STATE.AdventureFive  || ChewingGumSimulator.gameState==ChewingGumSimulator.STATE.AdventureSix || ChewingGumSimulator.gameState==ChewingGumSimulator.STATE.AdventureSeven || ChewingGumSimulator.gameState==ChewingGumSimulator.STATE.AdventureEight || ChewingGumSimulator.gameState==ChewingGumSimulator.STATE.AdventureNine || ChewingGumSimulator.gameState==ChewingGumSimulator.STATE.AdventureTen){
            
            
            
            
            
            g.setColor(Color.gray);
            g.fillRoundRect(220,10,200,30,40,40);
            
            g.setColor(new Color(75,(int)greenValue,0));
            g.fillRoundRect(220,10,(int)HEALTH * 2,30,40,40);
            
            g.setColor(Color.white);
            g.drawRoundRect(220,10,200,30,40,40);
            
            
            g.setColor(Color.gray);
            g.fillRoundRect(430,10,100,30,40,40);
            
            g.setColor(new Color(75,(int)newgreenValue,0));
            g.fillRoundRect(430,10,(int)AMMO,30,40,40);
            
            g.setColor(Color.white);
            g.drawRoundRect(430,10,100,30,40,40);
            
            
            Font CoinFnt = new Font("calibri",1,15);
            g.setFont(CoinFnt);
            g.setColor(Color.yellow);
            g.drawString("Coins: " + (int)COINS, 540, 20);
            
            if(Game.ShowFPS==true){
            g.setColor(Color.white);
            g.drawString("FPS: " + (int)Game.frameNumber, 540, 35);
            }
            
            g.setColor(Color.white);
            g.drawString("Health: " + (int)HEALTH, 290, 55);
            g.drawString("Ammo: " + (int)AMMO, 445, 55);
            
            g.setColor(Color.cyan);
            g.drawString("XP: " + Game.playerXP,Game.WIDTH-100,50);
            g.drawString("Rank: " + Game.playerLevel,Game.WIDTH-100,65);
            
            g.setColor(Color.blue);
            g.fillRoundRect(Game.WIDTH-105, 75, 80, 10,5,5);
            g.setColor(new Color(75,(int)xpgreenValue,0));
            g.fillRoundRect(Game.WIDTH-105, 75,(int) XP/25 * 2, 10,5,5);
            g.setColor(Color.cyan);
            g.drawRoundRect(Game.WIDTH-105, 75,(int) XP/25 * 2, 10,5,5);
            
        }
        
       
        
        
        
        else if(Game.gameState == ChewingGumSimulator.STATE.Arena || Game.gameState == ChewingGumSimulator.STATE.ArenaTwo || Game.gameState == ChewingGumSimulator.STATE.ArenaThree || Game.gameState == ChewingGumSimulator.STATE.ArenaFour || Game.gameState == ChewingGumSimulator.STATE.ArenaFive || Game.gameState == ChewingGumSimulator.STATE.ArenaSix || Game.gameState == ChewingGumSimulator.STATE.ArenaSeven || Game.gameState == ChewingGumSimulator.STATE.ArenaEight || Game.gameState == ChewingGumSimulator.STATE.ArenaNine)
        {   g.setColor(Color.gray);
            g.fillRoundRect(15, 15, 200, 32,10,10);
            
            g.setColor(new Color(75,(int)greenValue,0));
            g.fillRoundRect(15, 15,(int) HEALTH * 2, 32,10,10);
            g.setColor(Color.white);
            g.drawRoundRect(15, 15,(int) HEALTH * 2, 32,10,10);
            g.setColor(Color.white);
            g.drawString("Player 1", 85, 65);
            
            g.setColor(Color.gray);
            g.fillRoundRect(425, 15, 200, 32,10,10);
            
            g.setColor(new Color(75,(int)iargreenValue,0));
            g.fillRoundRect(425, 15,(int) HEALTH2 * 2, 32,10,10);
            g.setColor(Color.white);
            g.drawRoundRect(425, 15,(int) HEALTH2 * 2, 32,10,10);
            g.setColor(Color.white);
            g.drawString("Player 2", 495, 65);
            
            
        }
        
        
        
    }
    
    public void score(float score){
        this.score = score;
    }
    
    public float getScore(){
        return score;
    }
    
    
    
    public void setLevel(float level){
        this.level = level;
    }
    
    public float getLevel(){
        return level;
    }

    
  
    
    
}
