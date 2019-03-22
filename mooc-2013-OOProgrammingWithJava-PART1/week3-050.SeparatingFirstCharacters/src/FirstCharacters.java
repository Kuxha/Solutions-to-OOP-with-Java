import java.util.Scanner;

public class FirstCharacters 
{
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Type your name: ");
        String name = reader.nextLine();
        
        if(name.length()>=3)
        {
            System.out.print("1. character: " + name.charAt(0) + "\n2. character: " + name.charAt(1)+ "\n3. character: " + name.charAt(2));
        }
       
        
    }
    
   
    
}
/*Type your name: Paul
1. character: P
2. character: a
3. character: u*/