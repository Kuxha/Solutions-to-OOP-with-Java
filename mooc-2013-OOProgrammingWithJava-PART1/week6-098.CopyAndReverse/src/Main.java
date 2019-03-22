
import java.util.Arrays;



public class Main {

    public static void main(String[] args) {
        // write testcode here
        int[] original = {1, 2, 3, 4};
    int[] copied = copy(original);

    // change the copied
    copied[0] = 99;

    // print both
    System.out.println( "original: " + Arrays.toString(original));
    System.out.println( "copied: " + Arrays.toString(copied));
    }
    public static int[] copy(int[] array){
        
        int n = array.length;
        int[] copy = new int[n];
        int i = 0;
        for(int num : array){
            copy[i++] = num;
        }
        
        return copy;
    }

    public static int[] reverseCopy(int[] array){
        
        int n = array.length;
        int[] copy = new int[n];
        int i = n-1;
        for(int num : array){
            copy[i--] = num;
        }
        
        return copy;
    }    
}
