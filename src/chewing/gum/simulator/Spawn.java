
package chewing.gum.simulator;

import static chewing.gum.simulator.ChewingGumSimulator.HEIGHT;
import static chewing.gum.simulator.ChewingGumSimulator.WIDTH;
import java.awt.Graphics;
import java.util.Random;



public class Spawn extends HUD{
    
    private Handler handler;
    private HUD hud;
    private Random r = new Random();
    private int scoreKeep = 0;
    static int scoreKeepTut = 0;
    static int arenaSpawn = 0;
    static int timeKeep = 0;
    private int eventRandom=r.nextInt(20);
    private int randomBall = r.nextInt(4);
    static boolean eventRunning = false;
    static boolean eventCheat = false;
    static boolean TreasureHelp=false;
    static boolean WeatherHelp=false;
    static boolean DecoHelp=false;
    static boolean FastEnemyHelp = false;
    static boolean AllahuAkbarHelp = false;
    static boolean TurretHelp = false;
    static boolean BoxesHelp = false;
    static boolean PowerHelp = false;
    static boolean Advstarted = false;
    public static boolean playerSpawned=false;
    static boolean tutSpawnOne = false;
    static boolean tutSpawnTwo = false;
    static boolean tutSpawnThree = false;
    static boolean tutSpawnFour = false;
    static boolean tutSpawnFive = false;
    static boolean tutSpawnSix = false;
    static boolean tutSpawnSeven = false;
    static boolean tutSpawnEight = false;
    private int fastTimer=200;
    private float pX, pY;
    
    private int SpawnTimer=5000;
    
    ChewingGumSimulator Game;
    BossOne boss;
    
    public Spawn(Handler handler,HUD hud){
        this.handler = handler;
        this.hud = hud;
        
        
    }
    
    public static void tutorialReset(){
        tutSpawnOne=false;
        tutSpawnTwo=false;
        tutSpawnThree=false;
        tutSpawnFour=false;
        tutSpawnFive=false;
        tutSpawnSix=false;
        tutSpawnSeven=false;
        tutSpawnEight=false;
        BoxesHelp=false;
        for(int i=0;i<ChewingGumSimulator.tutorialStages.length;i++){
            ChewingGumSimulator.tutorialStages[i]=false;
        }
    }
    
    private void playerStatus(){
        for(int i=0;i < handler.object.size(); i++){
        GameObject iaraObject = handler.object.get(i);
        if(iaraObject.getId()==ID.Player){
            playerSpawned=true;
            pX=iaraObject.getX();
            pY=iaraObject.getY();
        }
        
        }
    }  
    
