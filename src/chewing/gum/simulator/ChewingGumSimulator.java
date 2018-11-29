
package chewing.gum.simulator;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;
import java.util.Random;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;





public class ChewingGumSimulator extends Canvas implements Runnable{
   public static int WIDTH = 640, HEIGHT = WIDTH/12*9;
   
   private Thread thread;
   
   private boolean running = false;
   
   public static boolean paused = false;
   
   public static boolean cheats = true;
   
   public static boolean tutorials = false;
   
   public static boolean pretendWork = false;
   
   public static boolean ShowFPS =true;
   
   public static boolean toExitOrNotToExit = false;
   
   public static boolean bladderActive=false;
   
   public static boolean editSelected = false;
   
   public static boolean invertedArrows = false;
   
   public static boolean socialNetworks = true;
   
   public static boolean fromAdventure = false;
   
   public static boolean transitStart = false;
   
   //SAVE DATA ARRAYS - TROPHIES/ACHIVEMENTS/ARENAS/ADVENTURE ZONES
   
   public static boolean[] trophiesStatus= new boolean[20];
   
   public static boolean[] achivementsStatus= new boolean[5];
   
   public static boolean[] customArenaSlots = new boolean[7];
   
   public static boolean[] arenasStatus= new boolean[9];
   
   public static boolean[] adventureStatus= new boolean[10];
   
   public static boolean[] tutorialStages = new boolean[20];
   
   public static int playerXP = 0;
   public static int playerLevel = 0;
   
   public static int PlayerColor = 0;
   
   public static int frameNumber = 0;  
   
   
   
   public static int lastAdventure;
   
   public static int savedCoins;
   public static int savedScore;
   public static int savedBackground;
   
   public static int backgroundSelection = savedBackground;
   
   
   private Random r;
   
   
   private Handler handler;
   
   private HUD hud;
   
   
   
   private Spawn spawner;
   
   private Menu menu;
   
   private MarketPlace shop;
   
   private AdventureShop advShop;
   
   private WorkingTime worktime;
   
   private AdventureOne adventure;
   
   private Logo logo;
   
   private GameBackground background;
   
   private TutorialRender tutRen;
   
   public static SaveData saving;
   public static int tutorialS=0;
   
   static ResourceManager manager;
   
