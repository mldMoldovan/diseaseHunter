
package chewing.gum.simulator;


import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Graphics;
import java.awt.Graphics2D;



import java.util.Random;


public class Menu extends MouseAdapter{
    private float alpha = 0.9f;
    //BUTTONS X AND Y VALUES
    
    
    //MAIN MENU
    private int ButtonX_MM_Arena;
    private int ButtonY_MM_Arena;
    
    private int ButtonX_MM_Play;
    private int ButtonY_MM_Play;
    
    private int ButtonX_MM_Adventure;
    private int ButtonY_MM_Adventure;
    
    private int ButtonX_MM_Options;
    private int ButtonY_MM_Options;
    
    private int ButtonX_MM_Help;
    private int ButtonY_MM_Help;
    
    private int ButtonX_MM_About;
    private int ButtonY_MM_About;
    
    private int ButtonX_MM_Quit;
    private int ButtonY_MM_Quit;
    
    
    private int ButtonX_Size_MM;
    private int ButtonY_Size_MM;
    
    
    
    //HELP MENU
    
    private int ButtonX_HM_Weather;
    private int ButtonY_HM_Weather;
    
    private int ButtonX_HM_Treasures;
    private int ButtonY_HM_Treasures;
    
    private int ButtonX_HM_Enemies;
    private int ButtonY_HM_Enemies;
    
    private int ButtonX_HM_PowerUps;
    private int ButtonY_HM_PowerUps;
    
    private int ButtonX_HM_Boxes;
    private int ButtonY_HM_Boxes;
    
    private int ButtonX_HM_Decorations;
    private int ButtonY_HM_Decorations;
    
    private int ButtonX_HM_Turrets;
    private int ButtonY_HM_Turrets;
    
    private int ButtonX_HM_Explosives;
    private int ButtonY_HM_Explosives;
    
    private int ButtonX_HM_SinglePlayer;
    private int ButtonY_HM_SinglePlayer;
    
    private int ButtonX_HM_Arena;
    private int ButtonY_HM_Arena;
    
    private int ButtonX_HM_Cheats;
    private int ButtonY_HM_Cheats;
    
    private int ButtonX_HM_Adventure;
    private int ButtonY_HM_Adventure;
    
    private int ButtonX_HM_Tutorial;
    private int ButtonY_HM_Tutorial;
    
    private int ButtonX_HM_Back;
    private int ButtonY_HM_Back;
    
    //OPTIONS MENU
    private int ButtonX_OM_Language;
    private int ButtonY_OM_Language;
    
    
    private int ButtonX_OM_Profile;
    private int ButtonY_OM_Profile;
    
    private int ButtonX_OM_Other;
    private int ButtonY_OM_Other;
    
    private int ButtonX_OM_Controls;
    private int ButtonY_OM_Controls;
    
    private int ButtonX_OM_Sound;
    private int ButtonY_OM_Sound;
    
    private int ButtonX_OM_Graphics;
    private int ButtonY_OM_Graphics;
    
    private int ButtonX_OM_PlayerSetup;
    private int ButtonY_OM_PlayerSetup;
    
    private int ButtonX_OM_Back;
    private int ButtonY_OM_Back;
    
    //ARENA SELECT MENU
    
    private int ButtonX_AA_A1;
    private int ButtonY_AA_A1;
    
    private int ButtonX_AA_A2;
    private int ButtonY_AA_A2;
    
    private int ButtonX_AA_A3;
    private int ButtonY_AA_A3;
    
    private int ButtonX_AA_A4;
    private int ButtonY_AA_A4;
    
    private int ButtonX_AA_A5;
    private int ButtonY_AA_A5;
    
    private int ButtonX_AA_A6;
    private int ButtonY_AA_A6;
    
    private int ButtonX_AA_A7;
    private int ButtonY_AA_A7;
    
    private int ButtonX_AA_A8;
    private int ButtonY_AA_A8;
    
    private int ButtonX_AA_A9;
    private int ButtonY_AA_A9;
    
    private int ButtonX_AA_Custom;
    private int ButtonY_AA_Custom;
    
    private int ButtonX_AA_Back;
    private int ButtonY_AA_Back;
    
    
    //ADVENTURE SELECT MENU
    private int ButtonX_AV_One;
    private int ButtonY_AV_One;
    
    private int ButtonX_AV_Two;
    private int ButtonY_AV_Two;
    
    private int ButtonX_AV_Three;
    private int ButtonY_AV_Three;
    
    private int ButtonX_AV_Four;
    private int ButtonY_AV_Four;
    
    private int ButtonX_AV_Five;
    private int ButtonY_AV_Five;
    
    private int ButtonX_AV_Six;
    private int ButtonY_AV_Six;
    
    private int ButtonX_AV_Seven;
    private int ButtonY_AV_Seven;
    
    private int ButtonX_AV_Eight;
    private int ButtonY_AV_Eight;
    
    private int ButtonX_AV_Nine;
    private int ButtonY_AV_Nine;
    
    private int ButtonX_AV_Ten;
    private int ButtonY_AV_Ten;
    
    
    
    //STRINGS
    private String String_Back;
    private String String_Retry;
    private String String_NextLevel;
    private String String_BackToMenu;
    
    //MAIN MENU
    private String String_MM_Arena;
    private String String_MM_Play;
    private String String_MM_Options;
    private String String_MM_Help;
    private String String_MM_About;
    private String String_MM_Quit;
    private String String_MM_Adventure;
    
    
    
    //OPTIONS MENU
    
    private String String_OM_Language;
    private String String_OM_Sound;
    private String String_OM_Profile;
    private String String_OM_Other;
    private String String_OM_Controls;
    private String String_OM_PlayerSetup;
    private String String_OM_Graphics;
    
    
    
    //HELP MENU
    
    private String String_HM_Weather;
    private String String_HM_Treasures;
    private String String_HM_Enemies;
    private String String_HM_PowerUps;
    private String String_HM_Boxes;
    private String String_HM_Decorations;
    private String String_HM_Turrets;
    private String String_HM_Explosives;
    private String String_HM_SinglePlayer;
    private String String_HM_Arena;
    private String String_HM_Cheats;
    private String String_HM_Adventure;
    private String String_HM_Tutorial;
    
    private String String_HM_NextEnemy;
    private String String_HM_NextBox;
    private String String_HM_NextCloud;
    private String String_HM_NextDecoration;
    private String String_HM_NextTurret;
    private String String_HM_NextExplosive;
    private String String_HM_NextPowerUp;
    
    //HELP DESCRIPTIONS
    private String String_Desc_AutoTurret;
    private String String_Desc_StraightTurret;
    private String String_Desc_ParticleTurret;
    
    private String String_Desc_BronzeT;
    private String String_Desc_SilverT;
    private String String_Desc_GoldT;
    
    private String String_Desc_RedCell;
    private String String_Desc_WhiteCell;
    private String String_Desc_PlateletCell;
    
    private String String_Desc_SmartCell;
    private String String_Desc_BCell;
    private String String_Desc_TCell;
    
    private String String_Desc_Photon;
    private String String_Desc_Neutrino;
    private String String_Desc_HiggsBoson;
    
    private String String_Desc_BossOne;
    private String String_Desc_BossTwo;
    private String String_Desc_BossThree;
    private String String_Desc_BossFour;
    private String String_Desc_BossFive;
    
    private String String_Desc_BossOneSucker;
    private String String_Desc_BossTwoSucker;
    private String String_Desc_BossThreeSucker;
    private String String_Desc_BossFourSucker;
    private String String_Desc_BossFiveSucker;
    
    private String String_Desc_Tree;
    private String String_Desc_Bush;
    private String String_Desc_Cactus;
    
    
    private String String_Desc_Rain;
    private String String_Desc_Snow;
    private String String_Desc_Thunder;
    private String String_Desc_Fallout;
    
    private String String_Desc_Shield;
    private String String_Desc_Speed;
    
    
    private String String_Desc_Fission;
    private String String_Desc_Fusion;
    
    
    private String String_Desc_Ammo;
    private String String_Desc_EMP;
    private String String_Desc_Health;
    
   
    
    
    
    private Handler handler;
    private ChewingGumSimulator Game;
    private HUD hud;
    Color buttonColor=Color.white;
    private Color arenaSColor = new Color(102,178,255);
    private Color dark_green = new Color(33,146,33);
    private Color dark_red = new Color(156,0,0);
    private Color royal_blue = new Color(65,105,225);
    public boolean optionalBackground = false;
    public boolean optionalP1Color = false;
    public boolean optionalP2Color = false;
    static boolean EditorSpawn = true;
    private Color faceBlue = new Color(59, 89, 152);
    private Color vkBlue = new Color(69, 102, 142);
    private Color twBlue = new Color(0, 172, 237);
    
    
    
    
    
    private Random r = new Random();
    
    public Menu(ChewingGumSimulator Game,Handler handler,HUD hud){
        this.Game = Game;
        this.handler = handler;
        this.hud = hud;
        
                ButtonX_AV_One=10;
                ButtonY_AV_One=10;
                
                ButtonX_AV_Two=10;
                ButtonY_AV_Two=80;
                
                ButtonX_AV_Three=10;
                ButtonY_AV_Three=150;
                
                ButtonX_AV_Four=10;
                ButtonY_AV_Four=220;
                
                ButtonX_AV_Five=10;
                ButtonY_AV_Five=290;
                
                ButtonX_AV_Six=Game.WIDTH + 20;
                ButtonY_AV_Six=10;
                
                ButtonX_AV_Seven=Game.WIDTH + 20;
                ButtonY_AV_Seven=80;
                
                ButtonX_AV_Eight=Game.WIDTH + 20;
                ButtonY_AV_Eight=150;
                
                ButtonX_AV_Nine=Game.WIDTH + 20;
                ButtonY_AV_Nine=220;
                
                ButtonX_AV_Ten=Game.WIDTH + 20;
                ButtonY_AV_Ten=290;
    }
    
    private AlphaComposite makeTransparent(float alpha){
        int type = AlphaComposite.SRC_OVER;
        return AlphaComposite.getInstance(type, alpha);
    }
    
    public void Adventure_Transit(){
        
            
                ButtonX_AV_One--;
                ButtonX_AV_Six--;
                //ButtonY_AV_One=10;
                
                ButtonX_AV_Two--;
                ButtonX_AV_Seven--;
                //ButtonY_AV_Two=80;
                
                ButtonX_AV_Three--;
                ButtonX_AV_Eight--;
                //ButtonY_AV_Three=150;
                
                ButtonX_AV_Four--;
                ButtonX_AV_Nine--;
                //ButtonY_AV_Four=220;
                
                ButtonX_AV_Five--;
                ButtonX_AV_Ten--;
                //ButtonY_AV_Five=290;
                if(ButtonX_AV_Six <= 10){
                Game.transitStart=false;
            }
        
    }
    
    public void ButtonSetter(){
        
            if(Game.WIDTH==640){
                ButtonX_MM_Arena=210;
                ButtonY_MM_Arena=10;
                
                ButtonX_MM_Play=210;
                ButtonY_MM_Play=80;
                
                ButtonX_MM_Options=210;
                ButtonY_MM_Options=150;
                
                ButtonX_MM_Help=210;
                ButtonY_MM_Help=220;
                
                ButtonX_MM_About=210;
                ButtonY_MM_About=290;
                
                ButtonX_MM_Quit=210;
                ButtonY_MM_Quit=360;
                
                ButtonX_MM_Adventure=420;
                ButtonY_MM_Adventure=80;
                
                ButtonX_Size_MM=200;
                ButtonY_Size_MM=60;
                
                
                
                
                
                
                
                ButtonX_HM_Arena=415;
                ButtonY_HM_Arena=220;
                
                ButtonX_HM_SinglePlayer=415;
                ButtonY_HM_SinglePlayer=150;
                
                ButtonX_HM_Cheats=415;
                ButtonY_HM_Cheats=290;
                
                ButtonX_HM_Adventure=415;
                ButtonY_HM_Adventure=360;
                
                ButtonX_HM_Turrets=415;
                ButtonY_HM_Turrets=10;
                
                ButtonX_HM_Back=210;
                ButtonY_HM_Back=360;
                
                ButtonX_HM_Explosives=415;
                ButtonY_HM_Explosives=80;
                
                ButtonX_HM_Weather=5;
                ButtonY_HM_Weather=10;
                
                ButtonX_HM_Treasures=5;
                ButtonY_HM_Treasures=80;
                
                ButtonX_HM_Enemies=5;
                ButtonY_HM_Enemies=150;
                
                ButtonX_HM_PowerUps=5;
                ButtonY_HM_PowerUps=220;
                
                ButtonX_HM_Boxes=5;
                ButtonY_HM_Boxes=290;
                
                ButtonX_HM_Tutorial=210;
                ButtonY_HM_Tutorial=40;
                
                ButtonX_HM_Decorations=5;
                ButtonY_HM_Decorations=360;
                
                
                
                
                ButtonX_OM_Language=5;
                ButtonY_OM_Language=150;
                
                ButtonX_OM_Profile=5;
                ButtonY_OM_Profile=220;
                
                ButtonX_OM_Other=5;
                ButtonY_OM_Other=290;
                
                ButtonX_OM_Controls=210;
                ButtonY_OM_Controls=290;
                
                
                ButtonX_OM_Sound=415;
                ButtonY_OM_Sound=150;
                
                ButtonX_OM_Graphics=415;
                ButtonY_OM_Graphics=220;
                
                ButtonX_OM_PlayerSetup=415;
                ButtonY_OM_PlayerSetup=290;
                
                
                
                
                ButtonX_AA_A1=5;
                ButtonY_AA_A1=140;
                
                ButtonX_AA_A2=5;
                ButtonY_AA_A2=210;
                
                ButtonX_AA_A3=5;
                ButtonY_AA_A3=280;
                
                ButtonX_AA_A4=210;
                ButtonY_AA_A4=140;
                
                ButtonX_AA_A5=210;
                ButtonY_AA_A5=210;
                
                ButtonX_AA_A6=210;
                ButtonY_AA_A6=280;
                
                ButtonX_AA_A7=415;
                ButtonY_AA_A7=140;
                
                ButtonX_AA_A8=415;
                ButtonY_AA_A8=210;
                
                ButtonX_AA_A9=415;
                ButtonY_AA_A9=280;
                
                ButtonX_AA_Custom=5;
                ButtonY_AA_Custom=350;
                
                ButtonX_AA_Back=415;
                ButtonY_AA_Back=350;
                
                
                
            }
            if(Game.WIDTH==1280){
                ButtonX_MM_Arena=420;
                ButtonY_MM_Arena=20;
                
                ButtonX_MM_Play=420;
                ButtonY_MM_Play=160;
                
                ButtonX_MM_Options=420;
                ButtonY_MM_Options=300;
                
                ButtonX_MM_Help=420;
                ButtonY_MM_Help=440;
                
                ButtonX_MM_About=420;
                ButtonY_MM_About=580;
                
                ButtonX_MM_Quit=420;
                ButtonY_MM_Quit=720;
                
                ButtonX_MM_Adventure=840;
                ButtonY_MM_Adventure=160;
                
                ButtonX_Size_MM=400;
                ButtonY_Size_MM=120;
                
                
                ButtonX_HM_Arena=830;
                ButtonY_HM_Arena=440;
                
                ButtonX_HM_SinglePlayer=830;
                ButtonY_HM_SinglePlayer=300;
                
                ButtonX_HM_Cheats=830;
                ButtonY_HM_Cheats=580;
                
                ButtonX_HM_Adventure=830;
                ButtonY_HM_Adventure=720;
                
                ButtonX_HM_Turrets=830;
                ButtonY_HM_Turrets=20;
                
                ButtonX_HM_Back=420;
                ButtonY_HM_Back=720;
                
                ButtonX_HM_Explosives=830;
                ButtonY_HM_Explosives=160;
                
                ButtonX_HM_Weather=10;
                ButtonY_HM_Weather=20;
                
                ButtonX_HM_Treasures=10;
                ButtonY_HM_Treasures=160;
                
                ButtonX_HM_Enemies=10;
                ButtonY_HM_Enemies=300;
                
                ButtonX_HM_PowerUps=10;
                ButtonY_HM_PowerUps=440;
                
                ButtonX_HM_Boxes=10;
                ButtonY_HM_Boxes=580;
                
                ButtonX_HM_Tutorial=420;
                ButtonY_HM_Tutorial=160;
                
                ButtonX_HM_Decorations=10;
                ButtonY_HM_Decorations=720;
                
                
                ButtonX_OM_Language=10;
                ButtonY_OM_Language=300;
                
                ButtonX_OM_Profile=10;
                ButtonY_OM_Profile=440;
                
                ButtonX_OM_Other=10;
                ButtonY_OM_Other=580;
                
                ButtonX_OM_Controls=420;
                ButtonY_OM_Controls=580;
                
                
                ButtonX_OM_Sound=830;
                ButtonY_OM_Sound=300;
                
                ButtonX_OM_Graphics=830;
                ButtonY_OM_Graphics=440;
                
                ButtonX_OM_PlayerSetup=830;
                ButtonY_OM_PlayerSetup=580;
                
                
                ButtonX_AA_A1=10;
                ButtonY_AA_A1=280;
                
                ButtonX_AA_A2=10;
                ButtonY_AA_A2=420;
                
                ButtonX_AA_A3=10;
                ButtonY_AA_A3=560;
                
                ButtonX_AA_A4=420;
                ButtonY_AA_A4=280;
                
                ButtonX_AA_A5=420;
                ButtonY_AA_A5=420;
                
                ButtonX_AA_A6=420;
                ButtonY_AA_A6=560;
                
                ButtonX_AA_A7=830;
                ButtonY_AA_A7=280;
                
                ButtonX_AA_A8=830;
                ButtonY_AA_A8=420;
                
                ButtonX_AA_A9=830;
                ButtonY_AA_A9=560;
                
                ButtonX_AA_Custom=10;
                ButtonY_AA_Custom=700;
                
                ButtonX_AA_Back=830;
                ButtonY_AA_Back=700;
                
                
            }
            if(Game.WIDTH==1366){
                
            }
            if(Game.WIDTH==1920){
                
            }
        
    }
    public void StringSetter(){
        if(Game.gameLang==LANGUAGE.English){
            
            
            String_Back="Back";
            String_Retry="Retry";
            String_NextLevel = "Next Level";
            String_BackToMenu = "Back To Menu";
            
            
            String_MM_Arena="Arena";
            String_MM_Play="Play";
            String_MM_Options="Options";
            String_MM_Help="Help";
            String_MM_About="About";
            String_MM_Quit="Quit";
            String_MM_Adventure="Adventure";
            
            
            String_OM_Other = "Other";
            String_OM_Graphics = "Graphics";
            String_OM_Sound = "Sound";
            String_OM_PlayerSetup = "Player Setup";
            String_OM_Language = "Language";
            String_OM_Profile = "Profile";
            String_OM_Controls = "Controls";
            
            String_HM_Weather = "Weather Help";
            String_HM_Treasures = "Treasures Help";
            String_HM_Boxes = "Boxes Help";
            String_HM_Decorations = "Decorations Help";
            String_HM_SinglePlayer = "Single Player Help";
            String_HM_Arena = "Arena Help";
            String_HM_Adventure = "Adventure Help";
            String_HM_Explosives = "Explosives Help";
            String_HM_Turrets = "Turrets Help";
            String_HM_Cheats = "Cheats Help";
            String_HM_Tutorial = "Tutorial";
            String_HM_PowerUps = "Power Ups Help";
            String_HM_Enemies = "Enemies Help";
        }
        
        if(Game.gameLang==LANGUAGE.Hungarian){
            
            
            String_Back = "Vissza";
            String_Retry = "Ujból Megkísérel";
            String_NextLevel = "Következő Szint";
            String_BackToMenu = "Vissza a Menühöz";
            
            String_MM_Arena="Küzdőtér";
            String_MM_Play="Játék";
            String_MM_Options="Lehetőségek";
            String_MM_Help="Segítség";
            String_MM_About="Részletek";
            String_MM_Quit="Kilép";
            String_MM_Adventure="Kaland";
            
            String_OM_Other = "Más";
            String_OM_Graphics = "Grafika";
            String_OM_Sound = "Hang";
            String_OM_PlayerSetup = "Lejátszó Beállítás";
            String_OM_Language = "Nyelv";
            String_OM_Profile = "Profil";
            String_OM_Controls = "Ellenőrzések";
            
            
            
            
            String_HM_Weather = "Időjárás Segítség";
            String_HM_Treasures = "Kincsek Segítség";
            String_HM_Boxes = "Dobozok Segítség";
            String_HM_Decorations = "Dekoráció Segítség";
            String_HM_SinglePlayer = "Egyjátékos Segítség";
            String_HM_Arena = "Küzdőtér Segítség";
            String_HM_Adventure = "Kaland Segítség";
            String_HM_Explosives = "Robbanóanyagok Segítség";
            String_HM_Turrets = "Tornyokkal Segítség";
            String_HM_Cheats = "Csal Segítség";
            String_HM_Tutorial = "Oktatói";
            String_HM_PowerUps = "Hatáskörök Segítség";
            String_HM_Enemies = "Ellenség Segítség";
        }
    }
    
