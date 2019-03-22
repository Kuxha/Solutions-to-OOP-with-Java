public class MyDate {
    private int day;
    private int month;
    private int year;

    public MyDate(int day, int montd, int year) {
        this.day = day;
        this.month = montd;
        this.year = year;
    }

    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean earlier(MyDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month
                && this.day < compared.day) {
            return true;
        }

        return false;
    }
    
    public int differenceInYears(MyDate comparedDate){
     System.out.println("compared --> " +comparedDate + " and  this.date " +this.toString());
     
     if(comparedDate.year < this.year){
         int diff = this.year-comparedDate.year-1;
         if(this.year-comparedDate.year >= 1){
             if(this.month - comparedDate.month >0)
                 return diff + 1;
             else if(this.month - comparedDate.month ==0){
                 if(this.day - comparedDate.day >=0)
                     return diff + 1;
                 else return diff + 0;
             }
             else return diff + 0;
                 
         }
         return this.year - comparedDate.year;
     }
     else if(comparedDate.year > this.year){
         
         int diff2 = comparedDate.year - this.year-1;
         
         
         if(comparedDate.year - this.year >= 1){
             if(comparedDate.month - this.month>0)
                 return diff2 + 1;
             else if(comparedDate.month - this.month==0){
                   if(this.day - comparedDate.day <=0)
                     return diff2 +1;
                 else return diff2 + 0;
             }
             else return diff2 + 0;
                 
         }
         return comparedDate.year - this.year;
     }
     else return 0;  
    }

}
