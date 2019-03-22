import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Grades grade = new Grades();
        int n;
        System.out.println("Type exam scores, -1 completes");
        while(true){
            
            n = reader.nextInt();
            if(n == -1){
                grade.printGrades();
                System.out.println("Accepted percentage: " + ""+grade.percentage());
                break;
            }
                
            grade.setGrade(n);
            
            
        }
        
    }
 
    
}
