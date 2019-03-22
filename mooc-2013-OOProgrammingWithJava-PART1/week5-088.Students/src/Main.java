
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write here the main program
       Scanner  reader = new Scanner(System.in);
       ArrayList<Student> students = new ArrayList<Student>();
       while(true){
           
           System.out.print("name: ");
           String name = reader.nextLine();
           
           if(name.isEmpty()){
               break;
           }
           System.out.print("studentnumber: ");
           String num = reader.nextLine();
           
           Student stu = new Student(name,num);
           students.add(stu);
       }
       
       for(Student stu : students){
           System.out.println(stu.toString());
       }
       
        System.out.print("Give search term: ");
        String search = reader.nextLine();
        System.out.println("Result: ");
        for(Student stu : students){
            
            if(stu.getName().contains(search)){
                System.out.println(stu.toString());
            }
           
       }
        
       
   
    }
}
