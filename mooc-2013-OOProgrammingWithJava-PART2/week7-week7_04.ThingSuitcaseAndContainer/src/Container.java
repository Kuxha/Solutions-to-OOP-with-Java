
import java.util.ArrayList;

public class Container {

    private int maxwt;
    private int totalweight;
    private ArrayList<Suitcase> suitcases;

    public Container(int maxwt) {
        this.totalweight = 0;
        this.suitcases = new ArrayList<Suitcase>();
        this.maxwt = maxwt;

    }

    public void addSuitcase(Suitcase suitcase) {
        int newweight = this.totalweight + suitcase.totalWeight();
        if (newweight <= this.maxwt) {

            this.totalweight = newweight;
            this.suitcases.add(suitcase);
        }

    }

    public String toString() {

        int weight = 0;

        for (Suitcase suitcase : this.suitcases) {

            weight += suitcase.totalWeight();

        }

        return this.suitcases.size() + " suitcases (" + weight + " kg)";

    }

    public void printThings() {

        for (Suitcase suitcase : this.suitcases) {

            suitcase.printThings();
        }

    }
    


}
