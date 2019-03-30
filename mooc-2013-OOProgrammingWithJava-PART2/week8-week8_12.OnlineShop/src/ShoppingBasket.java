
import java.util.HashMap;
import java.util.Map;

public class ShoppingBasket {

    private Map<String, Purchase> basket;

    public ShoppingBasket() {

        this.basket = new HashMap<String, Purchase>();
    }

    public void add(String product, int price) {
        if (this.basket.containsKey(product)) {
            this.basket.get(product).increaseAmount();
        } else {
            this.basket.put(product, new Purchase(product, 1, price));
        }
    }

    public int price() {
        int totalprice = 0;
        for (Purchase product : this.basket.values()) {
            totalprice += product.price();
        }
        return totalprice;

    }

    public void print() {

        for (Purchase product : this.basket.values()) {
            System.out.println(product);
        }
    }
}