    public enum STATE {
       Logo,
       Menu,
       Game,
       Help,
       About,
       Options,
       Options_PlayerSetup,
       Options_Other,
       Options_Profile,
       Options_Controls,
       GraphicsOption,
       Graphics_SelectResolution,
       SelectDiff,
       StoryScreenOne,
       StoryScreenTwo,
       CheatMenu,
       PlayerColorMenu,
       ArenaSelect,
       Arena,
       ArenaTwo,
       ArenaThree,
       ArenaFour,
       ArenaFive,
       ArenaSix,
       ArenaSeven,
       ArenaEight,
       ArenaNine,
       ArenaWP1,
       ArenaWP2,
       ArenaSPlants,
       ArenaSWeather,
       ArenaSWalls,
       ArenaSTreasures,
       ArenaSTrophies,
       ArenaSExplosive,
       ArenaSTurrets,
       ArenaSPColor,
       ArenaSBackground,
       SingleHelp,
       ArenaHelp,
       CheatsHelp,
       BasicEnemyHelp,
       WhiteCellHelp,
       PlateletCellHelp,
       FastEnemyHelp,
       NeutrinoHelp,
       HiggsBosonHelp,
       SmartEnemyHelp,
       BCellHelp,
       TCellHelp,
       BossSuckerHelp,
       BossOneHelp,
       BossSucker2Help,
       BossTwoHelp,
       BossSucker3Help,
       BossThreeHelp,
       BossSucker4Help,
       BossFourHelp,
       BossSucker5Help,
       BossFiveHelp,
       ShieldHelp,
       SpeedHelp,
       HealthBoxHelp,
       EMPBoxHelp,
       AmmoBoxHelp,
       BronzeTreasureHelp,
       SilverTreasureHelp,
       GoldTreasureHelp,
       StraightTurretHelp,
       ParticleTurretHelp,
       AutoTurretHelp,
       BushHelp,
       TreeHelp,
       CactusHelp,
       RainHelp,
       SnowHelp,
       ThunderHelp,
       FalloutHelp,
       FissionHelp,
       FusionHelp,
       Tutorial,
       TutorialSOne,
       EndTutorial,
       FinishTutorial,
       TutorialSTwo,
       MiniTutorialArena,
       MiniTutorialGame,
       Worker,
       CheatsSpawnMenu,
       CheatsSpawnMenuTwo,
       CheatsCurrency,
       MarketPlace,
       WorkingTime,
       BackgroundSelect(),
       MenuBackgroundSelect(),
       AdventureOne(),
       AdventureTwo(),
       AdventureThree(),
       AdventureFour(),
       AdventureFive(),
       AdventureSix(),
       AdventureSeven(),
       AdventureEight(),
       AdventureNine(),
       AdventureTen(),
       ArenaEditor(),
       ArenaSelector(),
       AdventureOneLost(),
       AdventureTwoLost(),
       AdventureThreeLost(),
       AdventureFourLost(),
       AdventureFiveLost(),
       AdventureSixLost(),
       AdventureSevenLost(),
       AdventureEightLost(),
       AdventureNineLost(),
       AdventureTenLost(),
       AdventureOneWon(),
       AdventureTwoWon(),
       AdventureThreeWon(),
       AdventureFourWon(),
       AdventureFiveWon(),
       AdventureSixWon(),
       AdventureSevenWon(),
       AdventureEightWon(),
       AdventureNineWon(),
       AdventureTenWon(),
       AdventureSelect(),
       AdventureSelect2(),
       AdventureShop(),
       Options_Trophies(),
       Options_Achivements(),
       Options_Language(),
       Options_PlayerUpgrades(),
       EndGame, 
    };
   
   
   
   public static STATE gameState = STATE.Logo;
   
   public static LANGUAGE gameLang = LANGUAGE.English;
   
   
    
    
    
    
    
   public ChewingGumSimulator(){
   handler = new Handler();
   hud = new HUD();
   
   
  
   menu = new Menu(this,handler,hud);
   shop = new MarketPlace(this,handler);
   advShop = new AdventureShop(this,handler);
   worktime = new WorkingTime(this,handler);
   adventure = new AdventureOne(this,handler);
   logo = new Logo(this,handler);
   background = new GameBackground(this,handler);
   tutRen = new TutorialRender(this,handler);
   
   
   
   this.addKeyListener(new KeyInput(handler,this));
   
   this.addMouseListener(menu);
   this.addMouseListener(shop);
   this.addMouseListener(advShop);
   this.addMouseMotionListener(menu);
   
   
   //AudioPlayer.load();
   //AudioPlayer.getMusic("music").loop();
   
   LoadGame();
   
   new Window(WIDTH,HEIGHT,"Disease Hunter Beta",this);
   
   
   
   spawner = new Spawn(handler,hud);
   
   
   
   r = new Random();
   
   
   
   
   
  
   
 
   
   }
    
    
    
    public synchronized void start(){
       thread = new Thread(this);
       thread.start();
       running = true;
   }
    
    
    public synchronized void stop(){
       try{
           thread.join();
           running  = false;
       }catch(Exception e){e.printStackTrace();}
   }
   
   public void run(){
   this.requestFocus();
   long lastTime = System.nanoTime();
   double amountOfTicks = 60.0;
   double ns = 1000000000 / amountOfTicks;
   double delta = 0;
   long timer = System.currentTimeMillis();
   int frames = 0;
   while(running){
       long now = System.nanoTime();
       delta += (now - lastTime) / ns;
       lastTime = now;
       while(delta >= 1){
           tick();
           delta--;
       }
       if(running)
           render();
       frames++;
       
       if(System.currentTimeMillis() - timer > 1000){
           timer += 1000;
           frameNumber=frames;
           //System.out.println("FPS: " + frames);
           frames = 0;
       }
   }
   stop();}
   
