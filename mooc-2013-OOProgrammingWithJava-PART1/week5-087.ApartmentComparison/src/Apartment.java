
public class Apartment {

    private int rooms;
    private int squareMeters;
    private int pricePerSquareMeter;

    public Apartment(int rooms, int squareMeters, int pricePerSquareMeter) {
        this.rooms = rooms;
        this.squareMeters = squareMeters;
        this.pricePerSquareMeter = pricePerSquareMeter;
    }
    public boolean larger(Apartment otherApartment){
        if(this.squareMeters>otherApartment.squareMeters){
            return true;
        }
        return false;
    }
    
        public boolean moreExpensiveThan(Apartment otherApartment){
        if(this.pricePerSquareMeter*this.squareMeters>otherApartment.pricePerSquareMeter*otherApartment.squareMeters){
            return true;
        }
        return false;
    }
        public int priceDifference(Apartment otherApartment){
        if(this.pricePerSquareMeter*this.squareMeters>otherApartment.pricePerSquareMeter*otherApartment.squareMeters){
           
            return this.pricePerSquareMeter*this.squareMeters - otherApartment.pricePerSquareMeter*otherApartment.squareMeters;
        }
        else{
           
            return otherApartment.pricePerSquareMeter*otherApartment.squareMeters -this.pricePerSquareMeter*this.squareMeters;
        }
    }
}
