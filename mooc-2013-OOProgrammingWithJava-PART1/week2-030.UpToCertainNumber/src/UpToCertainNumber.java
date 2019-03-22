
import java.util.Scanner;


public class UpToCertainNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        
        System.out.println("Up to what number? ");
         int number = 1;
         int x=Integer.parseInt(reader.nextLine());
        while(number<=x)
        {
            System.out.println(number++);
        }
        
    }
}
