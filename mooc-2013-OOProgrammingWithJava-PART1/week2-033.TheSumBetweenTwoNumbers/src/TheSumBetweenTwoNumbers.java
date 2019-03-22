
import java.util.Scanner;


public class TheSumBetweenTwoNumbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
         System.out.print("First: ");
         int y=Integer.parseInt(reader.nextLine());
         
         System.out.print("Second: ");
         int x=Integer.parseInt(reader.nextLine());
         int sum=x;
         while(y<x)
         {
             sum = sum +y;
             y++;
             
             
             
         }
         
         System.out.println(sum);
    }
}
