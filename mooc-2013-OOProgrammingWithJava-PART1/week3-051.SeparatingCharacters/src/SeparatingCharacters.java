
import java.util.Scanner;

public class SeparatingCharacters {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type your name: ");
        String name = reader.nextLine();
        
        int n = name.length();
        int i=0;
        
        while (i<n)
        {
            System.out.println((i+1)+". character: " + name.charAt(i));
            i++;
        }
    }
}
