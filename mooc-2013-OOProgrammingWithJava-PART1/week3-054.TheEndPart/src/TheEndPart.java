import java.util.Scanner;

public class TheEndPart {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
            System.out.print("Type a word: ");
        String name = reader.nextLine();
        System.out.print("Length of end part: ");
        int x = Integer.parseInt(reader.nextLine());
        int n=name.length();
        
        System.out.println("Result: " + name.substring(n-x));
    }
}
