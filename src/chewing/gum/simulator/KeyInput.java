
package chewing.gum.simulator;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Random;



public class KeyInput extends KeyAdapter{
    
    private Handler handler;
    private boolean[] keyDown= new boolean[8];
    private ChewingGumSimulator Game;
    private HUD hud;
    private Random r = new Random();
    private Player player;
    private Lifters lift;
    
    public KeyInput(Handler handler,ChewingGumSimulator Game){
        this.handler = handler;
        this.Game = Game;
        for(int i=0;i<8;i++)
        {
            keyDown[i]=false;
        }
        
        
        
    }
    
    
    
 public void keyPressed(KeyEvent e){
     
     int key = e.getKeyCode();
     //System.out.println(key);
     
     if(key == KeyEvent.VK_ESCAPE) 
     {     Game.SaveGame();
           //HUD.HEALTH=100;
           //HUD.HEALTH2=100;
         /*if(Game.gameState==ChewingGumSimulator.STATE.ArenaEditor){
             Game.gameState=ChewingGumSimulator.STATE.Menu;
             
         }*/
         
         if(Game.gameState == ChewingGumSimulator.STATE.ArenaEditor)
                 {
                     
                     Game.gameState = ChewingGumSimulator.STATE.ArenaSelector;
                    
         
                 }
         else if(Game.gameState == ChewingGumSimulator.STATE.Tutorial)
                 {
                     Spawn.tutorialReset();
                     Game.gameState = ChewingGumSimulator.STATE.Help;
                    
         
                 }
         
         else if(Game.gameState == ChewingGumSimulator.STATE.Arena || Game.gameState == ChewingGumSimulator.STATE.ArenaTwo || Game.gameState == ChewingGumSimulator.STATE.ArenaThree || Game.gameState == ChewingGumSimulator.STATE.ArenaFour || Game.gameState == ChewingGumSimulator.STATE.ArenaFive || Game.gameState == ChewingGumSimulator.STATE.ArenaSix || Game.gameState == ChewingGumSimulator.STATE.ArenaSeven || Game.gameState == ChewingGumSimulator.STATE.ArenaEight || Game.gameState == ChewingGumSimulator.STATE.ArenaNine)
                 {
                     
                     Game.gameState = ChewingGumSimulator.STATE.ArenaSelect;
                     
                 
                 }
         
         
         else if(Game.gameState == ChewingGumSimulator.STATE.AdventureOne || Game.gameState == ChewingGumSimulator.STATE.AdventureTwo || Game.gameState == ChewingGumSimulator.STATE.AdventureThree || Game.gameState == ChewingGumSimulator.STATE.AdventureFour || Game.gameState == ChewingGumSimulator.STATE.AdventureFive  || ChewingGumSimulator.gameState==ChewingGumSimulator.STATE.AdventureSix || ChewingGumSimulator.gameState==ChewingGumSimulator.STATE.AdventureSeven || ChewingGumSimulator.gameState==ChewingGumSimulator.STATE.AdventureEight || ChewingGumSimulator.gameState==ChewingGumSimulator.STATE.AdventureNine || ChewingGumSimulator.gameState==ChewingGumSimulator.STATE.AdventureTen)
                 {
                     AdventureOne.Timer=10000;
                     AdventureOne.step=false;
                     Game.gameState = ChewingGumSimulator.STATE.Menu;
                     
         
                 }
         
         //handler.clearEnemies();
         //handler.clearPlayers();
         else if(Game.gameState==ChewingGumSimulator.STATE.Game){
             Spawn.playerSpawned=false;
         if(ChewingGumSimulator.toExitOrNotToExit==true)
         {Game.gameState = ChewingGumSimulator.STATE.Menu;
         
         if(hud.getScore()>ChewingGumSimulator.savedScore){
                Game.savedScore = (int) hud.getScore();
            }
            Game.savedCoins = (int) hud.COINS;
         Game.paused = false;
          Game.SaveGame();}
         
         else
         { if(Game.paused==false)
             {Game.paused=true;}
         else if(Game.paused==true)
             {Game.paused=false;}
         }}
         
         //hud.setLevel(1);
        // hud.score(0);
         
         
         
         //hud.setLevel(1);
         //hud.score(0);
         
         //for(int i=0;i<4;i++)
         //handler.addObject(new MenuParticle(r.nextInt(ChewingGumSimulator.WIDTH),r.nextInt(ChewingGumSimulator.HEIGHT),ID.MenuParticle,handler));
     }
     
     
     
     
     
     if(key == KeyEvent.VK_M) 
             {   if(Game.gameState == ChewingGumSimulator.STATE.Game){
                 Game.gameState = ChewingGumSimulator.STATE.MarketPlace;
                 Game.paused=true;}
             
             else if(ChewingGumSimulator.gameState==ChewingGumSimulator.STATE.Tutorial && ChewingGumSimulator.tutorialStages[9]==true && ChewingGumSimulator.tutorialStages[10]==false){
                         
                         ChewingGumSimulator.tutorialStages[10]=true;
                         Game.gameState = ChewingGumSimulator.STATE.AdventureShop;
                         Game.lastAdventure=11;
                       }
             
             else if(Game.gameState == ChewingGumSimulator.STATE.MarketPlace){
                 Game.gameState = ChewingGumSimulator.STATE.Game;
                 Game.paused=false;    }
             
             
             else if(Game.gameState == ChewingGumSimulator.STATE.AdventureOne || Game.gameState == ChewingGumSimulator.STATE.AdventureTwo || Game.gameState == ChewingGumSimulator.STATE.AdventureThree || Game.gameState == ChewingGumSimulator.STATE.AdventureFour || Game.gameState == ChewingGumSimulator.STATE.AdventureFive  || ChewingGumSimulator.gameState==ChewingGumSimulator.STATE.AdventureSix || ChewingGumSimulator.gameState==ChewingGumSimulator.STATE.AdventureSeven || ChewingGumSimulator.gameState==ChewingGumSimulator.STATE.AdventureEight || ChewingGumSimulator.gameState==ChewingGumSimulator.STATE.AdventureNine || ChewingGumSimulator.gameState==ChewingGumSimulator.STATE.AdventureTen){
                   
                 if(Game.gameState == ChewingGumSimulator.STATE.AdventureOne)
                 {
                     Game.lastAdventure=1;
                 }
                 else if(Game.gameState == ChewingGumSimulator.STATE.AdventureTwo)
                 {
                     Game.lastAdventure=2;
                 }
                 else if(Game.gameState == ChewingGumSimulator.STATE.AdventureThree)
                 {
                     Game.lastAdventure=3;
                 }
                 else if(Game.gameState == ChewingGumSimulator.STATE.AdventureFour)
                 {
                     Game.lastAdventure=4;
                 }
                 else if(Game.gameState == ChewingGumSimulator.STATE.AdventureFive)
                 {
                     Game.lastAdventure=5;
                 }
                 else if(Game.gameState == ChewingGumSimulator.STATE.AdventureSix)
                 {
                     Game.lastAdventure=6;
                 }
                 else if(Game.gameState == ChewingGumSimulator.STATE.AdventureSeven)
                 {
                     Game.lastAdventure=7;
                 }
                 else if(Game.gameState == ChewingGumSimulator.STATE.AdventureEight)
                 {
                     Game.lastAdventure=8;
                 }
                 else if(Game.gameState == ChewingGumSimulator.STATE.AdventureNine)
                 {
                     Game.lastAdventure=9;
                 }
                 else if(Game.gameState == ChewingGumSimulator.STATE.AdventureTen)
                 {
                     Game.lastAdventure=10;
                 }
                 Game.gameState = ChewingGumSimulator.STATE.AdventureShop;
                 Game.paused=false; 
                     
                     
                     }
             
         }
     
     
     
     if(key == KeyEvent.VK_O) 
             {   if(Game.gameState == ChewingGumSimulator.STATE.Game){
                 Game.gameState = ChewingGumSimulator.STATE.WorkingTime;}
             else if(Game.gameState == ChewingGumSimulator.STATE.WorkingTime){
                 Game.gameState = ChewingGumSimulator.STATE.Game;}
         }
     
     for(int i=0; i < handler.object.size(); i++){
         GameObject tempObject = handler.object.get(i);
         
         if(tempObject.getId() == ID.Player2){
             //Player 2
             
             if(Player.touchingWall == false){
             if(key == KeyEvent.VK_W) {tempObject.setVelY(-4); keyDown[4]=true;}
             if(key == KeyEvent.VK_S) {tempObject.setVelY(4); keyDown[5]=true;}
             if(key == KeyEvent.VK_A) {tempObject.setVelX(-4); keyDown[6]=true;}
             if(key == KeyEvent.VK_D) {tempObject.setVelX(4); keyDown[7]=true;}}
             if(key == KeyEvent.VK_SPACE)
             {
                 handler.addObject(new PlayerRocketH((int)tempObject.getX(),(int) tempObject.getY(), ID.PlayerRocket2,handler));
                 PlayerRocketH.direction = 2;
             }
         }
         
         if(tempObject.getId() == ID.Player){
             //Player 1
             if(Player.touchingWall == false)
             {
                 if(Player.SpeedBoosted==true){
                     if(key == KeyEvent.VK_UP) 
                     {tempObject.setVelY(-8); keyDown[0]=true;}
                     if(key == KeyEvent.VK_DOWN) 
                     {tempObject.setVelY(8); keyDown[1]=true;}
                     if(key == KeyEvent.VK_LEFT) 
                     {tempObject.setVelX(-8); keyDown[2]=true;}
                     if(key == KeyEvent.VK_RIGHT) 
                     {tempObject.setVelX(8); keyDown[3]=true;}
                     
                     
                 }
                 else if(Player.SpeedBoosted==false)
                 {
             if(key == KeyEvent.VK_UP) {tempObject.setVelY(-4); keyDown[0]=true;
             if(player.playerJumping==false){player.playerJumping=true;}
             if(Game.gameState==ChewingGumSimulator.STATE.Tutorial && Game.tutorialStages[0]==false){
                         
                         Game.tutorialStages[0]=true;
                       }
                     
             }
             
             if(key == KeyEvent.VK_DOWN) 
             {   if(Game.gameState==ChewingGumSimulator.STATE.AdventureOne && player.onPlatform==false){
                 tempObject.setVelY(4); keyDown[1]=true;}
             if(Game.gameState==ChewingGumSimulator.STATE.Tutorial && Game.tutorialStages[0]==false){
                         tempObject.setVelY(4); keyDown[1]=true;
                         Game.tutorialStages[0]=true;
                       }
             else{
             tempObject.setVelY(4); keyDown[1]=true;}
             }
             if(key == KeyEvent.VK_LEFT) 
             {tempObject.setVelX(-4); keyDown[2]=true;
             if(Game.gameState==ChewingGumSimulator.STATE.Tutorial && Game.tutorialStages[0]==false){
                         
                         Game.tutorialStages[0]=true;
                       }}
             if(key == KeyEvent.VK_RIGHT) 
             {tempObject.setVelX(4); keyDown[3]=true;
             if(Game.gameState==ChewingGumSimulator.STATE.Tutorial && Game.tutorialStages[0]==false){
                         
                         Game.tutorialStages[0]=true;
                       }}
                 }
                 
             }
             
             
             if(Game.gameState == ChewingGumSimulator.STATE.Game || Game.gameState == ChewingGumSimulator.STATE.Tutorial || Game.gameState == ChewingGumSimulator.STATE.AdventureOne || Game.gameState == ChewingGumSimulator.STATE.AdventureTwo || Game.gameState == ChewingGumSimulator.STATE.AdventureThree || Game.gameState == ChewingGumSimulator.STATE.AdventureFour || Game.gameState == ChewingGumSimulator.STATE.AdventureFive  || ChewingGumSimulator.gameState==ChewingGumSimulator.STATE.AdventureSix || ChewingGumSimulator.gameState==ChewingGumSimulator.STATE.AdventureSeven || ChewingGumSimulator.gameState==ChewingGumSimulator.STATE.AdventureEight || ChewingGumSimulator.gameState==ChewingGumSimulator.STATE.AdventureNine || ChewingGumSimulator.gameState==ChewingGumSimulator.STATE.AdventureTen || Game.gameState == ChewingGumSimulator.STATE.ArenaEditor){
             if(key == KeyEvent.VK_W) 
             {  if(HUD.AMMO > 2 && Game.paused==false)
             {   if(Player.Thunderstruck==false){
                 if(Game.gameState==ChewingGumSimulator.STATE.Tutorial && Game.tutorialStages[1]==true){
                         
                         Game.tutorialStages[2]=true;
                       }
                 PlayerRocket.direction = 2;
                 handler.addObject(new PlayerRocket((int)tempObject.getX()+4,(int) tempObject.getY()-5, ID.PlayerRocket,handler));}
                 else
             {   if(Game.gameState==ChewingGumSimulator.STATE.Tutorial && Game.tutorialStages[5]==true && Game.tutorialStages[6]==false){
                         
                         Game.tutorialStages[6]=true;
                       }
                 PlayerLightning.Lightdirection = 2;
                 handler.addObject(new PlayerLightning((int)tempObject.getX()+4,(int) tempObject.getY(), ID.PlayerLightning,handler));
             }
                 
                HUD.AMMO = HUD.AMMO - 2;}
             }
             
             if(key == KeyEvent.VK_SPACE) 
             {  
                 
                 if(Game.bladderActive==true){
                     
                 if(hud.BLADDER>0 && Game.paused==false){
                 handler.addObject(new PlayerPee((int)tempObject.getX()+5,(int)tempObject.getY()+10,ID.PlayerPee,handler));
                 hud.BLADDER--;}
                 }
                 
         }
             
             if(key == KeyEvent.VK_S) 
                 
             {   if(HUD.AMMO > 2 && Game.paused==false)
             {
                 if(Player.Thunderstruck==false){
                     if(Game.gameState==ChewingGumSimulator.STATE.Tutorial && Game.tutorialStages[1]==true){
                         
                         Game.tutorialStages[2]=true;
                       }
                 PlayerRocket.direction = 1;
                 handler.addObject(new PlayerRocket((int)tempObject.getX(),(int) tempObject.getY(), ID.PlayerRocket,handler));}
                 else
             {   if(Game.gameState==ChewingGumSimulator.STATE.Tutorial && Game.tutorialStages[5]==true && Game.tutorialStages[6]==false){
                         
                         Game.tutorialStages[6]=true;
                       }
                 PlayerLightning.Lightdirection = 1;
                 handler.addObject(new PlayerLightning((int)tempObject.getX(),(int) tempObject.getY(), ID.PlayerLightning,handler));
             }
                
                HUD.AMMO = HUD.AMMO - 2;}
             }
             if(key == KeyEvent.VK_D) 
             {   if(HUD.AMMO > 2 && Game.paused==false){
                 if(Player.Thunderstruck==false){
                     if(Game.gameState==ChewingGumSimulator.STATE.Tutorial && Game.tutorialStages[1]==true){
                         
                         Game.tutorialStages[2]=true;
                       }
                 PlayerRocketH.direction = 1;
                 handler.addObject(new PlayerRocketH((int)tempObject.getX(),(int) tempObject.getY(), ID.PlayerRocketH,handler));}
                 else
             {   if(Game.gameState==ChewingGumSimulator.STATE.Tutorial && Game.tutorialStages[5]==true && Game.tutorialStages[6]==false){
                         
                         Game.tutorialStages[6]=true;
                       }
                 PlayerLightning.Lightdirection = 3;
                 handler.addObject(new PlayerLightning((int)tempObject.getX(),(int) tempObject.getY(), ID.PlayerLightning,handler));
             }
                
                HUD.AMMO = HUD.AMMO - 2;}
             }
             if(key == KeyEvent.VK_A) 
             {   if(HUD.AMMO > 2 && Game.paused==false){
                 if(Player.Thunderstruck==false){
                     if(Game.gameState==ChewingGumSimulator.STATE.Tutorial && Game.tutorialStages[1]==true){
                         
                         Game.tutorialStages[2]=true;
                       }
                 PlayerRocketH.direction = 2;
                 handler.addObject(new PlayerRocketH((int)tempObject.getX(),(int) tempObject.getY(), ID.PlayerRocketH,handler));}
                 else
             {   if(Game.gameState==ChewingGumSimulator.STATE.Tutorial && Game.tutorialStages[5]==true && Game.tutorialStages[6]==false){
                         
                         Game.tutorialStages[6]=true;
                       }
                 PlayerLightning.Lightdirection = 4;
                 handler.addObject(new PlayerLightning((int)tempObject.getX(),(int) tempObject.getY(), ID.PlayerLightning,handler));
             }
                
                HUD.AMMO = HUD.AMMO - 2;}
             }
             
             if(key == KeyEvent.VK_ENTER) 
             {   
                 
                 if(Game.gameState==ChewingGumSimulator.STATE.ArenaEditor){
                     if(Game.editSelected==true){
                         Game.editSelected=false;
                     }
                 }
                 if(Game.gameState==ChewingGumSimulator.STATE.Tutorial && Game.tutorialStages[3]==true && Game.tutorialStages[4]==false){
                     Game.tutorialStages[4]=true;
                 }
                 else{
                 
                 
                 
                 if(HUD.EMPCount > 0 && Game.paused==false){
                 
                for(int k=0; k < handler.object.size(); k++){
                GameObject otherObject = handler.object.get(k);
                    if(otherObject.getId()==ID.FastEnemy)
                    {   Game.playerXP+=10;
                        handler.removeObject(otherObject);
                        break;
                    }
                    else if(otherObject.getId()==ID.Neutrino)
                    {   Game.playerXP+=50;
                        handler.removeObject(otherObject);
                        break;
                    }
                    else if(otherObject.getId()==ID.HiggsBoson)
                    {   Game.playerXP+=100;
                        handler.removeObject(otherObject);
                        break;
                    }
                }
                HUD.EMPCount--;
             }
                 }
             
         }
             
             
             
             
             
             
             
             if(key == KeyEvent.VK_N) 
             {   
                 if(HUD.NUKES>0 && Game.paused==false){
                 handler.addObject(new Nuke((int)tempObject.getX()+7,(int)tempObject.getY()+17,ID.Nuke,handler));
                 HUD.NUKES--;}
         }
              
             if(key == KeyEvent.VK_K) 
             {   if(Game.bladderActive==true){
                 if(HUD.BLADDER>9 && Game.paused==false){
                 handler.addObject(new PlayerPoo((int)tempObject.getX()-3,(int)tempObject.getY(),ID.PlayerPoo,handler));
                 HUD.BLADDER-=10;}
             }
         }
             
             if(key == KeyEvent.VK_G) 
             {   if(Game.bladderActive==true){
                 if(HUD.BLADDER>14 && Game.paused==false){
                 handler.addObject(new PlayerGuano((int)tempObject.getX()-3,(int)tempObject.getY(),ID.PlayerGuano,handler));
                 HUD.BLADDER-=15;}}
             else{
                 if(HUD.ATOMS>0 && Game.paused==false){
                 handler.addObject(new PlayerGrenade((int)tempObject.getX()-10,(int)tempObject.getY()-10,ID.PlayerGrenade,handler));
                 HUD.ATOMS--;
                 if(Game.gameState==ChewingGumSimulator.STATE.Tutorial){
                     Game.tutorialStages[8]=true;
                 }
                 }
                 
                 
                 }
         }
             
             if(key == KeyEvent.VK_B) 
             {   if(Game.bladderActive==true){
                 if(HUD.BLADDER>19 && Game.paused==false){
                 handler.addObject(new PlayerBalega((int)tempObject.getX()-3,(int)tempObject.getY(),ID.PlayerBalega,handler));
                 HUD.BLADDER-=20;}}
         }
             }
             
             
             if(key == KeyEvent.VK_ENTER && (Game.gameState == ChewingGumSimulator.STATE.Arena || Game.gameState == ChewingGumSimulator.STATE.ArenaTwo || Game.gameState == ChewingGumSimulator.STATE.ArenaThree || Game.gameState == ChewingGumSimulator.STATE.ArenaFour || Game.gameState == ChewingGumSimulator.STATE.ArenaFive || Game.gameState == ChewingGumSimulator.STATE.ArenaSix || Game.gameState == ChewingGumSimulator.STATE.ArenaSeven || Game.gameState == ChewingGumSimulator.STATE.ArenaEight || Game.gameState == ChewingGumSimulator.STATE.ArenaNine)){
                 PlayerRocketH.direction = 1;
                handler.addObject(new PlayerRocketH((int)tempObject.getX(),(int) tempObject.getY(), ID.PlayerRocket,handler));
                
             }
             
             
             
             
             
             
             /*if(key == KeyEvent.VK_Q) 
     {   
        if(ChewingGumSimulator.pretendWork == true){
         
         Game.gameState = ChewingGumSimulator.STATE.Menu;
        ChewingGumSimulator.pretendWork = false;}
        else if(ChewingGumSimulator.pretendWork == false)
        {   handler.clearEnemies();
            Game.gameState = ChewingGumSimulator.STATE.Worker;
        }
         //hud.setLevel(1);
        // hud.score(0);
         
         
         //hud.setLevel(1);
         //hud.score(0);
         
         //for(int i=0;i<4;i++)
         //handler.addObject(new MenuParticle(r.nextInt(ChewingGumSimulator.WIDTH),r.nextInt(ChewingGumSimulator.HEIGHT),ID.MenuParticle,handler));
     } */
         
         
             
             
             
             
             
             
             
         }
         
         
         
         
         
     }
     
     
     
     /*if(key == KeyEvent.VK_G) 
     {   
         if(ChewingGumSimulator.cheats==true){
         HUD.HEALTH = 100;}
         //for(int i=0;i<4;i++)
         //handler.addObject(new MenuParticle(r.nextInt(ChewingGumSimulator.WIDTH),r.nextInt(ChewingGumSimulator.HEIGHT),ID.MenuParticle,handler));
     }*/
     
     
     
     if(key == KeyEvent.VK_C) 
         
     {   
         if(ChewingGumSimulator.cheats==true){
         Game.gameState = ChewingGumSimulator.STATE.CheatMenu;}
     }
     
     //handler.addObject(new BossOneBullet((int)x,(int) y+15, ID.BossOneBullet,handler));
     
     if(key == KeyEvent.VK_P) 
     {   if(Game.gameState == ChewingGumSimulator.STATE.Game || Game.gameState == ChewingGumSimulator.STATE.Arena || Game.gameState == ChewingGumSimulator.STATE.ArenaTwo)
     {if(Game.paused)
         {Game.paused = false;}
         else
         {Game.paused=true;}}
     
     }
     
     
 }   
 
