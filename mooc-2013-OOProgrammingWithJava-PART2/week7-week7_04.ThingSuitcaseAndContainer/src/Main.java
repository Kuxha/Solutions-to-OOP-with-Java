
public class Main {

    public static void main(String[] args) {
        // use this main class to test your program!
    
    
    
    }
    
    
        public static void addSuitcasesFullOfBricks(Container container){
        
            for(int i=1;i<101;i++){
            Suitcase suitcase = new Suitcase(100*100);
            Thing thing = new Thing("Brick",i);
            suitcase.addThing(thing);
            container.addSuitcase(suitcase);
            
            }
        
        }

}