    public void tick(){
        playerStatus();
        if(eventRunning==true){
        if(SpawnTimer>0){
            SpawnTimer--;
        }
        if(SpawnTimer==0){
            SpawnTimer=5000;
        } }
        if(eventCheat==true){
            eventRandom=1;
        }
        
        if(Game.gameState == ChewingGumSimulator.STATE.Game){
            if(playerSpawned!=true){
                handler.addObject(new Player(WIDTH/2 -32, HEIGHT/2-32, ID.Player,handler));
                playerSpawned=true;
            }
            scoreKeep++;
        
        
        if(eventRandom==1){
            eventRunning=true;
            if(SpawnTimer==1){
            handler.addObject(new CancerCell((ChewingGumSimulator.WIDTH / 2)-48,0,ID.CancerCell,handler));}
        }
        
        if(eventRandom==3){
            eventRunning=true;
            if(SpawnTimer==1){
            handler.addObject(new LeukemiaCell((ChewingGumSimulator.WIDTH / 2)-48,0,ID.LeukemiaCell,handler));}
        }
        
        if(eventRandom==2){
            eventRunning=true;
            if(SpawnTimer==1){
            handler.addObject(new MalignCell((ChewingGumSimulator.WIDTH / 2)-48,0,ID.MalignCell,handler));}
        }
        if(scoreKeep >= 3000)
        {
            scoreKeep=0;
            
            HUD.AMMO = 100;
            
            hud.setLevel(hud.getLevel()+1);
            if(hud.getLevel()<30)
            {handler.addObject(new SoftTreasure((int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.WIDTH),80,ChewingGumSimulator.WIDTH-100),(int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.HEIGHT),160,ChewingGumSimulator.HEIGHT-120), ID.SoftTreasure,handler));
            handler.addObject(new StraightTurret((int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.WIDTH),40,ChewingGumSimulator.WIDTH-30),(int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.HEIGHT),120,ChewingGumSimulator.HEIGHT-50),ID.StraightTurret,handler));}
            //}
            if(hud.getLevel()<60 && hud.getLevel()>=30)
            {handler.addObject(new SilverSoftTreasure((int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.WIDTH),80,ChewingGumSimulator.WIDTH-100),(int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.HEIGHT),160,ChewingGumSimulator.HEIGHT-120), ID.SilverSoftTreasure,handler));
            handler.addObject(new ParticleTurret((int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.WIDTH),40,ChewingGumSimulator.WIDTH-30),(int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.HEIGHT),120,ChewingGumSimulator.HEIGHT-50),ID.ParticleTurret,handler));} 
            if(hud.getLevel()>=60)
            {handler.addObject(new GoldSoftTreasure((int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.WIDTH),80,ChewingGumSimulator.WIDTH-100),(int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.HEIGHT),160,ChewingGumSimulator.HEIGHT-120), ID.GoldSoftTreasure,handler));
            handler.addObject(new AutoTurret((int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.WIDTH),40,ChewingGumSimulator.WIDTH-30),(int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.HEIGHT),120,ChewingGumSimulator.HEIGHT-50),ID.AutoTurret,handler));} 
            handler.addObject(new PlateletCell((int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.WIDTH),80,ChewingGumSimulator.WIDTH-100),(int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.HEIGHT),160,ChewingGumSimulator.HEIGHT-120), ID.PlateletCell,handler));
        
        }
        
        
        if(scoreKeep == 2000){
            
            if(hud.getLevel()<10){
                if(randomBall==3 && randomBall==4){
                handler.addObject(new GreaseBall(ChewingGumSimulator.WIDTH+300,(int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.HEIGHT),200,ChewingGumSimulator.HEIGHT-100),ID.GreaseBall,handler));}
                
                else{
                handler.addObject(new GreaseBall(0,(int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.HEIGHT),200,ChewingGumSimulator.HEIGHT-100),ID.GreaseBallBack,handler));}
                
        handler.addObject(new FastEnemy((int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.WIDTH),20,ChewingGumSimulator.WIDTH-10),(int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.HEIGHT),120,ChewingGumSimulator.HEIGHT),ID.FastEnemy,handler));
        handler.addObject(new SmartEnemy((int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.WIDTH),20,ChewingGumSimulator.WIDTH-10),(int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.HEIGHT),120,ChewingGumSimulator.HEIGHT),ID.SmartEnemy,handler));
            }
            if(hud.getLevel()<20 && hud.getLevel()>10){
                if(randomBall==3 && randomBall==4){
                handler.addObject(new BloodCloth(ChewingGumSimulator.WIDTH+300,(int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.HEIGHT),200,ChewingGumSimulator.HEIGHT-100),ID.BloodCloth,handler));}
                
                else{
                handler.addObject(new BloodCloth(0,(int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.HEIGHT),200,ChewingGumSimulator.HEIGHT-100),ID.BloodClothBack,handler));}
        handler.addObject(new Neutrino((int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.WIDTH),20,ChewingGumSimulator.WIDTH-10),(int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.HEIGHT),120,ChewingGumSimulator.HEIGHT),ID.Neutrino,handler));
        handler.addObject(new BCell((int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.WIDTH),20,ChewingGumSimulator.WIDTH-10),(int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.HEIGHT),120,ChewingGumSimulator.HEIGHT),ID.BCell,handler));
            }
            
            if(hud.getLevel()<30 && hud.getLevel()>20){
                if(randomBall==3 && randomBall==4){
                handler.addObject(new AcidPuddle(ChewingGumSimulator.WIDTH+300,(int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.HEIGHT),200,ChewingGumSimulator.HEIGHT-100),ID.AcidPuddle,handler));}
                
                else{
                handler.addObject(new AcidPuddle(0,(int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.HEIGHT),200,ChewingGumSimulator.HEIGHT-100),ID.AcidPuddleBack,handler));}
        handler.addObject(new HiggsBoson((int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.WIDTH),20,ChewingGumSimulator.WIDTH-10),(int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.HEIGHT),120,ChewingGumSimulator.HEIGHT),ID.HiggsBoson,handler));
        handler.addObject(new TCell((int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.WIDTH),20,ChewingGumSimulator.WIDTH-10),(int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.HEIGHT),120,ChewingGumSimulator.HEIGHT),ID.TCell,handler));
            }
            
            if(hud.getLevel()<40 && hud.getLevel()>30){
                if(randomBall==3 && randomBall==4){
                handler.addObject(new GreaseBall(ChewingGumSimulator.WIDTH+300,(int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.HEIGHT),200,ChewingGumSimulator.HEIGHT-100),ID.GreaseBall,handler));
                handler.addObject(new BloodCloth(ChewingGumSimulator.WIDTH+300,(int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.HEIGHT),200,ChewingGumSimulator.HEIGHT-100),ID.BloodCloth,handler));
                handler.addObject(new AcidPuddle(ChewingGumSimulator.WIDTH+300,(int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.HEIGHT),200,ChewingGumSimulator.HEIGHT-100),ID.AcidPuddle,handler));}
                
                else{
                handler.addObject(new GreaseBall(0,(int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.HEIGHT),200,ChewingGumSimulator.HEIGHT-100),ID.GreaseBallBack,handler));
                handler.addObject(new BloodCloth(0,(int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.HEIGHT),200,ChewingGumSimulator.HEIGHT-100),ID.BloodClothBack,handler));
                handler.addObject(new AcidPuddle(0,(int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.HEIGHT),200,ChewingGumSimulator.HEIGHT-100),ID.AcidPuddleBack,handler));}
        handler.addObject(new HiggsBoson((int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.WIDTH),20,ChewingGumSimulator.WIDTH-10),(int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.HEIGHT),120,ChewingGumSimulator.HEIGHT),ID.HiggsBoson,handler));
        handler.addObject(new TCell((int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.WIDTH),20,ChewingGumSimulator.WIDTH-10),(int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.HEIGHT),120,ChewingGumSimulator.HEIGHT),ID.TCell,handler));
        handler.addObject(new FastEnemy((int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.WIDTH),20,ChewingGumSimulator.WIDTH-10),(int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.HEIGHT),120,ChewingGumSimulator.HEIGHT),ID.FastEnemy,handler));
        handler.addObject(new SmartEnemy((int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.WIDTH),20,ChewingGumSimulator.WIDTH-10),(int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.HEIGHT),120,ChewingGumSimulator.HEIGHT),ID.SmartEnemy,handler));  
            
            
            }
            
            
            if(hud.getLevel()<50 && hud.getLevel()>40){
                if(randomBall==3 && randomBall==4){
                handler.addObject(new GreaseBall(ChewingGumSimulator.WIDTH+300,(int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.HEIGHT),200,ChewingGumSimulator.HEIGHT-100),ID.GreaseBall,handler));
                handler.addObject(new BloodCloth(ChewingGumSimulator.WIDTH+300,(int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.HEIGHT),200,ChewingGumSimulator.HEIGHT-100),ID.BloodCloth,handler));
                handler.addObject(new AcidPuddle(ChewingGumSimulator.WIDTH+300,(int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.HEIGHT),200,ChewingGumSimulator.HEIGHT-100),ID.AcidPuddle,handler));}
                
                else{
                handler.addObject(new GreaseBall(0,(int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.HEIGHT),200,ChewingGumSimulator.HEIGHT-100),ID.GreaseBallBack,handler));
                handler.addObject(new BloodCloth(0,(int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.HEIGHT),200,ChewingGumSimulator.HEIGHT-100),ID.BloodClothBack,handler));
                handler.addObject(new AcidPuddle(0,(int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.HEIGHT),200,ChewingGumSimulator.HEIGHT-100),ID.AcidPuddleBack,handler));}
        handler.addObject(new HiggsBoson((int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.WIDTH),20,ChewingGumSimulator.WIDTH-10),(int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.HEIGHT),120,ChewingGumSimulator.HEIGHT),ID.HiggsBoson,handler));
        handler.addObject(new TCell((int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.WIDTH),20,ChewingGumSimulator.WIDTH-10),(int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.HEIGHT),120,ChewingGumSimulator.HEIGHT),ID.TCell,handler));
        handler.addObject(new Neutrino((int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.WIDTH),20,ChewingGumSimulator.WIDTH-10),(int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.HEIGHT),120,ChewingGumSimulator.HEIGHT),ID.Neutrino,handler));
        handler.addObject(new BCell((int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.WIDTH),20,ChewingGumSimulator.WIDTH-10),(int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.HEIGHT),120,ChewingGumSimulator.HEIGHT),ID.BCell,handler));
        handler.addObject(new FastEnemy((int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.WIDTH),20,ChewingGumSimulator.WIDTH-10),(int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.HEIGHT),120,ChewingGumSimulator.HEIGHT),ID.FastEnemy,handler));
        handler.addObject(new SmartEnemy((int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.WIDTH),20,ChewingGumSimulator.WIDTH-10),(int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.HEIGHT),120,ChewingGumSimulator.HEIGHT),ID.SmartEnemy,handler));    
            
            
            }
            
            
            
        }
        
        if(scoreKeep==1 && playerSpawned==false)
        {
            
            handler.addObject(new Player(WIDTH/2 -32, HEIGHT/2-32, ID.Player,handler));
            playerSpawned=true;
            
            
        }
        if(hud.getScore()%5000==0 && hud.getScore()/5000 > 0)
        {
            
            handler.addObject(new HealthBox((int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.WIDTH),20,ChewingGumSimulator.WIDTH-50),(int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.HEIGHT),120,ChewingGumSimulator.HEIGHT-50), ID.HealthBox,handler));
            handler.addObject(new SpeedBooster((int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.WIDTH),20,ChewingGumSimulator.WIDTH-50),(int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.HEIGHT),120,ChewingGumSimulator.HEIGHT-50), ID.SpeedBooster,handler));
            
            if(Game.bladderActive==true){
            handler.addObject(new SodaBox((int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.WIDTH),20,ChewingGumSimulator.WIDTH-50),(int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.HEIGHT),120,ChewingGumSimulator.HEIGHT-50),ID.SodaBox,handler));
            }
        
        
        }
        
        if(hud.getScore()%7000==0 && hud.getScore()/7000 > 0)
        {
            
            handler.addObject(new AtomDisengage((int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.WIDTH),80,ChewingGumSimulator.WIDTH-80),(int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.HEIGHT),80,ChewingGumSimulator.HEIGHT-80), ID.AtomDisengage,handler));
            
        }
        
        if(hud.getScore()%2500==0 && hud.getScore()/2500 > 0)
        {
            handler.addObject(new WhiteCell((int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.WIDTH),20,ChewingGumSimulator.WIDTH-10),(int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.HEIGHT),120,ChewingGumSimulator.HEIGHT),ID.WhiteCell,handler));
            handler.addObject(new EMPBox((int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.WIDTH),20,ChewingGumSimulator.WIDTH-50),(int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.HEIGHT),120,ChewingGumSimulator.HEIGHT-50), ID.EMPBox,handler));
            handler.addObject(new ShieldPower((int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.WIDTH),20,ChewingGumSimulator.WIDTH-50),(int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.HEIGHT),120,ChewingGumSimulator.HEIGHT-50),ID.ShieldPower,handler));
            handler.addObject(new AmmoBox((int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.WIDTH),20,ChewingGumSimulator.WIDTH-50),(int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.HEIGHT),120,ChewingGumSimulator.HEIGHT-50), ID.AmmoBox,handler));
            handler.addObject(new LightningBox((int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.WIDTH),20,ChewingGumSimulator.WIDTH-50),(int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.HEIGHT),120,ChewingGumSimulator.HEIGHT-50), ID.LightningBox,handler));
        }
        /*if(scoreKeep / 100 == 1)
        {
            handler.addObject(new FastEnemy(r.nextInt(ChewingGumSimulator.WIDTH),r.nextInt(ChewingGumSimulator.HEIGHT),ID.FastEnemy,handler));
            handler.addObject(new SmartEnemy(r.nextInt(ChewingGumSimulator.WIDTH),r.nextInt(ChewingGumSimulator.HEIGHT),ID.SmartEnemy,handler));
        }*/
        if(scoreKeep % 1000 == 0)
        {   Game.SaveGame();
            if(hud.getLevel()<10){
            handler.addObject(new BasicEnemy((int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.WIDTH),40,ChewingGumSimulator.WIDTH-30),(int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.HEIGHT),120,ChewingGumSimulator.HEIGHT-50),ID.BasicEnemy,handler));
            }
            if(hud.getLevel()<20 && hud.getLevel > 10){
            handler.addObject(new BasicEnemy((int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.WIDTH),40,ChewingGumSimulator.WIDTH-30),(int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.HEIGHT),120,ChewingGumSimulator.HEIGHT-50),ID.BasicEnemy,handler));
            //handler.addObject(new BasicEnemy(r.nextInt(ChewingGumSimulator.WIDTH),(int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.HEIGHT),80,ChewingGumSimulator.HEIGHT),ID.BasicEnemy,handler));
            handler.addObject(new WhiteCell((int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.WIDTH),40,ChewingGumSimulator.WIDTH-30),(int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.HEIGHT),120,ChewingGumSimulator.HEIGHT-50),ID.WhiteCell,handler));
            }
            
            if(hud.getLevel()<30 && hud.getLevel > 20){
            handler.addObject(new BasicEnemy((int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.WIDTH),20,ChewingGumSimulator.WIDTH-10),(int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.HEIGHT),120,ChewingGumSimulator.HEIGHT),ID.BasicEnemy,handler));
            handler.addObject(new BasicEnemy((int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.WIDTH),40,ChewingGumSimulator.WIDTH-30),(int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.HEIGHT),120,ChewingGumSimulator.HEIGHT-50),ID.BasicEnemy,handler));
            handler.addObject(new WhiteCell((int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.WIDTH),20,ChewingGumSimulator.WIDTH-10),(int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.HEIGHT),120,ChewingGumSimulator.HEIGHT),ID.WhiteCell,handler));
            }
            
            if(hud.getLevel()<40 && hud.getLevel > 30){
            handler.addObject(new BasicEnemy((int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.WIDTH),20,ChewingGumSimulator.WIDTH-10),(int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.HEIGHT),120,ChewingGumSimulator.HEIGHT),ID.BasicEnemy,handler));
            handler.addObject(new BasicEnemy((int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.WIDTH),40,ChewingGumSimulator.WIDTH-30),(int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.HEIGHT),120,ChewingGumSimulator.HEIGHT-50),ID.BasicEnemy,handler));
            handler.addObject(new WhiteCell((int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.WIDTH),20,ChewingGumSimulator.WIDTH-10),(int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.HEIGHT),120,ChewingGumSimulator.HEIGHT),ID.WhiteCell,handler));
            handler.addObject(new WhiteCell((int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.WIDTH),20,ChewingGumSimulator.WIDTH-10),(int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.HEIGHT),120,ChewingGumSimulator.HEIGHT),ID.WhiteCell,handler));
            }
            
            
            if(hud.getLevel()<50 && hud.getLevel > 40){
            handler.addObject(new BasicEnemy((int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.WIDTH),20,ChewingGumSimulator.WIDTH-10),(int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.HEIGHT),120,ChewingGumSimulator.HEIGHT),ID.BasicEnemy,handler));
            handler.addObject(new BasicEnemy((int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.WIDTH),40,ChewingGumSimulator.WIDTH-30),(int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.HEIGHT),120,ChewingGumSimulator.HEIGHT-50),ID.BasicEnemy,handler));
            handler.addObject(new WhiteCell((int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.WIDTH),20,ChewingGumSimulator.WIDTH-10),(int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.HEIGHT),120,ChewingGumSimulator.HEIGHT),ID.WhiteCell,handler));
            handler.addObject(new WhiteCell((int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.WIDTH),20,ChewingGumSimulator.WIDTH-10),(int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.HEIGHT),120,ChewingGumSimulator.HEIGHT),ID.WhiteCell,handler));
            handler.addObject(new WhiteCell((int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.WIDTH),20,ChewingGumSimulator.WIDTH-10),(int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.HEIGHT),120,ChewingGumSimulator.HEIGHT),ID.WhiteCell,handler));
            }
        
        }
        
        
        if((hud.getLevel() ==10.0 && scoreKeep==1)||(hud.getLevel() == 30.0 && scoreKeep==1)||(hud.getLevel() == 40.0 && scoreKeep==1)||(hud.getLevel() == 50.0 && scoreKeep==1)){
            
            handler.clearEnemies();
            handler.addObject(new Player(WIDTH/2-32, HEIGHT/2-32, ID.Player,handler));
            handler.addObject(new BossOne((ChewingGumSimulator.WIDTH / 2)-48,0,ID.BossOne,handler));
            
        }
        if(hud.getLevel() == 20.0 && scoreKeep==1){
            
            handler.clearEnemies();
            handler.addObject(new Player(WIDTH/2-32, HEIGHT/2-32, ID.Player,handler));
            handler.addObject(new BossTwo((ChewingGumSimulator.WIDTH / 2)-48,0,ID.BossTwo,handler));
        }
        if(hud.getLevel() == 30.0 && scoreKeep==1){
            
            handler.clearEnemies();
            handler.addObject(new Player(WIDTH/2-32, HEIGHT/2-32, ID.Player,handler));
                handler.addObject(new BossThree((ChewingGumSimulator.WIDTH / 2)-48,0,ID.BossThree,handler));
        }
        
        if(hud.getLevel() == 40.0 && scoreKeep==1){
            
            handler.clearEnemies();
            handler.addObject(new Player(WIDTH/2-32, HEIGHT/2-32, ID.Player,handler));
            handler.addObject(new BossFour((ChewingGumSimulator.WIDTH / 2)-48,0,ID.BossFour,handler));
        }
        
        if(hud.getLevel() == 50.0 && scoreKeep==1){
            
            handler.clearEnemies();
            handler.addObject(new Player(WIDTH/2-32, HEIGHT/2-32, ID.Player,handler));
            handler.addObject(new BossFive((ChewingGumSimulator.WIDTH / 2)-48,0,ID.BossFive,handler));
        }
        
        if(hud.getLevel() == 60.0 && scoreKeep==1){
            
            handler.clearEnemies();
            handler.addObject(new Player(WIDTH/2-32, HEIGHT/2-32, ID.Player,handler));
            handler.addObject(new BossSix((ChewingGumSimulator.WIDTH / 2)-48,0,ID.BossSix,handler));
        }
        
        if(hud.getLevel() == 70.0 && scoreKeep==1){
            
            handler.clearEnemies();
            handler.addObject(new Player(WIDTH/2-32, HEIGHT/2-32, ID.Player,handler));
            handler.addObject(new BossSeven((ChewingGumSimulator.WIDTH / 2)-48,0,ID.BossSeven,handler));
        }
        
        if(hud.getLevel() == 80.0 && scoreKeep==1){
            
            handler.clearEnemies();
            handler.addObject(new Player(WIDTH/2-32, HEIGHT/2-32, ID.Player,handler));
            handler.addObject(new BossEight((ChewingGumSimulator.WIDTH / 2)-48,0,ID.BossEight,handler));
        }
        
        if(hud.getLevel() == 90.0 && scoreKeep==1){
            
            handler.clearEnemies();
            handler.addObject(new Player(WIDTH/2-32, HEIGHT/2-32, ID.Player,handler));
            handler.addObject(new BossNine((ChewingGumSimulator.WIDTH / 2)-48,0,ID.BossNine,handler));
        }
        
        if(hud.getLevel() == 100.0 && scoreKeep==1){
            
            handler.clearEnemies();
            handler.addObject(new Player(WIDTH/2-32, HEIGHT/2-32, ID.Player,handler));
            handler.addObject(new BossTen((ChewingGumSimulator.WIDTH / 2)-48,0,ID.BossTen,handler));
        }
        
        
        
    }
        
      else if(Game.gameState == ChewingGumSimulator.STATE.AdventureOne){
       
       if(Advstarted==true){
        
         
       handler.clearEnemies();
       handler.addObject(new Player(WIDTH/2, HEIGHT/2, ID.Player,handler));
       }
       Advstarted=false;
       
       }
    
        
        
        
        
    else if(Game.gameState == ChewingGumSimulator.STATE.Arena){
       
       arenaSpawn++;
       if(arenaSpawn==1){ 
         
       
       handler.addObject(new Player(WIDTH/3, HEIGHT/2, ID.Player,handler));
       handler.addObject(new Player(WIDTH/3*2, HEIGHT/2, ID.Player2,handler));
       handler.addObject(new ArenaTrophy(WIDTH-64, HEIGHT/2, ID.ArenaTrophy2,handler));
       handler.addObject(new ArenaTrophy(32, HEIGHT/2, ID.ArenaTrophy,handler));
       handler.addObject(new VerticalWall(64, HEIGHT/4, ID.VerticalWall,handler));
       handler.addObject(new VerticalWall(64, HEIGHT/4*3 -50, ID.VerticalWall,handler));
       handler.addObject(new VerticalWall(WIDTH-94, HEIGHT/4, ID.VerticalWall,handler));
       handler.addObject(new VerticalWall(WIDTH-94, HEIGHT/4*3 -50, ID.VerticalWall,handler));
       
       handler.addObject(new VerticalWall(98, HEIGHT/4+40, ID.VerticalWall,handler));
       handler.addObject(new VerticalWall(98, HEIGHT/4+90, ID.VerticalWall,handler));
       handler.addObject(new VerticalWall(98, HEIGHT/4+140, ID.VerticalWall,handler));
       
       handler.addObject(new RadioactiveVerticalWall(128, HEIGHT/4+40, ID.RadioactiveVerticalWall,handler));
       handler.addObject(new RadioactiveVerticalWall(128, HEIGHT/4+90, ID.RadioactiveVerticalWall,handler));
       handler.addObject(new RadioactiveVerticalWall(128, HEIGHT/4+140, ID.RadioactiveVerticalWall,handler));
       
       handler.addObject(new VerticalWall(WIDTH-128, HEIGHT/4+40, ID.VerticalWall,handler));
       handler.addObject(new VerticalWall(WIDTH-128, HEIGHT/4+90, ID.VerticalWall,handler));
       handler.addObject(new VerticalWall(WIDTH-128, HEIGHT/4+140, ID.VerticalWall,handler));
       
       handler.addObject(new RadioactiveVerticalWall(WIDTH-158, HEIGHT/4+40, ID.RadioactiveVerticalWall,handler));
       handler.addObject(new RadioactiveVerticalWall(WIDTH-158, HEIGHT/4+90, ID.RadioactiveVerticalWall,handler));
       handler.addObject(new RadioactiveVerticalWall(WIDTH-158, HEIGHT/4+140, ID.RadioactiveVerticalWall,handler));
       
       handler.addObject(new HorizontalWall(20, HEIGHT/4, ID.HorizontalWall,handler));
       handler.addObject(new HorizontalWall(20, HEIGHT/4*3-10, ID.HorizontalWall,handler));
       handler.addObject(new HorizontalWall(WIDTH-94, HEIGHT/4, ID.HorizontalWall,handler));
       handler.addObject(new HorizontalWall(WIDTH-94, HEIGHT/4*3-10, ID.HorizontalWall,handler));
       
       handler.addObject(new DangerousBush(150,100, ID.BlueberryBush,handler));
       handler.addObject(new DangerousBush(150,ChewingGumSimulator.HEIGHT-150, ID.BlueberryBush,handler));
       
       handler.addObject(new DangerousBush(ChewingGumSimulator.WIDTH-230,100, ID.RedberryBush,handler));
       handler.addObject(new DangerousBush(ChewingGumSimulator.WIDTH-230,ChewingGumSimulator.HEIGHT-150, ID.RedberryBush,handler));
       
       handler.addObject(new RainCloud((ChewingGumSimulator.WIDTH / 2)-48,0,ID.RainCloud,handler));
       handler.addObject(new RainCloud((ChewingGumSimulator.WIDTH / 3)-48,0,ID.RainCloud,handler));
       handler.addObject(new ThunderCloud((ChewingGumSimulator.WIDTH / 3 * 2)-48,0,ID.ThunderCloud,handler));
       }
       
       
       
       
       
        
}
    
    else if(Game.gameState == ChewingGumSimulator.STATE.ArenaTwo){
       
       arenaSpawn++;
       if(arenaSpawn==1){ 
         
       
       handler.addObject(new Player(WIDTH/3, HEIGHT/2, ID.Player,handler));
       handler.addObject(new Player(WIDTH/3*2, HEIGHT/2, ID.Player2,handler));
       handler.addObject(new ArenaTrophy(WIDTH-64, HEIGHT/2, ID.ArenaTrophy2,handler));
       handler.addObject(new ArenaTrophy(32, HEIGHT/2, ID.ArenaTrophy,handler));
       
       handler.addObject(new RadioactiveVerticalWall(64, HEIGHT/4, ID.RadioactiveVerticalWall,handler));
       handler.addObject(new RadioactiveVerticalWall(64, HEIGHT/4*3 -50, ID.RadioactiveVerticalWall,handler));
       handler.addObject(new RadioactiveVerticalWall(WIDTH-94, HEIGHT/4, ID.RadioactiveVerticalWall,handler));
       handler.addObject(new RadioactiveVerticalWall(WIDTH-94, HEIGHT/4*3 -50, ID.RadioactiveVerticalWall,handler));
       
       handler.addObject(new RadioactiveVerticalWall(98, HEIGHT/4+40, ID.RadioactiveVerticalWall,handler));
       handler.addObject(new RadioactiveVerticalWall(98, HEIGHT/4+90, ID.RadioactiveVerticalWall,handler));
       handler.addObject(new RadioactiveVerticalWall(98, HEIGHT/4+140, ID.RadioactiveVerticalWall,handler));
       
       handler.addObject(new RadioactiveVerticalWall(128, HEIGHT/4+40, ID.RadioactiveVerticalWall,handler));
       handler.addObject(new RadioactiveVerticalWall(128, HEIGHT/4+90, ID.RadioactiveVerticalWall,handler));
       handler.addObject(new RadioactiveVerticalWall(128, HEIGHT/4+140, ID.RadioactiveVerticalWall,handler));
       
       handler.addObject(new RadioactiveVerticalWall(WIDTH-128, HEIGHT/4+40, ID.RadioactiveVerticalWall,handler));
       handler.addObject(new RadioactiveVerticalWall(WIDTH-128, HEIGHT/4+90, ID.RadioactiveVerticalWall,handler));
       handler.addObject(new RadioactiveVerticalWall(WIDTH-128, HEIGHT/4+140, ID.RadioactiveVerticalWall,handler));
       
       handler.addObject(new RadioactiveVerticalWall(WIDTH-158, HEIGHT/4+40, ID.RadioactiveVerticalWall,handler));
       handler.addObject(new RadioactiveVerticalWall(WIDTH-158, HEIGHT/4+90, ID.RadioactiveVerticalWall,handler));
       handler.addObject(new RadioactiveVerticalWall(WIDTH-158, HEIGHT/4+140, ID.RadioactiveVerticalWall,handler));
       
       handler.addObject(new RadioactiveHorizontalWall(20, HEIGHT/4, ID.RadioactiveHorizontalWall,handler));
       handler.addObject(new RadioactiveHorizontalWall(20, HEIGHT/4*3-10, ID.RadioactiveHorizontalWall,handler));
       handler.addObject(new RadioactiveHorizontalWall(WIDTH-94, HEIGHT/4, ID.RadioactiveHorizontalWall,handler));
       handler.addObject(new RadioactiveHorizontalWall(WIDTH-94, HEIGHT/4*3-10, ID.RadioactiveHorizontalWall,handler));
       
       handler.addObject(new SnowCloud((ChewingGumSimulator.WIDTH / 2)-48,0,ID.SnowCloud,handler));
       handler.addObject(new SnowCloud((ChewingGumSimulator.WIDTH / 3)-48,0,ID.SnowCloud,handler));
       
       handler.addObject(new DangerousTree(150,100, ID.SnowTree ,handler));
       handler.addObject(new DangerousTree(150,ChewingGumSimulator.HEIGHT-150, ID.SnowTree,handler));
       
       handler.addObject(new DangerousTree(ChewingGumSimulator.WIDTH-230,100, ID.SnowTree,handler));
       handler.addObject(new DangerousTree(ChewingGumSimulator.WIDTH-230,ChewingGumSimulator.HEIGHT-150, ID.SnowTree,handler));
       
       
       }}
    
    
    else if(Game.gameState == ChewingGumSimulator.STATE.ArenaThree){
       
       arenaSpawn++;
       if(arenaSpawn==1){ 
         
       
       handler.addObject(new Player(WIDTH/3, HEIGHT/2, ID.Player,handler));
       handler.addObject(new Player(WIDTH/3*2, HEIGHT/2, ID.Player2,handler));
       handler.addObject(new ArenaTrophy(WIDTH-64, HEIGHT/2, ID.ArenaTrophy2,handler));
       handler.addObject(new ArenaTrophy(32, HEIGHT/2, ID.ArenaTrophy,handler));
       
       handler.addObject(new RadioactiveVerticalWall(64, HEIGHT/4, ID.RadioactiveVerticalWall,handler));
       handler.addObject(new RadioactiveVerticalWall(64, HEIGHT/4*3 -50, ID.RadioactiveVerticalWall,handler));
       handler.addObject(new RadioactiveVerticalWall(WIDTH-94, HEIGHT/4, ID.RadioactiveVerticalWall,handler));
       handler.addObject(new RadioactiveVerticalWall(WIDTH-94, HEIGHT/4*3 -50, ID.RadioactiveVerticalWall,handler));
       
       handler.addObject(new RadioactiveVerticalWall(98, HEIGHT/4+40, ID.RadioactiveVerticalWall,handler));
       handler.addObject(new RadioactiveVerticalWall(98, HEIGHT/4+90, ID.RadioactiveVerticalWall,handler));
       handler.addObject(new RadioactiveVerticalWall(98, HEIGHT/4+140, ID.RadioactiveVerticalWall,handler));
       
       handler.addObject(new RadioactiveVerticalWall(128, HEIGHT/4+40, ID.RadioactiveVerticalWall,handler));
       handler.addObject(new RadioactiveVerticalWall(128, HEIGHT/4+90, ID.RadioactiveVerticalWall,handler));
       handler.addObject(new RadioactiveVerticalWall(128, HEIGHT/4+140, ID.RadioactiveVerticalWall,handler));
       
       handler.addObject(new RadioactiveVerticalWall(WIDTH-128, HEIGHT/4+40, ID.RadioactiveVerticalWall,handler));
       handler.addObject(new RadioactiveVerticalWall(WIDTH-128, HEIGHT/4+90, ID.RadioactiveVerticalWall,handler));
       handler.addObject(new RadioactiveVerticalWall(WIDTH-128, HEIGHT/4+140, ID.RadioactiveVerticalWall,handler));
       
       handler.addObject(new RadioactiveVerticalWall(WIDTH-158, HEIGHT/4+40, ID.RadioactiveVerticalWall,handler));
       handler.addObject(new RadioactiveVerticalWall(WIDTH-158, HEIGHT/4+90, ID.RadioactiveVerticalWall,handler));
       handler.addObject(new RadioactiveVerticalWall(WIDTH-158, HEIGHT/4+140, ID.RadioactiveVerticalWall,handler));
       
       handler.addObject(new RadioactiveHorizontalWall(20, HEIGHT/4, ID.RadioactiveHorizontalWall,handler));
       handler.addObject(new RadioactiveHorizontalWall(20, HEIGHT/4*3-10, ID.RadioactiveHorizontalWall,handler));
       handler.addObject(new RadioactiveHorizontalWall(WIDTH-94, HEIGHT/4, ID.RadioactiveHorizontalWall,handler));
       handler.addObject(new RadioactiveHorizontalWall(WIDTH-94, HEIGHT/4*3-10, ID.RadioactiveHorizontalWall,handler));
       
       handler.addObject(new FalloutCloud((ChewingGumSimulator.WIDTH / 2)-48,0,ID.FalloutCloud,handler));
       handler.addObject(new FalloutCloud((ChewingGumSimulator.WIDTH / 3)-48,0,ID.FalloutCloud,handler));
       
       handler.addObject(new DangerousCactus(150,100, ID.DangerousCactus ,handler));
       handler.addObject(new DangerousCactus(150,ChewingGumSimulator.HEIGHT-150, ID.DangerousCactus,handler));
       
       handler.addObject(new DangerousCactus(ChewingGumSimulator.WIDTH-230,100, ID.DangerousCactus,handler));
       handler.addObject(new DangerousCactus(ChewingGumSimulator.WIDTH-230,ChewingGumSimulator.HEIGHT-150, ID.DangerousCactus,handler));
       
       
       }}
    
    
    
    else if(Game.gameState == ChewingGumSimulator.STATE.ArenaFour){
       
       arenaSpawn++;
       if(arenaSpawn==1){ 
         
       
       handler.addObject(new Player(WIDTH/3, HEIGHT/2, ID.Player,handler));
       handler.addObject(new Player(WIDTH/3*2, HEIGHT/2, ID.Player2,handler));
       handler.addObject(new ArenaTrophy(WIDTH-64, HEIGHT/2, ID.ArenaTrophy2,handler));
       handler.addObject(new ArenaTrophy(32, HEIGHT/2, ID.ArenaTrophy,handler));
       handler.addObject(new VerticalWall(64, HEIGHT/4, ID.VerticalWall,handler));
       handler.addObject(new VerticalWall(64, HEIGHT/4*3 -50, ID.VerticalWall,handler));
       handler.addObject(new VerticalWall(WIDTH-94, HEIGHT/4, ID.VerticalWall,handler));
       handler.addObject(new VerticalWall(WIDTH-94, HEIGHT/4*3 -50, ID.VerticalWall,handler));
       
       handler.addObject(new VerticalWall(98, HEIGHT/4+40, ID.VerticalWall,handler));
       handler.addObject(new VerticalWall(98, HEIGHT/4+90, ID.VerticalWall,handler));
       handler.addObject(new VerticalWall(98, HEIGHT/4+140, ID.VerticalWall,handler));
       
       handler.addObject(new RadioactiveVerticalWall(128, HEIGHT/4+40, ID.RadioactiveVerticalWall,handler));
       handler.addObject(new RadioactiveVerticalWall(128, HEIGHT/4+90, ID.RadioactiveVerticalWall,handler));
       handler.addObject(new RadioactiveVerticalWall(128, HEIGHT/4+140, ID.RadioactiveVerticalWall,handler));
       
       handler.addObject(new VerticalWall(WIDTH-128, HEIGHT/4+40, ID.VerticalWall,handler));
       handler.addObject(new VerticalWall(WIDTH-128, HEIGHT/4+90, ID.VerticalWall,handler));
       handler.addObject(new VerticalWall(WIDTH-128, HEIGHT/4+140, ID.VerticalWall,handler));
       
       handler.addObject(new RadioactiveVerticalWall(WIDTH-158, HEIGHT/4+40, ID.RadioactiveVerticalWall,handler));
       handler.addObject(new RadioactiveVerticalWall(WIDTH-158, HEIGHT/4+90, ID.RadioactiveVerticalWall,handler));
       handler.addObject(new RadioactiveVerticalWall(WIDTH-158, HEIGHT/4+140, ID.RadioactiveVerticalWall,handler));
       
       handler.addObject(new HorizontalWall(20, HEIGHT/4, ID.HorizontalWall,handler));
       handler.addObject(new HorizontalWall(20, HEIGHT/4*3-10, ID.HorizontalWall,handler));
       handler.addObject(new HorizontalWall(WIDTH-94, HEIGHT/4, ID.HorizontalWall,handler));
       handler.addObject(new HorizontalWall(WIDTH-94, HEIGHT/4*3-10, ID.HorizontalWall,handler));
       
       handler.addObject(new DangerousTree(150,100, ID.AutumnTree ,handler));
       handler.addObject(new DangerousTree(150,ChewingGumSimulator.HEIGHT-150, ID.AutumnTree,handler));
       
       handler.addObject(new DangerousTree(ChewingGumSimulator.WIDTH-230,100, ID.AutumnTree,handler));
       handler.addObject(new DangerousTree(ChewingGumSimulator.WIDTH-230,ChewingGumSimulator.HEIGHT-150, ID.AutumnTree,handler));
       
       handler.addObject(new DangerousBush(ChewingGumSimulator.WIDTH/2-50,100, ID.BlackberryBush,handler));
       handler.addObject(new DangerousBush(ChewingGumSimulator.WIDTH/2-50,ChewingGumSimulator.HEIGHT-150, ID.BlueberryBush,handler));
       
       handler.addObject(new DangerousTree(ChewingGumSimulator.WIDTH-125,100, ID.AutumnTree,handler));
       handler.addObject(new DangerousTree(ChewingGumSimulator.WIDTH-125,ChewingGumSimulator.HEIGHT-150, ID.AutumnTree,handler));
       
       handler.addObject(new DangerousTree(75,100, ID.AutumnTree ,handler));
       handler.addObject(new DangerousTree(75,ChewingGumSimulator.HEIGHT-150, ID.AutumnTree,handler));
       
       handler.addObject(new DangerousBush(ChewingGumSimulator.WIDTH/2-120,100, ID.BlackberryBush,handler));
       handler.addObject(new DangerousBush(ChewingGumSimulator.WIDTH/2-120,ChewingGumSimulator.HEIGHT-150, ID.BlueberryBush,handler));
       
       handler.addObject(new DangerousBush(ChewingGumSimulator.WIDTH/2+20,100, ID.BlackberryBush,handler));
       handler.addObject(new DangerousBush(ChewingGumSimulator.WIDTH/2+20,ChewingGumSimulator.HEIGHT-150, ID.BlueberryBush,handler));
       
       
       handler.addObject(new RainCloud((ChewingGumSimulator.WIDTH / 2)-48,0,ID.RainCloud,handler));
       handler.addObject(new RainCloud((ChewingGumSimulator.WIDTH / 3)-48,0,ID.RainCloud,handler));
       handler.addObject(new ThunderCloud((ChewingGumSimulator.WIDTH / 3 * 2)-48,0,ID.ThunderCloud,handler));
       
       }
       
       
       
       
       
        
}
    
    
    else if(Game.gameState == ChewingGumSimulator.STATE.ArenaFive){
       
       arenaSpawn++;
       if(arenaSpawn==1){ 
         
       
       handler.addObject(new Player(WIDTH/3, HEIGHT/2, ID.Player,handler));
       handler.addObject(new Player(WIDTH/3*2, HEIGHT/2, ID.Player2,handler));
       handler.addObject(new ArenaTrophy(WIDTH-64, HEIGHT/2, ID.ArenaTrophy2,handler));
       handler.addObject(new ArenaTrophy(32, HEIGHT/2, ID.ArenaTrophy,handler));
       
       handler.addObject(new RadioactiveVerticalWall(64, HEIGHT/4, ID.RadioactiveVerticalWall,handler));
       handler.addObject(new RadioactiveVerticalWall(64, HEIGHT/4*3 -50, ID.RadioactiveVerticalWall,handler));
       handler.addObject(new RadioactiveVerticalWall(WIDTH-94, HEIGHT/4, ID.RadioactiveVerticalWall,handler));
       handler.addObject(new RadioactiveVerticalWall(WIDTH-94, HEIGHT/4*3 -50, ID.RadioactiveVerticalWall,handler));
       
       handler.addObject(new RadioactiveVerticalWall(98, HEIGHT/4+40, ID.RadioactiveVerticalWall,handler));
       handler.addObject(new RadioactiveVerticalWall(98, HEIGHT/4+90, ID.RadioactiveVerticalWall,handler));
       handler.addObject(new RadioactiveVerticalWall(98, HEIGHT/4+140, ID.RadioactiveVerticalWall,handler));
       
       handler.addObject(new RadioactiveVerticalWall(128, HEIGHT/4+40, ID.RadioactiveVerticalWall,handler));
       handler.addObject(new RadioactiveVerticalWall(128, HEIGHT/4+90, ID.RadioactiveVerticalWall,handler));
       handler.addObject(new RadioactiveVerticalWall(128, HEIGHT/4+140, ID.RadioactiveVerticalWall,handler));
       
       handler.addObject(new RadioactiveVerticalWall(WIDTH-128, HEIGHT/4+40, ID.RadioactiveVerticalWall,handler));
       handler.addObject(new RadioactiveVerticalWall(WIDTH-128, HEIGHT/4+90, ID.RadioactiveVerticalWall,handler));
       handler.addObject(new RadioactiveVerticalWall(WIDTH-128, HEIGHT/4+140, ID.RadioactiveVerticalWall,handler));
       
       handler.addObject(new RadioactiveVerticalWall(WIDTH-158, HEIGHT/4+40, ID.RadioactiveVerticalWall,handler));
       handler.addObject(new RadioactiveVerticalWall(WIDTH-158, HEIGHT/4+90, ID.RadioactiveVerticalWall,handler));
       handler.addObject(new RadioactiveVerticalWall(WIDTH-158, HEIGHT/4+140, ID.RadioactiveVerticalWall,handler));
       
       handler.addObject(new RadioactiveHorizontalWall(20, HEIGHT/4, ID.RadioactiveHorizontalWall,handler));
       handler.addObject(new RadioactiveHorizontalWall(20, HEIGHT/4*3-10, ID.RadioactiveHorizontalWall,handler));
       handler.addObject(new RadioactiveHorizontalWall(WIDTH-94, HEIGHT/4, ID.RadioactiveHorizontalWall,handler));
       handler.addObject(new RadioactiveHorizontalWall(WIDTH-94, HEIGHT/4*3-10, ID.RadioactiveHorizontalWall,handler));
       
       handler.addObject(new VerticalWall(160, 100, ID.VerticalWall,handler));
       handler.addObject(new VerticalWall(160, HEIGHT-160, ID.VerticalWall,handler));
       handler.addObject(new SoftCoin(100, 100, ID.SoftCoin,handler));
       
       handler.addObject(new VerticalWall(WIDTH-185, 100, ID.VerticalWall,handler));
       handler.addObject(new VerticalWall(WIDTH-185, HEIGHT-160, ID.VerticalWall,handler));
       handler.addObject(new SoftCoin(WIDTH-160, 100, ID.SoftCoin,handler));
       
       handler.addObject(new VerticalWall(70, HEIGHT-100, ID.VerticalWall,handler));
       handler.addObject(new VerticalWall(WIDTH-90, HEIGHT-100, ID.VerticalWall,handler));
       
       handler.addObject(new HorizontalWall(160, HEIGHT-110, ID.HorizontalWall,handler));
       handler.addObject(new HorizontalWall(WIDTH-225, HEIGHT-110, ID.HorizontalWall,handler));
       
       handler.addObject(new HorizontalWall(210, HEIGHT-110, ID.HorizontalWall,handler));
       handler.addObject(new HorizontalWall(WIDTH-275, HEIGHT-110, ID.HorizontalWall,handler));
       
       handler.addObject(new RainCloud((ChewingGumSimulator.WIDTH / 2)-48,0,ID.RainCloud,handler));
       handler.addObject(new RainCloud((ChewingGumSimulator.WIDTH / 3)-48,0,ID.RainCloud,handler));
       
       
       
       }}
    
    
    
    else if(Game.gameState == ChewingGumSimulator.STATE.ArenaSix){
       
       arenaSpawn++;
       if(arenaSpawn==1){ 
         
       
       handler.addObject(new Player(WIDTH/3, HEIGHT/2, ID.Player,handler));
       handler.addObject(new Player(WIDTH/3*2, HEIGHT/2, ID.Player2,handler));
       handler.addObject(new ArenaTrophy(WIDTH-64, HEIGHT-80, ID.ArenaTrophy2,handler));
       handler.addObject(new ArenaTrophy(32, HEIGHT-80, ID.ArenaTrophy,handler));
       
       handler.addObject(new RadioactiveVerticalWall(64, HEIGHT/4, ID.RadioactiveVerticalWall,handler));
       handler.addObject(new RadioactiveVerticalWall(64, HEIGHT/4*3 -50, ID.RadioactiveVerticalWall,handler));
       handler.addObject(new RadioactiveVerticalWall(WIDTH-94, HEIGHT/4, ID.RadioactiveVerticalWall,handler));
       handler.addObject(new RadioactiveVerticalWall(WIDTH-94, HEIGHT/4*3 -50, ID.RadioactiveVerticalWall,handler));
       
       handler.addObject(new RadioactiveVerticalWall(98, HEIGHT/4+40, ID.RadioactiveVerticalWall,handler));
       handler.addObject(new RadioactiveVerticalWall(98, HEIGHT/4+90, ID.RadioactiveVerticalWall,handler));
       handler.addObject(new RadioactiveVerticalWall(98, HEIGHT/4+140, ID.RadioactiveVerticalWall,handler));
       
       handler.addObject(new RadioactiveVerticalWall(128, HEIGHT/4+40, ID.RadioactiveVerticalWall,handler));
       handler.addObject(new RadioactiveVerticalWall(128, HEIGHT/4+90, ID.RadioactiveVerticalWall,handler));
       handler.addObject(new RadioactiveVerticalWall(128, HEIGHT/4+140, ID.RadioactiveVerticalWall,handler));
       
       handler.addObject(new RadioactiveVerticalWall(WIDTH-128, HEIGHT/4+40, ID.RadioactiveVerticalWall,handler));
       handler.addObject(new RadioactiveVerticalWall(WIDTH-128, HEIGHT/4+90, ID.RadioactiveVerticalWall,handler));
       handler.addObject(new RadioactiveVerticalWall(WIDTH-128, HEIGHT/4+140, ID.RadioactiveVerticalWall,handler));
       
       handler.addObject(new RadioactiveVerticalWall(WIDTH-158, HEIGHT/4+40, ID.RadioactiveVerticalWall,handler));
       handler.addObject(new RadioactiveVerticalWall(WIDTH-158, HEIGHT/4+90, ID.RadioactiveVerticalWall,handler));
       handler.addObject(new RadioactiveVerticalWall(WIDTH-158, HEIGHT/4+140, ID.RadioactiveVerticalWall,handler));
       
       handler.addObject(new RadioactiveHorizontalWall(20, HEIGHT/4, ID.RadioactiveHorizontalWall,handler));
       handler.addObject(new RadioactiveHorizontalWall(20, HEIGHT/4*3-10, ID.RadioactiveHorizontalWall,handler));
       handler.addObject(new RadioactiveHorizontalWall(WIDTH-94, HEIGHT/4, ID.RadioactiveHorizontalWall,handler));
       handler.addObject(new RadioactiveHorizontalWall(WIDTH-94, HEIGHT/4*3-10, ID.RadioactiveHorizontalWall,handler));
       
       handler.addObject(new HorizontalWall(90, 130, ID.HorizontalWall,handler));
       handler.addObject(new HorizontalWall(WIDTH-160, 130, ID.HorizontalWall,handler));
       
       handler.addObject(new HorizontalWall(90, HEIGHT-150, ID.HorizontalWall,handler));
       handler.addObject(new HorizontalWall(140, HEIGHT-150, ID.HorizontalWall,handler));
       handler.addObject(new HorizontalWall(190, HEIGHT-150, ID.HorizontalWall,handler));
       handler.addObject(new HorizontalWall(240, HEIGHT-150, ID.HorizontalWall,handler));
       
       
       handler.addObject(new HorizontalWall(310, HEIGHT-150, ID.HorizontalWall,handler));
       handler.addObject(new HorizontalWall(360, HEIGHT-150, ID.HorizontalWall,handler));
       handler.addObject(new HorizontalWall(410, HEIGHT-150, ID.HorizontalWall,handler));
       handler.addObject(new HorizontalWall(460, HEIGHT-150, ID.HorizontalWall,handler));
       
       handler.addObject(new SnowCloud((ChewingGumSimulator.WIDTH / 2)-48,0,ID.SnowCloud,handler));
       handler.addObject(new SnowCloud((ChewingGumSimulator.WIDTH / 3)-48,0,ID.SnowCloud,handler));
       
       
       
       
       
       
       }}
    
    else if(Game.gameState == ChewingGumSimulator.STATE.ArenaSeven){
       
       arenaSpawn++;
       if(arenaSpawn==1){ 
         
       
       handler.addObject(new Player(WIDTH/3, HEIGHT/2, ID.Player,handler));
       handler.addObject(new Player(WIDTH/3*2, HEIGHT/2, ID.Player2,handler));
       handler.addObject(new ArenaTrophy(WIDTH-64, HEIGHT/2, ID.ArenaTrophy2,handler));
       handler.addObject(new ArenaTrophy(32, HEIGHT/2, ID.ArenaTrophy,handler));
       handler.addObject(new VerticalWall(64, HEIGHT/4, ID.VerticalWall,handler));
       handler.addObject(new VerticalWall(64, HEIGHT/4*3 -50, ID.VerticalWall,handler));
       handler.addObject(new VerticalWall(WIDTH-94, HEIGHT/4, ID.VerticalWall,handler));
       handler.addObject(new VerticalWall(WIDTH-94, HEIGHT/4*3 -50, ID.VerticalWall,handler));
       
       handler.addObject(new VerticalWall(98, HEIGHT/4+40, ID.VerticalWall,handler));
       handler.addObject(new VerticalWall(98, HEIGHT/4+90, ID.VerticalWall,handler));
       handler.addObject(new VerticalWall(98, HEIGHT/4+140, ID.VerticalWall,handler));
       
       handler.addObject(new RadioactiveVerticalWall(128, HEIGHT/4+40, ID.RadioactiveVerticalWall,handler));
       handler.addObject(new RadioactiveVerticalWall(128, HEIGHT/4+90, ID.RadioactiveVerticalWall,handler));
       handler.addObject(new RadioactiveVerticalWall(128, HEIGHT/4+140, ID.RadioactiveVerticalWall,handler));
       
       handler.addObject(new VerticalWall(WIDTH-128, HEIGHT/4+40, ID.VerticalWall,handler));
       handler.addObject(new VerticalWall(WIDTH-128, HEIGHT/4+90, ID.VerticalWall,handler));
       handler.addObject(new VerticalWall(WIDTH-128, HEIGHT/4+140, ID.VerticalWall,handler));
       
       handler.addObject(new RadioactiveVerticalWall(WIDTH-158, HEIGHT/4+40, ID.RadioactiveVerticalWall,handler));
       handler.addObject(new RadioactiveVerticalWall(WIDTH-158, HEIGHT/4+90, ID.RadioactiveVerticalWall,handler));
       handler.addObject(new RadioactiveVerticalWall(WIDTH-158, HEIGHT/4+140, ID.RadioactiveVerticalWall,handler));
       
       handler.addObject(new HorizontalWall(20, HEIGHT/4, ID.HorizontalWall,handler));
       handler.addObject(new HorizontalWall(20, HEIGHT/4*3-10, ID.HorizontalWall,handler));
       handler.addObject(new HorizontalWall(WIDTH-94, HEIGHT/4, ID.HorizontalWall,handler));
       handler.addObject(new HorizontalWall(WIDTH-94, HEIGHT/4*3-10, ID.HorizontalWall,handler));
       
       
       
       }
       
       
       
       
       
        
}
    
    
    else if(Game.gameState == ChewingGumSimulator.STATE.ArenaEight){
       
       arenaSpawn++;
       if(arenaSpawn==1){ 
         
       
       handler.addObject(new Player(WIDTH/3, HEIGHT/2, ID.Player,handler));
       handler.addObject(new Player(WIDTH/3*2, HEIGHT/2, ID.Player2,handler));
       handler.addObject(new ArenaTrophy(WIDTH-64, HEIGHT/2, ID.ArenaTrophy2,handler));
       handler.addObject(new ArenaTrophy(32, HEIGHT/2, ID.ArenaTrophy,handler));
       
       handler.addObject(new RadioactiveVerticalWall(64, HEIGHT/4, ID.RadioactiveVerticalWall,handler));
       handler.addObject(new RadioactiveVerticalWall(64, HEIGHT/4*3 -50, ID.RadioactiveVerticalWall,handler));
       handler.addObject(new RadioactiveVerticalWall(WIDTH-94, HEIGHT/4, ID.RadioactiveVerticalWall,handler));
       handler.addObject(new RadioactiveVerticalWall(WIDTH-94, HEIGHT/4*3 -50, ID.RadioactiveVerticalWall,handler));
       
       handler.addObject(new RadioactiveVerticalWall(98, HEIGHT/4+40, ID.RadioactiveVerticalWall,handler));
       handler.addObject(new RadioactiveVerticalWall(98, HEIGHT/4+90, ID.RadioactiveVerticalWall,handler));
       handler.addObject(new RadioactiveVerticalWall(98, HEIGHT/4+140, ID.RadioactiveVerticalWall,handler));
       
       handler.addObject(new RadioactiveVerticalWall(128, HEIGHT/4+40, ID.RadioactiveVerticalWall,handler));
       handler.addObject(new RadioactiveVerticalWall(128, HEIGHT/4+90, ID.RadioactiveVerticalWall,handler));
       handler.addObject(new RadioactiveVerticalWall(128, HEIGHT/4+140, ID.RadioactiveVerticalWall,handler));
       
       handler.addObject(new RadioactiveVerticalWall(WIDTH-128, HEIGHT/4+40, ID.RadioactiveVerticalWall,handler));
       handler.addObject(new RadioactiveVerticalWall(WIDTH-128, HEIGHT/4+90, ID.RadioactiveVerticalWall,handler));
       handler.addObject(new RadioactiveVerticalWall(WIDTH-128, HEIGHT/4+140, ID.RadioactiveVerticalWall,handler));
       
       handler.addObject(new RadioactiveVerticalWall(WIDTH-158, HEIGHT/4+40, ID.RadioactiveVerticalWall,handler));
       handler.addObject(new RadioactiveVerticalWall(WIDTH-158, HEIGHT/4+90, ID.RadioactiveVerticalWall,handler));
       handler.addObject(new RadioactiveVerticalWall(WIDTH-158, HEIGHT/4+140, ID.RadioactiveVerticalWall,handler));
       
       handler.addObject(new RadioactiveHorizontalWall(20, HEIGHT/4, ID.RadioactiveHorizontalWall,handler));
       handler.addObject(new RadioactiveHorizontalWall(20, HEIGHT/4*3-10, ID.RadioactiveHorizontalWall,handler));
       handler.addObject(new RadioactiveHorizontalWall(WIDTH-94, HEIGHT/4, ID.RadioactiveHorizontalWall,handler));
       handler.addObject(new RadioactiveHorizontalWall(WIDTH-94, HEIGHT/4*3-10, ID.RadioactiveHorizontalWall,handler));
       
       handler.addObject(new RainCloud((ChewingGumSimulator.WIDTH / 2)-48,0,ID.RainCloud,handler));
       handler.addObject(new RainCloud((ChewingGumSimulator.WIDTH / 3)-48,0,ID.RainCloud,handler));
       
       
       
       
       }}
    
    
    
    else if(Game.gameState == ChewingGumSimulator.STATE.ArenaNine){
       
       arenaSpawn++;
       if(arenaSpawn==1){ 
         
       
       handler.addObject(new Player(WIDTH/3, HEIGHT/2, ID.Player,handler));
       handler.addObject(new Player(WIDTH/3*2, HEIGHT/2, ID.Player2,handler));
       handler.addObject(new ArenaTrophy(WIDTH-64, HEIGHT/2, ID.ArenaTrophy2,handler));
       handler.addObject(new ArenaTrophy(32, HEIGHT/2, ID.ArenaTrophy,handler));
       
       handler.addObject(new RadioactiveVerticalWall(64, HEIGHT/4, ID.RadioactiveVerticalWall,handler));
       handler.addObject(new RadioactiveVerticalWall(64, HEIGHT/4*3 -50, ID.RadioactiveVerticalWall,handler));
       handler.addObject(new RadioactiveVerticalWall(WIDTH-94, HEIGHT/4, ID.RadioactiveVerticalWall,handler));
       handler.addObject(new RadioactiveVerticalWall(WIDTH-94, HEIGHT/4*3 -50, ID.RadioactiveVerticalWall,handler));
       
       handler.addObject(new RadioactiveVerticalWall(98, HEIGHT/4+40, ID.RadioactiveVerticalWall,handler));
       handler.addObject(new RadioactiveVerticalWall(98, HEIGHT/4+90, ID.RadioactiveVerticalWall,handler));
       handler.addObject(new RadioactiveVerticalWall(98, HEIGHT/4+140, ID.RadioactiveVerticalWall,handler));
       
       handler.addObject(new RadioactiveVerticalWall(128, HEIGHT/4+40, ID.RadioactiveVerticalWall,handler));
       handler.addObject(new RadioactiveVerticalWall(128, HEIGHT/4+90, ID.RadioactiveVerticalWall,handler));
       handler.addObject(new RadioactiveVerticalWall(128, HEIGHT/4+140, ID.RadioactiveVerticalWall,handler));
       
       handler.addObject(new RadioactiveVerticalWall(WIDTH-128, HEIGHT/4+40, ID.RadioactiveVerticalWall,handler));
       handler.addObject(new RadioactiveVerticalWall(WIDTH-128, HEIGHT/4+90, ID.RadioactiveVerticalWall,handler));
       handler.addObject(new RadioactiveVerticalWall(WIDTH-128, HEIGHT/4+140, ID.RadioactiveVerticalWall,handler));
       
       handler.addObject(new RadioactiveVerticalWall(WIDTH-158, HEIGHT/4+40, ID.RadioactiveVerticalWall,handler));
       handler.addObject(new RadioactiveVerticalWall(WIDTH-158, HEIGHT/4+90, ID.RadioactiveVerticalWall,handler));
       handler.addObject(new RadioactiveVerticalWall(WIDTH-158, HEIGHT/4+140, ID.RadioactiveVerticalWall,handler));
       
       handler.addObject(new RadioactiveHorizontalWall(20, HEIGHT/4, ID.RadioactiveHorizontalWall,handler));
       handler.addObject(new RadioactiveHorizontalWall(20, HEIGHT/4*3-10, ID.RadioactiveHorizontalWall,handler));
       handler.addObject(new RadioactiveHorizontalWall(WIDTH-94, HEIGHT/4, ID.RadioactiveHorizontalWall,handler));
       handler.addObject(new RadioactiveHorizontalWall(WIDTH-94, HEIGHT/4*3-10, ID.RadioactiveHorizontalWall,handler));
       
       handler.addObject(new SnowCloud((ChewingGumSimulator.WIDTH / 2)-48,0,ID.SnowCloud,handler));
       handler.addObject(new SnowCloud((ChewingGumSimulator.WIDTH / 3)-48,0,ID.SnowCloud,handler));
       
       
       
       
       }}
    
    
    
    
    else if(Game.gameState == ChewingGumSimulator.STATE.ArenaEditor){
       timeKeep++;
       if(timeKeep==1){
        
       
           // handler.addObject(new Player(WIDTH/2 -32, HEIGHT/2-32, ID.Player,handler));
            
            handler.addObject(new Player(WIDTH/2 -32, HEIGHT/2-32, ID.Player,handler));
            
       
       }
       
      }
    
    
    
    
    else if(Game.gameState == ChewingGumSimulator.STATE.BasicEnemyHelp){
       
       if(FastEnemyHelp == false){
           handler.clearEnemies();
       handler.addObject(new BasicEnemy((int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.WIDTH),20,ChewingGumSimulator.WIDTH-10),(int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.HEIGHT),80,ChewingGumSimulator.HEIGHT), ID.BasicEnemy,handler));
       }
       FastEnemyHelp = true;
       
       
       
        
}
    
    else if(Game.gameState == ChewingGumSimulator.STATE.PlateletCellHelp){
       
       if(FastEnemyHelp == true){
           handler.clearEnemies();
       handler.addObject(new PlateletCell((int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.WIDTH),20,ChewingGumSimulator.WIDTH-10),(int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.HEIGHT),80,ChewingGumSimulator.HEIGHT), ID.PlateletCell,handler));
       }
       FastEnemyHelp = false;
       
       
       
        
}
    else if(Game.gameState == ChewingGumSimulator.STATE.FastEnemyHelp){
       
       if(FastEnemyHelp == true){
        handler.clearEnemies();
       handler.addObject(new FastEnemy((int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.WIDTH),20,ChewingGumSimulator.WIDTH-10),(int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.HEIGHT),80,ChewingGumSimulator.HEIGHT), ID.FastEnemy,handler));
       }
       FastEnemyHelp = false;
       
       
       
        
}
    
    else if(Game.gameState == ChewingGumSimulator.STATE.SmartEnemyHelp){
       
        if(FastEnemyHelp == false){
        handler.clearEnemies();
        //handler.addObject(new GoldSoftTreasure((int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.WIDTH),100,ChewingGumSimulator.WIDTH-100),(int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.HEIGHT),120,ChewingGumSimulator.HEIGHT-100), ID.GoldSoftTreasure,handler));
        handler.addObject(new SmartEnemy((ChewingGumSimulator.WIDTH / 2)-48,HEIGHT/3,ID.SmartEnemy,handler));
        handler.addObject(new FakePlayer(Game.WIDTH-100,Game.HEIGHT-100,ID.FakePlayer,handler));
        }
        FastEnemyHelp=true;
       
       
       
        
}
    
    else if(Game.gameState == ChewingGumSimulator.STATE.BCellHelp){
       
        if(FastEnemyHelp == true){
        handler.clearEnemies();
        //handler.addObject(new GoldSoftTreasure((int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.WIDTH),100,ChewingGumSimulator.WIDTH-100),(int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.HEIGHT),120,ChewingGumSimulator.HEIGHT-100), ID.GoldSoftTreasure,handler));
        handler.addObject(new BCell((ChewingGumSimulator.WIDTH / 2)-48,HEIGHT/3,ID.BCell,handler));
        handler.addObject(new FakePlayer(Game.WIDTH-100,Game.HEIGHT-100,ID.FakePlayer,handler));
        }
        FastEnemyHelp=false;
       
       
       
        
}
    //SET FAST ENEMY HELP TO FALSE IN MENU
    else if(Game.gameState == ChewingGumSimulator.STATE.TCellHelp){
       
        if(FastEnemyHelp == false){
        handler.clearEnemies();
        //handler.addObject(new GoldSoftTreasure((int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.WIDTH),100,ChewingGumSimulator.WIDTH-100),(int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.HEIGHT),120,ChewingGumSimulator.HEIGHT-100), ID.GoldSoftTreasure,handler));
        handler.addObject(new TCell((ChewingGumSimulator.WIDTH / 2)-48,HEIGHT/3,ID.TCell,handler));
        handler.addObject(new FakePlayer(Game.WIDTH-100,Game.HEIGHT-100,ID.FakePlayer,handler));
        }
        FastEnemyHelp=true;
       
       
       
        
}
        
        
        else if(Game.gameState == ChewingGumSimulator.STATE.BossOneHelp){
       
       if(FastEnemyHelp == false){
        handler.clearEnemies();
       handler.addObject(new BossOne((ChewingGumSimulator.WIDTH / 2)-48,0,ID.BossOne,handler));
       
       }
       FastEnemyHelp = true;
       
       
       
        
}
        
        else if(Game.gameState == ChewingGumSimulator.STATE.BossTwoHelp){
       
       if(FastEnemyHelp == true){
        handler.clearEnemies();
       handler.addObject(new BossTwo((ChewingGumSimulator.WIDTH / 2)-48,0,ID.BossTwo,handler));
       
       }
       FastEnemyHelp = false;
       
       
       
        
}
        
        
        else if(Game.gameState == ChewingGumSimulator.STATE.BossThreeHelp){
       
       if(FastEnemyHelp == false){
        handler.clearEnemies();
       handler.addObject(new BossThree((ChewingGumSimulator.WIDTH / 2)-48,0,ID.BossThree,handler));
       
       }
       FastEnemyHelp = true;
       
       
       
        
}
        
        
        else if(Game.gameState == ChewingGumSimulator.STATE.BossFourHelp){
       
       if(FastEnemyHelp == true){
        handler.clearEnemies();
       handler.addObject(new BossFour((ChewingGumSimulator.WIDTH / 2)-48,0,ID.BossFour,handler));
       
       }
       FastEnemyHelp = false;
       
       
       
        
}
        
        
        else if(Game.gameState == ChewingGumSimulator.STATE.BossFiveHelp){
       
       if(FastEnemyHelp == false){
        handler.clearEnemies();
       handler.addObject(new BossFive((ChewingGumSimulator.WIDTH / 2)-48,0,ID.BossFive,handler));
       
       }
       FastEnemyHelp = true;
       
       
       
        
}
        
        
        
        
       else if(Game.gameState == ChewingGumSimulator.STATE.HealthBoxHelp){
       
       if(BoxesHelp == false){
        handler.clearEnemies();
        handler.addObject(new HealthBox(WIDTH/2,HEIGHT/2, ID.HealthBox,handler));
       
       }
       BoxesHelp = true;
       
       
       
        
}
        
        else if(Game.gameState == ChewingGumSimulator.STATE.AmmoBoxHelp){
       
       if(BoxesHelp == true){
        handler.clearEnemies();
        handler.addObject(new AmmoBox(WIDTH/2,HEIGHT/2, ID.AmmoBox,handler));
       }
       BoxesHelp = false;
       
       
       
        
}
        
        else if(Game.gameState == ChewingGumSimulator.STATE.EMPBoxHelp){
       
       if(BoxesHelp == false){
        handler.clearEnemies();
        handler.addObject(new EMPBox(WIDTH/2,HEIGHT/2, ID.EMPBox,handler));
       }
       BoxesHelp = true;
       
       
       
        
}
        
        
        else if(Game.gameState == ChewingGumSimulator.STATE.WhiteCellHelp){
       
        if(FastEnemyHelp == false){
        handler.clearEnemies();
        handler.addObject(new WhiteCell((int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.WIDTH),20,ChewingGumSimulator.WIDTH-10),(int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.HEIGHT),120,ChewingGumSimulator.HEIGHT-30),ID.WhiteCell,handler));
        }
        FastEnemyHelp=true;
       
       
       
        
}
        
        else if(Game.gameState == ChewingGumSimulator.STATE.BossSuckerHelp){
       
        if(FastEnemyHelp == true){
        handler.clearEnemies();
        handler.addObject(new BossSucker((ChewingGumSimulator.WIDTH / 2)-48,0,ID.BossSucker,handler));
        }
        FastEnemyHelp=false;
       
       
       
        
}
        
        else if(Game.gameState == ChewingGumSimulator.STATE.NeutrinoHelp){
       
        if(FastEnemyHelp == false){
        handler.clearEnemies();
        handler.addObject(new Neutrino((int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.WIDTH),20,ChewingGumSimulator.WIDTH-10),(int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.HEIGHT),80,ChewingGumSimulator.HEIGHT),ID.Neutrino,handler));
        }
        FastEnemyHelp=true;
       
       
       
        
}
        
        else if(Game.gameState == ChewingGumSimulator.STATE.HiggsBosonHelp){
       
        if(FastEnemyHelp == true){
        handler.clearEnemies();
        handler.addObject(new HiggsBoson((int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.WIDTH),20,ChewingGumSimulator.WIDTH-10),(int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.HEIGHT),80,ChewingGumSimulator.HEIGHT),ID.HiggsBoson,handler));
        }
        FastEnemyHelp=false;
       
       
       
        
}
        
        
        
        else if(Game.gameState == ChewingGumSimulator.STATE.BronzeTreasureHelp){
       
        if(TreasureHelp == false){
        handler.clearEnemies();
        handler.addObject(new SoftTreasure(WIDTH/2,HEIGHT/2, ID.SoftTreasure,handler));
        }
        TreasureHelp=true;
       
       
       
        
}
        
        else if(Game.gameState == ChewingGumSimulator.STATE.SilverTreasureHelp){
       
        if(TreasureHelp == true){
        handler.clearEnemies();
        //handler.addObject(new SilverSoftTreasure((int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.WIDTH),100,ChewingGumSimulator.WIDTH-100),(int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.HEIGHT),120,ChewingGumSimulator.HEIGHT-100), ID.SilverSoftTreasure,handler));
        handler.addObject(new SilverSoftTreasure(WIDTH/2,HEIGHT/2, ID.SilverSoftTreasure,handler));
        
        }
        TreasureHelp=false;
       
       
       
        
}
        
        else if(Game.gameState == ChewingGumSimulator.STATE.GoldTreasureHelp){
       
        if(TreasureHelp == false){
        handler.clearEnemies();
        //handler.addObject(new GoldSoftTreasure((int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.WIDTH),100,ChewingGumSimulator.WIDTH-100),(int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.HEIGHT),120,ChewingGumSimulator.HEIGHT-100), ID.GoldSoftTreasure,handler));
        handler.addObject(new SoftTreasure(WIDTH/2,HEIGHT/2, ID.GoldSoftTreasure,handler));
        
        }
        
        TreasureHelp=true;
       
       
       
        
}
        
        
        else if(Game.gameState == ChewingGumSimulator.STATE.BushHelp){
       
        if(DecoHelp == false){
        handler.clearEnemies();
        handler.addObject(new DangerousBush(WIDTH/2,HEIGHT/2, ID.BlueberryBush,handler));
        }
        DecoHelp=true;
       
       
       
        
}
        
        else if(Game.gameState == ChewingGumSimulator.STATE.TreeHelp){
       
        if(DecoHelp == true){
        handler.clearEnemies();
        //handler.addObject(new SilverSoftTreasure((int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.WIDTH),100,ChewingGumSimulator.WIDTH-100),(int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.HEIGHT),120,ChewingGumSimulator.HEIGHT-100), ID.SilverSoftTreasure,handler));
        handler.addObject(new DangerousTree(WIDTH/2,HEIGHT/2, ID.UnfruityTree,handler));
        
        }
        DecoHelp=false;
       
       
       
        
}
        
        else if(Game.gameState == ChewingGumSimulator.STATE.CactusHelp){
       
        if(DecoHelp == false){
        handler.clearEnemies();
        //handler.addObject(new GoldSoftTreasure((int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.WIDTH),100,ChewingGumSimulator.WIDTH-100),(int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.HEIGHT),120,ChewingGumSimulator.HEIGHT-100), ID.GoldSoftTreasure,handler));
        handler.addObject(new DangerousCactus(WIDTH/2,HEIGHT/2, ID.DangerousCactus,handler));
        
        }
        
        DecoHelp=true;
       
       
       
        
}
        
        
        else if(Game.gameState == ChewingGumSimulator.STATE.RainHelp){
       
        if(WeatherHelp == false){
        handler.clearEnemies();
        handler.addObject(new RainCloud((ChewingGumSimulator.WIDTH / 3)-48,0,ID.RainCloud,handler));
        handler.addObject(new RainCloud((ChewingGumSimulator.WIDTH / 2)-48,0,ID.RainCloud,handler));
        }
        WeatherHelp=true;
       
       
       
        
}
        
        else if(Game.gameState == ChewingGumSimulator.STATE.SnowHelp){
       
        if(WeatherHelp == true){
        handler.clearEnemies();
        
        handler.addObject(new SnowCloud((ChewingGumSimulator.WIDTH / 3)-48,0,ID.SnowCloud,handler));
        handler.addObject(new SnowCloud((ChewingGumSimulator.WIDTH / 2)-48,0,ID.SnowCloud,handler));
        }
        WeatherHelp=false;
       
       
       
        
}
        
        else if(Game.gameState == ChewingGumSimulator.STATE.ThunderHelp){
       
        if(WeatherHelp == false){
        handler.clearEnemies();
        //handler.addObject(new GoldSoftTreasure((int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.WIDTH),100,ChewingGumSimulator.WIDTH-100),(int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.HEIGHT),120,ChewingGumSimulator.HEIGHT-100), ID.GoldSoftTreasure,handler));
        handler.addObject(new ThunderCloud((ChewingGumSimulator.WIDTH / 3)-48,0,ID.ThunderCloud,handler));
        handler.addObject(new ThunderCloud((ChewingGumSimulator.WIDTH / 2)-48,0,ID.ThunderCloud,handler));
        }
        WeatherHelp=true;
       
       
       
        
}
        
        
        
        else if(Game.gameState == ChewingGumSimulator.STATE.FalloutHelp){
       
        if(WeatherHelp == true){
        handler.clearEnemies();
        //handler.addObject(new GoldSoftTreasure((int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.WIDTH),100,ChewingGumSimulator.WIDTH-100),(int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.HEIGHT),120,ChewingGumSimulator.HEIGHT-100), ID.GoldSoftTreasure,handler));
        handler.addObject(new FalloutCloud((ChewingGumSimulator.WIDTH / 3)-48,0,ID.FalloutCloud,handler));
        handler.addObject(new FalloutCloud((ChewingGumSimulator.WIDTH / 2)-48,0,ID.FalloutCloud,handler));
        }
        WeatherHelp=false;
       
       
       
        
}
        
        
        else if(Game.gameState == ChewingGumSimulator.STATE.FissionHelp){
       
        if(AllahuAkbarHelp == false){
        handler.clearEnemies();
        //handler.addObject(new GoldSoftTreasure((int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.WIDTH),100,ChewingGumSimulator.WIDTH-100),(int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.HEIGHT),120,ChewingGumSimulator.HEIGHT-100), ID.GoldSoftTreasure,handler));
        handler.addObject(new AtomDisengage((ChewingGumSimulator.WIDTH / 3)-48,HEIGHT/2,ID.AtomDisengage,handler));
        handler.addObject(new AtomDisengage((ChewingGumSimulator.WIDTH / 2)-48,HEIGHT/3,ID.AtomDisengage,handler));
        }
        AllahuAkbarHelp=true;
       
       
       
        
}
        
        
        else if(Game.gameState == ChewingGumSimulator.STATE.FusionHelp){
       
        if(AllahuAkbarHelp == true){
        handler.clearEnemies();
        //handler.addObject(new GoldSoftTreasure((int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.WIDTH),100,ChewingGumSimulator.WIDTH-100),(int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.HEIGHT),120,ChewingGumSimulator.HEIGHT-100), ID.GoldSoftTreasure,handler));
        handler.addObject(new AtomFusioner(ChewingGumSimulator.WIDTH/2,ChewingGumSimulator.HEIGHT/2, ID.fusionCenter,handler));
            handler.addObject(new AtomFusioner((int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.WIDTH),20,ChewingGumSimulator.WIDTH-20),(int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.HEIGHT),80,ChewingGumSimulator.HEIGHT), ID.AtomFusioner,handler));
            handler.addObject(new AtomFusioner((int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.WIDTH),20,ChewingGumSimulator.WIDTH-20),(int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.HEIGHT),80,ChewingGumSimulator.HEIGHT), ID.AtomFusioner,handler));
            handler.addObject(new AtomFusioner((int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.WIDTH),20,ChewingGumSimulator.WIDTH-20),(int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.HEIGHT),80,ChewingGumSimulator.HEIGHT), ID.AtomFusioner,handler));
            handler.addObject(new AtomFusioner((int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.WIDTH),20,ChewingGumSimulator.WIDTH-20),(int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.HEIGHT),80,ChewingGumSimulator.HEIGHT), ID.AtomFusioner,handler));
        }
        AllahuAkbarHelp=false;
       
       
       
        
}
        
        
        else if(Game.gameState == ChewingGumSimulator.STATE.StraightTurretHelp){
       
        if(TurretHelp == false){
        handler.clearEnemies();
        //handler.addObject(new GoldSoftTreasure((int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.WIDTH),100,ChewingGumSimulator.WIDTH-100),(int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.HEIGHT),120,ChewingGumSimulator.HEIGHT-100), ID.GoldSoftTreasure,handler));
        handler.addObject(new StraightTurret((ChewingGumSimulator.WIDTH / 2)-48,HEIGHT/3,ID.StraightTurret,handler));
        }
        TurretHelp=true;
       
       
       
        
}
        
        
        else if(Game.gameState == ChewingGumSimulator.STATE.ParticleTurretHelp){
       
        if(TurretHelp == true){
        handler.clearEnemies();
        //handler.addObject(new GoldSoftTreasure((int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.WIDTH),100,ChewingGumSimulator.WIDTH-100),(int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.HEIGHT),120,ChewingGumSimulator.HEIGHT-100), ID.GoldSoftTreasure,handler));
        handler.addObject(new ParticleTurret((ChewingGumSimulator.WIDTH / 2)-48,HEIGHT/3,ID.ParticleTurret,handler));
        }
        TurretHelp=false;
       
       
       
        
}
        
        
        else if(Game.gameState == ChewingGumSimulator.STATE.AutoTurretHelp){
       
        if(TurretHelp == false){
        handler.clearEnemies();
        //handler.addObject(new GoldSoftTreasure((int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.WIDTH),100,ChewingGumSimulator.WIDTH-100),(int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.HEIGHT),120,ChewingGumSimulator.HEIGHT-100), ID.GoldSoftTreasure,handler));
        handler.addObject(new AutoTurret((ChewingGumSimulator.WIDTH / 2)-48,HEIGHT/3,ID.AutoTurret,handler));
        handler.addObject(new FakePlayer(Game.WIDTH-100,Game.HEIGHT-100,ID.FakePlayer,handler));
        }
        TurretHelp=true;
       
       
       
        
}
        
        
        
        else if(Game.gameState == ChewingGumSimulator.STATE.ShieldHelp){
       
        if(PowerHelp == false){
        handler.clearEnemies();
        //handler.addObject(new GoldSoftTreasure((int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.WIDTH),100,ChewingGumSimulator.WIDTH-100),(int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.HEIGHT),120,ChewingGumSimulator.HEIGHT-100), ID.GoldSoftTreasure,handler));
        
        handler.addObject(new FakePlayer(Game.WIDTH-100,Game.HEIGHT-100,ID.FakePlayer,handler));
        }
        PowerHelp=true;
       
       
       
        
}
        
        
        else if(Game.gameState == ChewingGumSimulator.STATE.SpeedHelp){
       
        if(PowerHelp == true){
        handler.clearEnemies();
        //handler.addObject(new GoldSoftTreasure((int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.WIDTH),100,ChewingGumSimulator.WIDTH-100),(int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.HEIGHT),120,ChewingGumSimulator.HEIGHT-100), ID.GoldSoftTreasure,handler));
        
        handler.addObject(new FakePlayer(Game.WIDTH-100,Game.HEIGHT-100,ID.FakePlayer,handler));
        }
        PowerHelp=false;
       
       
       
        
}
                
                else if(Game.gameState == ChewingGumSimulator.STATE.Help){
            
        
                handler.clearEnemies();
                
            
        
}
        
        
        
        
        
        else if(Game.gameState == ChewingGumSimulator.STATE.Tutorial){
       if(HUD.HEALTH<=0){
           tutorialReset();
           Game.gameState=ChewingGumSimulator.STATE.EndTutorial;
       }
       if(BoxesHelp == false){
        handler.clearEnemies();
        //y = ChewingGumSimulator.clamp((int)y,80,ChewingGumSimulator.HEIGHT-48);
        handler.addObject(new Player(WIDTH/2 -32, HEIGHT/2-32, ID.Player,handler));
        
       }
       BoxesHelp = true;
       scoreKeepTut++;
        
        if(scoreKeepTut >= 1000)
        {
            scoreKeepTut=0;
            
            HUD.AMMO = 100;
            
            hud.setLevel(hud.getLevel()+1);}
        if(Game.tutorialStages[2]==true && tutSpawnTwo==false){
            handler.addObject(new FastEnemy((int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.WIDTH),30,ChewingGumSimulator.WIDTH-30),(int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.HEIGHT),120,ChewingGumSimulator.HEIGHT-150), ID.FastEnemy,handler));
            tutSpawnTwo=true;
            
        }
        if(Game.tutorialStages[2]==true && Game.tutorialStages[3]==false && tutSpawnTwo==true){
            if(fastTimer>0){
                fastTimer--;
            }
            if(fastTimer==0){
                HUD.EMPCount++;
                Game.tutorialStages[3]=true;
            }
        }
        
        if(Game.tutorialStages[0]==true && Game.tutorialStages[1]==false){
            
            Game.tutorialStages[1]=true;
        }
        
        if(Game.tutorialStages[0]==true && tutSpawnOne==false){
            handler.addObject(new BasicEnemy((int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.WIDTH),50,ChewingGumSimulator.WIDTH-50),(int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.HEIGHT),120,ChewingGumSimulator.HEIGHT-150), ID.BasicEnemy,handler));
            tutSpawnOne=true;
        }
        
        if(Game.tutorialStages[4]==true && tutSpawnThree==false){
            handler.addObject(new GreaseBall((int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.WIDTH),50,ChewingGumSimulator.WIDTH-50),(int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.HEIGHT),120,ChewingGumSimulator.HEIGHT-150), ID.GreaseBall,handler));
            tutSpawnThree=true;
        }
        if(Game.tutorialStages[5]==true && tutSpawnFour==false){
            handler.addObject(new LightningBox((int)pX,(int)pY,ID.LightningBox,handler));
            tutSpawnFour=true;
        }
        if(Game.tutorialStages[6]==true && tutSpawnFive==false){
            handler.addObject(new AtomDisengage((int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.WIDTH),50,ChewingGumSimulator.WIDTH-50),(int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.HEIGHT),120,ChewingGumSimulator.HEIGHT-150),ID.AtomDisengage,handler));
            tutSpawnFive=true;
        }
        
        if(Game.tutorialStages[8]==true && tutSpawnSix==false){
            handler.addObject(new AmmoBox((int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.WIDTH),50,ChewingGumSimulator.WIDTH-50),(int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.HEIGHT),120,ChewingGumSimulator.HEIGHT-150),ID.AmmoBox,handler));
            handler.addObject(new HealthBox((int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.WIDTH),50,ChewingGumSimulator.WIDTH-50),(int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.HEIGHT),120,ChewingGumSimulator.HEIGHT-150),ID.AmmoBox,handler));
            tutSpawnSix=true;
        }
        if(Game.tutorialStages[10]==true && tutSpawnSeven==false){
            handler.addObject(new BossSucker((ChewingGumSimulator.WIDTH / 2)-48,0,ID.BossSucker,handler));
            tutSpawnSeven=true;
        }
        if(Game.tutorialStages[11]==true && tutSpawnEight==false){
            handler.addObject(new BossOne((ChewingGumSimulator.WIDTH / 2)-48,0,ID.BossOne,handler));
            HUD.NUKES++;
            tutSpawnEight=true;
            
        }
        if(scoreKeepTut  == 100)
        {   
            
            if(Game.tutorialStages[0]==false){Game.tutorialS=1;}
            else{
                
                if(Game.tutorialStages[1]==false){
                Game.tutorialS=2;}
                else
                {
                    if(Game.tutorialStages[2]==false){
                        Game.tutorialS=3;
                    }
                    else{
                        if(Game.tutorialStages[3]==false){
                            Game.tutorialS=4;
                        }
                        else{
                            if(Game.tutorialStages[4]==false){
                            Game.tutorialS=5;
                        }
                            else{
                                if(Game.tutorialStages[5]==false){
                            Game.tutorialS=6;
                        }
                                else{
                                    if(Game.tutorialStages[6]==false){
                            Game.tutorialS=7;
                        }
                                    else{
                                        if(Game.tutorialStages[7]==false){
                            Game.tutorialS=8;
                        }
                                        else{
                                            if(Game.tutorialStages[8]==false){
                            Game.tutorialS=9;
                        }
                                            else{
                                                if(Game.tutorialStages[9]==false){
                            Game.tutorialS=10;
                        }
                                                else{
                                                    if(Game.tutorialStages[10]==false){
                            Game.tutorialS=11;
                        }
                                                    else{
                                                        if(Game.tutorialStages[11]==false){
                            Game.tutorialS=12;
                        }
                                                        else{
                                                            if(Game.tutorialStages[12]==false){
                            Game.tutorialS=13;
                        }
                                                            else{
                                                                Game.gameState = ChewingGumSimulator.STATE.FinishTutorial;
                                                                HUD.HEALTH=100;
                                                                HUD.AMMO=100;
                                                                
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            /*handler.addObject(new HealthBox(r.nextInt(ChewingGumSimulator.WIDTH),r.nextInt(ChewingGumSimulator.HEIGHT), ID.HealthBox,handler));
            handler.addObject(new AmmoBox(r.nextInt(ChewingGumSimulator.WIDTH),(int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.HEIGHT),80,ChewingGumSimulator.HEIGHT), ID.AmmoBox,handler));
            handler.addObject(new EMPBox(r.nextInt(ChewingGumSimulator.WIDTH),(int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.HEIGHT),80,ChewingGumSimulator.HEIGHT), ID.EMPBox,handler));
            handler.addObject(new ShieldPower(r.nextInt(ChewingGumSimulator.WIDTH),(int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.HEIGHT),80,ChewingGumSimulator.HEIGHT), ID.ShieldPower,handler));
            handler.addObject(new SpeedBooster(r.nextInt(ChewingGumSimulator.WIDTH),(int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.HEIGHT),80,ChewingGumSimulator.HEIGHT), ID.SpeedBooster,handler));
            handler.addObject(new BasicEnemy(r.nextInt(ChewingGumSimulator.WIDTH),(int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.HEIGHT),80,ChewingGumSimulator.HEIGHT), ID.BasicEnemy,handler));
            handler.addObject(new FastEnemy(r.nextInt(ChewingGumSimulator.WIDTH),r.nextInt(ChewingGumSimulator.HEIGHT), ID.FastEnemy,handler));
           */
}
        
        
        
       
       
        
}
        
        
    
    
    
 
    
}}
