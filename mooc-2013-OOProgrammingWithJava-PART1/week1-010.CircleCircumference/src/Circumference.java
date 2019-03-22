
import java.util.Scanner;

public class Circumference {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type the radius: ");
        double r =Double.parseDouble(reader.nextLine());
        
        double c = 2*Math.PI*r;
        
        System.out.println("Circumference of the circle: " + c);
    }
}
