
import java.util.Scanner;

public class SumOfThePowers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Type a number: ");
        int x = Integer.parseInt(reader.nextLine());
        
        int sum = 0;
        int i;
        for(i=0;i<=x;i++)
        {
            sum = sum + (int)Math.pow(2,i);
            
            
            
        }
            System.out.println("The result is " +sum);
    }
}