    public void mousePressed(MouseEvent e){
        int mx = e.getX();
        int my = e.getY();
        //System.out.println(mx);
        //System.out.println(my);
        
        //PLAY BUTTON415, 80, 200, 64
        
        
        
        if(mouseOver(mx, my, ButtonX_MM_Play, ButtonY_MM_Play, ButtonX_Size_MM, ButtonY_Size_MM) && Game.gameState == ChewingGumSimulator.STATE.Menu){
            
            if(ChewingGumSimulator.tutorials==true){
                Game.gameState = ChewingGumSimulator.STATE.MiniTutorialGame;
            }
            else if(ChewingGumSimulator.tutorials==false){
            
            
            Game.gameState = ChewingGumSimulator.STATE.StoryScreenOne;}
            
            
            
            
        }
        //ADVENTURE BUTTON
        if(mouseOver(mx, my, ButtonX_MM_Adventure, ButtonY_MM_Adventure, ButtonX_Size_MM, ButtonY_Size_MM) && Game.gameState == ChewingGumSimulator.STATE.Menu){
            
            
            
            
            Game.gameState = ChewingGumSimulator.STATE.AdventureSelect;
            
            
            
            
        }
        
        
        //QUIT GAME
        if(mouseOver(mx,my,ButtonX_MM_Quit,ButtonY_MM_Quit,ButtonX_Size_MM,ButtonY_Size_MM) && Game.gameState == ChewingGumSimulator.STATE.Menu){
            Game.SaveGame();
            System.exit(1);
            
      }
        
        //ARENA BUTTON
        if(mouseOver(mx, my, ButtonX_MM_Arena, ButtonY_MM_Arena, ButtonX_Size_MM, ButtonY_Size_MM) && Game.gameState == ChewingGumSimulator.STATE.Menu){
            
            if(ChewingGumSimulator.tutorials==true){
                Game.gameState = ChewingGumSimulator.STATE.MiniTutorialArena;
            }
            else if(ChewingGumSimulator.tutorials==false){
            
            
            Game.gameState = ChewingGumSimulator.STATE.ArenaSelect;}
            
            
            
            
        }
        
        //ARENA SELECT BACK BUTTON
        if(mouseOver(mx, my, ButtonX_AA_Back, 360, 200, 64) && Game.gameState == ChewingGumSimulator.STATE.ArenaSelect){
            
            Game.gameState = ChewingGumSimulator.STATE.Menu;
            
            
            
            
        }
        
        //ARENA ONE SELECT BUTTON400, 360, 200, 64
        if(mouseOver(mx, my, ButtonX_AA_A1,ButtonY_AA_A1, ButtonX_Size_MM, ButtonY_Size_MM) && Game.gameState == ChewingGumSimulator.STATE.ArenaSelect){
            
            
            Spawn.arenaSpawn=0;
            hud.score(0);
            hud.setLevel(1);
            hud.HEALTH=100;
            hud.HEALTH2=100;
            hud.EMPCount = 0;
            hud.AMMO=100;
            hud.BLADDER=100;
            
            Game.gameState = ChewingGumSimulator.STATE.Arena;
            
            
            
            
        }
        //ARENA MINI TUTORIAL START
        if(mouseOver(mx, my, 400, 360, 200, 64) && Game.gameState == ChewingGumSimulator.STATE.MiniTutorialArena){
            Spawn.arenaSpawn=0;
            Game.gameState = ChewingGumSimulator.STATE.ArenaSelect;
            
            
            
            
        }
        
        //ARENA MINI TUTORIAL BACK
        if(mouseOver(mx, my, 20, 360, 200, 64) && Game.gameState == ChewingGumSimulator.STATE.MiniTutorialArena){
            
            Game.gameState = ChewingGumSimulator.STATE.Menu;
            
            
            
            
        }
        
        //GAME MINI TUTORIAL START
        if(mouseOver(mx, my, 400, 360, 200, 64) && Game.gameState == ChewingGumSimulator.STATE.MiniTutorialGame){
            
            Game.gameState = ChewingGumSimulator.STATE.StoryScreenOne;
            
            
            
            
        }
        
        //GAME MINI TUTORIAL BACK5, 360, 200, 64
        if(mouseOver(mx, my, 20, 360, 200, 64) && Game.gameState == ChewingGumSimulator.STATE.MiniTutorialGame){
            Spawn.arenaSpawn=0;
            Game.gameState = ChewingGumSimulator.STATE.Menu;
            
            
            
            
        }
        
        //STORY SCREEN ONE BACK BUTTON
        if(mouseOver(mx, my, 5, 360, 200, 64) && Game.gameState == ChewingGumSimulator.STATE.StoryScreenOne){
            
            Game.gameState = ChewingGumSimulator.STATE.Menu;
            
            
            
            
        }
        
        //ARENA TWO SELECT BUTTON
        if(mouseOver(mx, my, ButtonX_AA_A2, ButtonY_AA_A2, ButtonX_Size_MM, ButtonY_Size_MM) && Game.gameState == ChewingGumSimulator.STATE.ArenaSelect){
            Spawn.arenaSpawn=0;
            hud.score(0);
            hud.setLevel(1);
            hud.HEALTH=100;
            hud.HEALTH2=100;
            hud.EMPCount = 0;
            hud.AMMO=100;
            hud.BLADDER=100;
            Game.gameState = ChewingGumSimulator.STATE.ArenaTwo;
            
            
            
            
        }
        
        //ARENA THREE SELECT BUTTON
        if(mouseOver(mx, my, ButtonX_AA_A3, ButtonY_AA_A3, ButtonX_Size_MM, ButtonY_Size_MM) && Game.gameState == ChewingGumSimulator.STATE.ArenaSelect){
            Spawn.arenaSpawn=0;
            Game.gameState = ChewingGumSimulator.STATE.ArenaThree;
            
            
            
            
        }
        
        //ARENA FOUR SELECT BUTTON
        if(mouseOver(mx, my, ButtonX_AA_A4, ButtonY_AA_A4, ButtonX_Size_MM, ButtonY_Size_MM) && Game.gameState == ChewingGumSimulator.STATE.ArenaSelect){
            Spawn.arenaSpawn=0;
            Game.gameState = ChewingGumSimulator.STATE.ArenaFour;
            
            
            
            
        }
        
        //ARENA FIVE SELECT BUTTON
        if(mouseOver(mx, my, ButtonX_AA_A5, ButtonY_AA_A5, ButtonX_Size_MM, ButtonY_Size_MM) && Game.gameState == ChewingGumSimulator.STATE.ArenaSelect){
            Spawn.arenaSpawn=0;
            Game.gameState = ChewingGumSimulator.STATE.ArenaFive;
            
            
            
            
        }
        //ARENA SIX SELECT BUTTON
        if(mouseOver(mx, my, ButtonX_AA_A6, ButtonY_AA_A6, ButtonX_Size_MM, ButtonY_Size_MM) && Game.gameState == ChewingGumSimulator.STATE.ArenaSelect){
            Spawn.arenaSpawn=0;
            Game.gameState = ChewingGumSimulator.STATE.ArenaSix;
            
            
            
            
        }
        
        //ARENA SEVEN SELECT BUTTON
        if(mouseOver(mx, my, ButtonX_AA_A7, ButtonY_AA_A7, ButtonX_Size_MM, ButtonY_Size_MM) && Game.gameState == ChewingGumSimulator.STATE.ArenaSelect){
            Spawn.arenaSpawn=0;
            Game.gameState = ChewingGumSimulator.STATE.ArenaSeven;
            
            
            
            
        }
        
        //ARENA EIGHT SELECT BUTTON
        if(mouseOver(mx, my, ButtonX_AA_A8, ButtonY_AA_A8, ButtonX_Size_MM, ButtonY_Size_MM) && Game.gameState == ChewingGumSimulator.STATE.ArenaSelect){
            Spawn.arenaSpawn=0;
            Game.gameState = ChewingGumSimulator.STATE.ArenaEight;
            
            
            
            
        }
        
        //ARENA NINE SELECT BUTTON
        if(mouseOver(mx, my, ButtonX_AA_A9, ButtonY_AA_A9, ButtonX_Size_MM, ButtonY_Size_MM) && Game.gameState == ChewingGumSimulator.STATE.ArenaSelect){
            Spawn.arenaSpawn=0;
            Game.gameState = ChewingGumSimulator.STATE.ArenaNine;
            
            
            
            
        }
        
        // ARENA 1 BACK BUTTON
        if(mouseOver(mx,my,400, 360, 200, 64) && Game.gameState == ChewingGumSimulator.STATE.ArenaWP1){
            Game.gameState = ChewingGumSimulator.STATE.Menu;
            
      }
        // ARENA 2 BACK BUTTON
        if(mouseOver(mx,my,400, 360, 200, 64) && Game.gameState == ChewingGumSimulator.STATE.ArenaWP2){
            Game.gameState = ChewingGumSimulator.STATE.Menu;
            
      }
        
        // ARENA SELECT
        if(mouseOver(mx,my,ButtonX_AA_Custom, ButtonY_AA_Custom, ButtonX_Size_MM, ButtonY_Size_MM) && Game.gameState == ChewingGumSimulator.STATE.ArenaSelect){
            Game.gameState = ChewingGumSimulator.STATE.ArenaEditor;
            
      }
        
        // ARENA EDITOR - WEATHER -  ADD RAIN
        if(mouseOver(mx,my,10, 104, 200, 64) && Game.gameState == ChewingGumSimulator.STATE.ArenaSWeather){
            
            handler.addObject(new RainCloud((ChewingGumSimulator.WIDTH / 3)-48,0,ID.RainCloud,handler));
            
            Game.gameState = ChewingGumSimulator.STATE.ArenaEditor;
            
            
      }
        
        
        // ARENA EDITOR - WEATHER -  ADD SNOW
        if(mouseOver(mx,my,10, 184, 200, 64) && Game.gameState == ChewingGumSimulator.STATE.ArenaSWeather){
            handler.addObject(new SnowCloud((ChewingGumSimulator.WIDTH / 3)-48,0,ID.SnowCloud,handler));
            Game.gameState = ChewingGumSimulator.STATE.ArenaEditor;
            
      }
        
        
        // ARENA EDITOR - WEATHER -  ADD THUNDER
        if(mouseOver(mx,my,10, 268, 200, 64) && Game.gameState == ChewingGumSimulator.STATE.ArenaSWeather){
            handler.addObject(new ThunderCloud((ChewingGumSimulator.WIDTH / 3)-48,0,ID.ThunderCloud,handler));
            Game.gameState = ChewingGumSimulator.STATE.ArenaEditor;
            
      }
        
        
        // ARENA EDITOR - WEATHER -  ADD FALLOUT
        if(mouseOver(mx,my,10, 352, 200, 64) && Game.gameState == ChewingGumSimulator.STATE.ArenaSWeather){
            handler.addObject(new FalloutCloud((ChewingGumSimulator.WIDTH / 3)-48,0,ID.FalloutCloud,handler));
            Game.gameState = ChewingGumSimulator.STATE.ArenaEditor;
            
      }
        
        
        
        //OPTIONS BUTTON
        if(mouseOver(mx, my, ButtonX_MM_Options, ButtonY_MM_Options, ButtonX_Size_MM, ButtonY_Size_MM) && Game.gameState == ChewingGumSimulator.STATE.Menu){
            
            Game.gameState = ChewingGumSimulator.STATE.Options;
            
            
            
            
        }
        //BACKGROUND SELECT - BLACK BACKGROUND
        if(mouseOver(mx, my, 10, 20, 200, 64) && Game.gameState == ChewingGumSimulator.STATE.BackgroundSelect){
            
            
            Game.SaveGame();
            
            
            
            
        }
        
        //BACKGROUND SELECT - MAGENTA BACKGROUND
        if(mouseOver(mx, my, 10, 104, 200, 64) && Game.gameState == ChewingGumSimulator.STATE.BackgroundSelect){
            
            ChewingGumSimulator.backgroundSelection=11;
            Game.SaveGame();
            
            
            
        }
        
        //BACKGROUND SELECT - Sunset BACKGROUND
        if(mouseOver(mx, my, 10, 268, 200, 64) && Game.gameState == ChewingGumSimulator.STATE.BackgroundSelect){
            
            ChewingGumSimulator.backgroundSelection=4;
            Game.SaveGame();
            
            
            
        }
        
        //BACKGROUND SELECT - Desert BACKGROUND
        if(mouseOver(mx, my, 10, 352, 200, 64) && Game.gameState == ChewingGumSimulator.STATE.BackgroundSelect){
            
            ChewingGumSimulator.backgroundSelection=5;
            Game.SaveGame();
            
            
            
        }
        
        //BACKGROUND SELECT - Stone BACKGROUND
        if(mouseOver(mx, my, 220, 20, 200, 64) && Game.gameState == ChewingGumSimulator.STATE.BackgroundSelect){
            
            ChewingGumSimulator.backgroundSelection=6;
            Game.SaveGame();
            
            
            
        }
        
        //BACKGROUND SELECT - Field BACKGROUND
        if(mouseOver(mx, my, 220, 188, 200, 64) && Game.gameState == ChewingGumSimulator.STATE.BackgroundSelect){
            
            ChewingGumSimulator.backgroundSelection=1;
            Game.SaveGame();
            
            
            
        }
        
        //BACKGROUND SELECT - Sunset Sea BACKGROUND220, 104, 200, 64
        if(mouseOver(mx, my, 220, 268, 200, 64) && Game.gameState == ChewingGumSimulator.STATE.BackgroundSelect){
            
            ChewingGumSimulator.backgroundSelection=7;
            Game.SaveGame();
            
            
            
        }
        
        //BACKGROUND SELECT - Space BACKGROUND
        if(mouseOver(mx, my, 220, 104, 200, 64) && Game.gameState == ChewingGumSimulator.STATE.BackgroundSelect){
            
            ChewingGumSimulator.backgroundSelection=12;
            Game.SaveGame();
            
            
            
        }
        //BACKGROUND SELECT - Sunset Hill BACKGROUND
        if(mouseOver(mx, my, 220, 352, 200, 64) && Game.gameState == ChewingGumSimulator.STATE.BackgroundSelect){
            
            ChewingGumSimulator.backgroundSelection=8;
            Game.SaveGame();
            
            
            
        }
        
        //BACKGROUND SELECT - Normand Sea BACKGROUND
        if(mouseOver(mx, my, 430, 20, 200, 64) && Game.gameState == ChewingGumSimulator.STATE.BackgroundSelect){
            
            ChewingGumSimulator.backgroundSelection=9;
            Game.SaveGame();
            
            
            
        }
        
        //BACKGROUND SELECT - Normand Sunset BACKGROUND
        if(mouseOver(mx, my, 430, 104, 200, 64) && Game.gameState == ChewingGumSimulator.STATE.BackgroundSelect){
            
            ChewingGumSimulator.backgroundSelection=10;
            Game.SaveGame();
            
            
            
        }
        
        //BACKGROUND SELECT - BACK BUTTON
        if(mouseOver(mx, my, 430, 184, 200, 64) && Game.gameState == ChewingGumSimulator.STATE.BackgroundSelect){
            
            Game.gameState = ChewingGumSimulator.STATE.GraphicsOption;
            
            
            
            
        }
        //MENU BACKGROUND SELECT - BACK BUTTON
        if(mouseOver(mx, my, 430, 184, 200, 64) && Game.gameState == ChewingGumSimulator.STATE.MenuBackgroundSelect){
            
            Game.gameState = ChewingGumSimulator.STATE.GraphicsOption;
            
            
            
            
        }
        
        
        //HELP BUTTON
        if(mouseOver(mx, my, ButtonX_MM_Help, ButtonY_MM_Help, ButtonX_Size_MM, ButtonY_Size_MM) && Game.gameState == ChewingGumSimulator.STATE.Menu){
            Game.gameState = ChewingGumSimulator.STATE.Help;
      }
        
        
        
        
        
        
        //ABOUT BUTTON
        if(mouseOver(mx,my,ButtonX_MM_About, ButtonY_MM_About, ButtonX_Size_MM, ButtonY_Size_MM) && Game.gameState == ChewingGumSimulator.STATE.Menu){
            
            Game.gameState = ChewingGumSimulator.STATE.About;
      }
        
        
        
        // HELP BACK BUTTON
        if(mouseOver(mx,my,ButtonX_HM_Back, ButtonY_HM_Back, ButtonX_Size_MM, ButtonY_Size_MM) && Game.gameState == ChewingGumSimulator.STATE.Help){
            Game.gameState = ChewingGumSimulator.STATE.Menu;
      }
        
        
        // HELP SINGLE PLAYER
        if(mouseOver(mx,my,ButtonX_HM_SinglePlayer, ButtonY_HM_SinglePlayer, ButtonX_Size_MM, ButtonY_Size_MM) && Game.gameState == ChewingGumSimulator.STATE.Help){
            Game.gameState = ChewingGumSimulator.STATE.SingleHelp;
      }
        
        
        // HELP TURRETS
        if(mouseOver(mx,my,ButtonX_HM_Turrets, ButtonY_HM_Turrets, ButtonX_Size_MM, ButtonY_Size_MM) && Game.gameState == ChewingGumSimulator.STATE.Help){
            Game.gameState = ChewingGumSimulator.STATE.StraightTurretHelp;
      }
        
        // HELP ARENA
        if(mouseOver(mx,my,ButtonX_HM_Arena, ButtonY_HM_Arena, ButtonX_Size_MM, ButtonY_Size_MM) && Game.gameState == ChewingGumSimulator.STATE.Help){
            Game.gameState = ChewingGumSimulator.STATE.ArenaHelp;
      }
        
        // HELP CHEATS
        if(mouseOver(mx,my,ButtonX_HM_Cheats, ButtonY_HM_Cheats, ButtonX_Size_MM, ButtonY_Size_MM) && Game.gameState == ChewingGumSimulator.STATE.Help){
            Game.gameState = ChewingGumSimulator.STATE.CheatsHelp;
      }
        
        // HELP ENEMIES
        
        
        
        if(mouseOver(mx,my,ButtonX_HM_Enemies, ButtonY_HM_Enemies, ButtonX_Size_MM, ButtonY_Size_MM) && Game.gameState == ChewingGumSimulator.STATE.Help){
            Game.gameState = ChewingGumSimulator.STATE.BasicEnemyHelp;
      }
        
        // HELP Bronze TREASURES
        if(mouseOver(mx,my,ButtonX_HM_Treasures, ButtonY_HM_Treasures, ButtonX_Size_MM, ButtonY_Size_MM) && Game.gameState == ChewingGumSimulator.STATE.Help){
            Game.gameState = ChewingGumSimulator.STATE.BronzeTreasureHelp;
      }
        
        // HELP Silver TREASURES
        if(mouseOver(mx,my,400, 360, 200, 64) && Game.gameState == ChewingGumSimulator.STATE.BronzeTreasureHelp){
            Game.gameState = ChewingGumSimulator.STATE.SilverTreasureHelp;
      }
        
        // HELP Gold TREASURES
        if(mouseOver(mx,my,20, 360, 200, 64) && Game.gameState == ChewingGumSimulator.STATE.SilverTreasureHelp){
            Game.gameState = ChewingGumSimulator.STATE.GoldTreasureHelp;
      }
        // HELP BACK TREASURES
        if(mouseOver(mx,my,400, 360, 200, 64) && Game.gameState == ChewingGumSimulator.STATE.GoldTreasureHelp){
            Game.gameState = ChewingGumSimulator.STATE.Help;
            handler.clearEnemies();
            Spawn.TreasureHelp=false;
      }
        
        // HELP STRAIGHT TURRET >> PARTICLE TURRET
        if(mouseOver(mx,my,20, 360, 200, 64) && Game.gameState == ChewingGumSimulator.STATE.StraightTurretHelp){
            Game.gameState = ChewingGumSimulator.STATE.ParticleTurretHelp;
      }
        
        // HELP PARTICLE TURRET >> AUTO TURRET
        if(mouseOver(mx,my,200, 360, 200, 64) && Game.gameState == ChewingGumSimulator.STATE.ParticleTurretHelp){
            Game.gameState = ChewingGumSimulator.STATE.AutoTurretHelp;
      }
        
        // HELP AUTO TURRET >> HELP MENU
        if(mouseOver(mx,my,400, 360, 200, 64) && Game.gameState == ChewingGumSimulator.STATE.AutoTurretHelp){
            Game.gameState = ChewingGumSimulator.STATE.Help;
            
            Spawn.TurretHelp=false;
      }
        
        
        // HELP BUSH
        if(mouseOver(mx,my,ButtonX_HM_Decorations, ButtonY_HM_Decorations, ButtonX_Size_MM, ButtonY_Size_MM) && Game.gameState == ChewingGumSimulator.STATE.Help){
            Game.gameState = ChewingGumSimulator.STATE.BushHelp;
      }
        
        // HELP TREE
        if(mouseOver(mx,my,400, 360, 200, 64) && Game.gameState == ChewingGumSimulator.STATE.BushHelp){
            Game.gameState = ChewingGumSimulator.STATE.TreeHelp;
      }
        
        // HELP CACTUS
        if(mouseOver(mx,my,20, 360, 200, 64) && Game.gameState == ChewingGumSimulator.STATE.TreeHelp){
            Game.gameState = ChewingGumSimulator.STATE.CactusHelp;
      }
        
        // HELP BACK DECORATIONS420, 80, 200, 64
        if(mouseOver(mx,my,400, 360, 200, 64) && Game.gameState == ChewingGumSimulator.STATE.CactusHelp){
            Game.gameState = ChewingGumSimulator.STATE.Help;
            handler.clearEnemies();
            Spawn.DecoHelp=false;
      }
        
        
        // HELP HELP MENU >> FISSION
        if(mouseOver(mx,my,ButtonX_HM_Explosives, ButtonY_HM_Explosives, ButtonX_Size_MM, ButtonY_Size_MM) && Game.gameState == ChewingGumSimulator.STATE.Help){
            Game.gameState = ChewingGumSimulator.STATE.FissionHelp;
      }
        
        // HELP FISSION >> FUSION
        if(mouseOver(mx,my,400, 360, 200, 64) && Game.gameState == ChewingGumSimulator.STATE.FissionHelp){
            Game.gameState = ChewingGumSimulator.STATE.FusionHelp;
      }
        
        // HELP FUSION >> BACK TO HELP
        if(mouseOver(mx,my,20, 360, 200, 64) && Game.gameState == ChewingGumSimulator.STATE.FusionHelp){
            Game.gameState = ChewingGumSimulator.STATE.Help;
            
      }
        
        // HELP  RAIN WEATHER
        if(mouseOver(mx,my,ButtonX_HM_Weather, ButtonY_HM_Weather, ButtonX_Size_MM, ButtonY_Size_MM) && Game.gameState == ChewingGumSimulator.STATE.Help){
            Game.gameState = ChewingGumSimulator.STATE.RainHelp;
      }
        
        // HELP SNOW WEATHER
        if(mouseOver(mx,my,400, 360, 200, 64) && Game.gameState == ChewingGumSimulator.STATE.RainHelp){
            Game.gameState = ChewingGumSimulator.STATE.SnowHelp;
      }
        
        // HELP FALLOUT
        if(mouseOver(mx,my,200, 360, 200, 64) && Game.gameState == ChewingGumSimulator.STATE.SnowHelp){
            Game.gameState = ChewingGumSimulator.STATE.ThunderHelp;
      }
        
        // HELP THUNDER >> FALLOUT
        if(mouseOver(mx,my,20, 360, 200, 64) && Game.gameState == ChewingGumSimulator.STATE.ThunderHelp){
            Game.gameState = ChewingGumSimulator.STATE.FalloutHelp;
      }
        
        // HELP BACK WEATHER
        if(mouseOver(mx,my,400, 360, 200, 64) && Game.gameState == ChewingGumSimulator.STATE.FalloutHelp){
            Game.gameState = ChewingGumSimulator.STATE.Help;
            handler.wipeFallout();
            handler.wipeFallout();
      }
        
        // HELP BLOOD CELL >> PLATELET
        if(mouseOver(mx,my,400, 360, 200, 64) && Game.gameState == ChewingGumSimulator.STATE.BasicEnemyHelp){
            Game.gameState = ChewingGumSimulator.STATE.PlateletCellHelp;
      }
        
        // HELP PLATELET >> FAST ENEMY
        if(mouseOver(mx,my,200, 360, 200, 64) && Game.gameState == ChewingGumSimulator.STATE.PlateletCellHelp){
            Game.gameState = ChewingGumSimulator.STATE.FastEnemyHelp;
            Spawn.FastEnemyHelp = true;
      }
        
        // HELP NEXT NEUTRINO
        if(mouseOver(mx,my,220, 360, 200, 64) && Game.gameState == ChewingGumSimulator.STATE.NeutrinoHelp){
            Game.gameState = ChewingGumSimulator.STATE.HiggsBosonHelp;
      }
        
        // HELP NEXT HIGGS BOSON
        if(mouseOver(mx,my,400, 360, 200, 64) && Game.gameState == ChewingGumSimulator.STATE.HiggsBosonHelp){
            Game.gameState = ChewingGumSimulator.STATE.SmartEnemyHelp; // WAS wHITE CELL
      }
        
        
        // HELP NEXT SMART ENEMY
        if(mouseOver(mx,my,20, 360, 200, 64) && Game.gameState == ChewingGumSimulator.STATE.SmartEnemyHelp){
            Game.gameState = ChewingGumSimulator.STATE.BCellHelp;
      }
        
        // HELP NEXT BCELL ENEMY
        if(mouseOver(mx,my,400, 360, 200, 64) && Game.gameState == ChewingGumSimulator.STATE.BCellHelp){
            Game.gameState = ChewingGumSimulator.STATE.TCellHelp;
      }
        
         // HELP NEXT TCELL ENEMY
        if(mouseOver(mx,my,20, 360, 200, 64) && Game.gameState == ChewingGumSimulator.STATE.TCellHelp){
            
            Game.gameState = ChewingGumSimulator.STATE.WhiteCellHelp;
            Spawn.FastEnemyHelp=false;
      }
        
        
        // HELP NEXT NEUTRINO ENEMY
        if(mouseOver(mx,my,20, 360, 200, 64) && Game.gameState == ChewingGumSimulator.STATE.FastEnemyHelp){
            Game.gameState = ChewingGumSimulator.STATE.NeutrinoHelp;
      }
        
        // HELP NEXT WHITE CELL
        if(mouseOver(mx,my,250, 360, 200, 64) && Game.gameState == ChewingGumSimulator.STATE.WhiteCellHelp){
            Game.gameState = ChewingGumSimulator.STATE.BossSuckerHelp;
      }
        
        // HELP NEXT BOSS SUCKER
        if(mouseOver(mx,my,20, 360, 200, 64) && Game.gameState == ChewingGumSimulator.STATE.BossSuckerHelp){
            Game.gameState = ChewingGumSimulator.STATE.BossOneHelp;
      }
        
        
        
        // HELP NEXT BOSSONE ENEMY
        if(mouseOver(mx,my,400, 360, 200, 64) && Game.gameState == ChewingGumSimulator.STATE.BossOneHelp){
            Game.gameState = ChewingGumSimulator.STATE.BossTwoHelp;
            
           
      }
        
        // HELP NEXT BOSSTWO ENEMY
        if(mouseOver(mx,my,10, 360, 200, 64) && Game.gameState == ChewingGumSimulator.STATE.BossTwoHelp){
            Game.gameState = ChewingGumSimulator.STATE.BossThreeHelp;
            
           
      }
        
        // HELP NEXT BOSSTHREE ENEMY
        if(mouseOver(mx,my,400, 360, 200, 64) && Game.gameState == ChewingGumSimulator.STATE.BossThreeHelp){
            Game.gameState = ChewingGumSimulator.STATE.BossFourHelp;
            
           
      }
        
        
        
        // HELP NEXT BOSSFIVE ENEMY
        if(mouseOver(mx,my,10, 360, 200, 64) && Game.gameState == ChewingGumSimulator.STATE.BossFourHelp){
            Game.gameState = ChewingGumSimulator.STATE.BossFiveHelp;
            
           
      }
        
        // HELP NEXT BOSSFIVE ENEMY
        if(mouseOver(mx,my,400, 360, 200, 64) && Game.gameState == ChewingGumSimulator.STATE.BossFiveHelp){
            Game.gameState = ChewingGumSimulator.STATE.Help;
            handler.wipeBoss5();
            Spawn.FastEnemyHelp=false;
           
      }
        
        
        // HELP >> SHIELD HELP ( POWER UPS)
        if(mouseOver(mx,my,ButtonX_HM_PowerUps, ButtonY_HM_PowerUps, ButtonX_Size_MM, ButtonY_Size_MM) && Game.gameState == ChewingGumSimulator.STATE.Help){
            Game.gameState = ChewingGumSimulator.STATE.ShieldHelp;
      }
        //HELP SHIELD HELP >> SPEED HELP
        if(mouseOver(mx,my,400, 360, 200, 64) && Game.gameState == ChewingGumSimulator.STATE.ShieldHelp){
            Game.gameState = ChewingGumSimulator.STATE.SpeedHelp;
      }
        
        //HELP SPEED HELP >> HELP
        if(mouseOver(mx,my,20, 360, 200, 64) && Game.gameState == ChewingGumSimulator.STATE.SpeedHelp){
            Game.gameState = ChewingGumSimulator.STATE.Help;
      }
        
        // HELP BOXES
        if(mouseOver(mx,my,ButtonX_HM_Boxes, ButtonY_HM_Boxes, ButtonX_Size_MM, ButtonY_Size_MM) && Game.gameState == ChewingGumSimulator.STATE.Help){
            Game.gameState = ChewingGumSimulator.STATE.HealthBoxHelp;
      }
        // HELP NEXT BOX AMMO BOX
        if(mouseOver(mx,my,400, 360, 200, 64) && Game.gameState == ChewingGumSimulator.STATE.HealthBoxHelp){
            Game.gameState = ChewingGumSimulator.STATE.AmmoBoxHelp;
      }
        
        // HELP NEXT BOX EMP BOX
        if(mouseOver(mx,my,20, 360, 200, 64) && Game.gameState == ChewingGumSimulator.STATE.AmmoBoxHelp){
            Game.gameState = ChewingGumSimulator.STATE.EMPBoxHelp;
      }
        
        // HELP NEXT BOX EMP BOX
        if(mouseOver(mx,my,400, 360, 200, 64) && Game.gameState == ChewingGumSimulator.STATE.EMPBoxHelp){
            
            handler.clearEnemies();
            Game.gameState = ChewingGumSimulator.STATE.Help;
            Spawn.BoxesHelp=false;
      }
        // HELP SINGLE EXIT BUTTON
        if(mouseOver(mx,my,20, 360, 200, 64) && Game.gameState == ChewingGumSimulator.STATE.SingleHelp){
            Game.gameState = ChewingGumSimulator.STATE.Help;
      }
        // HELP ARENA EXIT BUTTON
        if(mouseOver(mx,my,20, 360, 200, 64) && Game.gameState == ChewingGumSimulator.STATE.ArenaHelp){
            Game.gameState = ChewingGumSimulator.STATE.Help;
      }
        // HELP CHEATS EXIT BUTTON
        if(mouseOver(mx,my,20, 360, 200, 64) && Game.gameState == ChewingGumSimulator.STATE.CheatsHelp){
            Game.gameState = ChewingGumSimulator.STATE.Help;//20, 360, 200, 64
      }
        
        
        // TUTORIAL START BUTTON
        if(mouseOver(mx,my,ButtonX_HM_Tutorial, ButtonY_HM_Tutorial, ButtonX_Size_MM, ButtonY_Size_MM) && Game.gameState == ChewingGumSimulator.STATE.Help){
            Game.gameState = ChewingGumSimulator.STATE.Tutorial;
      }
        
        
        
        // TUTORIAL END EXIT MENU BUTTON
        if(mouseOver(mx,my,400, 360, 200, 64) && Game.gameState == ChewingGumSimulator.STATE.EndTutorial){
            Game.gameState = ChewingGumSimulator.STATE.Help;
      }
        
        
        // TUTORIAL END RETRY MENU BUTTON
        if(mouseOver(mx,my,20, 360, 200, 64) && Game.gameState == ChewingGumSimulator.STATE.EndTutorial){
            handler.clearEnemies();
            Game.gameState = ChewingGumSimulator.STATE.Tutorial;
            handler.addObject(new Player(ChewingGumSimulator.WIDTH/2-32, ChewingGumSimulator.HEIGHT/2-32, ID.Player,handler));
            
            
            
      }
        
        //OPTIONS PROFILE
        if(mouseOver(mx,my,5, 220, 200, 64) && Game.gameState == ChewingGumSimulator.STATE.Options){
            
            Game.gameState = ChewingGumSimulator.STATE.Options_Profile;
      }
        
        
        //OPTIONS LANGUAGES
        if(mouseOver(mx,my,5, 150, 200, 64) && Game.gameState == ChewingGumSimulator.STATE.Options){
            
            Game.gameState = ChewingGumSimulator.STATE.Options_Language;
      }
        
        
        
        
        //OPTIONS LANGUAGES HUNGARIAN
        if(mouseOver(mx,my,210, 280, 200, 64) && Game.gameState == ChewingGumSimulator.STATE.Options_Language){
            
            Game.gameLang=LANGUAGE.Hungarian;
      }
        
        //OPTIONS LANGUAGES HUNGARIAN
        if(mouseOver(mx,my,210, 140, 200, 64) && Game.gameState == ChewingGumSimulator.STATE.Options_Language){
            
            Game.gameLang=LANGUAGE.English;
      }
        
        //OPTIONS LANGUAGES BACK
        if(mouseOver(mx,my,5, 350, 200, 64) && Game.gameState == ChewingGumSimulator.STATE.Options_Language){
            
            Game.gameState = ChewingGumSimulator.STATE.Options;
      }
        
        
        
        // ABOUT BACK BUTTON
        if(mouseOver(mx,my,210, 360, 200, 64) && Game.gameState == ChewingGumSimulator.STATE.About){
            Game.gameState = ChewingGumSimulator.STATE.Menu;
      }
        
        // OPTIONS GRAPHICS
        if(mouseOver(mx,my,415,220, 200, 64) && Game.gameState == ChewingGumSimulator.STATE.Options){
            Game.gameState = ChewingGumSimulator.STATE.GraphicsOption;
      }
        
        // OPTIONS OTHER
        if(mouseOver(mx,my,5, 290, 200, 64) && Game.gameState == ChewingGumSimulator.STATE.Options){
            Game.gameState = ChewingGumSimulator.STATE.Options_Other;
      }
        
        
        
        
        
        
        
        
        // OPTIONS PLAYER WHITE BUTTON
        if(mouseOver(mx,my,210, 140, 200, 64) && Game.gameState == ChewingGumSimulator.STATE.PlayerColorMenu){
            
            ChewingGumSimulator.PlayerColor = 0;
            Game.gameState = ChewingGumSimulator.STATE.Options_PlayerSetup;
      }
        // OPTIONS PLAYER ORANGE BUTTON
        if(mouseOver(mx,my,210, 210, 200, 64) && Game.gameState == ChewingGumSimulator.STATE.PlayerColorMenu){
            
            ChewingGumSimulator.PlayerColor = 1;
            Game.gameState = ChewingGumSimulator.STATE.Options_PlayerSetup;
      }
        
        // OPTIONS PLAYER GREEN BUTTON
        if(mouseOver(mx,my,210, 280, 200, 64) && Game.gameState == ChewingGumSimulator.STATE.PlayerColorMenu){
            
            ChewingGumSimulator.PlayerColor = 2;
            Game.gameState = ChewingGumSimulator.STATE.Options_PlayerSetup;
      }
        
        // OPTIONS PLAYER CYAN BUTTON 
        if(mouseOver(mx,my,420, 140, 200, 64) && Game.gameState == ChewingGumSimulator.STATE.PlayerColorMenu){
            
            ChewingGumSimulator.PlayerColor = 3;
            Game.gameState = ChewingGumSimulator.STATE.Options_PlayerSetup;
      }
        
        // OPTIONS PLAYER RED BUTTON
        if(mouseOver(mx,my,420, 210, 200, 64) && Game.gameState == ChewingGumSimulator.STATE.PlayerColorMenu){
            
            ChewingGumSimulator.PlayerColor = 4;
            Game.gameState = ChewingGumSimulator.STATE.Options_PlayerSetup;
      }
        
        // OPTIONS PLAYER YELLOW BUTTON
        if(mouseOver(mx,my,420, 280, 200, 64) && Game.gameState == ChewingGumSimulator.STATE.PlayerColorMenu){
            
            ChewingGumSimulator.PlayerColor = 5;
            Game.gameState = ChewingGumSimulator.STATE.Options_PlayerSetup;
      }
        
        // OPTIONS PLAYER MAGENTA BUTTON
        if(mouseOver(mx,my,5, 140, 200, 64) && Game.gameState == ChewingGumSimulator.STATE.PlayerColorMenu){
            
            ChewingGumSimulator.PlayerColor = 6;
            Game.gameState = ChewingGumSimulator.STATE.Options_PlayerSetup;
      }
        // OPTIONS PLAYER BLUE BUTTON
        if(mouseOver(mx,my,5, 210, 200, 64) && Game.gameState == ChewingGumSimulator.STATE.PlayerColorMenu){
            
            ChewingGumSimulator.PlayerColor = 7;
            Game.gameState = ChewingGumSimulator.STATE.Options_PlayerSetup;
      }
        
        
        
        
        // OPTIONS PLAYER COLOR BACK BUTTON415,290, 200, 64
        if(mouseOver(mx,my,420, 360, 200, 64) && Game.gameState == ChewingGumSimulator.STATE.PlayerColorMenu){
            Game.gameState = ChewingGumSimulator.STATE.Options_PlayerSetup;
      }
        
        
        // OPTIONS PLAYER 
        if(mouseOver(mx,my,415,290, 200, 64) && Game.gameState == ChewingGumSimulator.STATE.Options){
            Game.gameState = ChewingGumSimulator.STATE.Options_PlayerSetup;
      }
        
        
        //OPTIONS CONTROLS
        if(mouseOver(mx,my,210,290, 200, 64) && Game.gameState == ChewingGumSimulator.STATE.Options){
            
            Game.gameState = ChewingGumSimulator.STATE.Options_Controls;
      }
        
        // OPTIONS BACK BUTTON 5, 80, 200, 64
        if(mouseOver(mx,my,210, 360, 200, 64) && Game.gameState == ChewingGumSimulator.STATE.Options){
            Game.gameState = ChewingGumSimulator.STATE.Menu;
      }
        
        
        // OPTIONS_GRAPHICS  RESOLUTION BUTTON
        if(mouseOver(mx,my,10, 104, 200, 64) && Game.gameState == ChewingGumSimulator.STATE.GraphicsOption){
            Game.gameState = ChewingGumSimulator.STATE.Graphics_SelectResolution;
      }
        
        // OPTIONS_GRAPHICS  BACKGROUND COLOR
        if(mouseOver(mx,my,10, 184, 200, 64) && Game.gameState == ChewingGumSimulator.STATE.GraphicsOption){
            Game.gameState = ChewingGumSimulator.STATE.BackgroundSelect;
      }
        
        // OPTIONS_GRAPHICS  MENU BACKGROUND COLOR
        if(mouseOver(mx,my,10, 268, 200, 64) && Game.gameState == ChewingGumSimulator.STATE.GraphicsOption){
            Game.gameState = ChewingGumSimulator.STATE.MenuBackgroundSelect;
      }
        
        // OPTIONS_GRAPHICS  SHOW FPS SWITCH
        if(mouseOver(mx,my,10, 352, 200, 64) && Game.gameState == ChewingGumSimulator.STATE.GraphicsOption){
            if(Game.ShowFPS==true){
                Game.ShowFPS=false;
            }
            else if(Game.ShowFPS==false){
                Game.ShowFPS=true;
            }
      }
        
        // OPTIONS_GRAPHICS  BACK BUTTON
        if(mouseOver(mx,my,430, 352, 200, 64) && Game.gameState == ChewingGumSimulator.STATE.GraphicsOption){
            Game.gameState = ChewingGumSimulator.STATE.Options;
      }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        // OPTIONS_OTHER SOCIAL NETWORKS SWITCH
        if(mouseOver(mx,my,10, 104, 200, 64) && Game.gameState == ChewingGumSimulator.STATE.Options_Other){
            if(Game.socialNetworks==true){
                Game.socialNetworks=false;
            }
            else if(Game.socialNetworks==false){
                Game.socialNetworks=true;
            }
      }
        
        
        
        // OPTIONS_OTHER BLADDER SWITCH
        if(mouseOver(mx,my,10, 352, 200, 64) && Game.gameState == ChewingGumSimulator.STATE.Options_Other){
            if(Game.bladderActive==true){
                Game.bladderActive=false;
            }
            else if(Game.bladderActive==false){
                Game.bladderActive=true;
            }
      }
        
        // OPTIONS_OTHER CHEATS SWITCH
        if(mouseOver(mx,my,10,268, 200, 64) && Game.gameState == ChewingGumSimulator.STATE.Options_Other){
           if(Game.cheats==true){
                Game.cheats=false;
            }
            else if(Game.cheats==false){
                Game.cheats=true;
            }
      }
        
        
        // OPTIONS_OTHER TUTORIALS SWITCH
        if(mouseOver(mx,my,10,184, 200, 64) && Game.gameState == ChewingGumSimulator.STATE.Options_Other){
            if(Game.tutorials==true){
                Game.tutorials=false;
            }
            else if(Game.tutorials==false){
                Game.tutorials=true;
            }
      }
        
        // OPTIONS_OTHER  BACK BUTTON
        if(mouseOver(mx,my,430, 352, 200, 64) && Game.gameState == ChewingGumSimulator.STATE.Options_Other){
            Game.gameState = ChewingGumSimulator.STATE.Options;
            Game.SaveGame();
      }
        
        
        // OPTIONS_PLAYER UPGRADES BACK BUTTON
        if(mouseOver(mx,my,10, 360, 200, 64) && Game.gameState == ChewingGumSimulator.STATE.Options_PlayerUpgrades){
            Game.gameState = ChewingGumSimulator.STATE.Options_PlayerSetup;
            
      }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        // OPTIONS_PLAYER  COLOR
        if(mouseOver(mx,my,10, 104, 200, 64) && Game.gameState == ChewingGumSimulator.STATE.Options_PlayerSetup){
            Game.gameState = ChewingGumSimulator.STATE.PlayerColorMenu;
      }
        
        // OPTIONS_PLAYER  FACE
        if(mouseOver(mx,my,10, 184, 200, 64) && Game.gameState == ChewingGumSimulator.STATE.Options_PlayerSetup){
            Game.gameState = ChewingGumSimulator.STATE.BackgroundSelect;
      }
        
        // OPTIONS_PLAYER  UPGRADES
        if(mouseOver(mx,my,10, 268, 200, 64) && Game.gameState == ChewingGumSimulator.STATE.Options_PlayerSetup){
            Game.gameState = ChewingGumSimulator.STATE.Options_PlayerUpgrades;
      }
        
        // OPTIONS_PLAYER  ARENA PLAYERS
        if(mouseOver(mx,my,10, 352, 200, 64) && Game.gameState == ChewingGumSimulator.STATE.Options_PlayerSetup){
            if(Game.ShowFPS==true){
                Game.ShowFPS=false;
            }
            else if(Game.ShowFPS==false){
                Game.ShowFPS=true;
            }
      }
        
        
        // OPTIONS_PLAYER BACK BUTTON
        if(mouseOver(mx,my,430, 352, 200, 64) && Game.gameState == ChewingGumSimulator.STATE.Options_PlayerSetup){
            Game.gameState = ChewingGumSimulator.STATE.Options;
      }
        
        
        
        
        
        
        
        
        
        
        // OPTIONS_PROFILE  TROPHIES
        if(mouseOver(mx,my,220, 104, 200, 64) && Game.gameState == ChewingGumSimulator.STATE.Options_Profile){
            Game.gameState = ChewingGumSimulator.STATE.Options_Trophies;
      }
        
        
        
        // OPTIONS_PROFILE  ACHIVEMENTS
        if(mouseOver(mx,my,430, 104, 200, 64) && Game.gameState == ChewingGumSimulator.STATE.Options_Profile){
            Game.gameState = ChewingGumSimulator.STATE.Options_Achivements;
      }
        
        // OPTIONS_PROFILE  BACK BUTTON
        if(mouseOver(mx,my,430, 352, 200, 64) && Game.gameState == ChewingGumSimulator.STATE.Options_Profile){
            Game.gameState = ChewingGumSimulator.STATE.Options;
      }
        
        
        
        
        
        
        
        
        // OPTIONS_ACHIVEMENTS BACK BUTTON
        if(mouseOver(mx,my,210, 360, 200, 64) && Game.gameState == ChewingGumSimulator.STATE.Options_Achivements){
            Game.gameState = ChewingGumSimulator.STATE.Options_Profile;
      }
        
        
        
        
        
        
        
        
        
        
        
        // OPTIONS_CONTROLS  ARROWS SWITCH 1
        if(mouseOver(mx,my,10, 184, 200, 64) && Game.gameState == ChewingGumSimulator.STATE.Options_Controls){
            if(Game.invertedArrows==true){
                Game.invertedArrows=false;
            }
            
            else if(Game.invertedArrows==false){
                Game.invertedArrows=true;
            }
      }
        
        
        // OPTIONS_CONTROLS  ARROWS SWITCH 1
        if(mouseOver(mx,my,10, 268, 200, 64) && Game.gameState == ChewingGumSimulator.STATE.Options_Controls){
            if(Game.invertedArrows==true){
                Game.invertedArrows=false;
            }
            
            else if(Game.invertedArrows==false){
                Game.invertedArrows=true;
            }
      }
        
        
        
        // OPTIONS_CONTROLS  ESC SWITCH
        if(mouseOver(mx,my,10, 352, 200, 64) && Game.gameState == ChewingGumSimulator.STATE.Options_Controls){
            if(Game.toExitOrNotToExit==true){
                Game.toExitOrNotToExit=false;
            }
            
            else if(Game.toExitOrNotToExit==false){
                Game.toExitOrNotToExit=true;
            }
      }
        
        
        
        // OPTIONS_CONTROLS  BACK BUTTON
        if(mouseOver(mx,my,430, 352, 200, 64) && Game.gameState == ChewingGumSimulator.STATE.Options_Controls){
            Game.gameState = ChewingGumSimulator.STATE.Options;
      }
        
        
        // OPTIONS_CONTROLS  BACK BUTTON
        if(mouseOver(mx,my,400, 360, 200, 64) && Game.gameState == ChewingGumSimulator.STATE.FinishTutorial){
            Game.gameState = ChewingGumSimulator.STATE.Help;
      }
        
        
        
        
        
        
        
        
        
        
        
        
        
        // RESOLUTION BACK BUTTON
        if(mouseOver(mx,my,430, 352, 200, 64) && Game.gameState == ChewingGumSimulator.STATE.Graphics_SelectResolution){
            Game.gameState = ChewingGumSimulator.STATE.GraphicsOption;
      }
        
        // RESOLUTION 1280
        if(mouseOver(mx,my,430, 184, 200, 64) && Game.gameState == ChewingGumSimulator.STATE.Graphics_SelectResolution){
            Game.WIDTH=1280;
            Game.gameState = ChewingGumSimulator.STATE.Menu;
      }
        
        
        // RESOLUTION 640
        if(mouseOver(mx,my,430, 104, 200, 64) && Game.gameState == ChewingGumSimulator.STATE.Graphics_SelectResolution){
            Game.WIDTH=640;
            Game.gameState = ChewingGumSimulator.STATE.Options;
      }
        
        
        // ARENA EDITOR TURRET STRAIGHT
        if(mouseOver(mx,my,5, 20, 200, 64) && Game.gameState == ChewingGumSimulator.STATE.ArenaSTurrets){
            ChewingGumSimulator.editSelected=true;
            for(int i=0;i<handler.object.size();i++){
            GameObject tempObject = handler.object.get(i);
            if(tempObject.getId()==ID.Player){
            handler.addObject(new StraightTurret((int)tempObject.getX()-50,(int)tempObject.getY()-30, ID.StraightTurret,handler));
            }}
            Game.gameState=ChewingGumSimulator.STATE.ArenaEditor;
      }
        
        
        // ARENA EDITOR TURRET PARTICLE
        if(mouseOver(mx,my,210, 20, 200, 64) && Game.gameState == ChewingGumSimulator.STATE.ArenaSTurrets){
            ChewingGumSimulator.editSelected=true;
            for(int i=0;i<handler.object.size();i++){
            GameObject tempObject = handler.object.get(i);
            if(tempObject.getId()==ID.Player){
            handler.addObject(new ParticleTurret((int)tempObject.getX()-50,(int)tempObject.getY()-30, ID.ParticleTurret,handler));
            }}
            Game.gameState=ChewingGumSimulator.STATE.ArenaEditor;
      }
        
        
        
        // ARENA EDITOR AUTO TURRET
        if(mouseOver(mx,my,415, 20, 200, 64) && Game.gameState == ChewingGumSimulator.STATE.ArenaSTurrets){
            ChewingGumSimulator.editSelected=true;
            for(int i=0;i<handler.object.size();i++){
            GameObject tempObject = handler.object.get(i);
            if(tempObject.getId()==ID.Player){
            handler.addObject(new AutoTurret((int)tempObject.getX()-50,(int)tempObject.getY()-30, ID.AutoTurret,handler));
            }}
            Game.gameState=ChewingGumSimulator.STATE.ArenaEditor;
      }
        
        
        
        
        
        
        
        
        // GAME OVER BACK BUTTON
        if(mouseOver(mx,my,210, 360, 200, 64) && Game.gameState == ChewingGumSimulator.STATE.EndGame){
            Game.gameState = ChewingGumSimulator.STATE.Menu;
            if(hud.getScore()>ChewingGumSimulator.savedScore){
                Game.savedScore = (int) hud.getScore();
            }
            Game.savedCoins = (int) hud.COINS;
            
      }
        
        
        
      
      // OPTIONS TROPHIES >> BACK BUTTON
        if(mouseOver(mx,my,210, 360, 200, 64) && Game.gameState == ChewingGumSimulator.STATE.Options_Trophies){
            Game.gameState = ChewingGumSimulator.STATE.Options_Profile;
            
            
            
      }
        
        
        
        // ADVENTURE SELECT - BACK BUTTON
        if(mouseOver(mx,my,210, 360, 200, 64) && Game.gameState == ChewingGumSimulator.STATE.AdventureSelect){
            Game.gameState = ChewingGumSimulator.STATE.Menu;
            
            
            
      }
        
        // ADVENTURE SELECT - NEXT BUTTON
        if(mouseOver(mx,my,5, 360, 200, 64) && Game.gameState == ChewingGumSimulator.STATE.AdventureSelect){
            Game.gameState = ChewingGumSimulator.STATE.AdventureSelect2;
            
            
            
      }
        // ADVENTURE SELECT2 - PREVIOUS BUTTON
        if(mouseOver(mx,my,210, 360, 200, 64) && Game.gameState == ChewingGumSimulator.STATE.AdventureSelect2){
            Game.gameState = ChewingGumSimulator.STATE.AdventureSelect;
            
            
            
      }
        
        // ADVENTURE SELECT - ADVENTURE ONE
        if(mouseOver(mx,my,10, 10, 400, 64) && Game.gameState == ChewingGumSimulator.STATE.AdventureSelect){
            
            Game.gameState = ChewingGumSimulator.STATE.AdventureOne;
            AdventureOne.step=false;
            
            
      }
        
        // ADVENTURE SELECT - ADVENTURE TWO
        if(mouseOver(mx,my,10, 80, 400, 64) && Game.gameState == ChewingGumSimulator.STATE.AdventureSelect){
            if(ChewingGumSimulator.adventureStatus[1]==true){
            Game.gameState = ChewingGumSimulator.STATE.AdventureTwo;
            AdventureOne.step=false;}
            
            
            
      }
        
        // ADVENTURE SELECT - ADVENTURE THREE
        if(mouseOver(mx,my,10, 150, 400, 64) && Game.gameState == ChewingGumSimulator.STATE.AdventureSelect){
            if(ChewingGumSimulator.adventureStatus[2]==true){
            Game.gameState = ChewingGumSimulator.STATE.AdventureThree;
            AdventureOne.step=false;}
            
            
            
      }
        
        
        // ADVENTURE SELECT - ADVENTURE FOUR
        if(mouseOver(mx,my,10, 220, 400, 64) && Game.gameState == ChewingGumSimulator.STATE.AdventureSelect){
            if(ChewingGumSimulator.adventureStatus[3]==true){
            Game.gameState = ChewingGumSimulator.STATE.AdventureFour;
            AdventureOne.step=false;}
            
            
            
      }
        
        // ADVENTURE SELECT - ADVENTURE FIVE
        if(mouseOver(mx,my,10, 290, 400, 64) && Game.gameState == ChewingGumSimulator.STATE.AdventureSelect){
            if(ChewingGumSimulator.adventureStatus[4]==true){
            Game.gameState = ChewingGumSimulator.STATE.AdventureFive;
            AdventureOne.step=false;}
            
            
            
      }
        
        // ADVENTURE SELECT - ADVENTURE SIX
        if(mouseOver(mx,my,10, 10, 400, 64) && Game.gameState == ChewingGumSimulator.STATE.AdventureSelect2){
            if(ChewingGumSimulator.adventureStatus[5]==true){
            Game.gameState = ChewingGumSimulator.STATE.AdventureSix;
            AdventureOne.step=false;
            }
            
      }
        
        // ADVENTURE SELECT - ADVENTURE SEVEN
        if(mouseOver(mx,my,10, 80, 400, 64) && Game.gameState == ChewingGumSimulator.STATE.AdventureSelect2){
            if(ChewingGumSimulator.adventureStatus[6]==true){
            Game.gameState = ChewingGumSimulator.STATE.AdventureSeven;
            AdventureOne.step=false;}
            
            
            
      }
        
        // ADVENTURE SELECT - ADVENTURE EIGHT
        if(mouseOver(mx,my,10, 150, 400, 64) && Game.gameState == ChewingGumSimulator.STATE.AdventureSelect2){
            if(ChewingGumSimulator.adventureStatus[7]==true){
            Game.gameState = ChewingGumSimulator.STATE.AdventureEight;
            AdventureOne.step=false;}
            
            
            
      }
        
        
        // ADVENTURE SELECT - ADVENTURE NINE
        if(mouseOver(mx,my,10, 220, 400, 64) && Game.gameState == ChewingGumSimulator.STATE.AdventureSelect2){
            if(ChewingGumSimulator.adventureStatus[8]==true){
            Game.gameState = ChewingGumSimulator.STATE.AdventureNine;
            AdventureOne.step=false;}
            
            
            
      }
        
        // ADVENTURE SELECT - ADVENTURE TEN
        if(mouseOver(mx,my,10, 290, 400, 64) && Game.gameState == ChewingGumSimulator.STATE.AdventureSelect2){
            if(ChewingGumSimulator.adventureStatus[4]==true){
            Game.gameState = ChewingGumSimulator.STATE.AdventureTen;
            AdventureOne.step=false;}
            
            
            
      }
        
        
        // ADVENTURE OVER - RETRY BUTTON
        if(mouseOver(mx,my,420, 360, 200, 64) && (Game.gameState == ChewingGumSimulator.STATE.AdventureOneLost || Game.gameState == ChewingGumSimulator.STATE.AdventureTwoLost || Game.gameState == ChewingGumSimulator.STATE.AdventureThreeLost || Game.gameState == ChewingGumSimulator.STATE.AdventureFourLost || Game.gameState == ChewingGumSimulator.STATE.AdventureFiveLost || Game.gameState == ChewingGumSimulator.STATE.AdventureSixLost || Game.gameState == ChewingGumSimulator.STATE.AdventureSevenLost || Game.gameState == ChewingGumSimulator.STATE.AdventureEightLost || Game.gameState == ChewingGumSimulator.STATE.AdventureNineLost || Game.gameState == ChewingGumSimulator.STATE.AdventureTenLost)){
           
            
            
            if(Game.gameState == ChewingGumSimulator.STATE.AdventureOneLost){
                AdventureOne.Timer=10000;
                HUD.HEALTH=100;
                HUD.AMMO=100;
                AdventureOne.step=false;
                Game.gameState = ChewingGumSimulator.STATE.AdventureOne;
            }
            
            else if(Game.gameState == ChewingGumSimulator.STATE.AdventureTwoLost){
                AdventureOne.Timer=10000;
                HUD.HEALTH=100;
                HUD.AMMO=100;
                AdventureOne.step=false;
                Game.gameState = ChewingGumSimulator.STATE.AdventureTwo;
            }
            else if(Game.gameState == ChewingGumSimulator.STATE.AdventureThreeLost){
                AdventureOne.Timer=10000;
                HUD.HEALTH=100;
                HUD.AMMO=100;
                AdventureOne.step=false;
                Game.gameState = ChewingGumSimulator.STATE.AdventureThree;
            }
            
            else if(Game.gameState == ChewingGumSimulator.STATE.AdventureFourLost){
                AdventureOne.Timer=10000;
                HUD.HEALTH=100;
                HUD.AMMO=100;
                AdventureOne.step=false;
                Game.gameState = ChewingGumSimulator.STATE.AdventureFour;
            }
            
            else if(Game.gameState == ChewingGumSimulator.STATE.AdventureFiveLost){
                AdventureOne.Timer=10000;
                HUD.HEALTH=100;
                HUD.AMMO=100;
                AdventureOne.step=false;
                Game.gameState = ChewingGumSimulator.STATE.AdventureFive;
            }
            
            else if(Game.gameState == ChewingGumSimulator.STATE.AdventureSixLost){
                AdventureOne.Timer=10000;
                HUD.HEALTH=100;
                HUD.AMMO=100;
                AdventureOne.step=false;
                Game.gameState = ChewingGumSimulator.STATE.AdventureSix;
            }
            
            else if(Game.gameState == ChewingGumSimulator.STATE.AdventureSevenLost){
                AdventureOne.Timer=10000;
                HUD.HEALTH=100;
                HUD.AMMO=100;
                AdventureOne.step=false;
                Game.gameState = ChewingGumSimulator.STATE.AdventureSeven;
            }
            else if(Game.gameState == ChewingGumSimulator.STATE.AdventureEightLost){
                AdventureOne.Timer=10000;
                HUD.HEALTH=100;
                HUD.AMMO=100;
                AdventureOne.step=false;
                Game.gameState = ChewingGumSimulator.STATE.AdventureEight;
            }
            
            else if(Game.gameState == ChewingGumSimulator.STATE.AdventureNineLost){
                AdventureOne.Timer=10000;
                HUD.HEALTH=100;
                HUD.AMMO=100;
                AdventureOne.step=false;
                Game.gameState = ChewingGumSimulator.STATE.AdventureNine;
            }
            
            else if(Game.gameState == ChewingGumSimulator.STATE.AdventureTenLost){
                AdventureOne.Timer=10000;
                HUD.HEALTH=100;
                HUD.AMMO=100;
                AdventureOne.step=false;
                Game.gameState = ChewingGumSimulator.STATE.AdventureTen;
            }
            
            
            
      }
        
        
        // ADVENTURE OVER - BACK BUTTON
        if(mouseOver(mx,my,210, 360, 200, 64) && (Game.gameState == ChewingGumSimulator.STATE.AdventureOneLost || Game.gameState == ChewingGumSimulator.STATE.AdventureTwoLost || Game.gameState == ChewingGumSimulator.STATE.AdventureThreeLost || Game.gameState == ChewingGumSimulator.STATE.AdventureFourLost || Game.gameState == ChewingGumSimulator.STATE.AdventureFiveLost || Game.gameState == ChewingGumSimulator.STATE.AdventureSixLost || Game.gameState == ChewingGumSimulator.STATE.AdventureSevenLost || Game.gameState == ChewingGumSimulator.STATE.AdventureEightLost || Game.gameState == ChewingGumSimulator.STATE.AdventureNineLost || Game.gameState == ChewingGumSimulator.STATE.AdventureTenLost || Game.gameState == ChewingGumSimulator.STATE.AdventureOneWon || Game.gameState == ChewingGumSimulator.STATE.AdventureTwoWon || Game.gameState == ChewingGumSimulator.STATE.AdventureThreeWon || Game.gameState == ChewingGumSimulator.STATE.AdventureFourWon || Game.gameState == ChewingGumSimulator.STATE.AdventureFiveWon)){
           
            
            
           
                AdventureOne.Timer=10000;
                HUD.HEALTH=100;
                HUD.AMMO=100;
                AdventureOne.step=false;
                Game.gameState = ChewingGumSimulator.STATE.Menu;
            
            
            
            
      }
        
        
        
        // ADVENTURE WON - NEXT BUTTON
        if(mouseOver(mx,my,420, 360, 200, 64) && (Game.gameState == ChewingGumSimulator.STATE.AdventureOneWon || Game.gameState == ChewingGumSimulator.STATE.AdventureTwoWon || Game.gameState == ChewingGumSimulator.STATE.AdventureThreeWon || Game.gameState == ChewingGumSimulator.STATE.AdventureFourWon || Game.gameState == ChewingGumSimulator.STATE.AdventureFiveWon  || Game.gameState == ChewingGumSimulator.STATE.AdventureSixWon || Game.gameState == ChewingGumSimulator.STATE.AdventureSevenWon || Game.gameState == ChewingGumSimulator.STATE.AdventureEightWon || Game.gameState == ChewingGumSimulator.STATE.AdventureNineWon || Game.gameState == ChewingGumSimulator.STATE.AdventureTenWon)){
           
            
            
            if(Game.gameState == ChewingGumSimulator.STATE.AdventureOneWon){
                AdventureOne.Timer=10000;
                HUD.HEALTH=100;
                HUD.AMMO=100;
                AdventureOne.step=false;
                Game.gameState = ChewingGumSimulator.STATE.AdventureTwo;
            }
            
            else if(Game.gameState == ChewingGumSimulator.STATE.AdventureTwoWon){
                AdventureOne.Timer=10000;
                HUD.HEALTH=100;
                HUD.AMMO=100;
                AdventureOne.step=false;
                Game.gameState = ChewingGumSimulator.STATE.AdventureThree;
            }
            else if(Game.gameState == ChewingGumSimulator.STATE.AdventureThreeWon){
                AdventureOne.Timer=10000;
                HUD.HEALTH=100;
                HUD.AMMO=100;
                AdventureOne.step=false;
                Game.gameState = ChewingGumSimulator.STATE.AdventureFour;
            }
            
            else if(Game.gameState == ChewingGumSimulator.STATE.AdventureFourWon){
                AdventureOne.Timer=10000;
                HUD.HEALTH=100;
                HUD.AMMO=100;
                AdventureOne.step=false;
                Game.gameState = ChewingGumSimulator.STATE.AdventureFive;
            }
            
            else if(Game.gameState == ChewingGumSimulator.STATE.AdventureFiveWon){
                AdventureOne.Timer=10000;
                HUD.HEALTH=100;
                HUD.AMMO=100;
                AdventureOne.step=false;
                handler.clearEnemies();
                Game.gameState = ChewingGumSimulator.STATE.AdventureSix;
                
            }
            
            else if(Game.gameState == ChewingGumSimulator.STATE.AdventureSixWon){
                AdventureOne.Timer=10000;
                HUD.HEALTH=100;
                HUD.AMMO=100;
                AdventureOne.step=false;
                handler.clearEnemies();
                Game.gameState = ChewingGumSimulator.STATE.AdventureSeven;
                
            }
            
            else if(Game.gameState == ChewingGumSimulator.STATE.AdventureSevenWon){
                AdventureOne.Timer=10000;
                HUD.HEALTH=100;
                HUD.AMMO=100;
                AdventureOne.step=false;
                handler.clearEnemies();
                Game.gameState = ChewingGumSimulator.STATE.AdventureEight;
                
            }
            
            else if(Game.gameState == ChewingGumSimulator.STATE.AdventureEightWon){
                AdventureOne.Timer=10000;
                HUD.HEALTH=100;
                HUD.AMMO=100;
                AdventureOne.step=false;
                handler.clearEnemies();
                Game.gameState = ChewingGumSimulator.STATE.AdventureNine;
                
            }
            
            else if(Game.gameState == ChewingGumSimulator.STATE.AdventureNineWon){
                AdventureOne.Timer=10000;
                HUD.HEALTH=100;
                HUD.AMMO=100;
                AdventureOne.step=false;
                handler.clearEnemies();
                Game.gameState = ChewingGumSimulator.STATE.AdventureTen;
                
            }
            
            else if(Game.gameState == ChewingGumSimulator.STATE.AdventureTenWon){
                AdventureOne.Timer=10000;
                HUD.HEALTH=100;
                HUD.AMMO=100;
                AdventureOne.step=false;
                handler.clearEnemies();
                Game.gameState = ChewingGumSimulator.STATE.AdventureSelect;
                
            }
            
            
            
      }
        
        // STORY SCREEN ONE BACK BUTTON
        if(mouseOver(mx,my,210, 360, 200, 64) && Game.gameState == ChewingGumSimulator.STATE.StoryScreenOne){
            Game.gameState = ChewingGumSimulator.STATE.StoryScreenTwo;
            
      }
        // STORY SCREEN TWO BACK BUTTON
        if(mouseOver(mx,my,400, 360, 200, 64) && Game.gameState == ChewingGumSimulator.STATE.StoryScreenTwo){
            Game.gameState = ChewingGumSimulator.STATE.Game;
            Game.paused=false;
            hud.score(0);
            hud.setLevel(1);
            hud.HEALTH=100;
            hud.HEALTH2=100;
            hud.AMMO=100;
            hud.BLADDER=100;
            hud.EMPCount = 0;
            handler.clearEnemies();
            handler.clearPlayers();
            
            
            handler.addObject(new BasicEnemy((int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.WIDTH),20,ChewingGumSimulator.WIDTH-10),(int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.HEIGHT),80,ChewingGumSimulator.HEIGHT), ID.BasicEnemy,handler));
            handler.addObject(new BasicEnemy((int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.WIDTH),20,ChewingGumSimulator.WIDTH-10),(int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.HEIGHT),80,ChewingGumSimulator.HEIGHT), ID.BasicEnemy,handler));
            
            
      }
        // CHEATS GAME BUTTON420, 360, 200, 64
        if(mouseOver(mx,my,210, 360, 200, 64) && Game.gameState == ChewingGumSimulator.STATE.Game && ChewingGumSimulator.cheats==true && ChewingGumSimulator.paused==true){
            Game.gameState = ChewingGumSimulator.STATE.CheatMenu;
            
      }
        
        // EXIT GAME BUTTON 420, 360, 200, 64
        if(mouseOver(mx,my,420, 360, 200, 64) && Game.gameState == ChewingGumSimulator.STATE.Game && Game.paused==true && Game.toExitOrNotToExit==false){
            Game.paused=false;
            Game.gameState = ChewingGumSimulator.STATE.Menu;
            if(hud.getScore()>ChewingGumSimulator.savedScore){
                Game.savedScore = (int) hud.getScore();
            }
            Game.savedCoins = (int) hud.COINS;
            Game.SaveGame();
      }
        
        
        //CHEATS MENU - CURRENCY CHEATS
        if(mouseOver(mx,my,210, 140, 200, 64) && Game.gameState == ChewingGumSimulator.STATE.CheatMenu){
            Game.gameState = ChewingGumSimulator.STATE.CheatsCurrency;
            
      }
        
        
        //CHEATS MENU - SPAWN OBJECTS
        if(mouseOver(mx,my,210, 210, 200, 64) && Game.gameState == ChewingGumSimulator.STATE.CheatMenu){
            Game.gameState = ChewingGumSimulator.STATE.CheatsSpawnMenu;
            
            
      }
        
        
        
        
        //CHEATS MENU - CLEAR OBJECTS
        if(mouseOver(mx,my,210, 280, 200, 64) && Game.gameState == ChewingGumSimulator.STATE.CheatMenu){
            Game.gameState = ChewingGumSimulator.STATE.Game;
            ChewingGumSimulator.paused = false;
            //handler.clearEnemies();
            //handler.clearPlayers();
            //Spawn.eventCheat=true;
            handler.addObject(new ParticleTurret((int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.WIDTH),20,ChewingGumSimulator.WIDTH-20),(int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.HEIGHT),80,ChewingGumSimulator.HEIGHT),ID.ParticleTurret,handler));
            
      }
        
        //CHEATS MENU - SPAWN ENEMY
        if(mouseOver(mx,my,420, 210, 200, 64) && Game.gameState == ChewingGumSimulator.STATE.CheatMenu){
            Game.gameState = ChewingGumSimulator.STATE.Game;
            
            handler.addObject(new AtomFusioner(ChewingGumSimulator.WIDTH/2,ChewingGumSimulator.HEIGHT/2, ID.fusionCenter,handler));
            handler.addObject(new AtomFusioner((int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.WIDTH),20,ChewingGumSimulator.WIDTH-20),(int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.HEIGHT),80,ChewingGumSimulator.HEIGHT), ID.AtomFusioner,handler));
            handler.addObject(new AtomFusioner((int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.WIDTH),20,ChewingGumSimulator.WIDTH-20),(int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.HEIGHT),80,ChewingGumSimulator.HEIGHT), ID.AtomFusioner,handler));
            handler.addObject(new AtomFusioner((int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.WIDTH),20,ChewingGumSimulator.WIDTH-20),(int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.HEIGHT),80,ChewingGumSimulator.HEIGHT), ID.AtomFusioner,handler));
            handler.addObject(new AtomFusioner((int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.WIDTH),20,ChewingGumSimulator.WIDTH-20),(int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.HEIGHT),80,ChewingGumSimulator.HEIGHT), ID.AtomFusioner,handler));
            
