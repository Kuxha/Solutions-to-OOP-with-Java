import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type a number: ");
        int x = Integer.parseInt(reader.nextLine());
        int z=1;
        while(x>0)
        {
            z = (x--)*z;
                    
        }
        
        System.out.println("Factorial is " +z);
    }
}
