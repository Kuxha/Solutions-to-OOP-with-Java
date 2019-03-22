import java.util.ArrayList;

public class Variance {
    // Copy here sum from exercise 63 
   public static int sum(ArrayList<Integer> list) {
        // Write your code here
        int sum2 = 0;
        for(int num : list)
        {
            sum2 = sum2 + num;
        }
        return sum2;
    }
    // Copy here average from exercise 64 
     public static double average(ArrayList<Integer> list) {
        
        return (double)sum(list)/list.size();
    }


    public static double variance(ArrayList<Integer> list) {
        // write code here
        int n=0;
        for(int s :list)
        {
            n++;
        }
        double ans = 0;
        double xo = average(list);
         for(int x :list)
        {
            ans = ans + (x - xo)*(x - xo);
           
        }
        
         ans = ans /(n-1);
        
        
        
       
        return ans;
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);
        
        System.out.println("The variance is: " + variance(list));
    }

}
