package reader.criteria;

public class Both implements Criterion {

    private Criterion one;
    private Criterion two;

    public Both(Criterion one, Criterion two) {
        this.one = one;
        this.two = two;
    }
    
    
    @Override
    public boolean complies(String line) {
      
        if (line.isEmpty()) {
            return false;
        } 
        if(one.complies(line) && two.complies(line))
            return true;
        return false;
      
    }
    
}
