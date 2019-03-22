
public class Book {
   private String title;
   private String publisher;
   private int year;
   
   public Book(String title,String publisher,int year){
       this.title = title;
       this.publisher = publisher;
       this.year = year;
   }
   public String title(){
       return this.title;
   }
   public String publisher(){
       return this.publisher;
   }
   public int year(){
       return this.year;
   }   
   
   public String toString(){
       String yr = ""+ this.year;
       String ans = this.title + ", " + this.publisher + ", " + yr;
       
       
       return ans;
       
   }

}
