
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros += cents / 100;
            cents %= 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    @Override
    public String toString() {
        String zero = "";
        if (cents < 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }
    public Money plus(Money added){
        Money org = new Money(this.euros,this.cents);
        Money sum = new Money(this.euros+added.euros,this.cents+added.cents);
        return sum;
    }
    
    public boolean less(Money compared){
       
       if(this.euros - compared.euros <0){
           return true;
       }
       else if(this.euros - compared.euros ==0){
           if(this.cents - compared.cents <0){
               return true;
           }
           else return false;
       }
       else return false;
      
    }
    
    public Money minus(Money decremented){
       Money org = new Money(this.euros,this.cents);
        Money sum = new Money(this.euros-decremented.euros,this.cents-decremented.cents);
        Money sum1 = new Money(this.euros-decremented.euros -1,this.cents-decremented.cents +100);
        Money zer = new Money(0,0);
        if(this.euros - decremented.euros < 0 ){
            return zer;
        }
        else if(this.euros - decremented.euros>0){
            if(this.cents - decremented.cents <0){
                return sum1;
            }
            else return sum;
        }
        else return sum;
    }
    
}
