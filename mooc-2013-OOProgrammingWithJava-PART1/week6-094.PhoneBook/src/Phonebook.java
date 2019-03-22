
import java.util.ArrayList;


public class Phonebook {
  private ArrayList <Person> phonebook = new ArrayList<Person>();
  public void add(String name,String number){
  
      Person p = new Person(name,number);
      this.phonebook.add(p);
  }
  
  public void printAll(){
      for(Person p : this.phonebook){
      System.out.println(p);
    }
  }
  
  public String searchNumber(String name){
     for(Person p : this.phonebook){
         System.out.println(name + "  " +p.getName() + "  " +this.phonebook.size());
      if(name.equals(p.getName())){
          return p.getNumber();
      }
    }
   return "number not known";
      
  }
}

// see the solutions once
