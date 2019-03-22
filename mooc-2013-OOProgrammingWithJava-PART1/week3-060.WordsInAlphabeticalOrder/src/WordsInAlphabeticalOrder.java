
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordsInAlphabeticalOrder {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // create here an ArrayList
        
        ArrayList <String> names1 = new ArrayList<String>();
        
        while(true)
        {
            System.out.print("Type a name: ");
            
            String name = reader.nextLine();
            
            if(name.equals(""))
            {
                break;
            }
            
            names1.add(name);
        }
        
        Collections.sort(names1);
        
        for(String substitute1 : names1)
        {
            System.out.println(substitute1);
        }
    }
}
