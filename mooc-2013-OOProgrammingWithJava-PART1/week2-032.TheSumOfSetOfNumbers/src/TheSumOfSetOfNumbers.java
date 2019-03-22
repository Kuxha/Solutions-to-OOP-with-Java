
import java.util.Scanner;

public class TheSumOfSetOfNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Until what? ");
        int x = Integer.parseInt(reader.nextLine());
        
        System.out.println(x*(x+1)/2);
    }
}