 public void keyReleased(KeyEvent e){
     int key = e.getKeyCode();
     //System.out.println(key);
     
     for(int i=0; i < handler.object.size(); i++){
         GameObject tempObject = handler.object.get(i);
         
         if(tempObject.getId() == ID.Player){
             //Player 1
             if(key == KeyEvent.VK_UP) keyDown[0]=false;//tempObject.setVelY(0);
             if(key == KeyEvent.VK_DOWN) keyDown[1]=false;//tempObject.setVelY(0);
             if(key == KeyEvent.VK_LEFT) keyDown[2]=false;//tempObject.setVelX(0);
             if(key == KeyEvent.VK_RIGHT) keyDown[3]=false;//tempObject.setVelX(0);
             
             if(!keyDown[0] && !keyDown[1]) tempObject.setVelY(0);
             if(!keyDown[2] && !keyDown[3]) tempObject.setVelX(0);
             
             
             
         }
         if(tempObject.getId() == ID.Player2){
             //Player 1
             if(key == KeyEvent.VK_W) keyDown[4]=false;//tempObject.setVelY(0);
             if(key == KeyEvent.VK_S) keyDown[5]=false;//tempObject.setVelY(0);
             if(key == KeyEvent.VK_A) keyDown[6]=false;//tempObject.setVelX(0);
             if(key == KeyEvent.VK_D) keyDown[7]=false;//tempObject.setVelX(0);
             
             if(!keyDown[4] && !keyDown[5]) tempObject.setVelY(0);
             if(!keyDown[6] && !keyDown[7]) tempObject.setVelX(0);
             
             
             
         }
     }
 }
   

 
    
    
}
