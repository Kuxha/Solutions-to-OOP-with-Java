package containers;

public class ProductContainer extends Container {

    private String name;

    public ProductContainer(String productName, double capacity) {
        super(capacity);
        name = productName;
    }

    public String getName() {

        return name;

    }

    public void setName(String newName) {

        name = newName;
    }
    
    public String toString(){
    
    
    return getName() + ": " + super.toString();
    }

}