   private void tick(){
       playerLevel=(int)playerXP/1000;
       if(gameState == STATE.Logo)
       {logo.tick();
        handler.tick();
        
       }
       
       if(gameState==STATE.Game || gameState==STATE.Arena || gameState==STATE.Tutorial || gameState==STATE.ArenaTwo || gameState == STATE.ArenaThree || gameState == STATE.ArenaFour || gameState == STATE.ArenaFive || gameState == STATE.ArenaSix || gameState == STATE.ArenaSeven || gameState == STATE.ArenaEight || gameState == STATE.ArenaNine){
           if(!paused){
       hud.tick();
       spawner.tick();
       
       handler.tick();
       if(gameState == STATE.Game)
       {if(HUD.HEALTH <= 0){
           HUD.HEALTH = 100;
           
           gameState = STATE.EndGame;
           handler.clearEnemies();}
        if(HUD.BLADDER <= 0){
            HUD.BLADDER = 0;
        }
        if(HUD.BLADDER > 100){
            HUD.BLADDER = 100;
        }
       
       
       }
       if(gameState == STATE.Arena || gameState == STATE.ArenaTwo || gameState == STATE.ArenaThree || gameState == STATE.ArenaFour || gameState == STATE.ArenaFive || gameState == STATE.ArenaSix || gameState == STATE.ArenaSeven || gameState == STATE.ArenaEight || gameState == STATE.ArenaNine){
           if(HUD.HEALTH <= 0)
           { HUD.HEALTH = 100;
             gameState = STATE.ArenaWP2;
             handler.clearEnemies();}
           if(HUD.HEALTH2 <= 0)
           { HUD.HEALTH2 = 100;
             gameState = STATE.ArenaWP1;
             handler.clearEnemies();}
       }
       
       if(gameState == STATE.Tutorial)
       {if(HUD.HEALTH <= 0){
           HUD.HEALTH = 100;
           
           gameState = STATE.EndTutorial;
           handler.clearEnemies();
           spawner.tutorialReset();}}
       
       
       
       
       
       
           
           
           
       }
         
       }
       
       
       if(gameState == STATE.AdventureOne || gameState==STATE.AdventureTwo || gameState==STATE.AdventureThree || gameState==STATE.AdventureFour || gameState==STATE.AdventureFive || gameState == STATE.AdventureSix || gameState==STATE.AdventureSeven || gameState==STATE.AdventureEight || gameState==STATE.AdventureNine || gameState==STATE.AdventureTen )
       {handler.tick();
        hud.tick();
        //spawner.tick();
        adventure.tick();
        
        
        //spawner.tick();
        
       }
       if(gameState == STATE.ArenaEditor)
       {   handler.tick();
           hud.tick();
           spawner.tick();
        //spawner.tick();
        
        
       }
       //Big if clause 
        
       if(gameState == STATE.Menu || gameState == STATE.EndGame || gameState == STATE.AdventureShop || gameState == STATE.AdventureOneLost || gameState == STATE.AdventureTwoLost || gameState == STATE.AdventureThreeLost || gameState == STATE.AdventureFourLost || gameState == STATE.AdventureFiveLost || gameState == STATE.Help || gameState == STATE.About || gameState == STATE.Options || gameState == STATE.GraphicsOption || gameState == STATE.StoryScreenOne || gameState == STATE.StoryScreenTwo || gameState == STATE.SelectDiff || gameState == STATE.PlayerColorMenu || gameState == STATE.ArenaWP1 || gameState == STATE.ArenaWP2 || gameState == STATE.SingleHelp || gameState == STATE.ArenaHelp || gameState == STATE.CheatsHelp || gameState == STATE.ShieldHelp || gameState == STATE.TutorialSOne || gameState == STATE.TutorialSTwo || gameState == STATE.FinishTutorial || gameState == STATE.ArenaSelect || gameState == STATE.MiniTutorialArena || gameState == STATE.MiniTutorialGame || gameState == STATE.WorkingTime || gameState == STATE.CheatsSpawnMenu || gameState == STATE.CheatsSpawnMenuTwo || gameState == STATE.CheatMenu || gameState == STATE.MarketPlace  || gameState == STATE.CheatsCurrency || gameState == STATE.ArenaSelector  || gameState == STATE.ArenaSPlants || gameState == STATE.ArenaSWeather || gameState == STATE.ArenaSWalls || gameState == STATE.ArenaSTreasures || gameState == STATE.ArenaSTrophies)
       {   
           
           if(gameState == STATE.Menu)
           {handler.clearPlayers();
             handler.clearEnemies();
             Player.Shield=false;
             Player.SpeedBoosted=false;
             Player.Thunderstruck=false;
             HUD.HEALTH=100;
             HUD.HEALTH2=100;
             HUD.AMMO=100;
             HUD.EMPCount=0;
             menu.tick();
             handler.tick();
               
           }
           
           if(gameState == STATE.BackgroundSelect || gameState == STATE.MenuBackgroundSelect || gameState == STATE.FinishTutorial)
           {handler.clearPlayers();
             handler.clearEnemies();
             Player.Shield=false;
             Player.SpeedBoosted=false;
             Player.Thunderstruck=false;
             HUD.HEALTH=100;
             HUD.HEALTH2=100;
             HUD.AMMO=100;
             HUD.EMPCount=0;
             menu.tick();
               
           }
           
           if(gameState == STATE.MarketPlace)
           {
             menu.tick();
             shop.tick();
               
           }
           if(gameState == STATE.WorkingTime)
           {
             worktime.tick();
               
           }
           if(gameState == STATE.AdventureShop)
           {
             menu.tick();
             advShop.tick();
               
           }
           
           if(gameState == STATE.AdventureOneLost || gameState==STATE.ArenaSelect || gameState == STATE.AdventureSelect || gameState == STATE.AdventureTwoLost || gameState == STATE.AdventureThreeLost || gameState == STATE.AdventureFourLost || gameState == STATE.AdventureFiveLost || gameState == STATE.AdventureSixLost || gameState==STATE.AdventureSevenLost || gameState==STATE.AdventureEightLost || gameState==STATE.AdventureNineLost || gameState==STATE.AdventureTenLost || gameState == STATE.ArenaSelector || gameState == STATE.ArenaSPlants || gameState == STATE.ArenaSWeather || gameState == STATE.SpeedHelp || gameState == STATE.ArenaSWalls || gameState == STATE.ArenaSTreasures || gameState == STATE.ArenaSTrophies || gameState == STATE.ArenaSExplosive || gameState == STATE.ArenaSTurrets || gameState == STATE.ArenaSPColor || gameState == STATE.ArenaSBackground)
           {
             menu.tick();
             if(gameState == STATE.ArenaSelect){
                 handler.clearEnemies();
             }
               
           }
           else
           {
               menu.tick();
               
               handler.tick();
           }
           
       }
       
       if(gameState == STATE.AmmoBoxHelp || gameState == STATE.FastEnemyHelp || gameState == STATE.SpeedHelp || gameState == STATE.ShieldHelp || gameState == STATE.PlateletCellHelp || gameState == STATE.FissionHelp || gameState == STATE.ParticleTurretHelp || gameState == STATE.AutoTurretHelp || gameState == STATE.StraightTurretHelp || gameState == STATE.FusionHelp || gameState == STATE.NeutrinoHelp || gameState == STATE.ThunderHelp || gameState == STATE.HiggsBosonHelp || gameState == STATE.BasicEnemyHelp || gameState == STATE.WhiteCellHelp || gameState == STATE.BushHelp || gameState == STATE.TreeHelp || gameState == STATE.CactusHelp || gameState == STATE.SmartEnemyHelp || gameState == STATE.BCellHelp || gameState == STATE.TCellHelp || gameState == STATE.BossSuckerHelp || gameState == STATE.BossOneHelp || gameState == STATE.BossTwoHelp || gameState == STATE.BossThreeHelp || gameState == STATE.BossFourHelp || gameState == STATE.BossFiveHelp || gameState == STATE.HealthBoxHelp || gameState == STATE.EMPBoxHelp  || gameState == STATE.RainHelp  || gameState == STATE.SnowHelp  || gameState == STATE.FalloutHelp  || gameState == STATE.BronzeTreasureHelp || gameState == STATE.SilverTreasureHelp || gameState == STATE.GoldTreasureHelp)
       {   if(gameState == STATE.Menu)
         {   handler.clearPlayers();
             handler.clearEnemies();
             Player.Shield=false;
             Player.SpeedBoosted=false;
             Player.Thunderstruck=false;
         }
           
           
           
           
           
           
           menu.tick();
           handler.tick();
           spawner.tick();
           
       }
       
       
       
       
   }
   
