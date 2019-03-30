
import java.util.Scanner;


public class TextUserInterface {
    
    private Scanner reader;
    private Dictionary dictionary;
    public TextUserInterface(Scanner reader,Dictionary dictionary){
        this.dictionary = dictionary;
        this.reader = reader;
    
    }
    
    



    
    
    
    
    
    
    
    
    
    public void start(){
        System.out.println("Statements:\n" +
"  add - adds a word pair to the dictionary\n" +
"  translate - asks a word and prints its translation\n" +
"  quit - quits the text user interface");
        while(true){
        System.out.print("Statement: ");
        String statement  = reader.nextLine();
        
        
        if(statement.equals("add")){
            this.add();}
        else if(statement.equals("translate")){
            this.translate();}
        else if(statement.equals("quit")){
            System.out.println("Cheers!");
            break;
        }
        else{
            System.out.println("Unknown statement");
        }
        
        }
    }
    
  public void add() {
        System.out.println("In Finnish: ");
        String word = this.reader.nextLine();
        System.out.println("Translation: ");
        String translation = this.reader.nextLine();
        this.dictionary.add(word, translation);
    }
    
    public void translate(){
        System.out.print("Give a word: ");
        String translation = reader.nextLine();
        System.out.println("Translation: " + this.dictionary.translate(translation));
        
    }
}
