
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Storehouse {

    private Map<String, Integer> product;
    private Map<String, Integer> productstocks;

    public Storehouse() {

        this.product = new HashMap<String, Integer>();
        this.productstocks = new HashMap<String, Integer>();
    }

    public void addProduct(String product, int price, int stock) {

        this.product.put(product, price);
        this.productstocks.put(product, stock);

    }

    public int price(String product) {
        if (this.product.containsKey(product)) {
            return this.product.get(product);
        } else {
            return -99;
        }

    }

    public int stock(String product) {
        if (this.productstocks.containsKey(product)) {
            return this.productstocks.get(product);
        } else {
            return 0;
        }

    }

    public boolean take(String product){
        for(String p : this.productstocks.keySet()){
            if(p.equals(product)){
                if(this.stock(p) > 0){
                    this.productstocks.put(p, this.stock(p) - 1);
                    return true;
                }
            }
        }
        return false;
    }

    public Set<String> products(){
        Set<String> products = new HashSet<String>();
        for(String s : this.product.keySet()){
            products.add(s);
        }
        return products;
    }

}
