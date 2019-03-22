
import java.util.ArrayList;


public class BirdData {
   private ArrayList<Bird> birdData;
   public BirdData(){
       this.birdData = new ArrayList<Bird>();
                
   }
   
   
   public void Add(String name,String scientificName){
       Bird bird = new Bird(name,scientificName);
       birdData.add(bird);
    }

   public void Observation(String obird){
       int flag =1;
       for(Bird bird:this.birdData){
           if(bird.name().equals(obird)){
              bird.obirdadd();
              flag  = 0;
           }
       }
       if(flag ==1)
           System.out.println("Is not a bird!");
       
       
    }
   public void Statistics(){
       for(Bird bird:this.birdData){
           bird.toShow();
       }
       
    }
   public void Show(String sbird){
       for(Bird bird:this.birdData){
           if(bird.name().equals(sbird)){
               bird.toShow();
           }
       }
       
}
  
}