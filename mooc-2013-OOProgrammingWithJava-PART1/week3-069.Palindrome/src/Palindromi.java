import java.util.Scanner;

public class Palindromi {

    public static boolean palindrome(String text) {
        // write code here
        int n = text.length();
        int i;
        
        //System.out.print("In reverse order: ");
        for(i=0;i<n/2;i++)
        {
            if(text.charAt(n-i-1)!=text.charAt(i))
                return false;
            
        }
        
        return true;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type a text: ");
        String text = reader.nextLine();    
        if (palindrome(text)) {
            System.out.println("The text is a palindrome!");
        } else {
            System.out.println("The text is not a palindrome!");
        }
    }
}
