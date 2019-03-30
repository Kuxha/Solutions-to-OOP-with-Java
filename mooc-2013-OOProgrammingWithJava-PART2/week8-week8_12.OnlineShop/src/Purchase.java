
public class Purchase {

    private String product;
    private int number;
    private int price;

    public Purchase(String product, int amount, int unitPrice) {

        this.number = amount;
        this.product = product;
        this.price = unitPrice;

    }

    public int price() {
        return (this.number*this.price);

    }

    public void increaseAmount() {
        this.number++;

    }

    @Override
    public String toString() {

        return this.product + ": " + this.number;

    }
}
