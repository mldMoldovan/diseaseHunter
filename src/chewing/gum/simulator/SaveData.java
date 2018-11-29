
package chewing.gum.simulator;



public class SaveData implements java.io.Serializable{
    
    public String Data_Username;
    
 
    
    public int Data_Coins;
    
    public int Data_MaxScore;
    
    public int Data_Background;
    
    public boolean Data_boolBladder;
    
    public boolean Data_boolTutorials;
    
    public boolean[] Data_adventureStatus= new boolean[10];
    
    public boolean[] Data_achivementsStatus=new boolean[5];
    
    public boolean[] Data_trophiesStatus=new boolean[20];
    
    public LANGUAGE Data_gameLang;
    
    public int Data_playerXP;
    
    public int Data_playerLevel;
    
    
    
    
    public SaveData(int Data_Coins, int Data_MaxScore, int Data_Background, boolean Data_adventureStatus[], boolean Data_achivementsStatus[], boolean Data_trophiesStatus[],LANGUAGE Data_gameLang,int Data_playerXP,int Data_playerLevel/* ,boolean Data_boolBladder, boolean Data_boolTutorials*/){
        //this.Data_Username = Data_Username;
        
        this.Data_Coins = Data_Coins;
        this.Data_MaxScore = Data_MaxScore;
        this.Data_Background = Data_Background;
        this.Data_adventureStatus= Data_adventureStatus;
        this.Data_achivementsStatus = Data_achivementsStatus;
        this.Data_trophiesStatus = Data_trophiesStatus;
        this.Data_gameLang = Data_gameLang;
        this.Data_playerXP = Data_playerXP;
        this.Data_playerLevel = Data_playerLevel;
        //this.Data_boolBladder = Data_boolBladder;
        //this.Data_boolTutorials = Data_boolTutorials;
      
    }
    
}
