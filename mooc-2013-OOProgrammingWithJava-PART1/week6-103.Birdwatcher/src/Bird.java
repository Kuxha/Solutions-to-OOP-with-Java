public class Bird {
private String name;
private String scientificName;
private int observations;

public Bird(String name,String scientific){
       this.name = name;
       this.scientificName = scientific;
       this.observations = 0;
   }    

public String name(){
  return this.name;
} 
public void obirdadd(){
  this.observations++;
}
public String scientificName(){
    return this.scientificName();
} 

public void toShow(){
       String ans = this.name+ " (" + this.scientificName +"): " + "" + this.observations +" observations";
        System.out.println(ans);
       
   }

}

 
   


