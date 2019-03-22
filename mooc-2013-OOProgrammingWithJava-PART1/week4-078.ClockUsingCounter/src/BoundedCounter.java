
public class BoundedCounter {
    private int value;
    private int upper;
    public BoundedCounter(int upper){
        this.value = 0;
        this.upper = upper;
    }
    public void next(){
       this.value++;
       if(this.value>this.upper){
           this.value =0;
       }
    }
    public String toString(){
        if(this.value<10){
            return "0"+this.value;
        }
        return "" + this.value;
    }
    
    public int getValue(){
        return this.value;
    }
    public void setValue(int param){
        if(param>=0 && param<=this.upper)
        this.value = param;
    }
}