   private void render(){
       BufferStrategy bs = this.getBufferStrategy();
       if(bs==null){
           this.createBufferStrategy(3);
           return;
       }
       Graphics g = bs.getDrawGraphics();
       
       g.setColor(Color.black);
       g.fillRect(0,0,WIDTH,HEIGHT);
       
       
       
       
       
       if(gameState == STATE.CheatMenu || gameState == STATE.ArenaSelect || gameState == STATE.BackgroundSelect  || gameState == STATE.MenuBackgroundSelect || gameState == STATE.CheatsCurrency || gameState == STATE.CheatsSpawnMenu || gameState == STATE.CheatsSpawnMenuTwo || gameState == STATE.ArenaSelector || gameState == STATE.ArenaSPlants || gameState == STATE.ArenaSWeather || gameState == STATE.ArenaSWalls || gameState == STATE.ArenaSTreasures || gameState == STATE.ArenaSTrophies || gameState == STATE.ArenaSExplosive || gameState == STATE.ArenaSTurrets || gameState == STATE.ArenaSPColor || gameState == STATE.ArenaSBackground){
           
           background.render(g);
           menu.render(g);
           
           
           
       }
       
       
       
           
           
           
       
       
       
       
       
       
       
       
       else if(gameState == STATE.Game || gameState == STATE.Arena || gameState == STATE.Tutorial || gameState == STATE.ArenaTwo || gameState == STATE.ArenaThree || gameState == STATE.ArenaFour || gameState == STATE.ArenaFive || gameState == STATE.ArenaSix || gameState == STATE.ArenaSeven || gameState == STATE.ArenaEight || gameState == STATE.ArenaNine){
           backgroundSelection = savedBackground;
           if(backgroundSelection==0)
           {
               g.setColor(Color.black);
               g.fillRect(0,0,WIDTH,HEIGHT);
           }
           else if(backgroundSelection==2)
           {
               g.setColor(Color.green);
               g.fillRect(0,0,WIDTH,HEIGHT);
           }
           else if(backgroundSelection==3)
           {
               g.setColor(Color.magenta);
               g.fillRect(0,0,WIDTH,HEIGHT);
           }
           else if(backgroundSelection==1){
           Color skyColor = new Color(132,112,255);
           Color brownColor = new Color(140,20,0);
           g.setColor(skyColor);
           g.fillRect(0,0,WIDTH,HEIGHT-80);
           
           g.setColor(Color.green);
           g.fillRect(0,HEIGHT-80,WIDTH,20);
           
           g.setColor(brownColor);
           g.fillRect(0,HEIGHT-60,WIDTH,60);}
           
           else if(backgroundSelection==4){
           Color skyColor = new Color(132,112,255);
           Color brownColor = new Color(140,20,0);
           Color sandColor = new Color	(237, 201, 175);
           
           g.setColor(skyColor);
           g.fillRect(0,0,WIDTH,HEIGHT-80);
           
           g.setColor(sandColor);
           g.fillRect(0,HEIGHT-80,WIDTH,20);
           
           g.setColor(brownColor);
           g.fillRect(0,HEIGHT-60,WIDTH,60);
           
           g.setColor(Color.orange);
           g.fillRect(WIDTH/2-50,HEIGHT-130,100,50);}
           
           else if(backgroundSelection==5){
           Color skyColor = new Color(132,112,255);
           Color brownColor = new Color(140,20,0);
           Color sandColor = new Color	(237, 201, 175);
           
           g.setColor(skyColor);
           g.fillRect(0,0,WIDTH,HEIGHT-80);
           
           g.setColor(sandColor);
           g.fillRect(0,HEIGHT-80,WIDTH,20);
           
           g.setColor(brownColor);
           g.fillRect(0,HEIGHT-60,WIDTH,60);
           
           g.setColor(Color.yellow);
           g.fillOval(WIDTH-150,150,100,100);
           
           g.setColor(sandColor);
           g.fillRect(0,HEIGHT-100,WIDTH/3,20);
           g.fillRect((WIDTH-(WIDTH/3)),HEIGHT-100,WIDTH/3,20);
           
           }
           
           else if(backgroundSelection==6){
           Color skyColor = new Color(132,112,255);
           Color brownColor = new Color(140,20,0);
           Color sandColor = new Color	(237, 201, 175);
           
           g.setColor(skyColor);
           g.fillRect(0,0,WIDTH,HEIGHT-80);
           
           g.setColor(Color.green);
           g.fillRect(0,HEIGHT-80,WIDTH,20);
           
           g.setColor(Color.DARK_GRAY);
           g.fillRect(0,HEIGHT-60,WIDTH,60);
           
           g.setColor(Color.yellow);
           g.fillRect(150,150,100,100);
           
           g.setColor(Color.DARK_GRAY);
           g.fillRect(0,HEIGHT-140,20,60);
           
           g.fillRect(WIDTH/3,HEIGHT-140,20,60);
           
           g.fillRect(WIDTH/3*2,HEIGHT-140,20,60);
           
           g.fillRect(WIDTH-30,HEIGHT-140,20,60);
           
           g.fillRect(0,HEIGHT-160,75,20);
           
           g.fillRect(WIDTH/3-85,HEIGHT-160,75,20);
           g.fillRect(WIDTH/3-10,HEIGHT-160,55,20);
           g.fillRect((WIDTH/3*2)-55,HEIGHT-160,45,20);
           g.fillRect((WIDTH/3*2)-10,HEIGHT-160,35,20);
           }
           
           else if(backgroundSelection==7){
           Color skyColor = new Color(132,112,255);
           Color brownColor = new Color(140,20,0);
           Color sandColor = new Color	(237, 201, 175);
           
           g.setColor(skyColor);
           g.fillRect(0,0,WIDTH,HEIGHT-150);
           
           g.setColor(Color.blue);
           g.fillRect(0,HEIGHT-150,WIDTH,70);
           
           g.setColor(sandColor);
           g.fillRect(0,HEIGHT-80,WIDTH,20);
           
           g.setColor(brownColor);
           g.fillRect(0,HEIGHT-60,WIDTH,60);
           
           g.setColor(Color.orange);
           g.fillRect(WIDTH/2-50,HEIGHT-200,100,50);}
           
           else if(backgroundSelection==8){
           Color skyColor = new Color(132,112,255);
           Color brownColor = new Color(140,20,0);
           g.setColor(skyColor);
           g.fillRect(0,0,WIDTH,HEIGHT-80);
           
           g.setColor(Color.green);
           g.fillRect(0,HEIGHT-80,WIDTH,20);
           
           g.setColor(brownColor);
           g.fillRect(0,HEIGHT-60,WIDTH,60);
           
           g.setColor(Color.green);
           g.fillRect(0,HEIGHT-100,WIDTH/3,20);
           g.fillRect((WIDTH-(WIDTH/3)),HEIGHT-100,WIDTH/3,20);
           
           g.fillRect(0,HEIGHT-120,WIDTH/4,20);
           g.fillRect((WIDTH-(WIDTH/3)),HEIGHT-120,WIDTH/4,20);
           
           g.fillRect(0,HEIGHT-140,WIDTH/5,20);
           g.fillRect((WIDTH-(WIDTH/3)),HEIGHT-140,WIDTH/5,20);
           
           g.fillRect(0,HEIGHT-160,WIDTH/7,20);
           g.fillRect((WIDTH-(WIDTH/3)),HEIGHT-160,WIDTH/7,20);
           
           g.setColor(Color.orange);
           g.fillRect(WIDTH/2-50,HEIGHT-130,100,50);
           
           
           
           
           }
           //NORMAND SEA
           else if(backgroundSelection==9){
           Color skyColor = new Color(132,112,255);
           Color brownColor = new Color(140,20,0);
           Color sandColor = new Color	(237, 201, 175);
           g.setColor(skyColor);
           g.fillRect(0,0,WIDTH,HEIGHT-80);
           
           g.setColor(Color.yellow);
           g.fillRect(150,150,100,100);
           
           g.setColor(sandColor);
           g.fillRect(0,HEIGHT-80,WIDTH,60);
           
           }
           
           //NORMAND SUNSET
           else if(backgroundSelection==10){
           Color skyColor = new Color(132,112,255);
           Color brownColor = new Color(140,20,0);
           g.setColor(skyColor);
           g.fillRect(0,0,WIDTH,HEIGHT-80);
           
           g.setColor(Color.green);
           g.fillRect(0,HEIGHT-80,WIDTH,20);
           
           g.setColor(brownColor);
           g.fillRect(0,HEIGHT-60,WIDTH,60);}
           
           else if(backgroundSelection==11)
           {   Color randCol = new Color(r.nextInt(255),r.nextInt(255),r.nextInt(255));
               
               
                   for(int j=0;j<16;j++)
                   {g.setColor(randCol);
               g.fillRect(0+(WIDTH/16*j),0+(HEIGHT/16*j),WIDTH/16,HEIGHT/16);
                   g.fillRect(r.nextInt(WIDTH), r.nextInt(HEIGHT), r.nextInt(150),r.nextInt(130));}
               
           }
           
           else if(backgroundSelection==12)
           {   
               
               
                   for(int j=0;j<32;j++)
                   {g.setColor(Color.white);
               //g.fillRect(0+(WIDTH/16*j),0+(HEIGHT/16*j),WIDTH/16,HEIGHT/16);
                   g.fillRect(r.nextInt(WIDTH), r.nextInt(HEIGHT), r.nextInt(6),r.nextInt(6));}
               
           
           }
           menu.render(g);
           
       
               
               
               if(paused){
           
           Font fnt = new Font("arial",1,40);
           Font fnt2 = new Font("arial",1,10);
           Font fnt3 = new Font("arial",1,20);
           g.setFont(fnt);
           g.setColor(Color.white);
           g.drawString("PAUSED",110,130);
           g.setFont(fnt2);
           if(toExitOrNotToExit==false){
               g.setFont(fnt3);
               g.setColor(Color.red);
               g.fillRoundRect(420, 360, 200, 64,20,20);
           g.setColor(Color.white);
           g.drawString("Exit",460,400);
            g.drawRoundRect(420, 360, 200, 64,20,20);}
           if(cheats){
            
            g.setColor(Color.yellow);
            g.setFont(fnt3);
            g.drawString("Cheat Menu",250,400);
            g.drawRoundRect(210, 360, 200, 64,20,20);
           }
           
       }
               
               if(gameState==STATE.Tutorial){
                   tutRen.render(g);
               }
           
          hud.render(g);
          handler.render(g);
           
           
           
       }
       
       else if(gameState == STATE.ArenaEditor){
           
           hud.render(g);
           menu.render(g);
           handler.render(g);
           
           
       }
       
       else if(gameState == STATE.MarketPlace) {
           shop.render(g);
           
           
       }
       else if(gameState == STATE.AdventureShop) {
           advShop.render(g);
           
           
       }
       
       else if(gameState == STATE.WorkingTime) {
           worktime.render(g);
           
           
       }
       
       else if(gameState == STATE.AdventureOne || gameState==STATE.AdventureTwo || gameState==STATE.AdventureThree || gameState==STATE.AdventureFour || gameState==STATE.AdventureFive || gameState == STATE.AdventureSix || gameState==STATE.AdventureSeven || gameState==STATE.AdventureEight || gameState==STATE.AdventureNine || gameState==STATE.AdventureTen || gameState == STATE.AdventureOneLost || gameState == STATE.AdventureTwoLost || gameState == STATE.AdventureThreeLost || gameState == STATE.AdventureFourLost || gameState == STATE.AdventureFiveLost || gameState == STATE.AdventureSixLost || gameState==STATE.AdventureSevenLost || gameState==STATE.AdventureEightLost || gameState==STATE.AdventureNineLost || gameState==STATE.AdventureTenLost || gameState == STATE.AdventureOneWon || gameState == STATE.AdventureTwoWon || gameState == STATE.AdventureThreeWon || gameState == STATE.AdventureFourWon || gameState == STATE.AdventureFiveWon || gameState == STATE.AdventureSixWon || gameState==STATE.AdventureSevenWon || gameState==STATE.AdventureEightWon || gameState==STATE.AdventureNineWon || gameState==STATE.AdventureTenWon ) {
           
           if(gameState == STATE.AdventureOneLost || gameState == STATE.AdventureTwoLost || gameState == STATE.AdventureSelect || gameState == STATE.AdventureThreeLost || gameState == STATE.AdventureFourLost || gameState == STATE.AdventureFiveLost || gameState == STATE.AdventureSixLost || gameState==STATE.AdventureSevenLost || gameState==STATE.AdventureEightLost || gameState==STATE.AdventureNineLost || gameState==STATE.AdventureTenLost || gameState == STATE.AdventureOneWon || gameState == STATE.AdventureTwoWon || gameState == STATE.AdventureThreeWon || gameState == STATE.AdventureFourWon || gameState == STATE.AdventureFiveWon || gameState == STATE.AdventureSixWon || gameState==STATE.AdventureSevenWon || gameState==STATE.AdventureEightWon || gameState==STATE.AdventureNineWon || gameState==STATE.AdventureTenWon ){
               menu.render(g);
           }
           else{
           adventure.render(g);
           
           handler.render(g);
           hud.render(g);}
           
           
           
           
       }
       else if(gameState == STATE.Logo)
       {logo.render(g);
        handler.render(g);
        
       }
       
       else if(gameState == STATE.Help)
       {menu.render(g);
        
        
       }
       
       
       
       else {
           menu.render(g);
           handler.render(g);
           
       }
       
       
       
       g.dispose();
       bs.show();
   }
   
