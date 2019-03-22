public class PrintingLikeBoss {

    // copy or rewrite the method of Assignment 39.1 here
    public static void printStars(int amount) {
      while(amount>0)
        {
            System.out.print("*");
            amount--;
        }
        System.out.print("\n");
    }
    
    
    public static void printWhitespaces(int amount) {
        while(amount>0)
        {
            System.out.print(" ");
            amount--;
        }
    }

    public static void printTriangle(int size) {
        
        // 40.2
        int j = size;
        int i=1;
        while(j>0)
        {
            printWhitespaces(j - 1);
            printStars(i);
            
            i++;
            j--;
        }
    }

    public static void xmasTree(int height) {
        
        int star = 2*height -1;
        int x =0;
     
        int white = star/2;
        int stars = 1;
        int i;
        while(x<height)
        {
            
                 printWhitespaces(white);
                 
                 
                 printStars(stars);
                 //printWhitespaces(white);
                 
                 white = white -1;
                 stars = stars +2;
                 x++;
                 
                // System.out.println("");
           
        }
        
        white = star/2 -1;
        
        printWhitespaces(white);
        printStars(3);
        //printWhitespaces(white);  
        
        
        printWhitespaces(white);   
        printStars(3);
       //printWhitespaces(white); 
       
        
        
    }

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!

        printTriangle(5);
        System.out.println("---");
        xmasTree(4);
        System.out.println("---");
        xmasTree(10);
    }
}
