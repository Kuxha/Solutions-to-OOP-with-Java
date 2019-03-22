
import java.util.Scanner;

public class FirstPart {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Type a word: ");
        String name = reader.nextLine();
        System.out.print("Length of first part: ");
        int x = Integer.parseInt(reader.nextLine());
        
        System.out.println("Result: " + name.substring(0,x));
        
        
    }
}


/*
Type a word: example
Length of the first part: 4
Result: exam*/