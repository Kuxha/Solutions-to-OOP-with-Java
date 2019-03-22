
import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        int[] values = {8, 3, 7, 9, 1, 2, 4};
        sort(values);
  
    }
    
    public static int smallest(int[] array){
        
        int min = array[0];
        for(int num : array){
            if(num<min)
                min = num;
        }
       
        return min;
    }
    public static int indexOfTheSmallest(int[] array){
        int min = array[0];
        int n = array.length;
        int index = 0;
        for(int i=0 ; i<n;i++){
        
            if(array[i]<min){
                min = array[i];
                index = i;
            }
        }
       
        return index; 
    }
    
    public static int indexOfTheSmallestStartingFrom(int[] array, int index) {
    // write the code here
    
        int min = array[index];
        int n = array.length;
        int indexa = index;
        for(int i=index ; i<n;i++){
        
            if(array[i]<min){
                min = array[i];
                indexa = i;
            }
        }
       
        return indexa;
}
    
    public static void swap(int[] array, int index1, int index2) {
    // code goes here
    int swap = array[index2];
    array[index2] = array[index1];
    array[index1] = swap;
}
public static void sort(int[] array) {
    for(int i=0;i<array.length;i++){
        int ismall = indexOfTheSmallestStartingFrom(array,i);
        swap(array,i,ismall);
        System.out.print("[");
        for(int j = 0;j<array.length;j++){
            System.out.print(array[j]);
            System.out.print(", ");
        }
        System.out.print("]");
        System.out.println("");
        
    }
    
    
    
    
}
}
