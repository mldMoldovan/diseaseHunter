
package chewing.gum.simulator;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.util.Random;




public class AdventureOne {
    Handler handler;
    ChewingGumSimulator Game;
    private Random r;
    Player player;
    BossOne bossOne;
    BossTwo bossTwo;
    BossThree bossThree;
    BossFour bossFour;
    BossFive bossFive;
    private int randomTrioSpawn;
    private Color vesselColor = new Color(255,51,51);
    private Color stomachColor = new Color(76,153,0);
    private Color pateuColor = new Color(102,51,0);
    private Color plamanColor = new Color(255,229,204);
    private Color heartColor = new Color(204,0,0);
    private Color throatColor = new Color(138,54,54);
    private Color kidneyColor = new Color(202,133,30);
    private Color bladderColor = new Color(185,169,66);
    private Color pancreatisColor = new Color(18,168,73);
    private Color brainColor = new Color(178,127,169);
    public static int Timer = 10000;
    public static boolean step = false;
    private Font mediumFnt = new Font("calibri",1,15);
    
    
    
    public AdventureOne(ChewingGumSimulator Game, Handler handler){
        this.handler = handler;
        this.Game = Game;
        for(int i=0;i<handler.object.size();i++)
        {if(handler.object.get(i).getId() == ID.Player)
            player = (Player)handler.object.get(i);
            
        }
        
        
    }
        
    
    public void tick(){
        
        if(Timer>0)
        {
            Timer--;
            
        }
        if(player.distanceTraveled==3000 && step==false){
            if(Game.gameState==ChewingGumSimulator.STATE.AdventureOne){
            handler.addObject(new BossSucker((ChewingGumSimulator.WIDTH / 3)-48,0,ID.BossSucker,handler));
            handler.addObject(new BossSucker((ChewingGumSimulator.WIDTH / 3*2)-48,0,ID.BossSucker,handler));
            handler.addObject(new BossOne((ChewingGumSimulator.WIDTH / 2)-48,0,ID.BossOne,handler));
            
            step=true;}
            if(Game.gameState==ChewingGumSimulator.STATE.AdventureTwo){
            handler.addObject(new BossTwoSucker((ChewingGumSimulator.WIDTH / 3)-48,0,ID.BossTwoSucker,handler));
            handler.addObject(new BossTwoSucker((ChewingGumSimulator.WIDTH / 3*2)-48,0,ID.BossTwoSucker,handler));
            handler.addObject(new BossTwo((ChewingGumSimulator.WIDTH / 2)-48,0,ID.BossTwo,handler));
            step=true;}
            if(Game.gameState==ChewingGumSimulator.STATE.AdventureThree){
            handler.addObject(new BossThreeSucker((ChewingGumSimulator.WIDTH / 3)-48,0,ID.BossThreeSucker,handler));
            handler.addObject(new BossThreeSucker((ChewingGumSimulator.WIDTH / 3*2)-48,0,ID.BossThreeSucker,handler));
            handler.addObject(new BossThree((ChewingGumSimulator.WIDTH / 2)-48,0,ID.BossThree,handler));
            step=true;}
            if(Game.gameState==ChewingGumSimulator.STATE.AdventureFour){
            handler.addObject(new BossFourSucker((ChewingGumSimulator.WIDTH / 3)-48,0,ID.BossFourSucker,handler));
            handler.addObject(new BossFourSucker((ChewingGumSimulator.WIDTH / 3*2)-48,0,ID.BossFourSucker,handler));
            handler.addObject(new BossFour((ChewingGumSimulator.WIDTH / 2)-48,0,ID.BossFour,handler));
            step=true;}
            if(Game.gameState==ChewingGumSimulator.STATE.AdventureFive){
            handler.addObject(new BossFiveSucker((ChewingGumSimulator.WIDTH / 3)-48,0,ID.BossFiveSucker,handler));
            handler.addObject(new BossFiveSucker((ChewingGumSimulator.WIDTH / 3*2)-48,0,ID.BossFiveSucker,handler));
            handler.addObject(new BossFive((ChewingGumSimulator.WIDTH / 2)-48,0,ID.BossFive,handler));
            step=true;}
            if(Game.gameState==ChewingGumSimulator.STATE.AdventureSix){
            handler.addObject(new BossSixSucker((ChewingGumSimulator.WIDTH / 3)-48,0,ID.BossSixSucker,handler));
            handler.addObject(new BossSixSucker((ChewingGumSimulator.WIDTH / 3*2)-48,0,ID.BossSixSucker,handler));
            handler.addObject(new BossSix((ChewingGumSimulator.WIDTH / 2)-48,0,ID.BossSix,handler));
            step=true;}
            if(Game.gameState==ChewingGumSimulator.STATE.AdventureSeven){
            handler.addObject(new BossSevenSucker((ChewingGumSimulator.WIDTH / 3)-48,0,ID.BossSevenSucker,handler));
            handler.addObject(new BossSevenSucker((ChewingGumSimulator.WIDTH / 3*2)-48,0,ID.BossSevenSucker,handler));
            handler.addObject(new BossSeven((ChewingGumSimulator.WIDTH / 2)-48,0,ID.BossSeven,handler));
            step=true;}
            if(Game.gameState==ChewingGumSimulator.STATE.AdventureEight){
            handler.addObject(new BossEightSucker((ChewingGumSimulator.WIDTH / 3)-48,0,ID.BossEightSucker,handler));
            handler.addObject(new BossEightSucker((ChewingGumSimulator.WIDTH / 3*2)-48,0,ID.BossEightSucker,handler));
            handler.addObject(new BossEight((ChewingGumSimulator.WIDTH / 2)-48,0,ID.BossEight,handler));
            step=true;}
            if(Game.gameState==ChewingGumSimulator.STATE.AdventureNine){
            handler.addObject(new BossNineSucker((ChewingGumSimulator.WIDTH / 3)-48,0,ID.BossNineSucker,handler));
            handler.addObject(new BossNineSucker((ChewingGumSimulator.WIDTH / 3*2)-48,0,ID.BossNineSucker,handler));
            handler.addObject(new BossNine((ChewingGumSimulator.WIDTH / 2)-48,0,ID.BossNine,handler));
            step=true;}
            if(Game.gameState==ChewingGumSimulator.STATE.AdventureTen){
            handler.addObject(new BossTenSucker((ChewingGumSimulator.WIDTH / 3)-48,0,ID.BossTenSucker,handler));
            handler.addObject(new BossTenSucker((ChewingGumSimulator.WIDTH / 3*2)-48,0,ID.BossTenSucker,handler));
            handler.addObject(new BossTen((ChewingGumSimulator.WIDTH / 2)-48,0,ID.BossTen,handler));
            step=true;}
        }
        if(HUD.HEALTH==0){
            player.distanceTraveled=0;
            step=false;
            if(Game.gameState == ChewingGumSimulator.STATE.AdventureOne){
                Game.gameState = ChewingGumSimulator.STATE.AdventureOneLost;
                
            }
            else if(Game.gameState == ChewingGumSimulator.STATE.AdventureTwo){
                Game.gameState = ChewingGumSimulator.STATE.AdventureTwoLost;
            }
            else if(Game.gameState == ChewingGumSimulator.STATE.AdventureThree){
                Game.gameState = ChewingGumSimulator.STATE.AdventureThreeLost;
            }
            else if(Game.gameState == ChewingGumSimulator.STATE.AdventureFour){
                Game.gameState = ChewingGumSimulator.STATE.AdventureFourLost;
            }
            else if(Game.gameState == ChewingGumSimulator.STATE.AdventureFive){
                Game.gameState = ChewingGumSimulator.STATE.AdventureFiveLost;
            }
            else if(Game.gameState == ChewingGumSimulator.STATE.AdventureSix){
                Game.gameState = ChewingGumSimulator.STATE.AdventureSixLost;
            }
            else if(Game.gameState == ChewingGumSimulator.STATE.AdventureSeven){
                Game.gameState = ChewingGumSimulator.STATE.AdventureSevenLost;
            }
            else if(Game.gameState == ChewingGumSimulator.STATE.AdventureEight){
                Game.gameState = ChewingGumSimulator.STATE.AdventureEightLost;
            }
            else if(Game.gameState == ChewingGumSimulator.STATE.AdventureNine){
                Game.gameState = ChewingGumSimulator.STATE.AdventureNineLost;
            }
            else if(Game.gameState == ChewingGumSimulator.STATE.AdventureTen){
                Game.gameState = ChewingGumSimulator.STATE.AdventureTenLost;
            }
        }
        if(Timer==0)
        {
            
            step=false;
            player.distanceTraveled=0;
            if(Game.gameState==ChewingGumSimulator.STATE.AdventureOne){
                Game.gameState = ChewingGumSimulator.STATE.AdventureOneLost;
                Timer=10000;
            }
            else if(Game.gameState==ChewingGumSimulator.STATE.AdventureTwo){
                Game.gameState = ChewingGumSimulator.STATE.AdventureTwoLost;
                Timer=10000;
            }
            else if(Game.gameState==ChewingGumSimulator.STATE.AdventureThree){
                Game.gameState = ChewingGumSimulator.STATE.AdventureThreeLost;
                Timer=10000;
            }
            else if(Game.gameState==ChewingGumSimulator.STATE.AdventureFour){
                Game.gameState = ChewingGumSimulator.STATE.AdventureFourLost;
                Timer=10000;
            }
            else if(Game.gameState==ChewingGumSimulator.STATE.AdventureFive){
                Game.gameState = ChewingGumSimulator.STATE.AdventureFiveLost;
                Timer=10000;
            }
            else if(Game.gameState == ChewingGumSimulator.STATE.AdventureSix){
                Game.gameState = ChewingGumSimulator.STATE.AdventureSixLost;
                Timer=10000;
            }
            else if(Game.gameState == ChewingGumSimulator.STATE.AdventureSeven){
                Game.gameState = ChewingGumSimulator.STATE.AdventureSevenLost;
                Timer=10000;
            }
            else if(Game.gameState == ChewingGumSimulator.STATE.AdventureEight){
                Game.gameState = ChewingGumSimulator.STATE.AdventureEightLost;
                Timer=10000;
            }
            else if(Game.gameState == ChewingGumSimulator.STATE.AdventureNine){
                Game.gameState = ChewingGumSimulator.STATE.AdventureNineLost;
                Timer=10000;
            }
            else if(Game.gameState == ChewingGumSimulator.STATE.AdventureTen){
                Game.gameState = ChewingGumSimulator.STATE.AdventureTenLost;
                Timer=10000;
            }
        }
        
        if(Timer%699==0){
            if(Game.gameState == ChewingGumSimulator.STATE.AdventureTwo){
            handler.addObject(new WhiteCell((ChewingGumSimulator.WIDTH + 100),ChewingGumSimulator.HEIGHT/2,ID.WhiteCell,handler));
            handler.addObject(new WhiteCell((ChewingGumSimulator.WIDTH + 100),ChewingGumSimulator.HEIGHT/2+50,ID.WhiteCell,handler));
            handler.addObject(new WhiteCell((ChewingGumSimulator.WIDTH + 100),ChewingGumSimulator.HEIGHT/2-50,ID.WhiteCell,handler));
            }
            else if(Game.gameState == ChewingGumSimulator.STATE.AdventureOne){
            handler.addObject(new BasicEnemy((ChewingGumSimulator.WIDTH + 100),ChewingGumSimulator.HEIGHT/2,ID.BasicEnemy,handler));
            handler.addObject(new BasicEnemy((ChewingGumSimulator.WIDTH + 100),ChewingGumSimulator.HEIGHT/2+50,ID.BasicEnemy,handler));
            handler.addObject(new BasicEnemy((ChewingGumSimulator.WIDTH + 100),ChewingGumSimulator.HEIGHT/2-50,ID.BasicEnemy,handler));}
            
            else if(Game.gameState == ChewingGumSimulator.STATE.AdventureThree){
            handler.addObject(new BasicEnemy((ChewingGumSimulator.WIDTH + 100),ChewingGumSimulator.HEIGHT/2,ID.BasicEnemy,handler));
            handler.addObject(new BasicEnemy((ChewingGumSimulator.WIDTH + 100),ChewingGumSimulator.HEIGHT/2+50,ID.BasicEnemy,handler));
            handler.addObject(new WhiteCell((ChewingGumSimulator.WIDTH + 100),ChewingGumSimulator.HEIGHT/2+100,ID.WhiteCell,handler));
            handler.addObject(new BasicEnemy((ChewingGumSimulator.WIDTH + 100),ChewingGumSimulator.HEIGHT/2-50,ID.BasicEnemy,handler));}
            
            else if(Game.gameState == ChewingGumSimulator.STATE.AdventureFour){
            handler.addObject(new WhiteCell((ChewingGumSimulator.WIDTH + 100),ChewingGumSimulator.HEIGHT/2,ID.WhiteCell,handler));
            handler.addObject(new WhiteCell((ChewingGumSimulator.WIDTH + 100),ChewingGumSimulator.HEIGHT/2+50,ID.WhiteCell,handler));
            handler.addObject(new WhiteCell((ChewingGumSimulator.WIDTH + 100),ChewingGumSimulator.HEIGHT/2-50,ID.WhiteCell,handler));
            handler.addObject(new WhiteCell((ChewingGumSimulator.WIDTH + 100),ChewingGumSimulator.HEIGHT/2+100,ID.WhiteCell,handler));
            handler.addObject(new WhiteCell((ChewingGumSimulator.WIDTH + 100),ChewingGumSimulator.HEIGHT/2-100,ID.WhiteCell,handler));}
            
            else if(Game.gameState == ChewingGumSimulator.STATE.AdventureFive){
            handler.addObject(new WhiteCell((ChewingGumSimulator.WIDTH + 100),ChewingGumSimulator.HEIGHT/2,ID.WhiteCell,handler));
            handler.addObject(new WhiteCell((ChewingGumSimulator.WIDTH + 100),ChewingGumSimulator.HEIGHT/2+50,ID.WhiteCell,handler));
            handler.addObject(new WhiteCell((ChewingGumSimulator.WIDTH + 100),ChewingGumSimulator.HEIGHT/2-50,ID.WhiteCell,handler));
            handler.addObject(new WhiteCell((ChewingGumSimulator.WIDTH + 100),ChewingGumSimulator.HEIGHT/2+100,ID.WhiteCell,handler));
            handler.addObject(new WhiteCell((ChewingGumSimulator.WIDTH + 100),ChewingGumSimulator.HEIGHT/2-100,ID.WhiteCell,handler));
            
            handler.addObject(new BasicEnemy((ChewingGumSimulator.WIDTH + 200),ChewingGumSimulator.HEIGHT/2+50,ID.BasicEnemy,handler));
            handler.addObject(new BasicEnemy((ChewingGumSimulator.WIDTH + 200),ChewingGumSimulator.HEIGHT/2-50,ID.BasicEnemy,handler));}
            
            else if(Game.gameState == ChewingGumSimulator.STATE.AdventureSix || Game.gameState == ChewingGumSimulator.STATE.AdventureSeven || Game.gameState == ChewingGumSimulator.STATE.AdventureEight || Game.gameState == ChewingGumSimulator.STATE.AdventureNine || Game.gameState == ChewingGumSimulator.STATE.AdventureTen){
            handler.addObject(new WhiteCell((ChewingGumSimulator.WIDTH + 100),ChewingGumSimulator.HEIGHT/2,ID.WhiteCell,handler));
            handler.addObject(new WhiteCell((ChewingGumSimulator.WIDTH + 100),ChewingGumSimulator.HEIGHT/2+50,ID.WhiteCell,handler));
            handler.addObject(new WhiteCell((ChewingGumSimulator.WIDTH + 100),ChewingGumSimulator.HEIGHT/2-50,ID.WhiteCell,handler));
            handler.addObject(new WhiteCell((ChewingGumSimulator.WIDTH + 100),ChewingGumSimulator.HEIGHT/2+100,ID.WhiteCell,handler));
            handler.addObject(new WhiteCell((ChewingGumSimulator.WIDTH + 100),ChewingGumSimulator.HEIGHT/2-100,ID.WhiteCell,handler));
            
            handler.addObject(new BasicEnemy((ChewingGumSimulator.WIDTH + 400),ChewingGumSimulator.HEIGHT/2+50,ID.BasicEnemy,handler));
            handler.addObject(new BasicEnemy((ChewingGumSimulator.WIDTH + 400),ChewingGumSimulator.HEIGHT/2-50,ID.BasicEnemy,handler));
            handler.addObject(new BasicEnemy((ChewingGumSimulator.WIDTH + 400),ChewingGumSimulator.HEIGHT/2+100,ID.BasicEnemy,handler));
            handler.addObject(new BasicEnemy((ChewingGumSimulator.WIDTH + 400),ChewingGumSimulator.HEIGHT/2-100,ID.BasicEnemy,handler));
            
            handler.addObject(new BasicEnemy((ChewingGumSimulator.WIDTH + 800),ChewingGumSimulator.HEIGHT/2+50,ID.BasicEnemy,handler));
            handler.addObject(new BasicEnemy((ChewingGumSimulator.WIDTH + 800),ChewingGumSimulator.HEIGHT/2-50,ID.BasicEnemy,handler));}
            
        }
        if(Timer==9999){
            player.distanceTraveled=0;
            handler.clearEnemies();
            if(Game.gameState==ChewingGumSimulator.STATE.AdventureOne){
            handler.addObject(new Player(ChewingGumSimulator.WIDTH/2 -32, ChewingGumSimulator.HEIGHT/2-32, ID.Player,handler));
            handler.addObject(new VesselDecorations(ChewingGumSimulator.WIDTH/2 -32, ChewingGumSimulator.HEIGHT-150, ID.GreaseDecoration,handler));
            handler.addObject(new VesselDecorations(ChewingGumSimulator.WIDTH/3 -32, ChewingGumSimulator.HEIGHT-300, ID.PlateletDecoration,handler));
            handler.addObject(new VesselDecorations(ChewingGumSimulator.WIDTH/4 -32, ChewingGumSimulator.HEIGHT-190, ID.RedClothDecoration,handler));
            handler.addObject(new VesselDecorations(ChewingGumSimulator.WIDTH -160, ChewingGumSimulator.HEIGHT-250, ID.WhiteClothDecoration,handler));
            handler.addObject(new VesselDecorations(ChewingGumSimulator.WIDTH -220, ChewingGumSimulator.HEIGHT-350, ID.GreaseDecoration,handler));
            handler.addObject(new Lifters(ChewingGumSimulator.WIDTH/2 -32, ChewingGumSimulator.HEIGHT-150, ID.SmallLift,handler));
            handler.addObject(new Lifters(ChewingGumSimulator.WIDTH/2 -32, ChewingGumSimulator.HEIGHT-150, ID.SmallLift,handler));
            handler.addObject(new Lifters(ChewingGumSimulator.WIDTH/3 -32, ChewingGumSimulator.HEIGHT-250, ID.MediumLift,handler));
            handler.addObject(new Lifters(ChewingGumSimulator.WIDTH/3 -32, ChewingGumSimulator.HEIGHT-250, ID.MediumLift,handler));
            handler.addObject(new Lifters(ChewingGumSimulator.WIDTH/3*2 -32, ChewingGumSimulator.HEIGHT-350, ID.BigLift,handler));
            
            }
            else if(Game.gameState==ChewingGumSimulator.STATE.AdventureTwo){
            handler.addObject(new Player(ChewingGumSimulator.WIDTH/2 -32, ChewingGumSimulator.HEIGHT/2-32, ID.Player,handler));
            handler.addObject(new StomachDecorations(ChewingGumSimulator.WIDTH/2 -32, ChewingGumSimulator.HEIGHT-150, ID.AcidDecoration,handler));
            handler.addObject(new StomachDecorations(ChewingGumSimulator.WIDTH/3 -32, ChewingGumSimulator.HEIGHT-300, ID.FatDecoration,handler));
            handler.addObject(new StomachDecorations(ChewingGumSimulator.WIDTH/4 -32, ChewingGumSimulator.HEIGHT-190, ID.InsulinDecoration,handler));
            handler.addObject(new StomachDecorations(ChewingGumSimulator.WIDTH -160, ChewingGumSimulator.HEIGHT-250, ID.SacidDecoration3,handler));
            handler.addObject(new StomachDecorations(ChewingGumSimulator.WIDTH -220, ChewingGumSimulator.HEIGHT-350, ID.SacidDecoration,handler));
            handler.addObject(new Lifters(ChewingGumSimulator.WIDTH/2 -32, ChewingGumSimulator.HEIGHT-150, ID.SmallLift,handler));
            handler.addObject(new Lifters(ChewingGumSimulator.WIDTH/2 -32, ChewingGumSimulator.HEIGHT-150, ID.SmallLift,handler));
            handler.addObject(new Lifters(ChewingGumSimulator.WIDTH/3 -32, ChewingGumSimulator.HEIGHT-250, ID.MediumLift,handler));
            handler.addObject(new Lifters(ChewingGumSimulator.WIDTH/3 -32, ChewingGumSimulator.HEIGHT-250, ID.MediumLift,handler));
            handler.addObject(new Lifters(ChewingGumSimulator.WIDTH/3*2 -32, ChewingGumSimulator.HEIGHT-350, ID.BigLift,handler));
            }
            
            
            
        
        else if(Game.gameState==ChewingGumSimulator.STATE.AdventureThree){
            handler.addObject(new Player(ChewingGumSimulator.WIDTH/2 -32, ChewingGumSimulator.HEIGHT/2-32, ID.Player,handler));
            handler.addObject(new StomachDecorations(ChewingGumSimulator.WIDTH/2 -32, ChewingGumSimulator.HEIGHT-150, ID.AcidDecoration,handler));
            handler.addObject(new StomachDecorations(ChewingGumSimulator.WIDTH/3 -32, ChewingGumSimulator.HEIGHT-300, ID.FatDecoration,handler));
            handler.addObject(new StomachDecorations(ChewingGumSimulator.WIDTH/4 -32, ChewingGumSimulator.HEIGHT-190, ID.InsulinDecoration,handler));
            handler.addObject(new StomachDecorations(ChewingGumSimulator.WIDTH -160, ChewingGumSimulator.HEIGHT-250, ID.SacidDecoration3,handler));
            handler.addObject(new StomachDecorations(ChewingGumSimulator.WIDTH -220, ChewingGumSimulator.HEIGHT-350, ID.SacidDecoration,handler));
            handler.addObject(new Lifters(ChewingGumSimulator.WIDTH/2 -32, ChewingGumSimulator.HEIGHT-150, ID.SmallLift,handler));
            handler.addObject(new Lifters(ChewingGumSimulator.WIDTH/2 -32, ChewingGumSimulator.HEIGHT-150, ID.SmallLift,handler));
            handler.addObject(new Lifters(ChewingGumSimulator.WIDTH/3 -32, ChewingGumSimulator.HEIGHT-250, ID.MediumLift,handler));
            handler.addObject(new Lifters(ChewingGumSimulator.WIDTH/3 -32, ChewingGumSimulator.HEIGHT-250, ID.MediumLift,handler));
            handler.addObject(new Lifters(ChewingGumSimulator.WIDTH/3*2 -32, ChewingGumSimulator.HEIGHT-350, ID.BigLift,handler));
        }
        
        
        else if(Game.gameState==ChewingGumSimulator.STATE.AdventureFour){
            handler.addObject(new Player(ChewingGumSimulator.WIDTH/2 -32, ChewingGumSimulator.HEIGHT/2-32, ID.Player,handler));
            handler.addObject(new PulmonaryDecorations(ChewingGumSimulator.WIDTH/2 -32, ChewingGumSimulator.HEIGHT-150, ID.AirDecoration,handler));
            handler.addObject(new PulmonaryDecorations(ChewingGumSimulator.WIDTH/3 -32, ChewingGumSimulator.HEIGHT-300, ID.WaterDecoration,handler));
            handler.addObject(new PulmonaryDecorations(ChewingGumSimulator.WIDTH/4 -32, ChewingGumSimulator.HEIGHT-190, ID.EdemaDecoration,handler));
            handler.addObject(new PulmonaryDecorations(ChewingGumSimulator.WIDTH -160, ChewingGumSimulator.HEIGHT-250, ID.EdemaDecoration3,handler));
            handler.addObject(new PulmonaryDecorations(ChewingGumSimulator.WIDTH -220, ChewingGumSimulator.HEIGHT-350, ID.PTissueDecoration,handler));
            handler.addObject(new Lifters(ChewingGumSimulator.WIDTH/2 -32, ChewingGumSimulator.HEIGHT-150, ID.SmallLift,handler));
            handler.addObject(new Lifters(ChewingGumSimulator.WIDTH/2 -32, ChewingGumSimulator.HEIGHT-150, ID.SmallLift,handler));
            handler.addObject(new Lifters(ChewingGumSimulator.WIDTH/3 -32, ChewingGumSimulator.HEIGHT-250, ID.MediumLift,handler));
            handler.addObject(new Lifters(ChewingGumSimulator.WIDTH/3 -32, ChewingGumSimulator.HEIGHT-250, ID.MediumLift,handler));
            handler.addObject(new Lifters(ChewingGumSimulator.WIDTH/3*2 -32, ChewingGumSimulator.HEIGHT-350, ID.BigLift,handler));
        }
        
        
        if(Game.gameState==ChewingGumSimulator.STATE.AdventureFive){
            handler.addObject(new Player(ChewingGumSimulator.WIDTH/2 -32, ChewingGumSimulator.HEIGHT/2-32, ID.Player,handler));
            handler.addObject(new VesselDecorations(ChewingGumSimulator.WIDTH/2 -32, ChewingGumSimulator.HEIGHT-150, ID.GreaseDecoration,handler));
            handler.addObject(new VesselDecorations(ChewingGumSimulator.WIDTH/3 -32, ChewingGumSimulator.HEIGHT-300, ID.PlateletDecoration,handler));
            handler.addObject(new VesselDecorations(ChewingGumSimulator.WIDTH/4 -32, ChewingGumSimulator.HEIGHT-190, ID.RedClothDecoration,handler));
            handler.addObject(new VesselDecorations(ChewingGumSimulator.WIDTH -160, ChewingGumSimulator.HEIGHT-250, ID.WhiteClothDecoration,handler));
            handler.addObject(new VesselDecorations(ChewingGumSimulator.WIDTH -220, ChewingGumSimulator.HEIGHT-350, ID.GreaseDecoration,handler));
            handler.addObject(new Lifters(ChewingGumSimulator.WIDTH/2 -32, ChewingGumSimulator.HEIGHT-150, ID.SmallLift,handler));
            handler.addObject(new Lifters(ChewingGumSimulator.WIDTH/2 -32, ChewingGumSimulator.HEIGHT-150, ID.SmallLift,handler));
            handler.addObject(new Lifters(ChewingGumSimulator.WIDTH/3 -32, ChewingGumSimulator.HEIGHT-250, ID.MediumLift,handler));
            handler.addObject(new Lifters(ChewingGumSimulator.WIDTH/3 -32, ChewingGumSimulator.HEIGHT-250, ID.MediumLift,handler));
            handler.addObject(new Lifters(ChewingGumSimulator.WIDTH/3*2 -32, ChewingGumSimulator.HEIGHT-350, ID.BigLift,handler));
            }
        if(Game.gameState==ChewingGumSimulator.STATE.AdventureSix){
            handler.addObject(new Player(ChewingGumSimulator.WIDTH/2 -32, ChewingGumSimulator.HEIGHT/2-32, ID.Player,handler));
            handler.addObject(new VesselDecorations(ChewingGumSimulator.WIDTH/2 -32, ChewingGumSimulator.HEIGHT-150, ID.GreaseDecoration,handler));
            handler.addObject(new VesselDecorations(ChewingGumSimulator.WIDTH/3 -32, ChewingGumSimulator.HEIGHT-300, ID.PlateletDecoration,handler));
            handler.addObject(new VesselDecorations(ChewingGumSimulator.WIDTH/4 -32, ChewingGumSimulator.HEIGHT-190, ID.RedClothDecoration,handler));
            handler.addObject(new VesselDecorations(ChewingGumSimulator.WIDTH -160, ChewingGumSimulator.HEIGHT-250, ID.WhiteClothDecoration,handler));
            handler.addObject(new VesselDecorations(ChewingGumSimulator.WIDTH -220, ChewingGumSimulator.HEIGHT-350, ID.GreaseDecoration,handler));
            handler.addObject(new Lifters(ChewingGumSimulator.WIDTH/2 -32, ChewingGumSimulator.HEIGHT-150, ID.SmallLift,handler));
            handler.addObject(new Lifters(ChewingGumSimulator.WIDTH/2 -32, ChewingGumSimulator.HEIGHT-150, ID.SmallLift,handler));
            handler.addObject(new Lifters(ChewingGumSimulator.WIDTH/3 -32, ChewingGumSimulator.HEIGHT-250, ID.MediumLift,handler));
            handler.addObject(new Lifters(ChewingGumSimulator.WIDTH/3 -32, ChewingGumSimulator.HEIGHT-250, ID.MediumLift,handler));
            handler.addObject(new Lifters(ChewingGumSimulator.WIDTH/3*2 -32, ChewingGumSimulator.HEIGHT-350, ID.BigLift,handler));
            }
        if(Game.gameState==ChewingGumSimulator.STATE.AdventureSeven){
            handler.addObject(new Player(ChewingGumSimulator.WIDTH/2 -32, ChewingGumSimulator.HEIGHT/2-32, ID.Player,handler));
            handler.addObject(new VesselDecorations(ChewingGumSimulator.WIDTH/2 -32, ChewingGumSimulator.HEIGHT-150, ID.GreaseDecoration,handler));
            handler.addObject(new VesselDecorations(ChewingGumSimulator.WIDTH/3 -32, ChewingGumSimulator.HEIGHT-300, ID.PlateletDecoration,handler));
            handler.addObject(new VesselDecorations(ChewingGumSimulator.WIDTH/4 -32, ChewingGumSimulator.HEIGHT-190, ID.RedClothDecoration,handler));
            handler.addObject(new VesselDecorations(ChewingGumSimulator.WIDTH -160, ChewingGumSimulator.HEIGHT-250, ID.WhiteClothDecoration,handler));
            handler.addObject(new VesselDecorations(ChewingGumSimulator.WIDTH -220, ChewingGumSimulator.HEIGHT-350, ID.GreaseDecoration,handler));
            handler.addObject(new Lifters(ChewingGumSimulator.WIDTH/2 -32, ChewingGumSimulator.HEIGHT-150, ID.SmallLift,handler));
            handler.addObject(new Lifters(ChewingGumSimulator.WIDTH/2 -32, ChewingGumSimulator.HEIGHT-150, ID.SmallLift,handler));
            handler.addObject(new Lifters(ChewingGumSimulator.WIDTH/3 -32, ChewingGumSimulator.HEIGHT-250, ID.MediumLift,handler));
            handler.addObject(new Lifters(ChewingGumSimulator.WIDTH/3 -32, ChewingGumSimulator.HEIGHT-250, ID.MediumLift,handler));
            handler.addObject(new Lifters(ChewingGumSimulator.WIDTH/3*2 -32, ChewingGumSimulator.HEIGHT-350, ID.BigLift,handler));
            }
        if(Game.gameState==ChewingGumSimulator.STATE.AdventureEight){
            handler.addObject(new Player(ChewingGumSimulator.WIDTH/2 -32, ChewingGumSimulator.HEIGHT/2-32, ID.Player,handler));
            handler.addObject(new VesselDecorations(ChewingGumSimulator.WIDTH/2 -32, ChewingGumSimulator.HEIGHT-150, ID.GreaseDecoration,handler));
            handler.addObject(new VesselDecorations(ChewingGumSimulator.WIDTH/3 -32, ChewingGumSimulator.HEIGHT-300, ID.PlateletDecoration,handler));
            handler.addObject(new VesselDecorations(ChewingGumSimulator.WIDTH/4 -32, ChewingGumSimulator.HEIGHT-190, ID.RedClothDecoration,handler));
            handler.addObject(new VesselDecorations(ChewingGumSimulator.WIDTH -160, ChewingGumSimulator.HEIGHT-250, ID.WhiteClothDecoration,handler));
            handler.addObject(new VesselDecorations(ChewingGumSimulator.WIDTH -220, ChewingGumSimulator.HEIGHT-350, ID.GreaseDecoration,handler));
            handler.addObject(new Lifters(ChewingGumSimulator.WIDTH/2 -32, ChewingGumSimulator.HEIGHT-150, ID.SmallLift,handler));
            handler.addObject(new Lifters(ChewingGumSimulator.WIDTH/2 -32, ChewingGumSimulator.HEIGHT-150, ID.SmallLift,handler));
            handler.addObject(new Lifters(ChewingGumSimulator.WIDTH/3 -32, ChewingGumSimulator.HEIGHT-250, ID.MediumLift,handler));
            handler.addObject(new Lifters(ChewingGumSimulator.WIDTH/3 -32, ChewingGumSimulator.HEIGHT-250, ID.MediumLift,handler));
            handler.addObject(new Lifters(ChewingGumSimulator.WIDTH/3*2 -32, ChewingGumSimulator.HEIGHT-350, ID.BigLift,handler));
            }
        if(Game.gameState==ChewingGumSimulator.STATE.AdventureNine){
            handler.addObject(new Player(ChewingGumSimulator.WIDTH/2 -32, ChewingGumSimulator.HEIGHT/2-32, ID.Player,handler));
            handler.addObject(new VesselDecorations(ChewingGumSimulator.WIDTH/2 -32, ChewingGumSimulator.HEIGHT-150, ID.GreaseDecoration,handler));
            handler.addObject(new VesselDecorations(ChewingGumSimulator.WIDTH/3 -32, ChewingGumSimulator.HEIGHT-300, ID.PlateletDecoration,handler));
            handler.addObject(new VesselDecorations(ChewingGumSimulator.WIDTH/4 -32, ChewingGumSimulator.HEIGHT-190, ID.RedClothDecoration,handler));
            handler.addObject(new VesselDecorations(ChewingGumSimulator.WIDTH -160, ChewingGumSimulator.HEIGHT-250, ID.WhiteClothDecoration,handler));
            handler.addObject(new VesselDecorations(ChewingGumSimulator.WIDTH -220, ChewingGumSimulator.HEIGHT-350, ID.GreaseDecoration,handler));
            handler.addObject(new Lifters(ChewingGumSimulator.WIDTH/2 -32, ChewingGumSimulator.HEIGHT-150, ID.SmallLift,handler));
            handler.addObject(new Lifters(ChewingGumSimulator.WIDTH/2 -32, ChewingGumSimulator.HEIGHT-150, ID.SmallLift,handler));
            handler.addObject(new Lifters(ChewingGumSimulator.WIDTH/3 -32, ChewingGumSimulator.HEIGHT-250, ID.MediumLift,handler));
            handler.addObject(new Lifters(ChewingGumSimulator.WIDTH/3 -32, ChewingGumSimulator.HEIGHT-250, ID.MediumLift,handler));
            handler.addObject(new Lifters(ChewingGumSimulator.WIDTH/3*2 -32, ChewingGumSimulator.HEIGHT-350, ID.BigLift,handler));
            }
        if(Game.gameState==ChewingGumSimulator.STATE.AdventureTen){
            handler.addObject(new Player(ChewingGumSimulator.WIDTH/2 -32, ChewingGumSimulator.HEIGHT/2-32, ID.Player,handler));
            handler.addObject(new VesselDecorations(ChewingGumSimulator.WIDTH/2 -32, ChewingGumSimulator.HEIGHT-150, ID.GreaseDecoration,handler));
            handler.addObject(new VesselDecorations(ChewingGumSimulator.WIDTH/3 -32, ChewingGumSimulator.HEIGHT-300, ID.PlateletDecoration,handler));
            handler.addObject(new VesselDecorations(ChewingGumSimulator.WIDTH/4 -32, ChewingGumSimulator.HEIGHT-190, ID.RedClothDecoration,handler));
            handler.addObject(new VesselDecorations(ChewingGumSimulator.WIDTH -160, ChewingGumSimulator.HEIGHT-250, ID.WhiteClothDecoration,handler));
            handler.addObject(new VesselDecorations(ChewingGumSimulator.WIDTH -220, ChewingGumSimulator.HEIGHT-350, ID.GreaseDecoration,handler));
            handler.addObject(new Lifters(ChewingGumSimulator.WIDTH/2 -32, ChewingGumSimulator.HEIGHT-150, ID.SmallLift,handler));
            handler.addObject(new Lifters(ChewingGumSimulator.WIDTH/2 -32, ChewingGumSimulator.HEIGHT-150, ID.SmallLift,handler));
            handler.addObject(new Lifters(ChewingGumSimulator.WIDTH/3 -32, ChewingGumSimulator.HEIGHT-250, ID.MediumLift,handler));
            handler.addObject(new Lifters(ChewingGumSimulator.WIDTH/3 -32, ChewingGumSimulator.HEIGHT-250, ID.MediumLift,handler));
            handler.addObject(new Lifters(ChewingGumSimulator.WIDTH/3*2 -32, ChewingGumSimulator.HEIGHT-350, ID.BigLift,handler));
            }
        }
            
            }
    
    
        
        
    
    
    public void render(Graphics g){
        if(Game.gameState==ChewingGumSimulator.STATE.AdventureOne){
        
        g.setColor(vesselColor);
        g.fillRect(0,0,Game.WIDTH,Game.HEIGHT);
        
        
        
        }
        
        
        
        
        if(Game.gameState==ChewingGumSimulator.STATE.AdventureTwo){
        g.setColor(stomachColor);
        g.fillRect(0,0,Game.WIDTH,Game.HEIGHT);
        }
        
        if(Game.gameState==ChewingGumSimulator.STATE.AdventureThree){
        g.setColor(pateuColor);
        g.fillRect(0,0,Game.WIDTH,Game.HEIGHT);
        }
        
        
        if(Game.gameState==ChewingGumSimulator.STATE.AdventureFour){
        g.setColor(plamanColor);
        g.fillRect(0,0,Game.WIDTH,Game.HEIGHT);
        }
        
        
        
        if(Game.gameState==ChewingGumSimulator.STATE.AdventureFive){
        g.setColor(heartColor);
        g.fillRect(0,0,Game.WIDTH,Game.HEIGHT);
        }
        
        if(Game.gameState==ChewingGumSimulator.STATE.AdventureFive){
        g.setColor(heartColor);
        g.fillRect(0,0,Game.WIDTH,Game.HEIGHT);
        }
        
        if(Game.gameState==ChewingGumSimulator.STATE.AdventureSix){
        g.setColor(throatColor);
        g.fillRect(0,0,Game.WIDTH,Game.HEIGHT);
        }
        
        if(Game.gameState==ChewingGumSimulator.STATE.AdventureSeven){
        g.setColor(kidneyColor);
        g.fillRect(0,0,Game.WIDTH,Game.HEIGHT);
        }
        
        if(Game.gameState==ChewingGumSimulator.STATE.AdventureEight){
        g.setColor(bladderColor);
        g.fillRect(0,0,Game.WIDTH,Game.HEIGHT);
        }
        
        if(Game.gameState==ChewingGumSimulator.STATE.AdventureNine){
        g.setColor(pancreatisColor);
        g.fillRect(0,0,Game.WIDTH,Game.HEIGHT);
        }
        
        
        if(Game.gameState==ChewingGumSimulator.STATE.AdventureTen){
        g.setColor(brainColor);
        g.fillRect(0,0,Game.WIDTH,Game.HEIGHT);
        }
        
        
        g.setColor(Color.gray);
        g.fillRoundRect(10,10,200,30,40,40);
        
        g.setColor(Color.orange);
        g.fillRoundRect(10,10,Timer/50,30,40,40);
        
        g.setColor(Color.yellow);
        g.drawRoundRect(10,10,200,30,40,40);
        
        g.setFont(mediumFnt);
        g.setColor(Color.white);
        g.drawString("Remaining Time: "+Timer, 30, 55);
    }
  
    
}