   public static float clamp(float var, float min, float max){
       if(var >= max)
           return var = max;
       else if(var <= min)
           return var = min;
       else
           return var;
       
   }
   
   public static float getModul(float var){
       if(var>0){
           return var;
       }
       else if(var<0){
           return ((-1)*var);
       }
       else
           return var;
   }
   
   
   
   
   
   
   public static void SaveGame(){
       saving = new SaveData(savedCoins,savedScore,savedBackground,adventureStatus,achivementsStatus,trophiesStatus,gameLang,playerXP,playerLevel);
       try{
           ResourceManager.save(saving,"1.save");
       }
       catch(Exception e){
           System.out.println("Error" + e.getMessage());
       }
       
       
       
       
       
       
       
       
   }
   
   
   public static void LoadGame(){
       
       saving = new SaveData(savedCoins,savedScore,savedBackground,adventureStatus,achivementsStatus,trophiesStatus,gameLang,playerXP,playerLevel);
       try{
           SaveData saving = (SaveData) ResourceManager.load("1.save");
           HUD.COINS=(saving.Data_Coins);
           savedCoins=(saving.Data_Coins);
           savedScore=(saving.Data_MaxScore);
           savedBackground=(saving.Data_Background);
           adventureStatus=(saving.Data_adventureStatus);
           achivementsStatus=(saving.Data_achivementsStatus);
           trophiesStatus=(saving.Data_trophiesStatus);
           gameLang=(saving.Data_gameLang);
           playerXP=(saving.Data_playerXP);
           playerLevel=(saving.Data_playerLevel);
           
           
       }
       catch(Exception e){
           System.out.println("Error" + e.getMessage());
       }
   }
   
   
   
   

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new ChewingGumSimulator();
    }
    
}

 
