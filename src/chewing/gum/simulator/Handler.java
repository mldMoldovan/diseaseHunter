
package chewing.gum.simulator;


import static chewing.gum.simulator.ChewingGumSimulator.STATE.Game;
import java.awt.Graphics;
import java.util.LinkedList;

public class Handler {
    
    private int objNo;
    
    
    
    LinkedList<GameObject> object = new LinkedList<GameObject>();
    
    public void tick(){
        for(int i=0;i<object.size();i++)
        {
            GameObject tempObject = object.get(i);
            tempObject.tick();
        }
    }
    
    public void render(Graphics g){
        
        for(int i=0;i<object.size();i++)
        {
            GameObject tempObject = object.get(i);
            tempObject.render(g);
        }
        
    }
    
    public void addObject(GameObject object){
        this.object.add(object);
    }
    
    public void removeObject(GameObject object){
        this.object.remove(object);
    }

    public void clearEnemies() {
        
        for(int j=0;j<object.size();j++){
            
            GameObject tempObject = object.get(j);
            
             
             if(tempObject.getId()!=ID.Player)
         {    object.clear();
              //removeObject(tempObject);
         
         }
            
         
         
         
         }
    }
    
    public void clearPlayers() {
        for(int i=0;i<object.size();i++){
            GameObject tempObject = object.get(i);
         if(tempObject.getId()==ID.Player)
         {    object.clear();
            
         
         }
         
    }



}
    
    public void wipeBoss() {
        for(int i=0;i<object.size();i++){
            GameObject tempObject = object.get(i);
         if(tempObject.getId()==ID.BossOne)
         {    removeObject(tempObject);
            
         
         }
         
    }



}
    
    public void wipeAutoTurret() {
        for(int i=0;i<object.size();i++){
            GameObject tempObject = object.get(i);
         if(tempObject.getId()==ID.AutoTurret)
         {    removeObject(tempObject);
            
         
         }
         
    }



}
    
    public void clearTurretParticles() {
        for(int i=0;i<object.size();i++){
            GameObject tempObject = object.get(i);
         if(tempObject.getId()==ID.StraightParticle)
         {    removeObject(tempObject);
            
         
         }
         
    }



}
    public void wipeAntibody() {
        for(int i=0;i<object.size();i++){
            GameObject tempObject = object.get(i);
         if(tempObject.getId()==ID.Antibody)
         {    removeObject(tempObject);
            
         
         }
         
    }



}
    
    public int numberObjects() {
        for(int i=0;i<object.size();i++){
            GameObject tempObject = object.get(i);
             objNo++;
            
         
         
         
    }


   return objNo;
}
    
    
    public void EMPDeployed(){
        for(int i=0;i<object.size();i++){
            GameObject tempObject = object.get(i);
         if(tempObject.getId()==ID.FastEnemy)
         {    removeObject(tempObject);
              if(ChewingGumSimulator.gameState==ChewingGumSimulator.STATE.Tutorial && ChewingGumSimulator.tutorialStages[3]==true && ChewingGumSimulator.tutorialStages[4]==false){
                  ChewingGumSimulator.tutorialStages[4]=true;
              }}
         else if(tempObject.getId()==ID.Neutrino)
         {    removeObject(tempObject);}
         else if(tempObject.getId()==ID.HiggsBoson)
         {    removeObject(tempObject);}
    }
    }
    
    
    
    public void wipeBoss5() {
        for(int i=0;i<object.size();i++){
            GameObject tempObject = object.get(i);
         if(tempObject.getId()==ID.BossFive)
         {    removeObject(tempObject);
            
         
         }
         
    }



}
    
        public void wipeFallout() {
        for(int i=0;i<object.size();i++){
            GameObject tempObject = object.get(i);
         if(tempObject.getId()==ID.FalloutCloud)
         {    removeObject(tempObject);
            
         
         }
         
    }



}
        
        
        
        
        public void wipeNeutrino() {
        for(int i=0;i<object.size();i++){
            GameObject tempObject = object.get(i);
         if(tempObject.getId()==ID.Neutrino)
         {    removeObject(tempObject);
            
         
         }
         
    }



}
        
        public void wipeHiggsBoson() {
        for(int i=0;i<object.size();i++){
            GameObject tempObject = object.get(i);
         if(tempObject.getId()==ID.HiggsBoson)
         {    removeObject(tempObject);
            
         
         }
         
    }



}
    
    public void wipeWalls() {
        for(int i=0;i<object.size();i++){
            GameObject tempObject = object.get(i);
         if(tempObject.getId()==ID.VerticalWall || tempObject.getId()==ID.HorizontalWall || tempObject.getId()==ID.RadioactiveVerticalWall || tempObject.getId()==ID.RadioactiveHorizontalWall)
         {    object.clear();
            
              
         }
         
    }



}
    
    public void wipeBasics() {
        for(int i=0;i<object.size();i++){
            GameObject tempObject = object.get(i);
         while(tempObject.getId()==ID.BasicEnemy){
         if(tempObject.getId()==ID.BasicEnemy)
         {    //object.clear();
            
              removeObject(tempObject);
         }}
         
    }



}
    
    






}
