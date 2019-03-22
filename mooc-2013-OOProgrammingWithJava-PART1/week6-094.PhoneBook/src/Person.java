
public class Person {
 private String phno;
 private String name;
 
 public Person(String name,String num){
     this.phno = num;
     this.name = name;
 }
 public String toString(){
     return this.name + " number: " + this.phno;
 }
 public String getName(){
     return this.name;
 }
  public String getNumber(){
     return this.phno;
 }
  public void changeNumber(String newNumber){
      this.phno = newNumber;
  }
}
