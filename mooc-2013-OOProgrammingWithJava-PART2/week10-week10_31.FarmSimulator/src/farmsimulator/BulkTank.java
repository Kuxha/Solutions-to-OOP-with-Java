package farmsimulator;

public class BulkTank {

    private double capacity, volume;

    public BulkTank() {
        this.capacity = 2000;

    }

    public BulkTank(double capacity) {
        this.capacity = capacity;

    }

    public double getCapacity() {
        return this.capacity;
    }

    public double getVolume() {

        return this.volume;
    }

    public double howMuchFreeSpace() {
        return this.capacity - this.volume;
    }

    public void addToTank(double amount) {

        double newVol = amount + this.getVolume();
        if (newVol >= this.getCapacity()) {
            this.volume = this.capacity;
        } else {
            this.volume = newVol;
        }

    }

    public double getFromTank(double amount) {

        double newVol = this.volume - amount;
        if (newVol <= 0) {
            this.volume = 0;
            return 0;
        } else {
            this.volume = newVol;
            return  newVol;
        }


    }
    
    public String toString(){
    
    return Math.ceil(this.volume) + "/" + Math.ceil(this.capacity);
    }
}
