import java.util.ArrayList;
public class Team {
   private String name;
   private ArrayList<Player> playa;
   private int max;
   public Team(String name){
       playa =  new ArrayList<Player>();
       this.max = 16;
       this.name = name;
   }
   public String getName(){
       return this.name;
   }
   
   public void addPlayer(Player name){
      if(this.playa.size()<this.max){
          this.playa.add(name);
      }
       
   }

   public void printPlayers(){
       for(Player player :playa){
           System.out.println(player.toString());
       }
   }
   
   public void setMaxSize(int maxSize){
       this.max = maxSize;
   }
   
   public int size(){
       int size = 0;
       for(Player player :playa){
           size++;
       }
       return size;
   }
   
      public int goals(){
          int goalz=0;
          for(Player pl :playa){
             goalz+=pl.goals();
          }
       return goalz;
   }

    
}
