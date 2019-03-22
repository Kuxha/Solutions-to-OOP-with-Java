
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        
        System.out.println("Type the points [0-60:");
        
        int x = Integer.parseInt(reader.nextLine());
        
        if(x<=29)
            System.out.println("failed");
        else if(x<35 && x>29)
            System.out.println("1");
        else if(x<40 && x>34)
            System.out.println("2");
        else if(x<=44 && x>=40)
            System.out.println("3");
        else if(x<=49 && x>=45)
            System.out.println("4");
        else if(x<=60 && x>=50)
            System.out.println("5");
        
        
        
        
        
        
    }
}
