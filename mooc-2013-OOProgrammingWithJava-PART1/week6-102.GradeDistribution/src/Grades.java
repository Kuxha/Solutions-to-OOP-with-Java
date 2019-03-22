
public class Grades {
    private int[] grade = {0,0,0,0,0,0};

    public void setGrade(int g){
        if(g>60)
            this.grade[0] = this.grade[0];
        else if(g>=50)
            this.grade[5]++;
        else if(g>=45)
            this.grade[4]++;
        else if(g>=40)
            this.grade[3]++;
        else if(g>=35)
            this.grade[2]++;
        else if(g>=30)
            this.grade[1]++;
        else if(g>0)
            this.grade[0]++;
          
    }
    
    public double percentage(){
       
        double accepted = 0;
        double allScores = 0;
        for(int i=1;i<=5;i++){
            accepted = accepted + this.grade[i];
        }
        for(int i=0;i<=5;i++){
            allScores = allScores + this.grade[i];
        }
        double ans = (100 * accepted)/allScores;
        return ans;
    }
    
    
    public int num(int i){
        return grade[i];
    }
    
    
    
    public void printGrades(){
        System.out.println("Grade distribution:");
        for(int i=5;i>=0;i--){
            System.out.print("" + i + ": ");
            printStar(this.grade[i]);
            System.out.println("");
        }
    
 
    }
    public void printStar(int num) {
        
       for(int i = 0; i<num;i++){
            System.out.print("*");
        } 
    }
}
