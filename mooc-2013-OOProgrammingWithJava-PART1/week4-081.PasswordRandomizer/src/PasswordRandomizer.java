import java.util.Random;

public class PasswordRandomizer {
    // Define the variables
    private final int length;
    private final Random random;
   
    public PasswordRandomizer(int length) {
        // Initialize the variable
        this.length = length;
        this.random = new Random();
    }

    public String createPassword() {
        // write code that returns a randomized password
        String pass="";
        int value;

       
        for(int i=0;i<this.length;i++){
            
            value = this.random.nextInt(25)+1;
            
            pass += "abcdefghijklmnopqrstuvwxyz".charAt(value);
        }
        return pass;
    }

}
