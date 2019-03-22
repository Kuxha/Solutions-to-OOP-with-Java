
import java.util.Scanner;

public class Main {  

    public static void main(String[] args) {
    BirdData bdata = new BirdData();
    Scanner reader = new Scanner(System.in);
    while(true){
        String ask= reader.nextLine();
                
        if(ask.equals("Add")){
            System.out.print("Name: ");
            String name = reader.nextLine();
            System.out.print("Latin Name");
            String scientificName = reader.nextLine();
            bdata.Add(name, scientificName);
            
        }
       else if(ask.equals("Observation")){
            System.out.print("What was observed:? ");
            String obird = reader.nextLine();
            bdata.Observation(obird);
       }
       else if(ask.equals("Statistics")){
           bdata.Statistics();
       }
       else if(ask.equals("Show")){
            System.out.print("What? ");
            String sbird = reader.nextLine();
            bdata.Show(sbird);
       }
       else if(ask.equals("Quit"))
           break;
        
    }
            
    }

}