//handler.addObject(new FalloutCloud((ChewingGumSimulator.WIDTH / 2)-48,0,ID.FalloutCloud,handler));
            
        
        
        
        
        }
        
        
        
        //CHEATS MENU - SPAWN MENU NEXT BUTTON 
        if(mouseOver(mx,my,430, 352, 200, 64) && Game.gameState == ChewingGumSimulator.STATE.CheatsSpawnMenu){
            Game.gameState = ChewingGumSimulator.STATE.CheatsSpawnMenuTwo;
            
            
      }
        
        //CHEATS MENU - SPAWN MENU BACK BUTTON 
        if(mouseOver(mx,my,220, 352, 200, 64) && Game.gameState == ChewingGumSimulator.STATE.CheatsSpawnMenu){
            Game.gameState = ChewingGumSimulator.STATE.CheatMenu;
            
            
      }
        
        //CHEATS MENU - SPAWN MENU SPAWNING  -- SNOW CLOUD 
        if(mouseOver(mx,my,10, 352, 200, 64) && Game.gameState == ChewingGumSimulator.STATE.CheatsSpawnMenu){
            Game.gameState = ChewingGumSimulator.STATE.Game;
            ChewingGumSimulator.paused = false;
            handler.addObject(new SnowCloud((ChewingGumSimulator.WIDTH / 2)-48,0,ID.SnowCloud,handler));
      }
        
        //CHEATS MENU - SPAWN MENU SPAWNING  -- RAIN CLOUD 
        if(mouseOver(mx,my,10, 268, 200, 64) && Game.gameState == ChewingGumSimulator.STATE.CheatsSpawnMenu){
            Game.gameState = ChewingGumSimulator.STATE.Game;
            ChewingGumSimulator.paused = false;
            handler.addObject(new RainCloud((ChewingGumSimulator.WIDTH / 2)-48,0,ID.RainCloud,handler));
      }
        
        //CHEATS MENU - SPAWN MENU SPAWNING  -- FALLOUT CLOUD 
        if(mouseOver(mx,my,220, 268, 200, 64) && Game.gameState == ChewingGumSimulator.STATE.CheatsSpawnMenu){
            Game.gameState = ChewingGumSimulator.STATE.Game;
            ChewingGumSimulator.paused = false;
            handler.addObject(new FalloutCloud((ChewingGumSimulator.WIDTH / 2)-48,0,ID.FalloutCloud,handler));
      }
        
        //CHEATS MENU - SPAWN MENU SPAWNING  -- CACTUS
        if(mouseOver(mx,my,10, 184, 200, 64) && Game.gameState == ChewingGumSimulator.STATE.CheatsSpawnMenu){
            Game.gameState = ChewingGumSimulator.STATE.Game;
            ChewingGumSimulator.paused = false;
            handler.addObject(new DangerousCactus(r.nextInt(ChewingGumSimulator.WIDTH),(int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.HEIGHT),80,ChewingGumSimulator.HEIGHT), ID.DangerousCactus,handler));
      }
        
        //CHEATS MENU - SPAWN MENU SPAWNING  -- TREE
        if(mouseOver(mx,my,10, 104, 200, 64) && Game.gameState == ChewingGumSimulator.STATE.CheatsSpawnMenu){
            Game.gameState = ChewingGumSimulator.STATE.Game;
            ChewingGumSimulator.paused = false;
            handler.addObject(new DangerousTree(r.nextInt(ChewingGumSimulator.WIDTH),(int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.HEIGHT),80,ChewingGumSimulator.HEIGHT), ID.DangerousTree,handler));
      }
        
        //CHEATS MENU - SPAWN MENU SPAWNING  -- BUSH
        if(mouseOver(mx,my,10, 20, 200, 64) && Game.gameState == ChewingGumSimulator.STATE.CheatsSpawnMenu){
            Game.gameState = ChewingGumSimulator.STATE.Game;
            ChewingGumSimulator.paused = false;
            handler.addObject(new DangerousBush(r.nextInt(ChewingGumSimulator.WIDTH),(int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.HEIGHT),80,ChewingGumSimulator.HEIGHT), ID.DangerousBush,handler));
      }
        
        //CHEATS MENU - SPAWN MENU SPAWNING  -- BOSS
        if(mouseOver(mx,my,220, 20, 200, 64) && Game.gameState == ChewingGumSimulator.STATE.CheatsSpawnMenu){
            Game.gameState = ChewingGumSimulator.STATE.Game;
            ChewingGumSimulator.paused = false;
            handler.addObject(new BossOne((ChewingGumSimulator.WIDTH / 2)-48,0,ID.BossOne,handler));
      }
        
        //CHEATS MENU - SPAWN MENU SPAWNING  -- BOSS MINION
        if(mouseOver(mx,my,220, 104, 200, 64) && Game.gameState == ChewingGumSimulator.STATE.CheatsSpawnMenu){
            Game.gameState = ChewingGumSimulator.STATE.Game;
            ChewingGumSimulator.paused = false;
            handler.addObject(new BossSucker((ChewingGumSimulator.WIDTH / 2)-48,0,ID.BossSucker,handler));
      }
        
        
        //CHEATS MENU - SPAWN MENU SPAWNING  -- BASIC ENEMY
        if(mouseOver(mx,my,430, 20, 200, 64) && Game.gameState == ChewingGumSimulator.STATE.CheatsSpawnMenu){
            Game.gameState = ChewingGumSimulator.STATE.Game;
            ChewingGumSimulator.paused = false;
            handler.addObject(new BasicEnemy(r.nextInt(ChewingGumSimulator.WIDTH),(int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.HEIGHT),80,ChewingGumSimulator.HEIGHT), ID.BasicEnemy,handler));
      }
        
        //CHEATS MENU - SPAWN MENU SPAWNING  -- LIGHT ENEMY
        if(mouseOver(mx,my,430, 104, 200, 64) && Game.gameState == ChewingGumSimulator.STATE.CheatsSpawnMenu){
            Game.gameState = ChewingGumSimulator.STATE.Game;
            ChewingGumSimulator.paused = false;
            handler.addObject(new FastEnemy(r.nextInt(ChewingGumSimulator.WIDTH),(int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.HEIGHT),80,ChewingGumSimulator.HEIGHT), ID.FastEnemy,handler));
      }
        
        //CHEATS MENU - SPAWN MENU SPAWNING  -- VERMIN ENEMY
        if(mouseOver(mx,my,430, 184, 200, 64) && Game.gameState == ChewingGumSimulator.STATE.CheatsSpawnMenu){
            Game.gameState = ChewingGumSimulator.STATE.Game;
            ChewingGumSimulator.paused = false;
            handler.addObject(new SmartEnemy(r.nextInt(ChewingGumSimulator.WIDTH),(int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.HEIGHT),80,ChewingGumSimulator.HEIGHT), ID.SmartEnemy,handler));
      }
        
        
        //CHEATS MENU - SPAWN MENU 2 SPAWNING  -- HEALTH BOX
        if(mouseOver(mx,my,10, 20, 200, 64) && Game.gameState == ChewingGumSimulator.STATE.CheatsSpawnMenuTwo){
            Game.gameState = ChewingGumSimulator.STATE.Game;
            ChewingGumSimulator.paused = false;
            handler.addObject(new HealthBox(r.nextInt(ChewingGumSimulator.WIDTH),(int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.HEIGHT),80,ChewingGumSimulator.HEIGHT), ID.HealthBox,handler));
      }
        
        //CHEATS MENU - SPAWN MENU 2 SPAWNING  -- AC/DC BOX
        if(mouseOver(mx,my,10, 104, 200, 64) && Game.gameState == ChewingGumSimulator.STATE.CheatsSpawnMenuTwo){
            Game.gameState = ChewingGumSimulator.STATE.Game;
            ChewingGumSimulator.paused = false;
            handler.addObject(new LightningBox(r.nextInt(ChewingGumSimulator.WIDTH),(int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.HEIGHT),80,ChewingGumSimulator.HEIGHT), ID.LightningBox,handler));
      }
        
        //CHEATS MENU - SPAWN MENU 2 SPAWNING  -- SHIELD BOX
        if(mouseOver(mx,my,10, 184, 200, 64) && Game.gameState == ChewingGumSimulator.STATE.CheatsSpawnMenuTwo){
            Game.gameState = ChewingGumSimulator.STATE.Game;
            ChewingGumSimulator.paused = false;
            handler.addObject(new ShieldPower(r.nextInt(ChewingGumSimulator.WIDTH),(int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.HEIGHT),80,ChewingGumSimulator.HEIGHT), ID.ShieldPower,handler));
      }
        
        //CHEATS MENU - SPAWN MENU 2 SPAWNING  -- SPEED BOX
        if(mouseOver(mx,my,10, 268, 200, 64) && Game.gameState == ChewingGumSimulator.STATE.CheatsSpawnMenuTwo){
            Game.gameState = ChewingGumSimulator.STATE.Game;
            ChewingGumSimulator.paused = false;
            handler.addObject(new SpeedBooster(r.nextInt(ChewingGumSimulator.WIDTH),(int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.HEIGHT),80,ChewingGumSimulator.HEIGHT), ID.SpeedBooster,handler));
      }
        
        //CHEATS MENU - SPAWN MENU 2 SPAWNING  -- SODA BOX
        if(mouseOver(mx,my,10, 352, 200, 64) && Game.gameState == ChewingGumSimulator.STATE.CheatsSpawnMenuTwo){
            Game.gameState = ChewingGumSimulator.STATE.Game;
            ChewingGumSimulator.paused = false;
            handler.addObject(new SodaBox(r.nextInt(ChewingGumSimulator.WIDTH),(int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.HEIGHT),80,ChewingGumSimulator.HEIGHT), ID.SodaBox,handler));
      }
        
        //CHEATS MENU - SPAWN MENU 2 SPAWNING  -- EMP BOX
        if(mouseOver(mx,my,220, 20, 200, 64) && Game.gameState == ChewingGumSimulator.STATE.CheatsSpawnMenuTwo){
            Game.gameState = ChewingGumSimulator.STATE.Game;
            ChewingGumSimulator.paused = false;
            handler.addObject(new EMPBox(r.nextInt(ChewingGumSimulator.WIDTH),(int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.HEIGHT),80,ChewingGumSimulator.HEIGHT), ID.EMPBox,handler));
      }
        
        //CHEATS MENU - SPAWN MENU 2 SPAWNING  -- AMMO BOX
        if(mouseOver(mx,my,220, 104, 200, 64) && Game.gameState == ChewingGumSimulator.STATE.CheatsSpawnMenuTwo){
            Game.gameState = ChewingGumSimulator.STATE.Game;
            ChewingGumSimulator.paused = false;
            handler.addObject(new AmmoBox(r.nextInt(ChewingGumSimulator.WIDTH),(int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.HEIGHT),80,ChewingGumSimulator.HEIGHT), ID.AmmoBox,handler));
      }
        
        //CHEATS MENU - SPAWN MENU 2 SPAWNING  -- COIN
        if(mouseOver(mx,my,430, 20, 200, 64) && Game.gameState == ChewingGumSimulator.STATE.CheatsSpawnMenuTwo){
            Game.gameState = ChewingGumSimulator.STATE.Game;
            ChewingGumSimulator.paused = false;
            handler.addObject(new SoftCoin(r.nextInt(ChewingGumSimulator.WIDTH),(int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.HEIGHT),80,ChewingGumSimulator.HEIGHT), ID.SoftCoin,handler));
      }
        
        //CHEATS MENU - SPAWN MENU 2 SPAWNING  -- TREASURE
        if(mouseOver(mx,my,430, 104, 200, 64) && Game.gameState == ChewingGumSimulator.STATE.CheatsSpawnMenuTwo){
            Game.gameState = ChewingGumSimulator.STATE.Game;
            ChewingGumSimulator.paused = false;
            handler.addObject(new SoftTreasure(r.nextInt(ChewingGumSimulator.WIDTH),(int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.HEIGHT),80,ChewingGumSimulator.HEIGHT), ID.SoftTreasure,handler));
      }
       
        //CHEATS MENU - SPAWN MENU 2 SPAWNING  -- NUKE BOX
        if(mouseOver(mx,my,430, 168, 200, 64) && Game.gameState == ChewingGumSimulator.STATE.CheatsSpawnMenuTwo){
            Game.gameState = ChewingGumSimulator.STATE.Game;
            ChewingGumSimulator.paused = false;
            handler.addObject(new NukeBox(r.nextInt(ChewingGumSimulator.WIDTH),(int)ChewingGumSimulator.clamp(r.nextInt(ChewingGumSimulator.HEIGHT),80,ChewingGumSimulator.HEIGHT), ID.NukeBox,handler));
      }
       
        
        
        //CHEATS MENU - SPAWN MENU  2 BACK BUTTON 
        if(mouseOver(mx,my,430, 268, 200, 64) && Game.gameState == ChewingGumSimulator.STATE.CheatsSpawnMenuTwo){
            Game.gameState = ChewingGumSimulator.STATE.CheatsSpawnMenu;
            
            
      }
        
        //CHEATS MENU - SPAWN PLAYER
        if(mouseOver(mx,my,420, 280, 200, 64) && Game.gameState == ChewingGumSimulator.STATE.CheatMenu){
            Game.gameState = ChewingGumSimulator.STATE.Game;
            ChewingGumSimulator.paused = false;
            handler.addObject(new Player(ChewingGumSimulator.WIDTH/2-32, ChewingGumSimulator.HEIGHT/2-32, ID.Player,handler));
            
      }
        //CHEATS MENU - REFILL HEALTH
        if(mouseOver(mx,my,420, 140, 200, 64) && Game.gameState == ChewingGumSimulator.STATE.CheatMenu){
            Game.gameState = ChewingGumSimulator.STATE.Game;
            ChewingGumSimulator.paused = false;
            HUD.HEALTH = 100;
            
      }
        
        
        //CHEATS MENU - REFILL AMMO
        if(mouseOver(mx,my,5, 140, 200, 64) && Game.gameState == ChewingGumSimulator.STATE.CheatMenu){
            Game.gameState = ChewingGumSimulator.STATE.Game;
            ChewingGumSimulator.paused = false;
            HUD.AMMO = 100;
            
      }
        
        //CHEATS MENU - SPAWN HEALTH BOX
        if(mouseOver(mx,my,5, 210, 200, 64) && Game.gameState == ChewingGumSimulator.STATE.CheatMenu){
            Game.gameState = ChewingGumSimulator.STATE.Game;
            ChewingGumSimulator.paused = false;
            handler.addObject(new HealthBox(r.nextInt(ChewingGumSimulator.WIDTH),r.nextInt(ChewingGumSimulator.HEIGHT), ID.HealthBox,handler));
            
      }
        //CHEATS MENU - SPAWN AMMO BOX
        if(mouseOver(mx,my,5, 280, 200, 64) && Game.gameState == ChewingGumSimulator.STATE.CheatMenu){
            Game.gameState = ChewingGumSimulator.STATE.Game;
            ChewingGumSimulator.paused = false;
            handler.addObject(new AmmoBox(r.nextInt(ChewingGumSimulator.WIDTH),r.nextInt(ChewingGumSimulator.HEIGHT), ID.AmmoBox,handler));
            
      }
        
        //CHEATS MENU - SPAWN EMP BOX
        if(mouseOver(mx,my,5, 350, 200, 64) && Game.gameState == ChewingGumSimulator.STATE.CheatMenu){
            Game.gameState = ChewingGumSimulator.STATE.Game;
            ChewingGumSimulator.paused = false;
            handler.addObject(new EMPBox(r.nextInt(ChewingGumSimulator.WIDTH),r.nextInt(ChewingGumSimulator.HEIGHT), ID.EMPBox,handler));
            
      }
        //CHEATS  MENU - BACK OPTION 
        if(mouseOver(mx,my,420, 360, 200, 64) && Game.gameState == ChewingGumSimulator.STATE.CheatMenu){
            Game.gameState = ChewingGumSimulator.STATE.Game;
            ChewingGumSimulator.paused = false;
            
      }
        
        //CHEATS MENU - CURRENCY - ADD 1 COIN
        if(mouseOver(mx,my,10, 20, 200, 64) && Game.gameState == ChewingGumSimulator.STATE.CheatsCurrency){
            Game.gameState = ChewingGumSimulator.STATE.Game;
            ChewingGumSimulator.paused = false;
            HUD.COINS+=1;
      }
        
        //CHEATS MENU - CURRENCY - ADD 10 COINS
        if(mouseOver(mx,my,10, 104, 200, 64) && Game.gameState == ChewingGumSimulator.STATE.CheatsCurrency){
            Game.gameState = ChewingGumSimulator.STATE.Game;
            ChewingGumSimulator.paused = false;
            HUD.COINS+=10;
      }
        
        //CHEATS MENU - CURRENCY - ADD 100 COINS
        if(mouseOver(mx,my,10, 188, 200, 64) && Game.gameState == ChewingGumSimulator.STATE.CheatsCurrency){
            Game.gameState = ChewingGumSimulator.STATE.Game;
            ChewingGumSimulator.paused = false;
            HUD.COINS+=100;
      }
        
        //CHEATS MENU - CURRENCY - ADD 1000 COINS
        if(mouseOver(mx,my,10, 268, 200, 64) && Game.gameState == ChewingGumSimulator.STATE.CheatsCurrency){
            Game.gameState = ChewingGumSimulator.STATE.Game;
            ChewingGumSimulator.paused = false;
            HUD.COINS+=1000;
      }
        
        //CHEATS MENU - CURRENCY - ADD 1 LEVEL
        if(mouseOver(mx,my,10, 218, 200, 64) && Game.gameState == ChewingGumSimulator.STATE.CheatsCurrency){
            Game.gameState = ChewingGumSimulator.STATE.Game;
            ChewingGumSimulator.paused = false;
            hud.setLevel(hud.getLevel()+1);
      }
        
        //CHEATS MENU - CURRENCY - ADD 5 LEVELS
        if(mouseOver(mx,my,10, 322, 200, 64) && Game.gameState == ChewingGumSimulator.STATE.CheatsCurrency){
            Game.gameState = ChewingGumSimulator.STATE.Game;
            ChewingGumSimulator.paused = false;
            hud.setLevel(hud.getLevel()+5);
      }
        
        //CHEATS MENU - CURRENCY - ADD 10 LEVELS
        if(mouseOver(mx,my,430, 20, 200, 64) && Game.gameState == ChewingGumSimulator.STATE.CheatsCurrency){
            Game.gameState = ChewingGumSimulator.STATE.Game;
            ChewingGumSimulator.paused = false;
            hud.setLevel(hud.getLevel()+10);
      }
        
        //CHEATS MENU - CURRENCY - ADD 100 LEVELS
        if(mouseOver(mx,my,430, 104, 200, 64) && Game.gameState == ChewingGumSimulator.STATE.CheatsCurrency){
            Game.gameState = ChewingGumSimulator.STATE.Game;
            ChewingGumSimulator.paused = false;
            hud.setLevel(hud.getLevel()+100);
      }
        
        //CHEATS MENU - CURRENCY - ADD GREANDES
        if(mouseOver(mx,my,10, 352, 200, 64) && Game.gameState == ChewingGumSimulator.STATE.CheatsCurrency){
            Game.gameState = ChewingGumSimulator.STATE.Game;
            ChewingGumSimulator.paused = false;
            HUD.ATOMS+=100;
      }
        
        
        //CHEATS MENU - CURRENCY BACK
        if(mouseOver(mx,my,430, 184, 200, 64) && Game.gameState == ChewingGumSimulator.STATE.CheatsCurrency){
            Game.gameState = ChewingGumSimulator.STATE.CheatMenu;
            
      }
        
        //ARENA SELECTOR  = = ENTER PLANT MENU
        if(mouseOver(mx,my,10, 20, 200, 64) && Game.gameState == ChewingGumSimulator.STATE.ArenaSelector){
            Game.gameState = ChewingGumSimulator.STATE.ArenaSPlants;
            
      }
        
        //ARENA SELECTOR  = = ENTER WEATHER MENU
        if(mouseOver(mx,my,10, 104, 200, 64) && Game.gameState == ChewingGumSimulator.STATE.ArenaSelector){
            Game.gameState = ChewingGumSimulator.STATE.ArenaSWeather;
            
      }
        
        //ARENA SELECTOR  = = ENTER WALLS MENU
        if(mouseOver(mx,my,10, 184, 200, 64) && Game.gameState == ChewingGumSimulator.STATE.ArenaSelector){
            Game.gameState = ChewingGumSimulator.STATE.ArenaSWalls;
            
      }
        
        //ARENA SELECTOR  = = ENTER TRESURES MENU
        if(mouseOver(mx,my,10, 268, 200, 64) && Game.gameState == ChewingGumSimulator.STATE.ArenaSelector){
            Game.gameState = ChewingGumSimulator.STATE.ArenaSTreasures;
            
      }
        
        //ARENA SELECTOR  = = ENTER TURRETS MENU
        if(mouseOver(mx,my,220, 104, 200, 64) && Game.gameState == ChewingGumSimulator.STATE.ArenaSelector){
            Game.gameState = ChewingGumSimulator.STATE.ArenaSTurrets;
            
      }
        
        //ARENA SELECTOR  = = ENTER TROPHIES MENU
        if(mouseOver(mx,my,10, 352, 200, 64) && Game.gameState == ChewingGumSimulator.STATE.ArenaSelector){
            Game.gameState = ChewingGumSimulator.STATE.ArenaSTrophies;
            
      }
        
        //ARENA SELECTOR  = = ENTER BACKGROUND MENU
        if(mouseOver(mx,my,430, 20, 200, 64) && Game.gameState == ChewingGumSimulator.STATE.ArenaSelector){
            Game.gameState = ChewingGumSimulator.STATE.ArenaSBackground;
            
      }
        
        //ARENA SELECTOR  = = ENTER PLAYER COLOR MENU
        if(mouseOver(mx,my,430, 104, 200, 64) && Game.gameState == ChewingGumSimulator.STATE.ArenaSelector){
            Game.gameState = ChewingGumSimulator.STATE.ArenaSPColor;
            
      }
        
        //ARENA SELECTOR  = = BACK TO EDITOR
        if(mouseOver(mx,my,430, 184, 200, 64) && Game.gameState == ChewingGumSimulator.STATE.ArenaSelector){
            Game.gameState = ChewingGumSimulator.STATE.ArenaEditor;
            
      }
        
        //ARENA SELECTOR  = = EXIT TO MENU
        if(mouseOver(mx,my,430, 268, 200, 64) && Game.gameState == ChewingGumSimulator.STATE.ArenaSelector){
            Game.gameState = ChewingGumSimulator.STATE.Menu;
            Spawn.timeKeep=0;
            
      }
        
        //ARENA SELECTOR PLANT MENU = = BACK TO SELECTOR MENU
        if(mouseOver(mx,my,430, 268, 200, 64) && Game.gameState == ChewingGumSimulator.STATE.ArenaSPlants){
            Game.gameState = ChewingGumSimulator.STATE.ArenaSelector;
            
      }
        
        //ARENA SELECTOR WEATHER MENU = = BACK TO SELECTOR MENU
        if(mouseOver(mx,my,430, 352, 200, 64) && Game.gameState == ChewingGumSimulator.STATE.ArenaSWeather){
            Game.gameState = ChewingGumSimulator.STATE.ArenaSelector;
            
      }
        
        //ARENA SELECTOR WALLS MENU = = BACK TO SELECTOR MENU
        if(mouseOver(mx,my,430, 352, 200, 64) && Game.gameState == ChewingGumSimulator.STATE.ArenaSWalls){
            Game.gameState = ChewingGumSimulator.STATE.ArenaSelector;
            
      }
        
        //ARENA SELECTOR TREASURES MENU = = BACK TO SELECTOR MENU
        if(mouseOver(mx,my,430, 352, 200, 64) && Game.gameState == ChewingGumSimulator.STATE.ArenaSTreasures){
            Game.gameState = ChewingGumSimulator.STATE.ArenaSelector;
            
      }
        
        //ARENA SELECTOR TREASURES MENU = = BRONZE TREASURE
        if(mouseOver(mx,my,5, 20, 200, 64) && Game.gameState == ChewingGumSimulator.STATE.ArenaSTreasures){
            ChewingGumSimulator.editSelected=true;
            for(int i=0;i<handler.object.size();i++){
            GameObject tempObject = handler.object.get(i);
            if(tempObject.getId()==ID.Player){
            handler.addObject(new SoftTreasure((int)tempObject.getX()-50,(int)tempObject.getY()-30, ID.SoftTreasure,handler));
            }}
            Game.gameState=ChewingGumSimulator.STATE.ArenaEditor;
      }
        
        
        //ARENA SELECTOR TREASURES MENU = = SILVER TREASURE
        if(mouseOver(mx,my,210, 20, 200, 64) && Game.gameState == ChewingGumSimulator.STATE.ArenaSTreasures){
            ChewingGumSimulator.editSelected=true;
            for(int i=0;i<handler.object.size();i++){
            GameObject tempObject = handler.object.get(i);
            if(tempObject.getId()==ID.Player){
            handler.addObject(new SilverSoftTreasure((int)tempObject.getX()-50,(int)tempObject.getY()-30, ID.SilverSoftTreasure,handler));
            }}
            Game.gameState=ChewingGumSimulator.STATE.ArenaEditor;
      }
        
        
        //ARENA SELECTOR TREASURES MENU = = GOLD TREASURE
        if(mouseOver(mx,my,415, 20, 200, 64) && Game.gameState == ChewingGumSimulator.STATE.ArenaSTreasures){
            ChewingGumSimulator.editSelected=true;
            for(int i=0;i<handler.object.size();i++){
            GameObject tempObject = handler.object.get(i);
            if(tempObject.getId()==ID.Player){
            handler.addObject(new GoldSoftTreasure((int)tempObject.getX()-50,(int)tempObject.getY()-30, ID.GoldSoftTreasure,handler));
            }}
            Game.gameState=ChewingGumSimulator.STATE.ArenaEditor;
      }
        
        //ARENA SELECTOR TROPHIES MENU = = BACK TO SELECTOR MENU
        if(mouseOver(mx,my,430, 352, 200, 64) && Game.gameState == ChewingGumSimulator.STATE.ArenaSTrophies){
            Game.gameState = ChewingGumSimulator.STATE.ArenaSelector;
            
      }
        
        //ARENA SELECTOR PLAYER COLOR MENU = = BACK TO SELECTOR MENU
        if(mouseOver(mx,my,430, 352, 200, 64) && Game.gameState == ChewingGumSimulator.STATE.ArenaSPColor){
            Game.gameState = ChewingGumSimulator.STATE.ArenaSelector;
            
      }
        //ARENA SELECTOR PLAYER COLOR MENU = = SET PLAYER 1 COLOR
        if(mouseOver(mx,my,5, 20, 200, 64) && Game.gameState == ChewingGumSimulator.STATE.ArenaSPColor){
            if(optionalP1Color==true){
                optionalP1Color=false;
            }
            else if(optionalP1Color==false){
                optionalP1Color=true;
            }
      }
        
        
        //ARENA SELECTOR PLAYER COLOR MENU = = SET PLAYER 2 COLOR
        if(mouseOver(mx,my,210, 20, 200, 64) && Game.gameState == ChewingGumSimulator.STATE.ArenaSPColor){
            if(optionalP2Color==true){
                optionalP2Color=false;
            }
            else if(optionalP2Color==false){
                optionalP2Color=true;
            }
      }
        
        //ARENA SELECTOR BACKGROUND MENU = = BACK TO SELECTOR MENU
        if(mouseOver(mx,my,430, 352, 200, 64) && Game.gameState == ChewingGumSimulator.STATE.ArenaSBackground){
            Game.gameState = ChewingGumSimulator.STATE.ArenaSelector;
            
      }
        
        //ARENA SELECTOR BACKGROUND MENU = = SET BACKGROUND
        if(mouseOver(mx,my,210, 20, 200, 64) && Game.gameState == ChewingGumSimulator.STATE.ArenaSBackground){
            Game.gameState = ChewingGumSimulator.STATE.BackgroundSelect;
            
      }
        
        //ARENA SELECTOR BACKGROUND MENU = = BACKGROUND SWITCH
        if(mouseOver(mx,my,5, 20, 200, 64) && Game.gameState == ChewingGumSimulator.STATE.ArenaSBackground){
            if(optionalBackground==true){
                optionalBackground=false;
            }
            else if(optionalBackground==false){
                optionalBackground=true;
            }
            
      }
        
        
        
        //END GAME RETRY BUTTON5, 20, 200, 64
        if(mouseOver(mx,my,420, 360, 200, 64) && Game.gameState == ChewingGumSimulator.STATE.EndGame){
            Game.gameState = ChewingGumSimulator.STATE.Game;
            if(hud.getScore()>ChewingGumSimulator.savedScore){
                Game.savedScore = (int) hud.getScore();
            }
            Game.savedCoins = (int) hud.COINS;
            ChewingGumSimulator.paused = false;
            hud.HEALTH=100;
            hud.AMMO=100;
            hud.BLADDER=100;
            hud.EMPCount=0;
            hud.NUKES=0;
            hud.score(0);
            hud.setLevel(1);
            handler.addObject(new Player(ChewingGumSimulator.WIDTH/2-32, ChewingGumSimulator.HEIGHT/2-32, ID.Player,handler));
            handler.addObject(new BasicEnemy(r.nextInt(ChewingGumSimulator.WIDTH),r.nextInt(ChewingGumSimulator.HEIGHT), ID.BasicEnemy,handler));
            handler.addObject(new BasicEnemy(r.nextInt(ChewingGumSimulator.WIDTH),r.nextInt(ChewingGumSimulator.HEIGHT), ID.BasicEnemy,handler));
        
        
        }  
        
        
        
        if(Game.WIDTH==1280){
            
     //MAIN MENU  
            


                 //ENTER ARENA
        if(mouseOver(mx,my,420,10,400,100) && Game.gameState == ChewingGumSimulator.STATE.Menu){
            Game.gameState = ChewingGumSimulator.STATE.ArenaSelect;
            
      }
        
        
        
        
        
        
        
        
        
        
  //STORY SCREEN ONE 
  
  
        //BACK TO MENU
        if(mouseOver(mx,my,130,Game.HEIGHT-160, 400, 100) && Game.gameState == ChewingGumSimulator.STATE.StoryScreenOne){
            Game.gameState = ChewingGumSimulator.STATE.Menu;
            
      }
        
        
        //STORY SCREEN TWO
        if(mouseOver(mx,my,Game.WIDTH-410,Game.HEIGHT-160, 400, 100) && Game.gameState == ChewingGumSimulator.STATE.StoryScreenOne){
            Game.gameState = ChewingGumSimulator.STATE.StoryScreenTwo;
            
      }
        
        
        
        //START GAME
        if(mouseOver(mx,my,Game.WIDTH-410,Game.HEIGHT-160, 400, 100) && Game.gameState == ChewingGumSimulator.STATE.StoryScreenTwo){
            Game.gameState = ChewingGumSimulator.STATE.Game;
            
      }
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
        }
        
        //MARKETPLACE REFILL HEALTH430, 184, 200, 64
        /*if(mouseOver(mx,my,10,10,200,60) && Game.gameState == ChewingGumSimulator.STATE.MarketPlace){
            if(hud.COINS>=50){
                hud.COINS-=50;
                hud.HEALTH=100;
            Game.gameState = ChewingGumSimulator.STATE.Game;
            ChewingGumSimulator.paused = false;}
            
      }*/
        
        
        
    }
    
    public void mouseReleased(MouseEvent e){
        
    }
    
    
    
    private boolean mouseOver(int mx, int my,int x,int y,int width, int height) {
        if(mx > x && mx < (x + width))
        {
            if(my > y && my < (y + height)){
                return true;
            }else return false;
            
        }else return false;
        
    }
    
    
    
    
    
    public void MouseMoved(MouseEvent e){
        int mx=e.getX();
        int my=e.getY();
        if(mouseOver(mx, my, 210, 80, 200, 64) && Game.gameState == ChewingGumSimulator.STATE.Menu){
            
            buttonColor=Color.yellow;
            
            
            
            
        }else buttonColor=Color.white;
    }
    
    public void tick(){
        StringSetter();
        ButtonSetter();
        if(Game.transitStart==true){
            Adventure_Transit();
        }
        if(Game.gameState==ChewingGumSimulator.STATE.FinishTutorial){
            Game.achivementsStatus[0]=true;
            Spawn.tutorialReset();
        }
        
    }
    
    
    
    
    
    
    public void render(Graphics g){
        
        Graphics2D g2d = (Graphics2D) g;
        
        
        Font menufont1280 = new Font("calibri",1,40);
        
        if(ChewingGumSimulator.paused)
        {   
        }
        
        if(Game.gameState==ChewingGumSimulator.STATE.Menu)
        {
            
            
            
        g.setColor(buttonColor);
        
        
        g.setColor(Color.green);
        g.fillRoundRect(ButtonX_MM_Play, ButtonY_MM_Play, ButtonX_Size_MM, ButtonY_Size_MM,20,20);    
        g.setColor(Color.white);
        g.drawRoundRect(ButtonX_MM_Play, ButtonY_MM_Play, ButtonX_Size_MM, ButtonY_Size_MM,20,20);
        
        
        
        
        g.setColor(Color.white);
        g.drawRoundRect(ButtonX_MM_Arena, ButtonY_MM_Arena, ButtonX_Size_MM, ButtonY_Size_MM,20,20);
        g.drawRoundRect(ButtonX_MM_Options, ButtonY_MM_Options, ButtonX_Size_MM, ButtonY_Size_MM,20,20);
        g.drawRoundRect(ButtonX_MM_Help, ButtonY_MM_Help, ButtonX_Size_MM, ButtonY_Size_MM,20,20);
        
        
        //ADVENTURE BUTTON
        Font fntx = new Font("calibri",1,20);
        g.setFont(fntx);
        
        g.setColor(Color.blue);
        g.fillRoundRect(ButtonX_MM_Adventure, ButtonY_MM_Adventure, ButtonX_Size_MM, ButtonY_Size_MM,20,20);
        g.setColor(Color.white);
        g.drawRoundRect(ButtonX_MM_Adventure, ButtonY_MM_Adventure, ButtonX_Size_MM, ButtonY_Size_MM,20,20);
        g.drawString(String_MM_Adventure, 465, 120);
        
     
        g.drawRoundRect(ButtonX_MM_About, ButtonY_MM_About, ButtonX_Size_MM, ButtonY_Size_MM,20,20);
        
        
        g.setColor(Color.red);
        g.fillRoundRect(ButtonX_MM_Quit, ButtonY_MM_Quit, ButtonX_Size_MM, ButtonY_Size_MM,20,20);
        g.setColor(Color.white);
        g.drawRoundRect(ButtonX_MM_Quit, ButtonY_MM_Quit, ButtonX_Size_MM, ButtonY_Size_MM,20,20);
        
        Font fnt = new Font("arial",1,20);
        Font fnt2 = new Font("arial",1,20);
        g.setFont(fnt);
        
        g.setColor(buttonColor);
        g.drawString(String_MM_Play, 287, 120);
        g.drawString(String_MM_Arena, 280, 50);
        g.setFont(fntx);
        g.drawString("Disease ", 470, 30);
        g.drawString("Hunter BETA", 450, 45);
        g.setFont(fnt);
        
            
            g.fillRect(10,10,80,20);
            g.setColor(Color.blue);
            g.fillRect(10,30,80,20);
            g.setColor(Color.red);
            g.fillRect(10,50,80,20);
            g.setColor(Color.white);
        
        g.setFont(fnt2);
        g.drawString(String_MM_Options,270,190);
        g.drawString(String_MM_Help,287,260);
        g.drawString(String_MM_About,280,330);
        g.drawString(String_MM_Quit,287,400);
        
        
        
          
            
        }
        
        
        
        
        else if(Game.gameState == ChewingGumSimulator.STATE.Help)
        {
            Font HelpFnt = new Font("arial",1,15);
            Font BackFnt = new Font("arial",1,20);
            Font EpicFnt = new Font("calibri",1,20);
            g.setFont(HelpFnt);
            g.setColor(Color.white);
            //g.drawString("Use arrow keys to move around comrade", 180, 150);
            //g.drawString("Cheats:", 180, 170);
            //g.drawString("Press G to refill your Health", 180, 190);
            //g.drawString("Press C to clear all enemies", 180, 210);
            
            //g.drawString("Remember to Enable cheats from Options", 180, 230);
            
            
            g2d.setComposite(makeTransparent(alpha));
            g.setColor(royal_blue);
            g.fillRoundRect(ButtonX_HM_Turrets, ButtonY_HM_Turrets, ButtonX_Size_MM, ButtonY_Size_MM,20,20);
            g.setColor(Color.white);
            g.drawRoundRect(ButtonX_HM_Turrets, ButtonY_HM_Turrets, ButtonX_Size_MM, ButtonY_Size_MM,20,20);
            g2d.setComposite(makeTransparent(1));
            g.drawString(String_HM_Turrets,470,50);
            
            
            g2d.setComposite(makeTransparent(alpha));
            g.setColor(royal_blue);
            g.fillRoundRect(ButtonX_HM_Explosives, ButtonY_HM_Explosives, ButtonX_Size_MM, ButtonY_Size_MM,20,20);
            g.setColor(Color.white);
            g.drawRoundRect(ButtonX_HM_Explosives, ButtonY_HM_Explosives, ButtonX_Size_MM, ButtonY_Size_MM,20,20);
            g2d.setComposite(makeTransparent(1));
            g.drawString(String_HM_Explosives,465,120);
            
            
            g2d.setComposite(makeTransparent(alpha));
            g.setColor(royal_blue);
            g.fillRoundRect(ButtonX_HM_SinglePlayer, ButtonY_HM_SinglePlayer, ButtonX_Size_MM, ButtonY_Size_MM,20,20);
            g.setColor(Color.white);
            g.drawRoundRect(ButtonX_HM_SinglePlayer, ButtonY_HM_SinglePlayer, ButtonX_Size_MM, ButtonY_Size_MM,20,20);
            g2d.setComposite(makeTransparent(1));
            g.drawString(String_HM_SinglePlayer,455,190);
            
            
            
            g2d.setComposite(makeTransparent(alpha));
            g.setColor(royal_blue);
            g.fillRoundRect(ButtonX_HM_Arena, ButtonY_HM_Arena, ButtonX_Size_MM, ButtonY_Size_MM,20,20);
            g.setColor(Color.white);
            g.drawRoundRect(ButtonX_HM_Arena, ButtonY_HM_Arena, ButtonX_Size_MM, ButtonY_Size_MM,20,20);
            g2d.setComposite(makeTransparent(1));
            g.drawString(String_HM_Arena,480,260);
            
            
            
            g2d.setComposite(makeTransparent(alpha));
            g.setColor(royal_blue);
            g.fillRoundRect(ButtonX_HM_Cheats, ButtonY_HM_Cheats, ButtonX_Size_MM, ButtonY_Size_MM,20,20);
            g.setColor(Color.white);
            g.drawRoundRect(ButtonX_HM_Cheats, ButtonY_HM_Cheats, ButtonX_Size_MM, ButtonY_Size_MM,20,20);
            g2d.setComposite(makeTransparent(1));
            g.drawString(String_HM_Cheats,475,330);
            
            
            g2d.setComposite(makeTransparent(alpha));
            g.setColor(royal_blue);
            g.fillRoundRect(ButtonX_HM_Adventure, ButtonY_HM_Adventure, ButtonX_Size_MM, ButtonY_Size_MM,20,20);
            g.setColor(Color.white);
            g.drawRoundRect(ButtonX_HM_Adventure, ButtonY_HM_Adventure, ButtonX_Size_MM, ButtonY_Size_MM,20,20);
            g2d.setComposite(makeTransparent(1));
            g.drawString(String_HM_Adventure,470,400);
            
            
            
            g2d.setComposite(makeTransparent(alpha));
            g.setColor(royal_blue);
            g.fillRoundRect(ButtonX_HM_Weather, ButtonY_HM_Weather, ButtonX_Size_MM, ButtonY_Size_MM,20,20);
            g.setColor(Color.white);
            g.drawRoundRect(ButtonX_HM_Weather, ButtonY_HM_Weather, ButtonX_Size_MM, ButtonY_Size_MM,20,20);
            g2d.setComposite(makeTransparent(1));
            g.drawString(String_HM_Weather,55,50);
            
            
            
            
            g2d.setComposite(makeTransparent(alpha));
            g.setColor(royal_blue);
            g.fillRoundRect(ButtonX_HM_Treasures, ButtonY_HM_Treasures, ButtonX_Size_MM, ButtonY_Size_MM,20,20);
            g.setColor(Color.white);
            g.drawRoundRect(ButtonX_HM_Treasures, ButtonY_HM_Treasures, ButtonX_Size_MM, ButtonY_Size_MM,20,20);
            g2d.setComposite(makeTransparent(1));
            g.drawString(String_HM_Treasures,55,120);
            
            
            g2d.setComposite(makeTransparent(alpha));
            g.setColor(royal_blue);
            g.fillRoundRect(ButtonX_HM_Enemies, ButtonY_HM_Enemies, ButtonX_Size_MM, ButtonY_Size_MM,20,20);
            g.setColor(Color.white);
            g.drawRoundRect(ButtonX_HM_Enemies, ButtonY_HM_Enemies, ButtonX_Size_MM, ButtonY_Size_MM,20,20);
            g2d.setComposite(makeTransparent(1));
            g.drawString(String_HM_Enemies,55,190);
            
            
            g2d.setComposite(makeTransparent(alpha));
            g.setColor(royal_blue);
            g.fillRoundRect(ButtonX_HM_PowerUps, ButtonY_HM_PowerUps, ButtonX_Size_MM, ButtonY_Size_MM,20,20);
            g.setColor(Color.white);
            g.drawRoundRect(ButtonX_HM_PowerUps, ButtonY_HM_PowerUps, ButtonX_Size_MM, ButtonY_Size_MM,20,20);
            g2d.setComposite(makeTransparent(1));
            g.drawString(String_HM_PowerUps,45,260);
            
            
            
            g2d.setComposite(makeTransparent(alpha));
            g.setColor(royal_blue);
            g.fillRoundRect(ButtonX_HM_Boxes, ButtonY_HM_Boxes, ButtonX_Size_MM, ButtonY_Size_MM,20,20);
            g.setColor(Color.white);
            g.drawRoundRect(ButtonX_HM_Boxes, ButtonY_HM_Boxes, ButtonX_Size_MM, ButtonY_Size_MM,20,20);
            g2d.setComposite(makeTransparent(1));
            g.drawString(String_HM_Boxes,65,330);
            
            g2d.setComposite(makeTransparent(alpha));
            g.setColor(royal_blue);
            g.fillRoundRect(ButtonX_HM_Decorations, ButtonY_HM_Decorations, ButtonX_Size_MM, ButtonY_Size_MM,20,20);
            g.setColor(Color.white);
            g.drawRoundRect(ButtonX_HM_Decorations, ButtonY_HM_Decorations, ButtonX_Size_MM, ButtonY_Size_MM,20,20);
            g2d.setComposite(makeTransparent(1));
            g.drawString(String_HM_Decorations,50,400);
            
            g2d.setComposite(makeTransparent(alpha));
            g.setColor(Color.yellow);
            g.fillRoundRect(ButtonX_HM_Tutorial, ButtonY_HM_Tutorial, ButtonX_Size_MM, ButtonY_Size_MM,20,20);
            g.setColor(Color.white);
            g.drawRoundRect(ButtonX_HM_Tutorial, ButtonY_HM_Tutorial, ButtonX_Size_MM, ButtonY_Size_MM,20,20);
            g2d.setComposite(makeTransparent(1));
            g.setFont(EpicFnt);
            g.setColor(Color.black);
            g.drawString(String_HM_Tutorial,280,80);
            
            
            g2d.setComposite(makeTransparent(alpha));
            g.setColor(Color.red);
            g.fillRoundRect(ButtonX_HM_Back, ButtonY_HM_Back, ButtonX_Size_MM, ButtonY_Size_MM,20,20);
            g.setColor(Color.white);
            g.drawRoundRect(ButtonX_HM_Back, ButtonY_HM_Back, ButtonX_Size_MM, ButtonY_Size_MM,20,20);
            g2d.setComposite(makeTransparent(1));
            g.setFont(BackFnt);
            g.drawString(String_Back,280,400);
            
        }
        
        
        
        
        
        else if(Game.gameState == ChewingGumSimulator.STATE.ShieldHelp)
        {
            Font EndFnt = new Font("arial",1,25);
            Font NorFnt = new Font("arial",1,17);
            
            
            g.setFont(NorFnt);
            g.setColor(Color.orange);
            
            g.drawString("This is the Shield Power", 30, 60);
            g.drawString("You will leave dirty battles squeaky clean", 30, 90);
            g.drawString("European Union Approved", 30, 120);
            
            
            
            
            
            
            
            
            g.setColor(Color.green);
            g.fillRoundRect(400, 360, 200, 64,20,20);
            
            
            g.setColor(Color.white);
            g.drawString("Next Power",450,400);
            g.drawRoundRect(400, 360, 200, 64,20,20);
            
            
        }
        
        
        
        else if(Game.gameState == ChewingGumSimulator.STATE.SpeedHelp)
        {
            Font EndFnt = new Font("arial",1,25);
            Font NorFnt = new Font("arial",1,17);
            
            
            g.setFont(NorFnt);
            g.setColor(Color.orange);
            
            g.drawString("This is the Speed Power", 30, 60);
            g.drawString("Level up your gearbox and turn into a SuperCell", 30, 90);
            g.drawString("Doubles your Speed", 30, 120);
            
            
            
            
            
            
            
            
            g.setColor(Color.green);
            g.fillRoundRect(20, 360, 200, 64,20,20);
            
            
            g.setColor(Color.white);
            g.drawString("Next Power",70,400);
            g.drawRoundRect(20, 360, 200, 64,20,20);
            
            
        }
        
        
        
        else if(Game.gameState == ChewingGumSimulator.STATE.About)
        {
            Font HelpFnt = new Font("arial",1,15);
            Font BackFnt = new Font("arial",1,20);
            Font LittleFnt = new Font("arial",1,10);
            g.setFont(HelpFnt);
            g.setColor(Color.white);
            g.drawString("Disease Hunter", 250, 150);
            g.drawString("Version 0.41 Beta", 240, 200);
            g.drawString("Beta Stage Three", 245, 250);
            g.drawString("© Copyright  2017  MLD Corporation", 180, 290);
            g.setFont(LittleFnt);
            g.drawString("Illegaly reproducing materials from this", 210, 310);
            g.drawString("Application will be punished under the law of", 205, 330);
            g.drawString("The Russian Federation", 250, 350);
            
            
            g.setColor(Color.red);
            g.fillRoundRect(210, 360, 200, 64,20,20);
            
            g.setColor(Color.white);
            g.drawRoundRect(210, 360, 200, 64,20,20);
            g.setFont(BackFnt);
            g.drawString(String_Back,280,400);
            
            //RUSSIAN FLAG IN CORNER
            g.setColor(Color.white);
            g.fillRect(10,10,80,20);
            g.setColor(Color.blue);
            g.fillRect(10,30,80,20);
            g.setColor(Color.red);
            g.fillRect(10,50,80,20);
            
        }
        
        
        else if(Game.gameState == ChewingGumSimulator.STATE.Options)
        {
            Font HelpFnt = new Font("arial",1,15);
            Font BackFnt = new Font("arial",1,20);
            Font NewFnt = new Font("calibri",1,15);
            g.setFont(HelpFnt);
            /*g.setColor(Color.white);
            g.drawString("Work In Progress", 250, 15);
            g.setColor(Color.yellow);
            g.drawString("Сука Блять", 270, 30);*/
            
            g.setColor(dark_green);
            g.fillRoundRect(ButtonX_OM_Other, ButtonY_OM_Other, ButtonX_Size_MM, ButtonY_Size_MM,20,20);
            
            g.setColor(Color.white);
            g.drawRoundRect(ButtonX_OM_Other, ButtonY_OM_Other, ButtonX_Size_MM, ButtonY_Size_MM,20,20);
            g.drawString(String_OM_Other,85,330);
            
            
            
            g.setColor(dark_green);
            g.fillRoundRect(ButtonX_OM_Language, ButtonY_OM_Language, ButtonX_Size_MM, ButtonY_Size_MM,20,20);
            
            g.setColor(Color.white);
            g.drawString(String_OM_Language,70,190);
            g.drawRoundRect(ButtonX_OM_Language, ButtonY_OM_Language, ButtonX_Size_MM, ButtonY_Size_MM,20,20);
            
            g.setColor(dark_green);
            g.fillRoundRect(ButtonX_OM_Profile, ButtonY_OM_Profile, ButtonX_Size_MM, ButtonY_Size_MM,20,20);
            
            g.setColor(Color.white);
            g.drawString(String_OM_Profile,80,260);
            g.drawRoundRect(ButtonX_OM_Profile, ButtonY_OM_Profile, ButtonX_Size_MM, ButtonY_Size_MM,20,20);
            
            
            
            
            
            
            
            
            g.setColor(dark_green);
            g.fillRoundRect(ButtonX_OM_Graphics, ButtonY_OM_Graphics, ButtonX_Size_MM, ButtonY_Size_MM,20,20);
            
            
            g.setColor(Color.white);
            g.drawString(String_OM_Graphics,480,260);
            g.drawRoundRect(ButtonX_OM_Graphics,ButtonY_OM_Graphics, ButtonX_Size_MM, ButtonY_Size_MM,20,20);
            
            
            
            g.setColor(dark_green);
            g.fillRoundRect(ButtonX_OM_PlayerSetup, ButtonY_OM_PlayerSetup, ButtonX_Size_MM, ButtonY_Size_MM,20,20); 
            g.setColor(Color.white);
            
            g.drawString(String_OM_PlayerSetup,470,330);
            g.drawRoundRect(ButtonX_OM_PlayerSetup,ButtonY_OM_PlayerSetup, ButtonX_Size_MM, ButtonY_Size_MM,20,20);
            
            
            
            g.setColor(Color.red);
            g.fillRoundRect(ButtonX_HM_Back, ButtonY_HM_Back, ButtonX_Size_MM, ButtonY_Size_MM,20,20);
            
            g.setFont(BackFnt);
            g.setColor(Color.white);
            g.drawString(String_Back,280,400);
            g.drawRoundRect(ButtonX_HM_Back, ButtonY_HM_Back, ButtonX_Size_MM, ButtonY_Size_MM,20,20);
            g.setFont(NewFnt);
            
            g.setColor(dark_green);
            g.fillRoundRect(ButtonX_OM_Controls, ButtonY_OM_Controls, ButtonX_Size_MM, ButtonY_Size_MM,20,20); 
            g.setColor(Color.white);
            
            g.drawString(String_OM_Controls,280,330);
            g.drawRoundRect(ButtonX_OM_Controls,ButtonY_OM_Controls, ButtonX_Size_MM, ButtonY_Size_MM,20,20);
            
            
            
            g.setColor(dark_green);
            g.fillRoundRect(ButtonX_OM_Sound, ButtonY_OM_Sound, ButtonX_Size_MM, ButtonY_Size_MM,20,20);
            
            
            g.setColor(Color.white);
            g.drawString(String_OM_Sound,490,190);
            g.drawRoundRect(ButtonX_OM_Sound,ButtonY_OM_Sound, ButtonX_Size_MM, ButtonY_Size_MM,20,20);
            
        }
        
        
        else if(Game.gameState == ChewingGumSimulator.STATE.EndGame)
        {
            Font EndFnt = new Font("arial",1,25);
            Font NorFnt = new Font("arial",1,15);
            
            
            g.setFont(EndFnt);
            g.setColor(Color.red);
            
            g.drawString("YOU HAVE BEEN DECOMPOSED", 130, 150);
            g.setColor(Color.orange);
            g.drawString("In medicine we trust", 170, 250);
            g.setColor(Color.cyan);
            g.drawString("Your Score: " + (int)hud.getScore(),210,300);
            g.drawString("Level " + (int)hud.getLevel() + " Reached" ,210, 350);
            
            if(Game.socialNetworks==true){
            
            g.setColor(faceBlue);
            g.fillRoundRect(5, 360, 200, 64,20,20);
            
            
            g.setFont(NorFnt);
            g.setColor(Color.white);
            g.drawString("Share On Facebook",40,400);
            g.drawRoundRect(5, 360, 200, 64,20,20);}
            
            
            g.setColor(Color.green);
            g.fillRoundRect(210, 360, 200, 64,20,20);
            
            
            g.setFont(NorFnt);
            g.setColor(Color.white);
            g.drawString(String_BackToMenu,260,400);
            g.drawRoundRect(210, 360, 200, 64,20,20);
            
            
            g.setColor(Color.cyan);
            g.fillRoundRect(420, 360, 200, 64,20,20);
            
            g.setFont(NorFnt);
            g.setColor(Color.white);
            g.drawString(String_Retry,490,400);
            g.drawRoundRect(420, 360, 200, 64,20,20);
            
            
        }
        
        
        
        else if(Game.gameState == ChewingGumSimulator.STATE.AdventureOneLost || Game.gameState == ChewingGumSimulator.STATE.AdventureTwoLost || Game.gameState == ChewingGumSimulator.STATE.AdventureThreeLost || Game.gameState == ChewingGumSimulator.STATE.AdventureFourLost || Game.gameState == ChewingGumSimulator.STATE.AdventureFiveLost || Game.gameState == ChewingGumSimulator.STATE.AdventureSixLost || Game.gameState == ChewingGumSimulator.STATE.AdventureSevenLost || Game.gameState == ChewingGumSimulator.STATE.AdventureEightLost || Game.gameState == ChewingGumSimulator.STATE.AdventureNineLost || Game.gameState == ChewingGumSimulator.STATE.AdventureTenLost)
        {
            Font EndFnt = new Font("arial",1,25);
            Font NorFnt = new Font("arial",1,15);
            
            
            g.setFont(EndFnt);
            g.setColor(Color.red);
            
            
            if(Game.gameState == ChewingGumSimulator.STATE.AdventureOneLost){
                g.drawString("Adventure Stage One Lost", 130, 50);
            }
            if(Game.gameState == ChewingGumSimulator.STATE.AdventureTwoLost){
                g.drawString("Adventure Stage Two Lost", 130, 50);
            }
            if(Game.gameState == ChewingGumSimulator.STATE.AdventureThreeLost){
                g.drawString("Adventure Stage Three Lost", 130, 50);
            }
            if(Game.gameState == ChewingGumSimulator.STATE.AdventureFourLost){
                g.drawString("Adventure Stage Four Lost", 130, 50);
            }
            if(Game.gameState == ChewingGumSimulator.STATE.AdventureFiveLost){
                g.drawString("Adventure Stage Five Lost", 130, 50);
            }
            if(Game.gameState == ChewingGumSimulator.STATE.AdventureSixLost){
                g.drawString("Adventure Stage Six Lost", 130, 50);
            }
            if(Game.gameState == ChewingGumSimulator.STATE.AdventureSevenLost){
                g.drawString("Adventure Stage Seven Lost", 130, 50);
            }
            if(Game.gameState == ChewingGumSimulator.STATE.AdventureEightLost){
                g.drawString("Adventure Stage Eight Lost", 130, 50);
            }
            if(Game.gameState == ChewingGumSimulator.STATE.AdventureNineLost){
                g.drawString("Adventure Stage Nine Lost", 130, 50);
            }
            if(Game.gameState == ChewingGumSimulator.STATE.AdventureTenLost){
                g.drawString("Adventure Stage Ten Lost", 130, 50);
            }
            
            
            g.drawString("YOU HAVE BEEN DECOMPOSED", 130, 150);
            g.setColor(Color.orange);
            g.drawString("In medicine we trust", 170, 250);
            g.setColor(Color.cyan);
            g.drawString("Time Remaining: " + AdventureOne.Timer,210,300);
            g.drawString("Distance " + (int)Player.distanceTraveled ,210, 350);
            
            if(Game.socialNetworks==true){
            
            g.setColor(faceBlue);
            g.fillRoundRect(5, 360, 200, 64,20,20);
            
            
            g.setFont(NorFnt);
            g.setColor(Color.white);
            g.drawString("Share On Facebook",40,400);
            g.drawRoundRect(5, 360, 200, 64,20,20);}
            
            
            g.setColor(Color.green);
            g.fillRoundRect(210, 360, 200, 64,20,20);
            
            
            g.setFont(NorFnt);
            g.setColor(Color.white);
            g.drawString(String_BackToMenu,260,400);
            g.drawRoundRect(210, 360, 200, 64,20,20);
            
            
            g.setColor(Color.cyan);
            g.fillRoundRect(420, 360, 200, 64,20,20);
            
            g.setFont(NorFnt);
            g.setColor(Color.white);
            g.drawString(String_Retry,490,400);
            g.drawRoundRect(420, 360, 200, 64,20,20);
            
            
        }
        
        
        else if(Game.gameState == ChewingGumSimulator.STATE.AdventureOneWon || Game.gameState == ChewingGumSimulator.STATE.AdventureTwoWon || Game.gameState == ChewingGumSimulator.STATE.AdventureThreeWon || Game.gameState == ChewingGumSimulator.STATE.AdventureFourWon || Game.gameState == ChewingGumSimulator.STATE.AdventureFiveWon || Game.gameState == ChewingGumSimulator.STATE.AdventureSixWon || Game.gameState == ChewingGumSimulator.STATE.AdventureSevenWon || Game.gameState == ChewingGumSimulator.STATE.AdventureEightWon || Game.gameState == ChewingGumSimulator.STATE.AdventureNineWon || Game.gameState == ChewingGumSimulator.STATE.AdventureTenWon)
        {
            Font EndFnt = new Font("arial",1,25);
            Font NorFnt = new Font("arial",1,15);
            
            
            g.setFont(EndFnt);
            g.setColor(Color.red);
            
            
            if(Game.gameState == ChewingGumSimulator.STATE.AdventureOneWon){
                g.drawString("Adventure Stage One Completed", 130, 50);
            }
            if(Game.gameState == ChewingGumSimulator.STATE.AdventureTwoWon){
                g.drawString("Adventure Stage Two Completed", 130, 50);
            }
            if(Game.gameState == ChewingGumSimulator.STATE.AdventureThreeWon){
                g.drawString("Adventure Stage Three Completed", 130, 50);
            }
            if(Game.gameState == ChewingGumSimulator.STATE.AdventureFourWon){
                g.drawString("Adventure Stage Four Completed", 130, 50);
            }
            if(Game.gameState == ChewingGumSimulator.STATE.AdventureFiveWon){
                g.drawString("Adventure Stage Five Completed", 130, 50);
            }
            if(Game.gameState == ChewingGumSimulator.STATE.AdventureSixWon){
                g.drawString("Adventure Stage Six Completed", 130, 50);
            }
            if(Game.gameState == ChewingGumSimulator.STATE.AdventureSevenWon){
                g.drawString("Adventure Stage Seven Completed", 130, 50);
            }
            if(Game.gameState == ChewingGumSimulator.STATE.AdventureEightWon){
                g.drawString("Adventure Stage Eight Completed", 130, 50);
            }
            if(Game.gameState == ChewingGumSimulator.STATE.AdventureNineWon){
                g.drawString("Adventure Stage Nine Completed", 130, 50);
            }
            if(Game.gameState == ChewingGumSimulator.STATE.AdventureTenWon){
                g.drawString("Adventure Stage Ten Completed", 130, 50);
            }
            
            
            
            
            g.setColor(Color.green);
            g.drawString("YOU HAVE ESCAPED FROM THIS LEVEL !", 130, 150);
            g.setColor(Color.orange);
            g.drawString("In medicine we trust", 170, 250);
            g.setColor(Color.cyan);
            g.drawString("Time Remaining: " + AdventureOne.Timer,210,300);
            g.drawString("Distance " + (int)Player.distanceTraveled ,210, 350);
            
            if(Game.socialNetworks==true){
            
            g.setColor(faceBlue);
            g.fillRoundRect(5, 360, 200, 64,20,20);
            
            
            g.setFont(NorFnt);
            g.setColor(Color.white);
            g.drawString("Share On Facebook",40,400);
            g.drawRoundRect(5, 360, 200, 64,20,20);}
            
            
            g.setColor(Color.green);
            g.fillRoundRect(210, 360, 200, 64,20,20);
            
            
            g.setFont(NorFnt);
            g.setColor(Color.white);
            g.drawString(String_BackToMenu,260,400);
            g.drawRoundRect(210, 360, 200, 64,20,20);
            
            
            g.setColor(Color.cyan);
            g.fillRoundRect(420, 360, 200, 64,20,20);
            
            g.setFont(NorFnt);
            g.setColor(Color.white);
            g.drawString(String_NextLevel,490,400);
            g.drawRoundRect(420, 360, 200, 64,20,20);
            
            
        }
        
        else if(Game.gameState == ChewingGumSimulator.STATE.StoryScreenOne)
        {
            
            
            if(Game.WIDTH==640){
            Font EndFnt = new Font("arial",1,25);
            Font NorFnt = new Font("arial",1,15);
            
            
            g.setFont(NorFnt);
            g.setColor(Color.red);
            
            g.drawString("You are the first version of the Universal Human Antivirus", 100, 150);
            
            g.drawString("You need to avoid dangerous cells and destroy the viruses", 100, 200);
            
            g.drawString("Present in the body of our patient. Good luck, medical pioneer !", 100, 250);
            
            
            g.setColor(Color.green);
            g.fillRoundRect(210, 360, 200, 64,20,20);
            
            
            g.setFont(NorFnt);
            g.setColor(Color.white);
            g.drawString("Next",290,400);
            g.drawRoundRect(210, 360, 200, 64,20,20);
            
            
            g.setColor(Color.red);
            g.fillRoundRect(5, 360, 200, 64,20,20);
            
            g.setColor(Color.white);
            g.drawString(String_Back,85,400);
            g.drawRoundRect(5, 360, 200, 64,20,20);}
            
            
            
            if(Game.WIDTH==1280){
                
                Font biggerFnt = new Font("calibri",1,50);
                g.setFont(biggerFnt);
                g.setColor(Color.red);
                g.drawRoundRect(10, Game.HEIGHT-160, 400, 100,20,20);
                g.drawString(String_Back,130,Game.HEIGHT-100);
                
                g.setColor(Color.green);
                g.drawRoundRect(Game.WIDTH-410,Game.HEIGHT-160, 400, 100,20,20);
                g.drawString("Next",Game.WIDTH-280,Game.HEIGHT-100);
            }
            
            
        }
        
        else if(Game.gameState == ChewingGumSimulator.STATE.StoryScreenTwo)
        {
            
            
            if(Game.WIDTH==640){
            Font EndFnt = new Font("arial",1,25);
            Font NorFnt = new Font("arial",1,15);
            
            
            g.setFont(EndFnt);
            g.setColor(Color.red);
            
            g.drawString("MAKE OUR PATIENT'S", 180, 150);
            
            g.setColor(Color.white);
            g.drawString(" HEALTH GREAT AGAIN", 170, 200);
            
            g.setColor(Color.blue);
            g.drawString(" !!!  !!! ", 280, 250);
            
            g.setColor(Color.cyan);
            g.fillRoundRect(400, 360, 200, 64,20,20);
            
            
            g.setFont(NorFnt);
            g.setColor(Color.white);
            g.drawString("START",470,400);
            g.drawRoundRect(400, 360, 200, 64,20,20);}
            
            
            
            
            if(Game.WIDTH==1280){
                
                
                Font biggerFnt = new Font("calibri",1,50);
                g.setFont(biggerFnt);
                g.setColor(Color.red);
                g.drawRoundRect(10, Game.HEIGHT-160, 400, 100,20,20);
                g.drawString(String_Back,130,Game.HEIGHT-100);
                
                g.setColor(Color.green);
                g.drawRoundRect(Game.WIDTH-410,Game.HEIGHT-160, 400, 100,20,20);
                g.drawString("Next",Game.WIDTH-280,Game.HEIGHT-100);
                
                g.setColor(Color.white);
                g.drawString("MAKE OUR PATIENT'S", 200, 100);
                g.drawString("HEALTH", 250, 200);
                g.drawString("GREAT AGAIN !!!", 200, 300);
            }
            
            
        }
        
        else if(Game.gameState == ChewingGumSimulator.STATE.SelectDiff)
        {
            Font EndFnt = new Font("arial",1,25);
            Font NorFnt = new Font("arial",1,15);
            
            
            g.setFont(NorFnt);
            g.setColor(Color.white);
            g.setFont(EndFnt);
            g.drawString("Select Your Testicles Size", 170, 100);
            g.setFont(NorFnt);
            
            g.setColor(Color.red);
            g.fillRoundRect(210, 140, 200, 64,20,20);
            
            
            g.setColor(Color.white);
            g.drawString("Big Balls", 280, 180);
            g.drawRoundRect(210, 140, 200, 64,20,20);
            
            
            g.setColor(Color.yellow);
            g.fillRoundRect(210, 210, 200, 64,20,20);
            
            g.setColor(Color.black);
            g.drawString("Resonable Balls", 255, 250);
            g.drawRoundRect(210, 210, 200, 64,20,20);
            
            
            g.setColor(Color.green);
            g.fillRoundRect(210, 280, 200, 64,20,20);
            
            g.setColor(Color.white);
            g.drawString("Pussy", 285, 320);
            g.drawRoundRect(210, 280, 200, 64,20,20);
            
            /*g.setFont(NorFnt);
            g.setColor(Color.cyan);
            g.drawString("START",290,400);
            g.drawRect(210, 360, 200, 64);*/
            
            
        }
        
        else if(Game.gameState == ChewingGumSimulator.STATE.CheatMenu)
        {
            Font EndFnt = new Font("arial",1,25);
            Font NorFnt = new Font("arial",1,15);
            
            
            g.setFont(NorFnt);
            g.setColor(Color.white);
            g.setFont(EndFnt);
            
            
            g.setColor(Color.green);
            g.fillRoundRect(210, 140, 200, 64,20,20);
            
            g.setFont(NorFnt);
            g.setColor(Color.white);
            g.drawString("Currency Cheats", 250, 180);
            g.drawRoundRect(210, 140, 200, 64,20,20);
            
           
            g.setColor(Color.green);
            g.fillRoundRect(210, 210, 200, 64,20,20);
            
            g.setColor(Color.white);
            g.drawString("Objects Cheats", 260, 250);
            g.drawRoundRect(210, 210, 200, 64,20,20);
            
            
            g.drawString("Clear Objects", 260, 320);
            g.drawRect(210, 280, 200, 64);
            
            g.setColor(Color.green);
            g.drawString("Spawn Player", 470, 320);
            g.drawRect(420, 280, 200, 64);
            
            g.setColor(Color.orange);
            g.drawString("Spawn Enemy", 470, 250);
            g.drawRect(420, 210, 200, 64);
            
            g.setColor(Color.orange);
            g.drawString("Refill Health", 470, 180);
            g.drawRect(420, 140, 200, 64);
            
            g.setColor(Color.orange);
            g.drawString("Refill Ammo", 55, 180);
            g.drawRect(5, 140, 200, 64);
            
            g.setColor(Color.orange);
            g.drawString("Spawn Health Box", 40, 250);
            g.drawRect(5, 210, 200, 64);
            
            g.setColor(Color.orange);
            g.drawString("Spawn Ammo Box", 40, 320);
            g.drawRect(5, 280, 200, 64);
            
            g.setColor(Color.magenta);
            g.drawString("Spawn EMP Box", 40, 390);
            g.drawRect(5, 350, 200, 64);
            
            g.setFont(NorFnt);
            g.setColor(Color.cyan);
            g.drawString(String_Back,470,400);
            g.drawRoundRect(420, 360, 200, 64,20,20);
            
            
        }
        
        
        
        else if(Game.gameState == ChewingGumSimulator.STATE.ArenaSelect)
        {
            Font EndFnt = new Font("arial",1,25);
            Font NorFnt = new Font("arial",1,15);
            
            
            g.setFont(NorFnt);
            g.setColor(Color.white);
            g.setFont(EndFnt);
            
            g.setFont(NorFnt);
            
            g.setColor(Color.yellow);
            g.fillRoundRect(ButtonX_AA_A4, ButtonY_AA_A4, ButtonX_Size_MM, ButtonY_Size_MM,20,20);
            
            g.setColor(Color.black);
            g.drawString("Arena Four", 265, 180);
            g.drawRoundRect(ButtonX_AA_A4, ButtonY_AA_A4, ButtonX_Size_MM, ButtonY_Size_MM,20,20);
            
            g.setColor(Color.yellow);
            g.fillRoundRect(ButtonX_AA_A5, ButtonY_AA_A5, ButtonX_Size_MM, ButtonY_Size_MM,20,20);
            
            
            g.setColor(Color.black);
            g.drawString("Arena Five", 265, 250);
            g.drawRoundRect(ButtonX_AA_A5, ButtonY_AA_A5, ButtonX_Size_MM, ButtonY_Size_MM,20,20);
            
            
            
            g.setColor(Color.yellow);
            g.fillRoundRect(ButtonX_AA_A6, ButtonY_AA_A6, ButtonX_Size_MM, ButtonY_Size_MM,20,20);
            
            
            g.setColor(Color.black);
            g.drawString("Arena Six", 270, 320);
            g.drawRoundRect(ButtonX_AA_A6, ButtonY_AA_A6, ButtonX_Size_MM, ButtonY_Size_MM,20,20);
            
            
            g.setColor(Color.green);
            g.fillRoundRect(ButtonX_AA_A1, ButtonY_AA_A1, ButtonX_Size_MM, ButtonY_Size_MM,20,20);
            
            
            
            g.setColor(Color.white);
            g.drawString("Arena One", 65, 180);
            g.drawRoundRect(ButtonX_AA_A1, ButtonY_AA_A1, ButtonX_Size_MM, ButtonY_Size_MM,20,20);
            
            
            
            g.setColor(Color.green);
            g.fillRoundRect(ButtonX_AA_A2, ButtonY_AA_A2, ButtonX_Size_MM, ButtonY_Size_MM,20,20);
            
            g.setColor(Color.white);
            g.drawString("Arena Two", 65, 250);
            g.drawRoundRect(ButtonX_AA_A2, ButtonY_AA_A2, ButtonX_Size_MM, ButtonY_Size_MM,20,20);
            
            
            
            g.setColor(Color.green);
            g.fillRoundRect(ButtonX_AA_A3, ButtonY_AA_A3, ButtonX_Size_MM, ButtonY_Size_MM,20,20);
            
            g.setColor(Color.white);
            g.drawString("Arena Three", 60, 320);
            g.drawRoundRect(ButtonX_AA_A3, ButtonY_AA_A3, ButtonX_Size_MM, ButtonY_Size_MM,20,20);
            
            
            
            
            g.setColor(Color.red);
            g.fillRoundRect(ButtonX_AA_A8, ButtonY_AA_A8, ButtonX_Size_MM, ButtonY_Size_MM,20,20);
            
            
            g.setColor(Color.white);
            g.drawString("Arena Eight", 465, 250);
            g.drawRoundRect(ButtonX_AA_A8, ButtonY_AA_A8, ButtonX_Size_MM, ButtonY_Size_MM,20,20);
            
            
            g.setColor(Color.red);
            g.fillRoundRect(ButtonX_AA_A7, ButtonY_AA_A7, ButtonX_Size_MM, ButtonY_Size_MM,20,20);
            
            g.setColor(Color.white);
            g.drawString("Arena Seven", 465, 180);
            g.drawRoundRect(ButtonX_AA_A7, ButtonY_AA_A7, ButtonX_Size_MM, ButtonY_Size_MM,20,20);
            
            
            g.setColor(Color.red);
            g.fillRoundRect(ButtonX_AA_A9, ButtonY_AA_A9, ButtonX_Size_MM, ButtonY_Size_MM,20,20);
            
            
            g.setColor(Color.white);
            g.drawString("Arena Nine", 465, 320);
            g.drawRoundRect(ButtonX_AA_A9, ButtonY_AA_A9, ButtonX_Size_MM, ButtonY_Size_MM,20,20);
            
            
            g.setColor(Color.magenta);
            g.fillRoundRect(ButtonX_AA_Custom, ButtonY_AA_Custom, ButtonX_Size_MM, ButtonY_Size_MM,20,20);
            
            g.setColor(Color.white);
            g.drawString("Custom Arena", 50, 390);
            g.drawRoundRect(ButtonX_AA_Custom, ButtonY_AA_Custom, ButtonX_Size_MM, ButtonY_Size_MM,20,20);
            
            g.setFont(NorFnt);
            
            
            g.setColor(Color.cyan);
            g.fillRoundRect(ButtonX_AA_Back, ButtonY_AA_Back, ButtonX_Size_MM, ButtonY_Size_MM,20,20);
            g.setColor(Color.DARK_GRAY);
            g.drawString(String_Back,490,400);
            g.setColor(Color.white);
            g.drawRoundRect(ButtonX_AA_Back, ButtonY_AA_Back, ButtonX_Size_MM, ButtonY_Size_MM,20,20);
            
            
        }
        
        else if(Game.gameState == ChewingGumSimulator.STATE.PlayerColorMenu)
        {
            Font EndFnt = new Font("arial",1,25);
            Font NorFnt = new Font("arial",1,15);
            
            
            g.setFont(NorFnt);
            g.setColor(Color.white);
            g.setFont(EndFnt);
            
            g.setFont(NorFnt);
            
            g.setColor(Color.magenta);
            g.drawString("Magenta Player", 55, 180);
            g.drawRoundRect(5, 140, 200, 64,20,20);
            
            g.setColor(Color.blue);
            g.drawString("Blue Player", 55, 250);
            g.drawRoundRect(5, 210, 200, 64,20,20);
            
            /*g.setColor(Color.pink);
            g.drawString("Pink Player", 55, 320);
            g.drawRect(5, 280, 200, 64);*/
            
            g.setColor(Color.white);
            g.drawString("White Player", 260, 180);
            g.drawRoundRect(210, 140, 200, 64,20,20);
            
            g.setColor(Color.orange);
            g.drawString("Orange Player", 260, 250);
            g.drawRoundRect(210, 210, 200, 64,20,20);
            
            g.setColor(Color.green);
            g.drawString("Green Player", 260, 320);
            g.drawRoundRect(210, 280, 200, 64,20,20);
            
            g.setColor(Color.yellow);
            g.drawString("Yellow Player", 470, 320);
            g.drawRoundRect(420, 280, 200, 64,20,20);
            
            g.setColor(Color.red);
            g.drawString("Red Player", 470, 250);
            g.drawRoundRect(420, 210, 200, 64,20,20);
            
            g.setColor(Color.cyan);
            g.drawString("Cyan Player", 470, 180);
            g.drawRoundRect(420, 140, 200, 64,20,20);
            
            g.setFont(NorFnt);
            g.setColor(Color.GRAY);
            g.drawString(String_Back,470,400);
            g.drawRoundRect(420, 360, 200, 64,20,20);
            
            
        }
        
        else if(Game.gameState == ChewingGumSimulator.STATE.ArenaWP1 || Game.gameState == ChewingGumSimulator.STATE.ArenaWP2)
        {
            Font EndFnt = new Font("arial",1,25);
            Font NorFnt = new Font("arial",1,15);
            Font BigFnt = new Font("arial",1,20);
            
            g.setFont(BigFnt);
            g.setColor(Color.cyan);
            
            g.drawString("The Winner Of the Arena Battle Has Been Decided", 60, 150);
            g.setColor(Color.orange);
            if(Game.gameState == ChewingGumSimulator.STATE.ArenaWP1)
            {   g.setColor(Color.green);
                g.drawString("PLAYER 1 Wins the Arena Battle", 100, 250);}
            else if(Game.gameState == ChewingGumSimulator.STATE.ArenaWP2)
            {   g.setColor(Color.red);
                g.drawString("PLAYER 2 Wins the Arena Battle", 100, 250);}
            
            
            
            
            g.setColor(Color.green);
            g.fillRoundRect(400, 360, 200, 64,20,20);
            
            
            g.setFont(NorFnt);
            g.setColor(Color.white);
            g.drawString(String_BackToMenu,450,400);
            g.drawRoundRect(400, 360, 200, 64,20,20);
            
            
        }
        
        else if(Game.gameState == ChewingGumSimulator.STATE.SingleHelp || Game.gameState == ChewingGumSimulator.STATE.ArenaHelp || Game.gameState == ChewingGumSimulator.STATE.CheatsHelp)
        {
            if(Game.gameState == ChewingGumSimulator.STATE.SingleHelp)
            {  g.setColor(Color.white);
               
                g.drawString("Use ARROW KEYS to control Player  Movement", 200, 50);
                g.drawString("Use ENTER to make the Player Shoot Projectiles", 200, 100);
                g.drawString("Collect HEALTH BOXES to replenish your health", 200, 150);
                g.drawString("Collect AMMO BOXES to replenish your ammo", 200, 200);
                g.drawString("Collect SHIELD POWER-UPS to become a GOD on the field", 200, 250);
                g.drawString("Collect EMP POWER-UPS to destroy the LIGHTNINGS", 200, 300);
            
            
            
            
            
            
            }
            if(Game.gameState == ChewingGumSimulator.STATE.ArenaHelp)
            {   g.setColor(Color.white);
                g.drawString("Use ARROW KEYS to control Player 1 Movement", 200, 50);
                g.drawString("Use W A S D to control Player 2 Movement", 200, 100);
                g.drawString("Use ENTER to make Player 1 Shoot Projectiles", 200, 150);
                g.drawString("Use SPACE to make Player 2 Shoot Projectiles", 200, 200);
                g.drawString("The main objective of the ARENA mode is to", 200, 250);
                g.drawString("Capture the trophy or destroy the other player", 200, 300);
            
            
            }
            if(Game.gameState == ChewingGumSimulator.STATE.CheatsHelp)
            {  g.setColor(Color.white);
                g.drawString("Enable Cheats from the Options Menu", 200, 50);
                g.drawString("You can empty the field with CLEAR ENEMIES", 200, 100);
                g.drawString("SPAWN whatever you need, like HEALTH or AMMO BOXES", 200, 150);
                g.drawString("SPAWN different enemies to check out their behaviour", 200, 200);
                g.drawString("ABUSING THE CHEATS MAY FREEZE THE GAME 1/50 TRIES", 200, 250);
                g.drawString("With Cheats Enabled, use Pause or C to access the cheat menu", 200, 300); 
            }
            
            
            g.setColor(Color.green);
            g.fillRoundRect(20, 360, 200, 64,20,20);
            
            g.setColor(Color.white);
            g.drawString(String_BackToMenu,70,400);
            g.drawRoundRect(20, 360, 200, 64,20,20);
            
            
            
        }
        
        
        
        else if(Game.gameState == ChewingGumSimulator.STATE.BasicEnemyHelp)
        {
            Font EndFnt = new Font("arial",1,25);
            Font NorFnt = new Font("arial",1,17);
            
            
            g.setFont(NorFnt);
            g.setColor(Color.orange);
            
            g.drawString("This is the Red Blood Cell", 30, 60);
            g.drawString("Text will be placed here", 30, 90);
            
            
            
            
            
            
            
            
            
            g.setColor(Color.green);
            g.fillRoundRect(400, 360, 200, 64,20,20);
            
            
            g.setColor(Color.white);
            g.drawString("Next Enemy",450,400);
            g.drawRoundRect(400, 360, 200, 64,20,20);
            
            
        }
        
        
        
        else if(Game.gameState == ChewingGumSimulator.STATE.PlateletCellHelp)
        {
            Font EndFnt = new Font("arial",1,25);
            Font NorFnt = new Font("arial",1,17);
            
            
            g.setFont(NorFnt);
            g.setColor(Color.orange);
            
            g.drawString("This is the Blood Platelet", 30, 60);
            g.drawString("Text will be placed here", 30, 90);
            
            
            
            
            
            
            
            
            
            g.setColor(Color.green);
            g.fillRoundRect(200, 360, 200, 64,20,20);
            
            
            g.setColor(Color.white);
            g.drawString("Next Enemy",250,400);
            g.drawRoundRect(200, 360, 200, 64,20,20);
            
            
        }
        
        
        
        
        else if(Game.gameState == ChewingGumSimulator.STATE.FastEnemyHelp)
        {
            Font EndFnt = new Font("arial",1,25);
            Font NorFnt = new Font("arial",1,17);
            
            
            g.setFont(NorFnt);
            g.setColor(Color.green);
            
            g.drawString("This is a Photon", 30, 60);
            g.drawString("These guys can travel with the speed of light", 30, 90);
            g.drawString("And they enjoy destroying everything in their path", 30, 120);
            g.drawString("Beware the specimens born in the core of the Sun", 30, 150);
            
            
            
            
            
            
            
            
            g.setColor(Color.green);
            g.fillRoundRect(20, 360, 200, 64,20,20);
            
            
            
            g.setColor(Color.white);
            g.drawString("Next Enemy",70,400);
            g.drawRoundRect(20, 360, 200, 64,20,20);
            
            
        }
        
        
        
        else if(Game.gameState == ChewingGumSimulator.STATE.SmartEnemyHelp)
        {
            Font EndFnt = new Font("arial",1,25);
            Font NorFnt = new Font("arial",1,17);
            
            
            g.setFont(NorFnt);
            g.setColor(Color.yellow);
            
            g.drawString("This is the Antibody", 30, 60);
            g.drawString("Also known as immunoglobulin", 30, 90);
            g.drawString("It it specifically built to hunt you down", 30, 120);
            
            
            
            
            
            g.setColor(Color.green);
            g.fillRoundRect(20, 360, 200, 64,20,20);
            
            g.setColor(Color.white);
            g.drawString("Next Enemy",70,400);
            g.drawRoundRect(20, 360, 200, 64,20,20);
            
            
        }
        
        else if(Game.gameState == ChewingGumSimulator.STATE.BCellHelp)
        {
            Font EndFnt = new Font("arial",1,25);
            Font NorFnt = new Font("arial",1,17);
            
            
            g.setFont(NorFnt);
            g.setColor(Color.yellow);
            
            g.drawString("This is the BCell", 30, 60);
            g.drawString("Also known as immunoglobulin", 30, 90);
            g.drawString("It it specifically built to hunt you down", 30, 120);
            
            
            
            
            
            g.setColor(Color.green);
            g.fillRoundRect(400, 360, 200, 64,20,20);
            
            g.setColor(Color.white);
            g.drawString("Next Enemy",450,400);
            g.drawRoundRect(400, 360, 200, 64,20,20);
            
            
        }
        
        
        else if(Game.gameState == ChewingGumSimulator.STATE.TCellHelp)
        {
            Font EndFnt = new Font("arial",1,25);
            Font NorFnt = new Font("arial",1,17);
            
            
            g.setFont(NorFnt);
            g.setColor(Color.yellow);
            
            g.drawString("This is the TCell", 30, 60);
            g.drawString("Also known as immunoglobulin", 30, 90);
            g.drawString("It it specifically built to hunt you down", 30, 120);
            
            
            
            
            
            g.setColor(Color.green);
            g.fillRoundRect(20, 360, 200, 64,20,20);
            
            g.setColor(Color.white);
            g.drawString("Next Enemy",70,400);
            g.drawRoundRect(20, 360, 200, 64,20,20);
            
            
        }
        
        
        else if(Game.gameState == ChewingGumSimulator.STATE.NeutrinoHelp)
        {
            Font EndFnt = new Font("arial",1,25);
            Font NorFnt = new Font("arial",1,17);
            
            
            g.setFont(NorFnt);
            g.setColor(Color.yellow);
            
            g.drawString("Neutrino Particle", 30, 60);
            g.drawString("Small but crazy, with a very high speed", 30, 90);
            g.drawString("It may provoke headaches over time", 30, 120);
            
            
            
            g.setColor(Color.green);
            g.fillRoundRect(220, 360, 200, 64,20,20);
            
            
            g.setColor(Color.white);
            g.drawString("Next Enemy",270,400);
            g.drawRoundRect(220, 360, 200, 64,20,20);
            
            
        }
        
        
        else if(Game.gameState == ChewingGumSimulator.STATE.HiggsBosonHelp)
        {
            Font EndFnt = new Font("arial",1,25);
            Font NorFnt = new Font("arial",1,17);
            
            
            g.setFont(NorFnt);
            g.setColor(Color.yellow);
            
            g.drawString("Higgs Boson Particle", 30, 60);
            g.drawString("A wild appeareance reminds us of God", 30, 90);
            g.drawString("You will be the one who finds it, and proves religion fake?", 30, 120);
            
            
            
            g.setColor(Color.green);
            g.fillRoundRect(400, 360, 200, 64,20,20);
            
            
            g.setColor(Color.white);
            g.drawString("Next Enemy",450,400);
            g.drawRoundRect(400, 360, 200, 64,20,20);
            
            
        }
        
        else if(Game.gameState == ChewingGumSimulator.STATE.BossOneHelp)
        {
            Font EndFnt = new Font("arial",1,25);
            Font NorFnt = new Font("arial",1,17);
            
            
            g.setFont(NorFnt);
            g.setColor(Color.yellow);
            
            g.drawString("This is the Chicken Pox Virus", 30, 60);
            g.drawString("Known as Varicella", 30, 90);
            g.drawString("If you think you will have a chance, you are DEAD", 30, 120);
            
            
            
            
            
            
            
            
            
            g.setColor(Color.green);
            g.fillRoundRect(400, 360, 200, 64,20,20);
            
            
            
            g.setColor(Color.white);
            g.drawString("Next Enemy",450,400);
            g.drawRoundRect(400, 360, 200, 64,20,20);
            
            
        }
        
        else if(Game.gameState == ChewingGumSimulator.STATE.HealthBoxHelp)
        {
            Font EndFnt = new Font("arial",1,25);
            Font NorFnt = new Font("arial",1,17);
            
            
            g.setFont(NorFnt);
            g.setColor(Color.LIGHT_GRAY);
            
            g.drawString("This is a Health Box", 30, 60);
            g.drawString("Just like Jesus Christ in a package", 30, 90);
            g.drawString("Your health is restored, your balls stop hurting", 30, 120);
            g.drawString("And the legends says that if you eat more than 50 your DICK MIGHT GROW", 20, 150);
            
            
            
            
            
            
            
            
            g.setColor(Color.green);
            g.fillRoundRect(400, 360, 200, 64,20,20);
            
            
            
            g.setColor(Color.white);
            g.drawString("Next Box",430,400);
            g.drawRoundRect(400, 360, 200, 64,20,20);
            
            
        }
        
        else if(Game.gameState == ChewingGumSimulator.STATE.AmmoBoxHelp)
        {
            Font EndFnt = new Font("arial",1,25);
            Font NorFnt = new Font("arial",1,17);
            
            
            g.setFont(NorFnt);
            g.setColor(Color.white);
            
            g.drawString("This is an Ammo Box", 30, 60);
            g.drawString("Just like Jesus Christ in a package during King Irod's purge.", 30, 90);
            g.drawString("A VERY FUCKING DANGEROUS PACKAGE.", 30, 120);
            g.drawString("Use your ammunation wisely, young man, during wars abundence is lost", 20, 150);
            
            
            
            
            
            
            
            
            g.setColor(Color.green);
            g.fillRoundRect(20, 360, 200, 64,20,20);
            
            
            
            g.setColor(Color.white);
            g.drawString("Next Box",70,400);
            g.drawRoundRect(20, 360, 200, 64,20,20);
            
            
        }
        
        else if(Game.gameState == ChewingGumSimulator.STATE.WhiteCellHelp)
        {
            Font EndFnt = new Font("arial",1,25);
            Font NorFnt = new Font("arial",1,17);
            
            
            g.setFont(NorFnt);
            g.setColor(Color.white);
            
            g.drawString("This is a Plasma White Blood Cell", 30, 60);
            g.drawString("Just like a an annoing cop", 30, 90);
            g.drawString("If they see you, they will call worse cells", 30, 120);
            g.drawString("Beware their powers", 20, 150);
            
            
            
            
            
            
            
            
            g.setColor(Color.green);
            g.fillRoundRect(250, 360, 200, 64,20,20);
            
            
            
            g.setColor(Color.white);
            g.drawString("Next Enemy",300,400);
            g.drawRoundRect(250, 360, 200, 64,20,20);
            
            
        }
        
        else if(Game.gameState == ChewingGumSimulator.STATE.BossSuckerHelp)
        {
            Font EndFnt = new Font("arial",1,25);
            Font NorFnt = new Font("arial",1,17);
            
            
            g.setFont(NorFnt);
            g.setColor(Color.white);
            
            g.drawString("This is the Chicken Pox mutation", 30, 60);
            g.drawString("They might appear while you engage the main strain", 30, 90);
            g.drawString("Of the virus in combat", 30, 120);
            g.drawString("It can be very powerful and aggresive", 20, 150);
            
            
            
            
            
            
            g.setColor(Color.green);
            g.fillRoundRect(20, 360, 200, 64,20,20);
            
            
            
            
            
            g.setColor(Color.white);
            g.drawString("Next Enemy",70,400);
            g.drawRoundRect(20, 360, 200, 64,20,20);
            
            
        }
        
        else if(Game.gameState == ChewingGumSimulator.STATE.EMPBoxHelp)
        {
            Font EndFnt = new Font("arial",1,25);
            Font NorFnt = new Font("arial",1,17);
            
            
            g.setFont(NorFnt);
            g.setColor(Color.orange);
            
            g.drawString("This is an EMP Box", 30, 60);
            g.drawString("With this powerful weapon, you will be able", 30, 90);
            g.drawString("To destroy the FUCKING LIGHTNING-CHEWERS, which i guarantee", 30, 120);
            g.drawString("You will find VERY FUCKIN' ANNOIYNG", 20, 150);
            
            
            
            
            
            
            
            g.setColor(Color.green);
            g.fillRoundRect(400, 360, 200, 64,20,20);
            
            
            
            
            g.setColor(Color.white);
            g.drawString("Next Box",450,400);
            g.drawRoundRect(400, 360, 200, 64,20,20);
            
            
        }
        
        else if(Game.gameState == ChewingGumSimulator.STATE.BronzeTreasureHelp)
        {
            Font EndFnt = new Font("arial",1,25);
            Font NorFnt = new Font("arial",1,17);
            
            
            g.setFont(NorFnt);
            g.setColor(Color.orange);
            
            g.drawString("Bronze Treasure", 30, 60);
            g.drawString("Expands into 5 Bronze Coins", 30, 90);
            
            
            
            
            
            
            g.setColor(Color.green);
            g.fillRoundRect(400, 360, 200, 64,20,20);
            
            
            
            
            
            
            g.setColor(Color.white);
            g.drawString("Next Chest",450,400);
            g.drawRoundRect(400, 360, 200, 64,20,20);
            
            
        }
        
        else if(Game.gameState == ChewingGumSimulator.STATE.SilverTreasureHelp)
        {
            Font EndFnt = new Font("arial",1,25);
            Font NorFnt = new Font("arial",1,17);
            
            
            g.setFont(NorFnt);
            g.setColor(Color.gray);
            
            g.drawString("Silver Treasure", 30, 60);
            g.drawString("Expands into 5 Silver Coins", 30, 90);
            
            
            
            
            
            
            
            
            
            g.setColor(Color.green);
            g.fillRoundRect(20, 360, 200, 64,20,20);
            
            
            
            g.setColor(Color.white);
            g.drawString("Next Chest",70,400);
            g.drawRoundRect(20, 360, 200, 64,20,20);
            
            
        }
        
        else if(Game.gameState == ChewingGumSimulator.STATE.GoldTreasureHelp)
        {
            Font EndFnt = new Font("arial",1,25);
            Font NorFnt = new Font("arial",1,17);
            
            
            g.setFont(NorFnt);
            g.setColor(Color.yellow);
            
            g.drawString("Gold Treasure", 30, 60);
            g.drawString("Expands into 5 Gold Coins", 30, 90);
            
            
            
            
            
            
            
            
            
            
            g.setColor(Color.green);
            g.fillRoundRect(400, 360, 200, 64,20,20);
            
            
            g.setColor(Color.white);
            g.drawString(String_BackToMenu,440,400);
            g.drawRoundRect(400, 360, 200, 64,20,20);
            
            
        }
        
        
        else if(Game.gameState == ChewingGumSimulator.STATE.RainHelp)
        {
            Font EndFnt = new Font("arial",1,25);
            Font NorFnt = new Font("arial",1,17);
            
            
            g.setFont(NorFnt);
            g.setColor(Color.blue);
            
            g.drawString("Rain Cloud", 30, 20);
            g.drawString("Rain is always good. Unless you have a nuclear accident.", 30, 50);
            
            
            
            
            
            
            
            
            g.setColor(Color.green);
            g.fillRoundRect(400, 360, 200, 64,20,20);
            
            
            
            
            g.setColor(Color.white);
            g.drawString("Next Cloud",440,400);
            g.drawRoundRect(400, 360, 200, 64,20,20);
            
            
        }
        
        else if(Game.gameState == ChewingGumSimulator.STATE.SnowHelp)
        {
            Font EndFnt = new Font("arial",1,25);
            Font NorFnt = new Font("arial",1,17);
            
            
            g.setFont(NorFnt);
            g.setColor(Color.white);
            
            g.drawString("Snow Cloud", 30, 100);
            g.drawString("Siberian Snow.It can damage non-slavic tissues", 30, 130);
            
            
            
            
            
            
            
            
            g.setColor(Color.green);
            g.fillRoundRect(200, 360, 200, 64,20,20);
            
            
            
            
            g.setColor(Color.white);
            g.drawString("Next Cloud",240,400);
            g.drawRoundRect(200, 360, 200, 64,20,20);
            
            
        }
        
        else if(Game.gameState == ChewingGumSimulator.STATE.FalloutHelp)
        {
            Font EndFnt = new Font("arial",1,25);
            Font NorFnt = new Font("arial",1,17);
            
            
            g.setFont(NorFnt);
            g.setColor(Color.green);
            
            g.drawString("Fallout Cloud", 30, 20);
            g.drawString("Shoots radioactive particles that damage anything", 30,50);
            
            
            
            
            
            
            
            
            
            g.setColor(Color.green);
            g.fillRoundRect(400, 360, 200, 64,20,20);
            
            
            
            g.setColor(Color.white);
            g.drawString(String_BackToMenu,430,400);
            g.drawRoundRect(400, 360, 200, 64,20,20);
            
            
            
        }
        
        else if(Game.gameState == ChewingGumSimulator.STATE.ThunderHelp)
        {
            Font EndFnt = new Font("arial",1,25);
            Font NorFnt = new Font("arial",1,17);
            
            
            g.setFont(NorFnt);
            g.setColor(Color.white);
            
            g.drawString("Thunder Cloud", 30, 60);
            g.drawString("A chinese man was caught on camera being shot by thunder.", 30, 90);
            g.drawString("Twice.In 3 minutes.", 30, 120);
            
            
            
            
            
            
            
            
            
            g.setColor(Color.green);
            g.fillRoundRect(20, 360, 200, 64,20,20);
            
            
            g.setColor(Color.white);
            g.drawString("Next Cloud",60,400);
            g.drawRoundRect(20, 360, 200, 64,20,20);
            
        }
        
        
        else if(Game.gameState == ChewingGumSimulator.STATE.BushHelp)
        {
            Font EndFnt = new Font("arial",1,25);
            Font NorFnt = new Font("arial",1,17);
            
            
            g.setFont(NorFnt);
            g.setColor(Color.red);
            
            g.drawString("Irradiated Berry Bush", 30, 60);
            g.drawString("It would not be a bright idea to taste these fruits", 30, 90);
            
            
            
            
            
            
            
            
            g.setColor(Color.green);
            g.fillRoundRect(400, 360, 200, 64,20,20);
            
            
            
            
            g.setColor(Color.white);
            g.drawString("Next",470,400);
            g.drawRoundRect(400, 360, 200, 64,20,20);
            
            
        }
        
        else if(Game.gameState == ChewingGumSimulator.STATE.TreeHelp)
        {
            Font EndFnt = new Font("arial",1,25);
            Font NorFnt = new Font("arial",1,17);
            
            
            g.setFont(NorFnt);
            g.setColor(Color.white);
            
            g.drawString("Irradiated Tree", 30, 60);
            g.drawString("Just like Heaven: DON'T FUCKING TOUCH THE TREES", 30, 90);
            
            
            
            
            
            
            
            
            
            g.setColor(Color.green);
            g.fillRoundRect(20, 360, 200, 64,20,20);
            
            
            
            g.setColor(Color.white);
            g.drawString("Next",90,400);
            g.drawRoundRect(20, 360, 200, 64,20,20);
            
            
        }
        
        else if(Game.gameState == ChewingGumSimulator.STATE.CactusHelp)
        {
            Font EndFnt = new Font("arial",1,25);
            Font NorFnt = new Font("arial",1,17);
            
            
            g.setFont(NorFnt);
            g.setColor(Color.green);
            
            g.drawString("Irradiated Cactus", 30, 30);
            g.drawString("Even without poisonous radioation levels", 30, 90);
            g.drawString("This thing is untouchable", 30, 120);
            
            
            
            
            
            
            
            
            g.setColor(Color.green);
            g.fillRoundRect(400, 360, 200, 64,20,20);
            
            
            
            g.setColor(Color.white);
            g.drawString("Next Box",450,400);
            g.drawRoundRect(400, 360, 200, 64,20,20);
            
            
        }
        
        
        
        else if(Game.gameState == ChewingGumSimulator.STATE.EndTutorial)
        {
            Font EndFnt = new Font("arial",1,25);
            Font NorFnt = new Font("arial",1,17);
            
            
            g.setFont(EndFnt);
            g.setColor(Color.red);
            
            g.drawString("You have just died in the tutorial", 30, 60);
            
            
            g.setFont(NorFnt);
            g.setColor(Color.LIGHT_GRAY);
            g.drawString("It was just a simple tutorial.", 30, 90);
            g.drawString("You must really suck at this game !", 30, 120);
            
            
            
            
            
            
            
            
            
            
            
            
            g.setColor(Color.red);
            g.drawString("Exit to Menu",420,400);
            g.drawRoundRect(400, 360, 200, 64,20,20);
            
            g.setColor(Color.cyan);
            g.drawString("Try Again",40,400);
            g.drawRoundRect(20, 360, 200, 64,20,20);
            
            
        }
        
        else if(Game.gameState == ChewingGumSimulator.STATE.FinishTutorial)
        {
            Font EndFnt = new Font("arial",1,25);
            Font NorFnt = new Font("arial",1,17);
            
            
            g.setFont(EndFnt);
            g.setColor(Color.green);
            
            g.drawString("You have just finished the tutorial", 30, 60);
            
            
            g.setFont(NorFnt);
            g.setColor(Color.LIGHT_GRAY);
            g.drawString("Congratulations comrade !", 30, 90);
            g.drawString("Now you are ready to avoid the diseases in the real game", 30, 120);
            
            
            
            
            
            
            
            
            
            g.setColor(Color.blue);
            g.fillRoundRect(400, 360, 200, 64,20,20);
            
            g.setColor(Color.white);
            g.drawString("Exit to Menu",420,400);
            g.drawRoundRect(400, 360, 200, 64,20,20);
            
            
            
            
        }
        
        else if(Game.gameState == ChewingGumSimulator.STATE.MiniTutorialArena)
        {   Font EndFnt = new Font("arial",1,25);
            Font NorFnt = new Font("arial",1,17);
            Font BigFnt = new Font("arial",1,20);
            
            g.setFont(EndFnt);
            g.setColor(Color.green);
            
            
            g.setColor(Color.white);
            g.drawString("Player One: ", 30, 60);
            g.drawString("Use ARROW KEYS to Move", 30, 90);
            g.drawString("Use ENTER to shoot projectiles", 30, 120);
            
            g.setColor(Color.cyan);
            g.drawString("Player Two: ", 30, 150);
            g.drawString("Use W A S D KEYS to Move", 30, 180);
            g.drawString("Use SPACE to shoot projectiles", 30, 210);
            
            g.setColor(Color.red);
            g.setFont(BigFnt);
            g.drawString("Avoid the red Walls as they deal damage", 30, 240);
            g.drawString("Avoid the green Walls as they deal heavy damage", 30, 270);
            
            g.setColor(Color.orange);
            g.drawString("You can win by killing the other player or stealing his Trophy", 30, 300);
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            g.setColor(Color.green);
            g.drawString("START",420,400);
            g.drawRoundRect(400, 360, 200, 64,20,20);
            
            g.setColor(Color.red);
            g.drawString(String_Back,40,400);
            g.drawRoundRect(20, 360, 200, 64,20,20);
            
            
        }
        
        else if(Game.gameState == ChewingGumSimulator.STATE.MiniTutorialGame)
        {
            Font EndFnt = new Font("arial",1,25);
            Font NorFnt = new Font("arial",1,17);
            Font BigFnt = new Font("arial",1,20);
            
            g.setFont(BigFnt);
            g.setColor(Color.green);
            
            
            g.setColor(Color.white);
            g.drawString("Player Controls: ", 30, 60);
            g.drawString("Use ARROW KEYS to Move", 30, 90);
            g.drawString("Use W A S D to shoot projectiles", 30, 120);
            
            
            g.drawString("In All Directions", 30, 150);
            g.setColor(Color.yellow);
            g.drawString("Use ENTER to deploy EMP Strike", 30, 180);
            g.setColor(Color.red);
            g.drawString("Beware the Chewers that might kill you", 30, 210);
            
            
            g.setColor(Color.cyan);
            g.drawString("Watch out for Health or Ammo Boxes", 30, 240);
            g.drawString("Also keep an eye for spawned Power-Ups", 30, 270);
            
            g.setColor(Color.magenta);
            g.drawString("Beware the Boss which you'll encounter every 10 levels", 30, 300);
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            g.setColor(Color.green);
            g.drawString("START",420,400);
            g.drawRoundRect(400, 360, 200, 64,20,20);
            
            g.setColor(Color.red);
            g.drawString(String_Back,40,400);
            g.drawRoundRect(20, 360, 200, 64,20,20);
            
            
        }
        
        else if(Game.gameState == ChewingGumSimulator.STATE.Worker)
        {
            Font EndFnt = new Font("arial",1,25);
            Font NorFnt = new Font("arial",1,17);
            Font BigFnt = new Font("arial",1,20);
            
            g.setFont(BigFnt);
            g.setColor(Color.green);
            
            
            g.setColor(Color.white);
            g.drawString("Player Controls: ", 30, 60);
            g.drawString("Use ARROW KEYS to Move", 30, 90);
            g.drawString("Use W A S D to shoot projectiles", 30, 120);
            
            
            g.drawString("In All Directions", 30, 150);
            g.setColor(Color.yellow);
            g.drawString("Use ENTER to deploy EMP Strike", 30, 180);
            g.setColor(Color.red);
            g.drawString("Beware the Chewers that might kill you", 30, 210);
            
            
            g.setColor(Color.cyan);
            g.drawString("Watch out for Health or Ammo Boxes", 30, 240);
            g.drawString("Also keep an eye for spawned Power-Ups", 30, 270);
            
            g.setColor(Color.magenta);
            g.drawString("Beware the Boss which you'll encounter every 10 levels", 30, 300);
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            g.setColor(Color.green);
            g.drawString("START",420,400);
            g.drawRoundRect(400, 360, 200, 64,20,20);
            
            g.setColor(Color.red);
            g.drawString(String_Back,40,400);
            g.drawRoundRect(20, 360, 200, 64,20,20);
            
            
        }
        
        
        else if(Game.gameState == ChewingGumSimulator.STATE.CheatsSpawnMenu)
        {
            Font EndFnt = new Font("arial",1,25);
            Font NorFnt = new Font("arial",1,15);
            Font BigFnt = new Font("arial",1,20);
            
            g.setFont(NorFnt);
            g.setColor(Color.green);
            
            g.setColor(Color.white);
            g.drawString("Spawn Bush",50,50);
            g.drawRect(10, 20, 200, 64);
            
            g.drawString("Spawn Tree",50,134);
            g.drawRect(10, 104, 200, 64);
            
            g.drawString("Spawn Cactus",50,218);
            g.drawRect(10, 184, 200, 64);
            
            g.drawString("Spawn Rain Cloud",50,302);
            g.drawRect(10, 268, 200, 64);
            
            g.drawString("Spawn Fallout Cloud",260,302);
            g.drawRect(220, 268, 200, 64);
            
            g.drawString("Spawn Snow Cloud",50,386);
            g.drawRect(10, 352, 200, 64);
            
            g.drawString("Spawn Boss",260,50);
            g.drawRect(220, 20, 200, 64);
            
            g.drawString("Spawn Boss Minion",260,134);
            g.drawRect(220, 104, 200, 64);
            
            g.drawString("Spawn Red Cell",460,50);
            g.drawRect(430, 20, 200, 64);
            
            g.drawString("Spawn Photon",445,134);
            g.drawRect(430, 104, 200, 64);
            
            g.drawString("Spawn Gastric Worm",445,218);
            g.drawRect(430, 184, 200, 64);
            
            g.setColor(Color.red);
            g.drawString(String_Back,260,386);
            g.drawRoundRect(220, 352, 200, 64,20,20);
            
            g.setColor(Color.green);
            g.drawString("Next Page",460,386);
            g.drawRoundRect(430, 352, 200, 64,20,20);
            
            
        }
        else if(Game.gameState == ChewingGumSimulator.STATE.CheatsSpawnMenuTwo)
        {
            Font EndFnt = new Font("arial",1,25);
            Font NorFnt = new Font("arial",1,15);
            Font BigFnt = new Font("arial",1,20);
            
            g.setFont(NorFnt);
            g.setColor(Color.green);
            
            g.setColor(Color.white);
            g.drawString("Spawn Health Box",50,50);
            g.drawRoundRect(10, 20, 200, 64,20,20);
            
            g.drawString("Spawn AC#DC Box",50,134);
            g.drawRoundRect(10, 104, 200, 64,20,20);
            
            g.drawString("Spawn Shield Box",50,218);
            g.drawRoundRect(10, 184, 200, 64,20,20);
            
            g.drawString("Spawn Speed Box",50,302);
            g.drawRoundRect(10, 268, 200, 64,20,20);
            
            g.drawString("Spawn Soda Box",50,386);
            g.drawRoundRect(10, 352, 200, 64,20,20);
            
            g.drawString("Spawn EMP Box",260,50);
            g.drawRoundRect(220, 20, 200, 64,20,20);
            
            g.drawString("Spawn Ammo Box",260,134);
            g.drawRoundRect(220, 104, 200, 64,20,20);
            
            g.drawString("Spawn Coin",460,50);
            g.drawRoundRect(430, 20, 200, 64,20,20);
            
            g.drawString("Spawn Treasure",445,134);
            g.drawRoundRect(430, 104, 200, 64,20,20);
            
            g.drawString("Spawn Nuke Box",445,218);
            g.drawRoundRect(430, 184, 200, 64,20,20);
            
            g.setColor(Color.red);
            g.drawString(String_Back,460,302);
            g.drawRoundRect(430, 268, 200, 64,20,20);
            
            
        }
        
        else if(Game.gameState == ChewingGumSimulator.STATE.BackgroundSelect)
        {
            Font EndFnt = new Font("arial",1,25);
            Font NorFnt = new Font("arial",1,15);
            Font BigFnt = new Font("arial",1,20);
            
            g.setFont(NorFnt);
            g.setColor(Color.green);
            
            g.setColor(Color.white);
            g.drawString("Black Background",50,50);
            g.drawRoundRect(10, 20, 200, 64,20,20);
            
            g.drawString("Mushroomed Background",20,134);
            g.drawRoundRect(10, 104, 200, 64,20,20);
            
            g.drawString("Blue Background",50,218);
            g.drawRoundRect(10, 184, 200, 64,20,20);
            
            g.drawString("Sunset Background",50,302);
            g.drawRoundRect(10, 268, 200, 64,20,20);
            
            g.drawString("Desert Background",50,386);
            g.drawRoundRect(10, 352, 200, 64,20,20);
            
            g.drawString("Stone Background",260,50);
            g.drawRoundRect(220, 20, 200, 64,20,20);
            
            g.drawString("Space Background",260,134);
            g.drawRoundRect(220, 104, 200, 64,20,20);
            
            g.drawString("Field Background",260,218);
            g.drawRoundRect(220, 184, 200, 64,20,20);
            
            g.drawString("Normand Sea",460,50);
            g.drawRoundRect(430, 20, 200, 64,20,20);
            
            g.drawString("Normand Sunset",445,134);
            g.drawRoundRect(430, 104, 200, 64,20,20);
            
            g.drawString("Sunset Sea",285,302);
            g.drawRoundRect(220, 268, 200, 64,20,20);
            
            g.drawString("Sunset Hill",280,386);
            g.drawRoundRect(220, 352, 200, 64,20,20);
            
            g.setColor(Color.red);
            g.drawString(String_Back,445,218);
            g.drawRoundRect(430, 184, 200, 64,20,20);
            
            
            
            
        }
        
        else if(Game.gameState == ChewingGumSimulator.STATE.MenuBackgroundSelect)
        {
            Font EndFnt = new Font("arial",1,25);
            Font NorFnt = new Font("arial",1,15);
            Font BigFnt = new Font("arial",1,20);
            
            g.setFont(NorFnt);
            g.setColor(Color.green);
            
            g.setColor(Color.white);
            g.drawString("Black Background",50,50);
            g.drawRoundRect(10, 20, 200, 64,20,20);
            
            g.drawString("Mushroomed Background",20,134);
            g.drawRoundRect(10, 104, 200, 64,20,20);
            
            g.drawString("Menu Background",50,218);
            g.drawRoundRect(10, 184, 200, 64,20,20);
            
            g.drawString("Sunset Background",50,302);
            g.drawRoundRect(10, 268, 200, 64,20,20);
            
            g.drawString("Desert Background",50,386);
            g.drawRoundRect(10, 352, 200, 64,20,20);
            
            g.drawString("Stone Background",260,50);
            g.drawRoundRect(220, 20, 200, 64,20,20);
            
            g.drawString("Space Background",260,134);
            g.drawRoundRect(220, 104, 200, 64,20,20);
            
            g.drawString("Field Background",260,218);
            g.drawRoundRect(220, 184, 200, 64,20,20);
            
            g.drawString("Normand Sea",460,50);
            g.drawRoundRect(430, 20, 200, 64,20,20);
            
            g.drawString("Normand Sunset",445,134);
            g.drawRoundRect(430, 104, 200, 64,20,20);
            
            g.drawString("Sunset Sea",285,302);
            g.drawRoundRect(220, 268, 200, 64,20,20);
            
            g.drawString("Sunset Hill",280,386);
            g.drawRoundRect(220, 352, 200, 64,20,20);
            
            g.setColor(Color.red);
            g.drawString(String_Back,445,218);
            g.drawRoundRect(430, 184, 200, 64,20,20);
            
            
            
            
        }
        
        
        else if(Game.gameState == ChewingGumSimulator.STATE.CheatsCurrency)
        {
            Font EndFnt = new Font("arial",1,25);
            Font NorFnt = new Font("arial",1,15);
            Font BigFnt = new Font("arial",1,20);
            
            g.setFont(NorFnt);
            g.setColor(Color.green);
            
            g.setColor(Color.white);
            g.drawString("Add 1 Coin",70,50);
            g.drawRoundRect(10, 20, 200, 64,20,20);
            
            g.drawString("Add 10 Coins",65,134);
            g.drawRoundRect(10, 104, 200, 64,20,20);
            
            g.drawString("Add 100 Coins",60,218);
            g.drawRoundRect(10, 184, 200, 64,20,20);
            
            g.drawString("Add 1000 Coins",60,302);
            g.drawRoundRect(10, 268, 200, 64,20,20);
            
            g.drawString("Refill Grenades",50,386);
            g.drawRoundRect(10, 352, 200, 64,20,20);
            
            g.drawString("Upgrade 1 Level",260,50);
            g.drawRoundRect(220, 20, 200, 64,20,20);
            
            g.drawString("Upgrade 5 Levels",260,134);
            g.drawRect(220, 104, 200, 64);
            
            
            
            g.drawString("Upgrade 10 Levels",470,50);
            g.drawRoundRect(430, 20, 200, 64,20,20);
            
            g.drawString("Upgrade 100 Levels",460,134);
            g.drawRoundRect(430, 104, 200, 64,20,20);
            
            g.drawString("Upgrade 100 Levels",250,302);
            g.drawRoundRect(220, 268, 200, 64,20,20);
            
            g.drawString("Sunset Hill",280,386);
            g.drawRoundRect(220, 352, 200, 64,20,20);
            
            g.setColor(Color.red);
            g.drawString(String_Back,445,218);
            g.drawRoundRect(430, 184, 200, 64,20,20);
            
            
            
            
            
            
            
        }
        
        else if(Game.gameState == ChewingGumSimulator.STATE.ArenaSelector)
        {
            Font EndFnt = new Font("arial",1,25);
            Font NorFnt = new Font("arial",1,15);
            Font BigFnt = new Font("arial",1,20);
            
            g.setFont(NorFnt);
            g.setColor(Color.green);
            
            g.setColor(arenaSColor);
            g.fillRoundRect(10, 20, 200, 64,20,20);
            g.setColor(Color.white);
            g.drawString("Plants",80,50);
            g.drawRoundRect(10, 20, 200, 64,20,20);
            
            
            
            g.setColor(arenaSColor);
            g.fillRoundRect(10, 104, 200, 64,20,20);
            g.setColor(Color.white);
            g.drawString("Weather",75,134);
            g.drawRoundRect(10, 104, 200, 64,20,20);
            
            
            
            g.setColor(arenaSColor);
            g.fillRoundRect(10, 184, 200, 64,20,20);
            g.setColor(Color.white);
            g.drawString("Walls",85,218);
            g.drawRoundRect(10, 184, 200, 64,20,20);
            
            
            
            g.setColor(arenaSColor);
            g.fillRoundRect(10, 268, 200, 64,20,20);
            g.setColor(Color.white);
            g.drawString("Treasures",70,302);
            g.drawRoundRect(10, 268, 200, 64,20,20);
            
            
            
            
            g.setColor(arenaSColor);
            g.fillRoundRect(10, 352, 200, 64,20,20);
            g.setColor(Color.white);
            g.drawString("Trophies",75,386);
            g.drawRoundRect(10, 352, 200, 64,20,20);
            
            
            
            g.setColor(arenaSColor);
            g.fillRoundRect(220,20, 200, 64,20,20);
            g.setColor(Color.white);
            g.drawString("Explosives",280,50);
            g.drawRoundRect(220, 20, 200, 64,20,20);
            
            
            
            g.setColor(arenaSColor);
            g.fillRoundRect(220, 104, 200, 64,20,20);
            g.setColor(Color.white);
            g.drawString("Turrets",285,134);
            g.drawRoundRect(220, 104, 200, 64,20,20);
            
            
            g.setColor(arenaSColor);
            g.fillRoundRect(430, 20, 200, 64,20,20);
            g.setColor(Color.white);
            g.drawString("Background",490,50);
            g.drawRoundRect(430, 20, 200, 64,20,20);
            
            
            g.setColor(arenaSColor);
            g.fillRoundRect(430, 104, 200, 64,20,20);
            g.setColor(Color.white);
            g.drawString("Players Color",480,134);
            g.drawRoundRect(430, 104, 200, 64,20,20);
            
            //g.drawString("Upgrade 100 Levels",250,302);
            //g.drawRect(220, 268, 200, 64);
            
            //g.drawString("Sunset Hill",280,386);
            //g.drawRect(220, 352, 200, 64);
            
            g.setColor(Color.red);
            g.fillRoundRect(430, 184, 200, 64,20,20);
            g.setColor(Color.white);
            g.drawString(String_Back,500,218);
            g.drawRoundRect(430, 184, 200, 64,20,20);
            g.setColor(Color.red);
            g.fillRoundRect(430, 268, 200, 64,20,20);
            g.setColor(Color.white);
            g.drawString("Exit To Menu",480,302);
            g.drawRoundRect(430, 268, 200, 64,20,20);}
        
        else if(Game.gameState == ChewingGumSimulator.STATE.ArenaSPlants)
        {
            Font EndFnt = new Font("arial",1,25);
            Font NorFnt = new Font("arial",1,15);
            Font BigFnt = new Font("arial",1,20);
            
            g.setFont(NorFnt);
            g.setColor(Color.green);
            
            g.setColor(Color.white);
            
            g.setColor(arenaSColor);
            g.fillRoundRect(10, 104, 200, 64,20,20);
            g.setColor(Color.white);
            g.drawString("Radioactive Bush",50,134);
            g.drawRoundRect(10, 104, 200, 64,20,20);
            
            
            g.setColor(arenaSColor);
            g.fillRoundRect(10, 184, 200, 64,20,20);
            g.setColor(Color.white);
            g.drawString("Radioactive Tree",50,218);
            g.drawRoundRect(10, 184, 200, 64,20,20);
            
            
            
            g.setColor(arenaSColor);
            g.fillRoundRect(10, 268, 200, 64,20,20);
            g.setColor(Color.white);
            g.drawString("Radioactive Cactus",50,302);
            g.drawRoundRect(10, 268, 200, 64,20,20);
            
            
            
            
            g.setColor(arenaSColor);
            g.fillRoundRect(10, 352, 200, 64,20,20);
            g.setColor(Color.white);
            g.drawString("Irradiated Mushroom",45,386);
            g.drawRoundRect(10, 352, 200, 64,20,20);
            
            
            
            
            
            
            
            //g.drawString("Upgrade 100 Levels",250,302);
            //g.drawRect(220, 268, 200, 64);
            
            //g.drawString("Sunset Hill",280,386);
            //g.drawRect(220, 352, 200, 64);
            
            g.setColor(Color.red);
            g.fillRoundRect(430, 268, 200, 64,20,20);
            g.setColor(Color.white);
            g.drawString(String_Back,500,302);
            g.drawRoundRect(430, 268, 200, 64,20,20);}
        
        else if(Game.gameState == ChewingGumSimulator.STATE.ArenaSWeather)
        {
            Font EndFnt = new Font("arial",1,25);
            Font NorFnt = new Font("arial",1,15);
            Font BigFnt = new Font("arial",1,20);
            
            g.setFont(NorFnt);
            g.setColor(Color.green);
            
            g.setColor(Color.white);
            
            
            
            g.setColor(arenaSColor);
            g.fillRoundRect(10, 104, 200, 64,20,20);
            g.setColor(Color.white);
            g.drawString("Rain Clouds",50,134);
            g.drawRoundRect(10, 104, 200, 64,20,20);
            
            
            
            g.setColor(arenaSColor);
            g.fillRoundRect(10, 184, 200, 64,20,20);
            g.setColor(Color.white);
            g.drawString("Snow Clouds",50,218);
            g.drawRoundRect(10, 184, 200, 64,20,20);
            
            
            
            g.setColor(arenaSColor);
            g.fillRoundRect(10, 268, 200, 64,20,20);
            g.setColor(Color.white);
            g.drawString("Fallout Clouds",50,302);
            g.drawRoundRect(10, 268, 200, 64,20,20);
            
            
            
            
            g.setColor(arenaSColor);
            g.fillRoundRect(10, 352, 200, 64,20,20);
            g.setColor(Color.white);
            g.drawString("Thunder Clouds",45,386);
            g.drawRoundRect(10, 352, 200, 64,20,20);
            
            
            
            
            
            
            
            //g.drawString("Upgrade 100 Levels",250,302);
            //g.drawRect(220, 268, 200, 64);
            
            //g.drawString("Sunset Hill",280,386);
            //g.drawRect(220, 352, 200, 64);
            
            
            g.setColor(Color.red);
            g.fillRoundRect(430, 352, 200, 64,20,20);
            g.setColor(Color.white);
            
            
            g.drawString(String_Back,500,382);
            g.drawRoundRect(430, 352, 200, 64,20,20);}
        
        
        else if(Game.gameState == ChewingGumSimulator.STATE.ArenaSWalls)
        {
            Font EndFnt = new Font("arial",1,25);
            Font NorFnt = new Font("arial",1,15);
            Font BigFnt = new Font("arial",1,20);
            
            g.setFont(NorFnt);
            g.setColor(Color.green);
            
            g.setColor(Color.white);
            
            
            
            g.setColor(arenaSColor);
            g.fillRoundRect(5,20, 200, 64,20,20);
            g.setColor(Color.white);
            g.drawString("Small Walls",55,60);
            g.drawRoundRect(5, 20, 200, 64,20,20);
            
            
            g.setColor(arenaSColor);
            g.fillRoundRect(210, 20, 200, 64,20,20);
            g.setColor(Color.white);
            g.drawString("Medium Walls",260,60);
            g.drawRoundRect(210, 20, 200, 64,20,20);
            
            
            
            
            g.setColor(arenaSColor);
            g.fillRoundRect(415, 20, 200, 64,20,20);
            g.setColor(Color.white);
            g.drawString("Big Walls",475,60);
            g.drawRoundRect(415, 20, 200, 64,20,20);
           
            
            
            
            
            
            
            
            //g.drawString("Upgrade 100 Levels",250,302);
            //g.drawRect(220, 268, 200, 64);
            
            //g.drawString("Sunset Hill",280,386);
            //g.drawRect(220, 352, 200, 64);
            
            g.setColor(Color.red);
            g.fillRoundRect(430, 352, 200, 64,20,20);
            g.setColor(Color.white);
            g.drawString(String_Back,500,382);
            g.drawRoundRect(430, 352, 200, 64,20,20);}
        
        
        else if(Game.gameState == ChewingGumSimulator.STATE.ArenaSTreasures)
        {
            Font EndFnt = new Font("arial",1,25);
            Font NorFnt = new Font("arial",1,15);
            Font BigFnt = new Font("arial",1,20);
            
            g.setFont(NorFnt);
            g.setColor(Color.green);
            
            g.setColor(Color.white);
            
            g.setColor(arenaSColor);
            g.fillRoundRect(5, 20, 200, 64,20,20);
            g.setColor(Color.white);
            g.drawString("Bronze Treasure",45,60);
            g.drawRoundRect(5, 20, 200, 64,20,20);
            
            
            g.setColor(arenaSColor);
            g.fillRoundRect(210, 20, 200, 64,20,20);
            g.setColor(Color.white);
            g.drawString("Silver Treasure",250,60);
            g.drawRoundRect(210, 20, 200, 64,20,20);
            
            
            g.setColor(arenaSColor);
            g.fillRoundRect(415, 20, 200, 64,20,20);
            g.setColor(Color.white);
            g.drawString("Gold Treasure",465,60);
            g.drawRoundRect(415, 20, 200, 64,20,20);
            
            
            
            
            
            
            
            //g.drawString("Upgrade 100 Levels",250,302);
            //g.drawRect(220, 268, 200, 64);
            
            //g.drawString("Sunset Hill",280,386);
            //g.drawRect(220, 352, 200, 64);
            
            g.setColor(Color.red);
            g.fillRoundRect(430, 352, 200, 64,20,20);
            g.setColor(Color.white);
            g.drawString(String_Back,500,382);
            g.drawRoundRect(430, 352, 200, 64,20,20);}
        
        
        
        else if(Game.gameState == ChewingGumSimulator.STATE.ArenaSTrophies)
        {
            Font EndFnt = new Font("arial",1,25);
            Font NorFnt = new Font("arial",1,15);
            Font BigFnt = new Font("arial",1,20);
            
            g.setFont(NorFnt);
            g.setColor(Color.green);
            
            g.setColor(Color.white);
            
            g.setColor(arenaSColor);
            g.fillRoundRect(10, 104, 200, 64,20,20);
            g.setColor(Color.white);
            g.drawString("Rain Clouds",50,134);
            g.drawRoundRect(10, 104, 200, 64,20,20);
            
            
            g.setColor(arenaSColor);
            g.fillRoundRect(10, 184, 200, 64,20,20);
            g.setColor(Color.white);
            g.drawString("Snow Clouds",50,218);
            g.drawRoundRect(10, 184, 200, 64,20,20);
            
            
            
            g.setColor(arenaSColor);
            g.fillRoundRect(10, 268, 200, 64,20,20);
            g.setColor(Color.white);
            g.drawString("Fallout Clouds",50,302);
            g.drawRoundRect(10, 268, 200, 64,20,20);
            
            
            
            
            g.setColor(arenaSColor);
            g.fillRoundRect(10, 352, 200, 64,20,20);
            g.setColor(Color.white);
            g.drawString("Thunder Clouds",45,386);
            g.drawRoundRect(10, 352, 200, 64,20,20);
            
            
            
            
            
            
            
            //g.drawString("Upgrade 100 Levels",250,302);
            //g.drawRect(220, 268, 200, 64);
            
            //g.drawString("Sunset Hill",280,386);
            //g.drawRect(220, 352, 200, 64);
            
            g.setColor(Color.red);
            g.fillRoundRect(430,352, 200, 64,20,20);
            g.setColor(Color.white);
            g.drawString(String_Back,500,382);
            g.drawRoundRect(430, 352, 200, 64,20,20);}
        
        else if(Game.gameState == ChewingGumSimulator.STATE.ArenaSExplosive)
        {
            Font EndFnt = new Font("arial",1,25);
            Font NorFnt = new Font("arial",1,15);
            Font BigFnt = new Font("arial",1,20);
            
            g.setFont(NorFnt);
            g.setColor(Color.green);
            
            g.setColor(Color.white);
            
            g.setColor(arenaSColor);
            g.fillRoundRect(5, 20, 200, 64,20,20);
            g.setColor(Color.white);
            g.drawString("Bronze Treasure",45,60);
            g.drawRoundRect(5, 20, 200, 64,20,20);
            
            
            
            g.setColor(arenaSColor);
            g.fillRoundRect(210,20, 200, 64,20,20);
            g.setColor(Color.white);
            g.drawString("Silver Treasure",250,60);
            g.drawRoundRect(210, 20, 200, 64,20,20);
            
            
            
            g.setColor(arenaSColor);
            g.fillRoundRect(415, 20, 200, 64,20,20);
            g.setColor(Color.white);
            g.drawString("Gold Treasure",465,60);
            g.drawRoundRect(415, 20, 200, 64,20,20);
            
            
            
            
            
            
            
            //g.drawString("Upgrade 100 Levels",250,302);
            //g.drawRect(220, 268, 200, 64);
            
            //g.drawString("Sunset Hill",280,386);
            //g.drawRect(220, 352, 200, 64);
            
            
            g.setColor(Color.red);
            g.fillRoundRect(430,352, 200, 64,20,20);
            
            g.setColor(Color.white);
            g.drawString(String_Back,500,382);
            g.drawRoundRect(430, 352, 200, 64,20,20);}
        
        else if(Game.gameState == ChewingGumSimulator.STATE.ArenaSTurrets)
        {
            Font EndFnt = new Font("arial",1,25);
            Font NorFnt = new Font("arial",1,15);
            Font BigFnt = new Font("arial",1,20);
            
            g.setFont(NorFnt);
            g.setColor(Color.green);
            
            g.setColor(Color.white);
            
            
            
            g.setColor(arenaSColor);
            g.fillRoundRect(5,20, 200, 64,20,20);
            g.setColor(Color.white);
            
            g.drawString("Straight Turret",45,60);
            g.drawRoundRect(5, 20, 200, 64,20,20);
            
            
            
            g.setColor(arenaSColor);
            g.fillRoundRect(210, 20, 200, 64,20,20);
            g.setColor(Color.white);
            g.drawString("Particle Turret",250,60);
            g.drawRoundRect(210, 20, 200, 64,20,20);
            
            
            
            g.setColor(arenaSColor);
            g.fillRoundRect(415, 20, 200, 64,20,20);
            g.setColor(Color.white);
            g.drawString("Auto Turret",465,60);
            g.drawRoundRect(415, 20, 200, 64,20,20);
            
            
            
            
            
            
            
            //g.drawString("Upgrade 100 Levels",250,302);
            //g.drawRect(220, 268, 200, 64);
            
            //g.drawString("Sunset Hill",280,386);
            //g.drawRect(220, 352, 200, 64);
            
            
            
            g.setColor(Color.red);
            g.fillRoundRect(430,352, 200, 64,20,20);
            
            g.setColor(Color.white);
            g.drawString(String_Back,500,382);
            g.drawRoundRect(430, 352, 200, 64,20,20);}
        
        
        
        else if(Game.gameState == ChewingGumSimulator.STATE.ArenaSPColor)
        {
            Font EndFnt = new Font("arial",1,25);
            Font NorFnt = new Font("arial",1,15);
            Font BigFnt = new Font("arial",1,20);
            
            g.setFont(NorFnt);
            g.setColor(Color.green);
            
            g.setColor(Color.white);
            
            if(optionalP1Color==true){
                g.setColor(Color.green);
            g.fillRoundRect(5,20, 200, 64,20,20);
            g.setColor(Color.white);
                g.drawString("Player 1 Color On",45,60);
                g.drawRoundRect(5, 20, 200, 64,20,20);
                
                
                g.setColor(arenaSColor);
            g.fillRoundRect(5,90, 200, 64,20,20);
            g.setColor(Color.white);
                g.drawString("Set Player 1 Color",45,120);
                g.drawRoundRect(5, 90, 200, 64,20,20);
                
            }
            
            else if(optionalP1Color==false){
                g.setColor(Color.red);
            g.fillRoundRect(5,20, 200, 64,20,20);
            g.setColor(Color.white);
                g.drawString("Player 1 Color Off",45,60);
                g.drawRoundRect(5, 20, 200, 64,20,20);
                
                
                
            }
            
            if(optionalP2Color==true){
                g.setColor(Color.green);
            g.fillRoundRect(210, 20, 200, 64,20,20);
            g.setColor(Color.white);
            g.drawString("Player 2 Color On",250,60);
            g.drawRoundRect(210, 20, 200, 64,20,20);
            
            
            
            g.setColor(arenaSColor);
            g.fillRoundRect(210, 90, 200, 64,20,20);
            g.setColor(Color.white);
            g.drawString("Set Player 2 Color",250,120);
            g.drawRoundRect(210, 90, 200, 64,20,20);}
            
            else if(optionalP2Color==false){
                g.setColor(Color.red);
            g.fillRoundRect(210,20, 200, 64,20,20);
            g.setColor(Color.white);
            g.drawString("Player 2 Color Off",250,60);
            g.drawRoundRect(210, 20, 200, 64,20,20);
            }
            
            
            
            
            
            
            
            
            
            //g.drawString("Upgrade 100 Levels",250,302);
            //g.drawRect(220, 268, 200, 64);
            
            //g.drawString("Sunset Hill",280,386);
            //g.drawRect(220, 352, 200, 64);
            
            
            g.setColor(Color.red);
            g.fillRoundRect(430,352, 200, 64,20,20);
            
            g.setColor(Color.white);
            g.drawString(String_Back,500,382);
            g.drawRoundRect(430, 352, 200, 64,20,20);}
        
        
        else if(Game.gameState == ChewingGumSimulator.STATE.ArenaSBackground)
        {
            Font EndFnt = new Font("arial",1,25);
            Font NorFnt = new Font("arial",1,15);
            Font BigFnt = new Font("arial",1,20);
            
            g.setFont(NorFnt);
            g.setColor(Color.green);
            
            g.setColor(Color.white);
            
            if(optionalBackground==false){
                
            g.setColor(Color.red);
            g.fillRoundRect(5,20, 200, 64,20,20);
            g.setColor(Color.white);
            g.drawString("Background Off",45,60);
            g.drawRoundRect(5, 20, 200, 64,20,20);
            }
            else if(optionalBackground==true){
                
            g.setColor(arenaSColor);
            g.fillRoundRect(5,20, 200, 64,20,20);
            g.setColor(Color.white);
            g.drawString("Background On",45,60);
            g.drawRoundRect(5, 20, 200, 64,20,20);
            
            
            g.setColor(arenaSColor);
            g.fillRoundRect(210, 20, 200, 64,20,20);
            g.setColor(Color.white);
            g.drawString("Set Background",250,60);
            g.drawRoundRect(210, 20, 200, 64,20,20);
            }
            
            
            
            
            
            
            
            
            
            
            //g.drawString("Upgrade 100 Levels",250,302);
            //g.drawRect(220, 268, 200, 64);
            
            //g.drawString("Sunset Hill",280,386);
            //g.drawRect(220, 352, 200, 64);
            
            
            
            g.setColor(Color.red);
            g.fillRoundRect(430,352, 200, 64,20,20);
            
            g.setColor(Color.white);
            g.drawString(String_Back,500,382);
            g.drawRoundRect(430, 352, 200, 64,20,20);}
        
        else if(Game.gameState == ChewingGumSimulator.STATE.GraphicsOption)
        {
            
            Font NorFnt = new Font("arial",1,15);
            
            
            g.setFont(NorFnt);
            
            
            
            
            g.setColor(Color.blue);
            g.fillRoundRect(10,104, 200, 64,20,20);
            g.setColor(Color.white);
            g.drawString("Resolution",70,134);
            g.drawRoundRect(10, 104, 200, 64,20,20);
            
            
            
            
            
            g.setColor(Color.blue);
            g.fillRoundRect(10,184, 200, 64,20,20);
            g.setColor(Color.white);
            g.drawString("Background",70,218);
            g.drawRoundRect(10, 184, 200, 64,20,20);
            
            
            g.setColor(Color.blue);
            g.fillRoundRect(10,268, 200, 64,20,20);
            g.setColor(Color.white);
            g.drawString("Menu Background",40,302);
            g.drawRoundRect(10, 268, 200, 64,20,20);
            
            
            
            if(Game.ShowFPS==true){
            g.setColor(Color.green);
            g.fillRoundRect(10,352, 200, 64,20,20);
            g.setColor(Color.white);
            g.drawString("FPS Shown",65,386);
            g.drawRoundRect(10, 352, 200, 64,20,20);
            }
            else if(Game.ShowFPS==false){
            g.setColor(Color.red);
            g.fillRoundRect(10,352, 200, 64,20,20);
            g.setColor(Color.white);
            g.drawString("FPS Hidden",60,386);
            g.drawRoundRect(10, 352, 200, 64,20,20);
                
                
            }
            
            
            
            
            
            
            
            
            //g.drawString("Upgrade 100 Levels",250,302);
            //g.drawRect(220, 268, 200, 64);
            
            //g.drawString("Sunset Hill",280,386);
            //g.drawRect(220, 352, 200, 64);
            
            
            
            g.setColor(Color.red);
            g.fillRoundRect(430,352, 200, 64,20,20);
            
            g.setColor(Color.white);
            g.drawString(String_Back,500,382);
            g.drawRoundRect(430, 352, 200, 64,20,20);}
        
        
        
        else if(Game.gameState == ChewingGumSimulator.STATE.Options_Other)
        {
            
            Font NorFnt = new Font("arial",1,15);
            
            
            g.setFont(NorFnt);
            g.setColor(Color.white);
            
            
            
            
            
            
            
            if(Game.socialNetworks==true){
            g.setColor(Color.green);
            g.fillRoundRect(10, 104, 200, 64,20,20);
            g.setColor(Color.white);
            g.drawString("Social On",70,138);
            g.drawRoundRect(10, 104, 200, 64,20,20);
            }
            else{
            g.setColor(Color.red);
            g.fillRoundRect(10, 104, 200, 64,20,20);
            g.setColor(Color.white);
            g.drawString("Social Off",70,138);
            g.drawRoundRect(10, 104, 200, 64,20,20);
                
                g.setColor(Color.white);
            }
            
            if(Game.cheats==true){
            g.setColor(Color.green);
            g.fillRoundRect(10, 268, 200, 64,20,20);
            g.setColor(Color.white);
            g.drawString("Cheats On",70,302);
            g.drawRoundRect(10, 268, 200, 64,20,20);
            }
            else{
            g.setColor(Color.red);
            g.fillRoundRect(10, 268, 200, 64,20,20);
            g.setColor(Color.white);
            g.drawString("Cheats Off",70,302);
            g.drawRoundRect(10, 268, 200, 64,20,20);
                
                g.setColor(Color.white);
            }
            if(Game.bladderActive==true){
            g.setColor(Color.green);
            g.fillRoundRect(10, 352, 200, 64,20,20);
            g.setColor(Color.white);
            g.drawString("Bladder On",70,386);
            g.drawRoundRect(10, 352, 200, 64,20,20);
            }
            else{
            g.setColor(Color.red);
            g.fillRoundRect(10, 352, 200, 64,20,20);
            g.setColor(Color.white);
            g.drawString("Bladder Off",70,386);
            g.drawRoundRect(10, 352, 200, 64,20,20);
                
                
            }
            
            g.setColor(Color.white);
            
            
            
            if(Game.tutorials==true){
            g.setColor(Color.green);
            g.fillRoundRect(10, 184, 200, 64,20,20);
            g.setColor(Color.white);
            g.drawString("Tutorials On",65,218);
            g.drawRoundRect(10, 184, 200, 64,20,20);
            }
            else{
            g.setColor(Color.red);
            g.fillRoundRect(10, 184, 200, 64,20,20);
            g.setColor(Color.white);
            g.drawString("Tutorials Off",65,218);
            g.drawRoundRect(10, 184, 200, 64,20,20);
                
                
            }
            
            
            //g.drawString("Upgrade 100 Levels",250,302);
            //g.drawRect(220, 268, 200, 64);
            
            //g.drawString("Sunset Hill",280,386);
            //g.drawRect(220, 352, 200, 64);
            
            
            g.setColor(Color.red);
            g.fillRoundRect(430,352, 200, 64,20,20);
            
            g.setColor(Color.white);
            g.drawString(String_Back,500,382);
            g.drawRoundRect(430, 352, 200, 64,20,20);}
        
        
        
        else if(Game.gameState == ChewingGumSimulator.STATE.Options_Profile)
        {
            
            Font NorFnt = new Font("arial",1,15);
            Font MediaFnt = new Font("calibri",1,20);
            
            
            g.setFont(NorFnt);
            g.setColor(Color.white);
            if(Game.socialNetworks==true){
            g.setFont(MediaFnt);
            g.setColor(faceBlue);
            g.fillRoundRect(10,10, 200, 64,20,20);
            
            g.setColor(Color.white);
            g.drawString("Login To Facebook",35,50);
            g.drawRoundRect(10, 10, 200, 64,20,20);
            
            
            g.setColor(vkBlue);
            g.fillRoundRect(220,10, 200, 64,20,20);
            
            g.setColor(Color.white);
            g.drawString("Login To VKontakte",240,50);
            g.drawRoundRect(220, 10, 200, 64,20,20);
            
            
            g.setColor(twBlue);
            g.fillRoundRect(430,10, 200, 64,20,20);
            
            g.setColor(Color.white);
            g.drawString("Login To Twitter",460,50);
            g.drawRoundRect(430, 10, 200, 64,20,20);}
            
            
            
            g.setFont(MediaFnt);
            g.setColor(Color.orange);
            g.fillRoundRect(220, 104, 200, 64,20,20);
            
            g.setColor(Color.white);
            g.drawString("Trophies",280,144);
            g.drawRoundRect(220, 104, 200, 64,20,20);
            
            
            
            g.setColor(Color.DARK_GRAY);
            g.fillRoundRect(220, 184, 200, 64,20,20);
            
            g.setColor(Color.white);
            g.drawString("Stats",295,224);
            g.drawRoundRect(220, 184, 200, 64,20,20);
            
            
            
            
            g.setColor(Color.orange);
            g.fillRoundRect(430, 104, 200, 64,20,20);
            
            g.setColor(Color.white);
            g.drawString("Achivements",480,144);
            g.drawRoundRect(430, 104, 200, 64,20,20);
            
            
            g.setColor(Color.lightGray);
            g.fillRoundRect(10, 104, 200, 64,20,20);
            g.setFont(NorFnt);
            g.setColor(Color.white);
            g.drawString("Balance",80,125);
            g.drawString(" "+Game.savedCoins+" ",90,150);
            g.drawRoundRect(10, 104, 200, 64,20,20);
            
            
            
            
            g.setColor(Color.lightGray);
            g.fillRoundRect(10, 184, 200, 64,20,20);
            g.setColor(Color.white);
            g.drawString("Max Score: ",50,218);
            g.drawString(" "+Game.savedScore+" ",50,240);
            g.drawRoundRect(10, 184, 200, 64,20,20);
            
            g.setColor(Color.lightGray);
            g.fillRoundRect(10, 268, 200, 64,20,20);
            
            g.setColor(Color.white);
            g.drawString("Player Level : " + Game.playerLevel,20,290);
            g.drawString("Player XP : " + Game.playerXP,20,320);
            g.drawRoundRect(10, 268, 200, 64,20,20);
            
            
            
            
            g.drawString("Save Game",70,386);
            g.drawRoundRect(10, 352, 200, 64,20,20);
            
            
            g.setColor(Color.white);
            
            
            
            
            //g.drawString("Upgrade 100 Levels",250,302);
            //g.drawRect(220, 268, 200, 64);
            
            //g.drawString("Sunset Hill",280,386);
            //g.drawRect(220, 352, 200, 64);
            
            g.setColor(Color.red);
            g.fillRoundRect(430, 352, 200, 64,20,20);
            g.setFont(MediaFnt);
            g.setColor(Color.white);
            g.drawString(String_Back,500,390);
            g.drawRoundRect(430, 352, 200, 64,20,20);}
        
        
        
        else if(Game.gameState == ChewingGumSimulator.STATE.Options_PlayerSetup)
        {
            
            Font NorFnt = new Font("arial",1,15);
            
            
            g.setFont(NorFnt);
            
            g.setColor(Color.blue);
            g.fillRoundRect(10, 104, 200, 64,20,20);
            g.setColor(Color.white);
            g.drawString("Player Color",65,134);
            g.drawRoundRect(10, 104, 200, 64,20,20);
            
            
            g.setColor(Color.blue);
            g.fillRoundRect(10, 184, 200, 64,20,20);
            g.setColor(Color.white);
            g.drawString("Player Face",70,218);
            g.drawRoundRect(10, 184, 200, 64,20,20);
            
            
            g.setColor(Color.blue);
            g.fillRoundRect(10, 268, 200, 64,20,20);
            g.setColor(Color.white);
            g.drawString("Upgrades",75,302);
            g.drawRoundRect(10, 268, 200, 64,20,20);
            
            
            
            g.setColor(Color.blue);
            g.fillRoundRect(10, 352, 200, 64,20,20);
            g.setColor(Color.white);
            g.drawString("Arena Player Settings",40,386);
            g.drawRoundRect(10, 352, 200, 64,20,20);
            
            
            g.setColor(Color.white);
            
            
            
            
            //g.drawString("Upgrade 100 Levels",250,302);
            //g.drawRect(220, 268, 200, 64);
            
            //g.drawString("Sunset Hill",280,386);
            //g.drawRect(220, 352, 200, 64);
            
            
            g.setColor(Color.red);
            g.fillRoundRect(430, 352, 200, 64,20,20);
            
            g.setColor(Color.white);
            g.drawString(String_Back,500,382);
            g.drawRoundRect(430, 352, 200, 64,20,20);}
        
        
        
        else if(Game.gameState == ChewingGumSimulator.STATE.Options_Controls)
        {
            
            Font NorFnt = new Font("arial",1,15);
            
            
            g.setFont(NorFnt);
            g.setColor(Color.white);
            
            if(Game.invertedArrows==false){
                g.setColor(Color.blue);
                g.fillRoundRect(10, 184, 200, 64,20,20);
                g.setColor(Color.white);
            g.drawString("Use Arrows To Move",40,218);
            g.drawRoundRect(10, 184, 200, 64,20,20);
            
            
            
            g.setColor(Color.blue);
                g.fillRoundRect(10, 268, 200, 64,20,20);
                g.setColor(Color.white);
            g.drawString("Use WASD To Shoot",40,302);
            g.drawRoundRect(10, 268, 200, 64,20,20);}
            
            else if(Game.invertedArrows==true){
                
                g.setColor(Color.blue);
                g.fillRoundRect(10, 184, 200, 64,20,20);
                g.setColor(Color.white);
            g.drawString("Use Arrows To Shoot",40,218);
            g.drawRoundRect(10, 184, 200, 64,20,20);
            
            g.setColor(Color.blue);
                g.fillRoundRect(10, 268, 200, 64,20,20);
                g.setColor(Color.white);
            g.drawString("Use WASD To Move",40,302);
            g.drawRoundRect(10, 268, 200, 64,20,20);}
            
            if(Game.toExitOrNotToExit==false){
            g.setColor(Color.green);
                g.fillRoundRect(10, 352, 200, 64,20,20);
                g.setColor(Color.white);
            g.drawString("Use Escape To Pause",40,386);
            g.drawRoundRect(10, 352, 200, 64,20,20);}
            
            
            else if(Game.toExitOrNotToExit==true){
            g.setColor(Color.red);
                g.fillRoundRect(10, 352, 200, 64,20,20);
                g.setColor(Color.white);
            g.drawString("Use Escape To Exit",40,386);
            g.drawRoundRect(10, 352, 200, 64,20,20);}
            
            
            g.setColor(Color.white);
            
            
            
            
            //g.drawString("Upgrade 100 Levels",250,302);
            //g.drawRect(220, 268, 200, 64);
            
            //g.drawString("Sunset Hill",280,386);
            //g.drawRect(220, 352, 200, 64);
            
            
            g.setColor(Color.red);
            g.fillRoundRect(430, 352, 200, 64,20,20);
            
            g.setColor(Color.white);
            g.drawString(String_Back,500,382);
            g.drawRoundRect(430, 352, 200, 64,20,20);}
        
        
        
        
        
        
        
        
        else if(Game.gameState == ChewingGumSimulator.STATE.BossTwoHelp)
        {
            Font EndFnt = new Font("arial",1,25);
            Font NorFnt = new Font("arial",1,17);
            
            
            g.setFont(NorFnt);
            g.setColor(Color.green);
            
            g.drawString("This is the Ebola Virus", 30, 30);
            g.drawString("Also known as varicella", 30, 90);
            g.drawString("This thing is untouchable", 30, 120);
            
            
            
            
            
            
            g.setColor(Color.green);
            g.fillRoundRect(10, 360, 200, 64,20,20);
            
            
            
            
            
            g.setColor(Color.white);
            g.drawString("Next Enemy",60,400);
            g.drawRoundRect(10, 360, 200, 64,20,20);
            
            
        }
        
        
        
        else if(Game.gameState == ChewingGumSimulator.STATE.BossThreeHelp)
        {
            Font EndFnt = new Font("arial",1,25);
            Font NorFnt = new Font("arial",1,17);
            
            
            g.setFont(NorFnt);
            g.setColor(Color.green);
            
            g.drawString("This is the Anthrax Virus", 30, 30);
            g.drawString("Also known as varicella", 30, 90);
            g.drawString("This thing is untouchable", 30, 120);
            
            
            
            
            
            
            
            
            
            g.setColor(Color.green);
            g.fillRoundRect(400, 360, 200, 64,20,20);
            
            
            g.setColor(Color.white);
            g.drawString("Next Enemy",450,400);
            g.drawRoundRect(400, 360, 200, 64,20,20);
            
            
        }
        
        
        else if(Game.gameState == ChewingGumSimulator.STATE.BossFourHelp)
        {
            Font EndFnt = new Font("arial",1,25);
            Font NorFnt = new Font("arial",1,17);
            
            
            g.setFont(NorFnt);
            g.setColor(Color.green);
            
            g.drawString("This is the SIDA Virus", 30, 30);
            g.drawString("Also known as varicella", 30, 90);
            g.drawString("This thing is untouchable", 30, 120);
            
            
            
            
            
            
            
            g.setColor(Color.green);
            g.fillRoundRect(10, 360, 200, 64,20,20);
            
            
            
            
            g.setColor(Color.white);
            g.drawString("Next Enemy",60,400);
            g.drawRoundRect(10, 360, 200, 64,20,20);
            
            
        }
        
        
        
        else if(Game.gameState == ChewingGumSimulator.STATE.BossFiveHelp)
        {
            Font EndFnt = new Font("arial",1,25);
            Font NorFnt = new Font("arial",1,17);
            
            
            g.setFont(NorFnt);
            g.setColor(Color.green);
            
            g.drawString("This is the Ciuma Virus", 30, 30);
            g.drawString("Also known as varicella", 30, 90);
            g.drawString("This thing is untouchable", 30, 120);
            
            
            
            
            
            
            
            
            g.setColor(Color.green);
            g.fillRoundRect(400, 360, 200, 64,20,20);
            
            
            
            g.setColor(Color.white);
            g.drawString("Back To Help Menu",430,400);
            g.drawRoundRect(400, 360, 200, 64,20,20);
            
            
        }
        
        
        else if(Game.gameState == ChewingGumSimulator.STATE.BossSucker2Help)
        {
            Font EndFnt = new Font("arial",1,25);
            Font NorFnt = new Font("arial",1,17);
            
            
            g.setFont(NorFnt);
            g.setColor(Color.green);
            
            g.drawString("This is the Ebola Virus Mutation", 30, 30);
            g.drawString("Also known as varicella", 30, 90);
            g.drawString("This thing is untouchable", 30, 120);
            
            
            
            
            
            
            
            
            g.setColor(Color.green);
            g.fillRoundRect(200, 360, 200, 64,20,20);
            
            
            
            g.setColor(Color.white);
            g.drawString("Next Enemy",250,400);
            g.drawRoundRect(200, 360, 200, 64,20,20);
            
            
        }
        
        
        else if(Game.gameState == ChewingGumSimulator.STATE.BossSucker3Help)
        {
            Font EndFnt = new Font("arial",1,25);
            Font NorFnt = new Font("arial",1,17);
            
            
            g.setFont(NorFnt);
            g.setColor(Color.green);
            
            g.drawString("This is the Anthrax Virus Mutation", 30, 30);
            g.drawString("Also known as varicella", 30, 90);
            g.drawString("This thing is untouchable", 30, 120);
            
            
            
            
            
            
            
            g.setColor(Color.green);
            g.fillRoundRect(200, 360, 200, 64,20,20);
            
            
            
            
            g.setColor(Color.white);
            g.drawString("Next Enemy",250,400);
            g.drawRoundRect(200, 360, 200, 64,20,20);
            
            
        }
        
        
        
        else if(Game.gameState == ChewingGumSimulator.STATE.BossSucker4Help)
        {
            Font EndFnt = new Font("arial",1,25);
            Font NorFnt = new Font("arial",1,17);
            
            
            g.setFont(NorFnt);
            g.setColor(Color.green);
            
            g.drawString("This is the SIDA Virus Mutation", 30, 30);
            g.drawString("Also known as varicella", 30, 90);
            g.drawString("This thing is untouchable", 30, 120);
            
            
            
            
            
            
            
            
            g.setColor(Color.green);
            g.fillRoundRect(200, 360, 200, 64,20,20);
            
            
            
            g.setColor(Color.white);
            g.drawString("Next Enemy",250,400);
            g.drawRoundRect(200, 360, 200, 64,20,20);
            
            
        }
        
        
        
        else if(Game.gameState == ChewingGumSimulator.STATE.BossSucker5Help)
        {
            Font EndFnt = new Font("arial",1,25);
            Font NorFnt = new Font("arial",1,17);
            
            
            g.setFont(NorFnt);
            g.setColor(Color.green);
            
            g.drawString("This is the Ciuma Virus Mutation", 30, 30);
            g.drawString("Also known as Pesedism", 30, 90);
            g.drawString("This thing is untouchable", 30, 120);
            
            
            
            
            
            
            
            
            g.setColor(Color.green);
            g.fillRoundRect(200, 360, 200, 64,20,20);
            
            
            
            g.setColor(Color.white);
            g.drawString("Next Enemy",250,400);
            g.drawRoundRect(200, 360, 200, 64,20,20);
            
            
        }
        
        
        
        
        
        else if(Game.gameState == ChewingGumSimulator.STATE.Graphics_SelectResolution)
        {
            
            Font NorFnt = new Font("arial",1,15);
            
            
            g.setFont(NorFnt);
            
            
            
            g.setColor(Color.blue);
            g.fillRoundRect(430,104, 200, 64,20,20);
            g.setColor(Color.white);
            
            g.drawString("640",490,134);
            g.drawRoundRect(430, 104, 200, 64,20,20);
            
            
            
            g.setColor(Color.blue);
            g.fillRoundRect(430,184, 200, 64,20,20);
            g.setColor(Color.white);
            g.drawString("1280",490,218);
            g.drawRoundRect(430, 184, 200, 64,20,20);
            
            
                
                
            
            
            
            
            
            
            
            
            
            //g.drawString("Upgrade 100 Levels",250,302);
            //g.drawRect(220, 268, 200, 64);
            
            //g.drawString("Sunset Hill",280,386);
            //g.drawRect(220, 352, 200, 64);
            
            g.setColor(Color.red);
            g.fillRoundRect(430, 352, 200, 64,20,20);
            
            g.setColor(Color.white);
            g.drawString(String_Back,500,382);
            g.drawRoundRect(430, 352, 200, 64,20,20);}
        
        
        
        else if(Game.gameState == ChewingGumSimulator.STATE.FissionHelp)
        {
            Font EndFnt = new Font("arial",1,25);
            Font NorFnt = new Font("arial",1,17);
            
            
            g.setFont(NorFnt);
            g.setColor(Color.yellow);
            
            g.drawString("This is the Ebola Virus", 30, 60);
            g.drawString("You will hate him and be sure that HE HATES YOU", 30, 90);
            g.drawString("If you think you will have a chance, you are DEAD", 30, 120);
            g.drawString("Very Dangerous, very aggresive, very DEADLY", 20, 150);
            
            
            
            
            
            
            
            
            g.setColor(Color.green);
            g.fillRoundRect(400, 360, 200, 64,20,20);
            
            
            
            g.setColor(Color.white);
            g.drawString("Next Enemy",450,400);
            g.drawRoundRect(400, 360, 200, 64,20,20);
            
            
        }
        
        
        else if(Game.gameState == ChewingGumSimulator.STATE.FusionHelp)
        {
            Font EndFnt = new Font("arial",1,25);
            Font NorFnt = new Font("arial",1,17);
            
            
            g.setFont(NorFnt);
            g.setColor(Color.yellow);
            
            g.drawString("This is the Ebola Virus", 30, 60);
            g.drawString("You will hate him and be sure that HE HATES YOU", 30, 90);
            g.drawString("If you think you will have a chance, you are DEAD", 30, 120);
            g.drawString("Very Dangerous, very aggresive, very DEADLY", 20, 150);
            
            
            
            
            
            
            
            
            g.setColor(Color.green);
            g.fillRoundRect(20, 360, 200, 64,20,20);
            
            
            
            g.setColor(Color.white);
            g.drawString(String_BackToMenu,60,400);
            g.drawRoundRect(20, 360, 200, 64,20,20);
            
            
        }
        
        
        else if(Game.gameState == ChewingGumSimulator.STATE.StraightTurretHelp)
        {
            Font EndFnt = new Font("arial",1,25);
            Font NorFnt = new Font("arial",1,17);
            
            
            g.setFont(NorFnt);
            g.setColor(Color.green);
            
            g.drawString("This is a Straight Turret", 30, 30);
            g.drawString("Shoots projectiles in 4 directions", 30, 90);
            g.drawString("But at a higher pace than other turrets", 30, 120);
            
            
            
            
            
            
            
            
            g.setColor(Color.green);
            g.fillRoundRect(20, 360, 200, 64,20,20);
            
            
            
            g.setColor(Color.white);
            g.drawString("Next Turret",70,400);
            g.drawRoundRect(20, 360, 200, 64,20,20);
            
            
        }
        
        
        else if(Game.gameState == ChewingGumSimulator.STATE.ParticleTurretHelp)
        {
            Font EndFnt = new Font("arial",1,25);
            Font NorFnt = new Font("arial",1,17);
            
            
            g.setFont(NorFnt);
            g.setColor(Color.green);
            
            g.drawString("This is a Roulette turret", 30, 30);
            g.drawString("Throws projectiles 360 degrees", 30, 90);
            g.drawString("It has a slower fire rate but a very wide angle", 30, 120);
            
            
            
            
            
            
            
            
            g.setColor(Color.green);
            g.fillRoundRect(200, 360, 200, 64,20,20);
            
            
            
            g.setColor(Color.white);
            g.drawString("Next Turret",250,400);
            g.drawRoundRect(200, 360, 200, 64,20,20);
            
            
        }
        
        
        else if(Game.gameState == ChewingGumSimulator.STATE.AutoTurretHelp)
        {
            Font EndFnt = new Font("arial",1,25);
            Font NorFnt = new Font("arial",1,17);
            
            
            g.setFont(NorFnt);
            g.setColor(Color.green);
            
            g.drawString("This is Automatic Turret", 30, 30);
            g.drawString("It shoots intelligent projectiles", 30, 90);
            g.drawString("That are able to track you down and attack", 30, 120);
            
            
            
            
            
            
            
            
            g.setColor(Color.green);
            g.fillRoundRect(400, 360, 200, 64,20,20);
            
            
            
            g.setColor(Color.white);
            g.drawString("Back To Help Menu",430,400);
            g.drawRoundRect(400, 360, 200, 64,20,20);
            
            
        }
        
        
        else if(Game.gameState == ChewingGumSimulator.STATE.AdventureSelect)
        {
            Font EndFnt = new Font("arial",1,25);
            Font NorFnt = new Font("calibri",1,20);
            
            
            g.setFont(NorFnt);
            g.setColor(Color.green);
            
            
            
            
            g.setColor(new Color(51,0,51));
            g.fillRoundRect(ButtonX_AV_One, ButtonY_AV_One, 600, 64,20,20);
            
            
            g.setColor(Color.white);
            g.drawString("Adventure One",50,50);
            g.drawRoundRect(ButtonX_AV_One, ButtonY_AV_One, 600, 64,20,20);
            
            
            
            g.setColor(new Color(51,0,51));
            g.fillRoundRect(ButtonX_AV_Two, ButtonY_AV_Two, 600, 64,20,20);
            
            
            g.setColor(Color.white);
            g.drawString("Adventure Two",50,120);
            g.drawRoundRect(ButtonX_AV_Two, ButtonY_AV_Two, 600, 64,20,20);
            
            if(Game.adventureStatus[1]==false){
            g.setColor(Color.gray);
            g.drawString("Locked",550,120);
            }
            
            g.setColor(new Color(51,0,51));
            g.fillRoundRect(ButtonX_AV_Three, ButtonY_AV_Three, 600, 64,20,20);
            
            
            g.setColor(Color.white);
            g.drawString("Adventure Three",50,190);
            g.drawRoundRect(ButtonX_AV_Three, ButtonY_AV_Three, 600, 64,20,20);
            
            
            if(Game.adventureStatus[2]==false){
            g.setColor(Color.gray);
            g.drawString("Locked",550,190);
            }
            
            g.setColor(new Color(51,0,51));
            g.fillRoundRect(ButtonX_AV_Four, ButtonY_AV_Four, 600, 64,20,20);
            
            
            g.setColor(Color.white);
            g.drawString("Adventure Four",50,260);
            g.drawRoundRect(ButtonX_AV_Four, ButtonY_AV_Four, 600, 64,20,20);
            
            
            
            g.setColor(new Color(51,0,51));
            g.fillRoundRect(ButtonX_AV_Five, ButtonY_AV_Five, 600, 64,20,20);
            
            
            if(Game.adventureStatus[3]==false){
            g.setColor(Color.gray);
            g.drawString("Locked",550,260);
            }
            
            g.setColor(Color.white);
            g.drawString("Adventure Five",50,330);
            g.drawRoundRect(ButtonX_AV_Five, ButtonY_AV_Five, 600, 64,20,20);
            
            if(Game.adventureStatus[4]==false){
            g.setColor(Color.gray);
            g.drawString("Locked",550,330);
            }
            
            /*
            g.setColor(Color.blue);
            g.fillRoundRect(ButtonX_AV_Six, ButtonY_AV_Six, 600, 64,20,20);
            
            
            g.setColor(Color.white);
            g.drawString("Adventure Six",50,50);
            g.drawRoundRect(ButtonX_AV_Six, ButtonY_AV_Six, 600, 64,20,20);
            
            
            
            g.setColor(new Color(51,0,51));
            g.fillRoundRect(ButtonX_AV_Seven, ButtonY_AV_Seven, 600, 64,20,20);
            
            
            g.setColor(Color.white);
            g.drawString("Adventure Seven",50,120);
            g.drawRoundRect(ButtonX_AV_Seven, ButtonY_AV_Seven, 600, 64,20,20);
            
            
            
            g.setColor(new Color(51,0,51));
            g.fillRoundRect(ButtonX_AV_Eight, ButtonY_AV_Eight, 600, 64,20,20);
            
            
            g.setColor(Color.white);
            g.drawString("Adventure Eight",50,190);
            g.drawRoundRect(ButtonX_AV_Eight, ButtonY_AV_Three, 600, 64,20,20);
            
            
            g.setColor(new Color(51,0,51));
            g.fillRoundRect(ButtonX_AV_Nine, ButtonY_AV_Nine, 600, 64,20,20);
            
            
            g.setColor(Color.white);
            g.drawString("Adventure Nine",50,260);
            g.drawRoundRect(ButtonX_AV_Nine, ButtonY_AV_Nine, 600, 64,20,20);
            
            
            
            g.setColor(new Color(51,0,51));
            g.fillRoundRect(ButtonX_AV_Ten, ButtonY_AV_Ten, 600, 64,20,20);
            
            
            g.setColor(Color.white);
            g.drawString("Adventure Ten",50,330);
            g.drawRoundRect(ButtonX_AV_Ten, ButtonY_AV_Ten, 600, 64,20,20);
            
            
            */
            g.setColor(Color.red);
            g.fillRoundRect(210, 360, 200, 64,20,20);
            
            
            
            g.setColor(Color.white);
            g.drawString(String_BackToMenu,250,400);
            g.drawRoundRect(210, 360, 200, 64,20,20);
            
            
            
            g.setColor(Color.blue);
            g.fillRoundRect(5, 360, 200, 64,20,20);
            
            g.setColor(Color.white);
            g.drawString("Next Page",30,400);
            
            g.drawRoundRect(5, 360, 200, 64,20,20);
            
            
            
            
        }
        
        
        else if(Game.gameState == ChewingGumSimulator.STATE.AdventureSelect2)
        {
            Font EndFnt = new Font("arial",1,25);
            Font NorFnt = new Font("calibri",1,20);
            
            
            g.setFont(NorFnt);
            g.setColor(Color.green);
            
            
            
            
            g.setColor(new Color(51,0,51));
            g.fillRoundRect(ButtonX_AV_One, ButtonY_AV_One, 600, 64,20,20);
            
            
            g.setColor(Color.white);
            g.drawString("Adventure Six",50,50);
            g.drawRoundRect(ButtonX_AV_One, ButtonY_AV_One, 600, 64,20,20);
            
            if(Game.adventureStatus[5]==false){
            g.setColor(Color.gray);
            g.drawString("Locked",550,50);
            }
            
            g.setColor(new Color(51,0,51));
            g.fillRoundRect(ButtonX_AV_Two, ButtonY_AV_Two, 600, 64,20,20);
            
            
            g.setColor(Color.white);
            g.drawString("Adventure Seven",50,120);
            g.drawRoundRect(ButtonX_AV_Two, ButtonY_AV_Two, 600, 64,20,20);
            
            if(Game.adventureStatus[6]==false){
            g.setColor(Color.gray);
            g.drawString("Locked",550,120);
            }
            
            g.setColor(new Color(51,0,51));
            g.fillRoundRect(ButtonX_AV_Three, ButtonY_AV_Three, 600, 64,20,20);
            
            
            g.setColor(Color.white);
            g.drawString("Adventure Eight",50,190);
            g.drawRoundRect(ButtonX_AV_Three, ButtonY_AV_Three, 600, 64,20,20);
            
            
            if(Game.adventureStatus[7]==false){
            g.setColor(Color.gray);
            g.drawString("Locked",550,190);
            }
            
            g.setColor(new Color(51,0,51));
            g.fillRoundRect(ButtonX_AV_Four, ButtonY_AV_Four, 600, 64,20,20);
            
            
            g.setColor(Color.white);
            g.drawString("Adventure Nine",50,260);
            g.drawRoundRect(ButtonX_AV_Four, ButtonY_AV_Four, 600, 64,20,20);
            
            
            
            g.setColor(new Color(51,0,51));
            g.fillRoundRect(ButtonX_AV_Five, ButtonY_AV_Five, 600, 64,20,20);
            
            
            if(Game.adventureStatus[8]==false){
            g.setColor(Color.gray);
            g.drawString("Locked",550,260);
            }
            
            g.setColor(Color.white);
            g.drawString("Adventure Ten",50,330);
            g.drawRoundRect(ButtonX_AV_Five, ButtonY_AV_Five, 600, 64,20,20);
            
            if(Game.adventureStatus[9]==false){
            g.setColor(Color.gray);
            g.drawString("Locked",550,330);
            }
            
            
            
            
            g.setColor(Color.red);
            g.fillRoundRect(210, 360, 200, 64,20,20);
            
            
            
            g.setColor(Color.white);
            g.drawString("Previous Page",250,400);
            g.drawRoundRect(210, 360, 200, 64,20,20);
            
            
            
            
            
            
            
            
        }
        
        else if(Game.gameState == ChewingGumSimulator.STATE.Options_Achivements)
        {
            Font EndFnt = new Font("arial",1,25);
            Font NorFnt = new Font("calibri",1,20);
            
            
            g.setFont(NorFnt);
            
            
            
            
            if(Game.achivementsStatus[0]==false){
            
            g.setColor(dark_red);
            g.fillRoundRect(10, 10, 300, 50,20,20);
            
            
            g.setColor(Color.white);
            g.drawString("Finished Tutorial",50,40);
            g.drawRoundRect(10, 10, 300, 50,20,20);}
            
            else if(Game.achivementsStatus[0]==true){
            
            g.setColor(dark_green);
            g.fillRoundRect(10, 10, 300, 50,20,20);
            
            
            g.setColor(Color.white);
            g.drawString("Finished Tutorial",50,40);
            g.drawRoundRect(10, 10, 300, 50,20,20);}
            
            
            
            
            
            
            if(Game.achivementsStatus[1]==false){
            
            g.setColor(dark_red);
            g.fillRoundRect(10, 80, 300, 50,20,20);
            
            
            g.setColor(Color.white);
            g.drawString("Finished Adventures",50,110);
            g.drawRoundRect(10, 80, 300, 50,20,20);}
            
            else if(Game.achivementsStatus[1]==true){
            
            g.setColor(dark_green);
            g.fillRoundRect(10, 80, 300, 50,20,20);
            
            
            g.setColor(Color.white);
            g.drawString("Finished Adventures",50,110);
            g.drawRoundRect(10, 80, 300, 50,20,20);}
            
            
            
            
            if(Game.achivementsStatus[2]==false){
            
            
            g.setColor(dark_red);
            g.fillRoundRect(10, 150, 300, 50,20,20);
            
            
            g.setColor(Color.white);
            g.drawString("Finished Arcades",50,180);
            g.drawRoundRect(10, 150, 300, 50,20,20);}
            
            
            else if(Game.achivementsStatus[2]==true){
            
            
            g.setColor(dark_green);
            g.fillRoundRect(10, 150, 300, 50,20,20);
            
            
            g.setColor(Color.white);
            g.drawString("Finished Arcades",50,180);
            g.drawRoundRect(10, 150, 300, 50,20,20);}
            
            
            
            
            if(Game.achivementsStatus[3]==false){
            
            
            g.setColor(dark_red);
            g.fillRoundRect(10, 220, 300, 50,20,20);
            
            
            g.setColor(Color.white);
            g.drawString("Dominated Arenas",50,250);
            g.drawRoundRect(10, 220, 300, 50,20,20);}
            
            if(Game.achivementsStatus[3]==true){
            
            
            g.setColor(dark_green);
            g.fillRoundRect(10, 220, 300, 50,20,20);
            
            
            g.setColor(Color.white);
            g.drawString("Dominated Arenas",50,250);
            g.drawRoundRect(10, 220, 300, 50,20,20);}
            
            
            if(Game.achivementsStatus[4]==true){
            g.setColor(dark_green);
            g.fillRoundRect(10, 290, 300, 50,20,20);
            
            
            g.setColor(Color.white);
            g.drawString("Captured All Trophies",50,320);
            g.drawRoundRect(10, 290, 300, 50,20,20);}
            
            if(Game.achivementsStatus[4]==false){
            g.setColor(dark_red);
            g.fillRoundRect(10, 290, 300, 50,20,20);
            
            
            g.setColor(Color.white);
            g.drawString("Captured All Trophies",50,320);
            g.drawRoundRect(10, 290, 300, 50,20,20);}
            
            
            g.setColor(Color.red);
            g.fillRoundRect(210, 360, 200, 64,20,20);
            
            
            
            g.setColor(Color.white);
            g.drawString(String_BackToMenu,250,400);
            g.drawRoundRect(210, 360, 200, 64,20,20);
            
            
        }
        
        
        else if(Game.gameState == ChewingGumSimulator.STATE.Options_Trophies)
        {
            Font EndFnt = new Font("arial",1,25);
            Font NorFnt = new Font("calibri",1,13);
            
            
            g.setFont(NorFnt);
            Color mumu = new Color(204,102,0);
            
            
            
            
            
            g.setColor(mumu);
            g.fillRoundRect(10, 10, 100, 50,20,20);
            
            
            g.setColor(Color.white);
            g.drawString("Virus 1",40,57);
            g.drawRoundRect(10, 10, 100, 50,20,20);
            
            
            
            g.setColor(mumu);
            g.fillRoundRect(10, 80, 100, 50,20,20);
            
            if(Game.trophiesStatus[0]==true){
                g.setColor(Color.green);
             g.fillRoundRect(45,12,30,30,10,10);
        
        
             
        
             g.setColor(Color.black);
             g.fillRect((int)45+5,(int)12+20, 20, 3);
        
             g.fillRect((int)45+5,(int)12+5, 5, 5);
             g.fillRect((int)45+20,(int)12+5, 5, 5);
        
             g.fillRect((int)45+5,(int)12+23, 5, 5);
             g.fillRect((int)45+20,(int)12+23, 5, 5);
                
            }
            
            
            g.setColor(Color.white);
            g.drawString("Virus 2",40,127);
            g.drawRoundRect(10, 80, 100, 50,20,20);
            
            
            
            g.setColor(mumu);
            g.fillRoundRect(10, 150, 100, 50,20,20);
            
            
            if(Game.trophiesStatus[1]==true){
             g.setColor(Color.gray);
             g.fillRoundRect(45,82,30,30,10,10);
        
        
             
        
             g.setColor(Color.black);
             g.fillRect((int)45+5,(int)82+20, 20, 3);
        
             g.fillRect((int)45+5,(int)82+5, 5, 5);
             g.fillRect((int)45+20,(int)82+5, 5, 5);
             
             g.fillRect((int)45+5,(int)90+5, 5, 5);
             g.fillRect((int)45+20,(int)90+5, 5, 5);
        
             g.fillRect((int)45+5,(int)82+23, 5, 5);
             g.fillRect((int)45+20,(int)82+23, 5, 5);
                
            }
            
            g.setColor(Color.white);
            g.drawString("Virus 3",40,197);
            g.drawRoundRect(10, 150, 100, 50,20,20);
            
            
            g.setColor(mumu);
            g.fillRoundRect(10, 220, 100, 50,20,20);
            
            
            if(Game.trophiesStatus[2]==true){
                g.setColor(Color.red);
             g.fillRoundRect(45,152,30,30,10,10);
        
        
             
        
             g.setColor(Color.black);
             g.fillRect((int)45+5,(int)152+20, 20, 3);
        
             g.fillRect((int)45+5,(int)152+5, 5, 5);
             g.fillRect((int)45+20,(int)152+5, 5, 5);
        
             g.fillRect((int)45+5,(int)152+23, 5, 5);
             g.fillRect((int)45+20,(int)152+23, 5, 5);
                
            }
            
            g.setColor(Color.white);
            g.drawString("Virus 4",40,267);
            g.drawRoundRect(10, 220, 100, 50,20,20);
            
            
            
            g.setColor(mumu);
            g.fillRoundRect(10, 290, 100, 50,20,20);
            
            
            if(Game.trophiesStatus[3]==true){
                g.setColor(Color.white);
             g.fillRoundRect(45,222,30,30,10,10);
        
        
             
        
             g.setColor(Color.black);
             g.fillRect((int)45+5,(int)222+20, 20, 3);
        
             g.fillRect((int)45+5,(int)222+5, 5, 5);
             g.fillRect((int)45+20,(int)222+5, 5, 5);
        
             g.fillRect((int)45+5,(int)222+23, 5, 5);
             g.fillRect((int)45+20,(int)222+23, 5, 5);
                
            }
            
            g.setColor(Color.white);
            g.drawString("Virus 5",40,337);
            g.drawRoundRect(10, 290, 100, 50,20,20);
            
            
            
            
            
            
            if(Game.trophiesStatus[4]==true){
                g.setColor(Color.pink);
             g.fillRoundRect(45,292,30,30,10,10);
        
        
             
        
             g.setColor(Color.black);
             g.fillRect((int)45+5,(int)292+20, 20, 3);
        
             g.fillRect((int)45+5,(int)292+5, 5, 5);
             g.fillRect((int)45+20,(int)292+5, 5, 5);
        
             g.fillRect((int)45+5,(int)292+23, 5, 5);
             g.fillRect((int)45+20,(int)292+23, 5, 5);
                
            }
            
            
            g.setColor(mumu);
            g.fillRoundRect(120, 10, 100, 50,20,20);
            
            
            g.setColor(Color.white);
            g.drawString("Virus 6",150,57);
            g.drawRoundRect(120, 10, 100, 50,20,20);
            
            
            
            if(Game.trophiesStatus[5]==true){
                g.setColor(Color.orange);
             g.fillRoundRect(155,12,30,30,10,10);
        
        
             
        
             g.setColor(Color.black);
             g.fillRect((int)155+5,(int)12+20, 20, 3);
        
             g.fillRect((int)155+5,(int)12+5, 5, 5);
             g.fillRect((int)155+20,(int)12+5, 5, 5);
        
             g.fillRect((int)155+5,(int)12+23, 5, 5);
             g.fillRect((int)155+20,(int)12+23, 5, 5);
                
            }
            
            
            
            g.setColor(mumu);
            g.fillRoundRect(120, 80, 100, 50,20,20);
            
            
            g.setColor(Color.white);
            g.drawString("Virus 7",150,127);
            g.drawRoundRect(120, 80, 100, 50,20,20);
            
            
            if(Game.trophiesStatus[6]==true){
                g.setColor(Color.DARK_GRAY);
             g.fillRoundRect(155,82,30,30,10,10);
        
        
             
        
             g.setColor(Color.black);
             g.fillRect((int)155+5,(int)82+20, 20, 3);
        
             g.fillRect((int)155+5,(int)82+5, 5, 5);
             g.fillRect((int)155+20,(int)82+5, 5, 5);
        
             g.fillRect((int)155+5,(int)82+23, 5, 5);
             g.fillRect((int)155+20,(int)82+23, 5, 5);
                
            }
            
            
            g.setColor(mumu);
            g.fillRoundRect(120, 150, 100, 50,20,20);
            
            
            g.setColor(Color.white);
            g.drawString("Virus 8",150,197);
            g.drawRoundRect(120, 150, 100, 50,20,20);
            
            
            
            if(Game.trophiesStatus[7]==true){
                g.setColor(Color.blue);
             g.fillRoundRect(155,152,30,30,10,10);
        
        
             
        
             g.setColor(Color.black);
             g.fillRect((int)155+5,(int)152+20, 20, 3);
        
             g.fillRect((int)155+5,(int)152+5, 5, 5);
             g.fillRect((int)155+20,(int)152+5, 5, 5);
        
             g.fillRect((int)155+5,(int)152+23, 5, 5);
             g.fillRect((int)155+20,(int)152+23, 5, 5);
                
            }
            
            g.setColor(mumu);
            g.fillRoundRect(120, 220, 100, 50,20,20);
            
            
            g.setColor(Color.white);
            g.drawString("Virus 9",150,267);
            g.drawRoundRect(120, 220, 100, 50,20,20);
            
            if(Game.trophiesStatus[8]==true){
                g.setColor(Color.magenta);
             g.fillRoundRect(155,222,30,30,10,10);
        
        
             
        
             g.setColor(Color.black);
             g.fillRect((int)155+5,(int)222+20, 20, 3);
        
             g.fillRect((int)155+5,(int)222+5, 5, 5);
             g.fillRect((int)155+20,(int)222+5, 5, 5);
        
             g.fillRect((int)155+5,(int)222+23, 5, 5);
             g.fillRect((int)155+20,(int)222+23, 5, 5);
                
            }
            
            g.setColor(mumu);
            g.fillRoundRect(120, 290, 100, 50,20,20);
            
            
            g.setColor(Color.white);
            g.drawString("Virus 10",150,337);
            g.drawRoundRect(120, 290, 100, 50,20,20);
            
            
            if(Game.trophiesStatus[9]==true){
                g.setColor(Color.cyan);
             g.fillRoundRect(155,222,30,30,10,10);
        
        
             
        
             g.setColor(Color.black);
             g.fillRect((int)155+5,(int)222+20, 20, 3);
        
             g.fillRect((int)155+5,(int)222+5, 5, 5);
             g.fillRect((int)155+20,(int)222+5, 5, 5);
        
             g.fillRect((int)155+5,(int)222+23, 5, 5);
             g.fillRect((int)155+20,(int)222+23, 5, 5);
                
            }
            
            
            
            g.setColor(mumu);
            g.fillRoundRect(Game.WIDTH-230, 10, 100, 50,20,20);
            
            
            g.setColor(Color.white);
            g.drawString("Virus 11",Game.WIDTH-200,57);
            g.drawRoundRect(Game.WIDTH-230, 10, 100, 50,20,20);
            
            
            
            g.setColor(mumu);
            g.fillRoundRect(Game.WIDTH-230, 80, 100, 50,20,20);
            
            
            g.setColor(Color.white);
            g.drawString("Virus 12",Game.WIDTH-200,127);
            g.drawRoundRect(Game.WIDTH-230, 80, 100, 50,20,20);
            
            
            
            g.setColor(mumu);
            g.fillRoundRect(Game.WIDTH-230, 150, 100, 50,20,20);
            
            
            g.setColor(Color.white);
            g.drawString("Virus 13",Game.WIDTH-200,197);
            g.drawRoundRect(Game.WIDTH-230, 150, 100, 50,20,20);
            
            
            g.setColor(mumu);
            g.fillRoundRect(Game.WIDTH-230, 220, 100, 50,20,20);
            
            
            g.setColor(Color.white);
            g.drawString("Virus 14",Game.WIDTH-200,267);
            g.drawRoundRect(Game.WIDTH-230, 220, 100, 50,20,20);
            
            
            
            g.setColor(mumu);
            g.fillRoundRect(Game.WIDTH-230, 290, 100, 50,20,20);
            
            
            g.setColor(Color.white);
            g.drawString("Virus 15",Game.WIDTH-200,337);
            g.drawRoundRect(Game.WIDTH-230, 290, 100, 50,20,20);
            
            
            
            
            g.setColor(mumu);
            g.fillRoundRect(Game.WIDTH-120, 10, 100, 50,20,20);
            
            
            g.setColor(Color.white);
            g.drawString("Virus 16",Game.WIDTH-90,57);
            g.drawRoundRect(Game.WIDTH-120, 10, 100, 50,20,20);
            
            
            
            g.setColor(mumu);
            g.fillRoundRect(Game.WIDTH-120, 80, 100, 50,20,20);
            
            
            g.setColor(Color.white);
            g.drawString("Virus 17",Game.WIDTH-90,127);
            g.drawRoundRect(Game.WIDTH-120, 80, 100, 50,20,20);
            
            
            g.setColor(mumu);
            g.fillRoundRect(Game.WIDTH-120, 150, 100, 50,20,20);
            
            
            g.setColor(Color.white);
            g.drawString("Virus 18",Game.WIDTH-90,197);
            g.drawRoundRect(Game.WIDTH-120, 150, 100, 50,20,20);
            
            
            
            g.setColor(mumu);
            g.fillRoundRect(Game.WIDTH-120, 220, 100, 50,20,20);
            
            
            g.setColor(Color.white);
            g.drawString("Virus 19",Game.WIDTH-90,267);
            g.drawRoundRect(Game.WIDTH-120, 220, 100, 50,20,20);
            
            
            
            g.setColor(mumu);
            g.fillRoundRect(Game.WIDTH-120, 290, 100, 50,20,20);
            
            
            g.setColor(Color.white);
            g.drawString("Virus 20",Game.WIDTH-90,337);
            g.drawRoundRect(Game.WIDTH-120, 290, 100, 50,20,20);
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            g.setColor(Color.red);
            g.fillRoundRect(210, 360, 200, 64,20,20);
            
            
            
            g.setColor(Color.white);
            g.drawString(String_BackToMenu,250,400);
            g.drawRoundRect(210, 360, 200, 64,20,20);
            
            
        }
        
        else if(Game.gameState == ChewingGumSimulator.STATE.Options_Language)
        {
            Font EndFnt = new Font("arial",1,25);
            Font NorFnt = new Font("arial",1,15);
            
            
            g.setFont(NorFnt);
            g.setColor(Color.white);
            g.setFont(EndFnt);
            
            g.setFont(NorFnt);
            
            g.setColor(Color.blue);
            g.fillRoundRect(210, 140, 200, 64,20,20);
            
            g.setColor(Color.white);
            g.drawString("English", 265, 180);
            g.drawRoundRect(210, 140, 200, 64,20,20);
            
            g.setColor(Color.blue);
            g.fillRoundRect(210, 210, 200, 64,20,20);
            
            
            g.setColor(Color.white);
            g.drawString("Russian", 265, 250);
            g.drawRoundRect(210, 210, 200, 64,20,20);
            
            
            
            g.setColor(Color.blue);
            g.fillRoundRect(210, 280, 200, 64,20,20);
            
            
            g.setColor(Color.white);
            g.drawString("Hungarian", 270, 320);
            g.drawRoundRect(210, 280, 200, 64,20,20);
            
            
           
            
            g.setColor(Color.blue);
            g.fillRoundRect(415, 210, 200, 64,20,20);
            
            
            g.setColor(Color.white);
            g.drawString("Arabic", 465, 250);
            g.drawRoundRect(415, 210, 200, 64,20,20);
            
            
            g.setColor(Color.blue);
            g.fillRoundRect(415, 140, 200, 64,20,20);
            
            g.setColor(Color.white);
            g.drawString("Japanese", 465, 180);
            g.drawRoundRect(415, 140, 200, 64,20,20);
            
            
            g.setColor(Color.blue);
            g.fillRoundRect(415, 70, 200, 64,20,20);
            
            g.setColor(Color.white);
            g.drawString("Romanian", 465, 110);
            g.drawRoundRect(415, 70, 200, 64,20,20);
            
            g.setColor(Color.blue);
            g.fillRoundRect(415, 280, 200, 64,20,20);
            
            
            g.setColor(Color.white);
            g.drawString("Polish", 465, 320);
            g.drawRoundRect(415, 280, 200, 64,20,20);
            
            
            g.setColor(Color.red);
            g.fillRoundRect(5, 350, 200, 64,20,20);
            
            g.setColor(Color.white);
            g.drawString(String_Back, 50, 390);
            g.drawRoundRect(5, 350, 200, 64,20,20);
            
            g.setFont(NorFnt);
            
            
            g.setColor(Color.blue);
            g.fillRoundRect(415, 350, 200, 64,20,20);
            
            g.setColor(Color.white);
            g.drawString("Chinese",490,390);
            g.drawRoundRect(415, 350, 200, 64,20,20);
            
            g.setColor(Color.blue);
            g.fillRoundRect(210, 350, 200, 64,20,20);
            
            g.setColor(Color.white);
            g.drawString("French",270,390);
            g.drawRoundRect(210, 350, 200, 64,20,20);
            
            
        }
        
        
        else if(Game.gameState == ChewingGumSimulator.STATE.Options_PlayerUpgrades)
        {
            Font EndFnt = new Font("arial",1,25);
            Font NorFnt = new Font("calibri",1,20);
            
            
            g.setFont(NorFnt);
            g.setColor(Color.green);
            
            
            
            
            
            
            
            
            
            
            g.setColor(Color.red);
            g.fillRoundRect(10, 360, 200, 64,20,20);
            
            
            
            
            
            g.setColor(Color.white);
            g.drawString(String_BackToMenu,40,400);
            g.drawRoundRect(10, 360, 200, 64,20,20);
            
            
            
            
            
            g.setColor(Color.blue);
            g.fillRoundRect(220, 360, 200, 64,20,20);
            
            g.setColor(Color.white);
            g.drawString("Upgrade Health",250,400);
            g.drawRoundRect(220, 360, 200, 64,20,20);
            
            
            
            g.setColor(Color.blue);
            g.fillRoundRect(220, 290, 200, 64,20,20);
            
            g.setColor(Color.white);
            g.drawString("Upgrade Speed ",250,330);
            g.drawRoundRect(220, 290, 200, 64,20,20);
            
            
            g.setColor(Color.blue);
            g.fillRoundRect(220, 220, 200, 64,20,20);
            
            g.setColor(Color.white);
            g.drawString("Upgrade Speed ",250,260);
            g.drawRoundRect(220, 220, 200, 64,20,20);
            
            
            
            
            g.setColor(Color.blue);
            g.fillRoundRect(430, 360, 200, 64,20,20);
            
            g.setColor(Color.white);
            g.drawString("Upgrade Opacity",460,400);
            g.drawRoundRect(430, 360, 200, 64,20,20);
            
            
            
            g.setColor(Color.blue);
            g.fillRoundRect(430, 290, 200, 64,20,20);
            
            g.setColor(Color.white);
            g.drawString("Upgrade Weapons",460,330);
            g.drawRoundRect(430, 290, 200, 64,20,20);
            
            
            g.setColor(Color.blue);
            g.fillRoundRect(430, 220, 200, 64,20,20);
            
            g.setColor(Color.white);
            g.drawString("Upgrade What?",460,250);
            g.drawRoundRect(430, 220, 200, 64,20,20);
            
            
            
            
            g.setColor(Color.blue);
            g.fillRoundRect(220, 150, 200, 64,20,20);
            
            g.setColor(Color.white);
            g.drawString("Level:  ",250,190);
            g.drawRoundRect(220, 150, 200, 64,20,20);
            
            
            
            g.setColor(Color.blue);
            g.fillRoundRect(430, 150, 200, 64,20,20);
            
            g.setColor(Color.white);
            g.drawString("Rank: N/A",460,190);
            g.drawRoundRect(430, 150, 200, 64,20,20);
            
            
        }
        
        g2d.setComposite(makeTransparent(1));
        
        
        
        
        
        
    }
    
}
