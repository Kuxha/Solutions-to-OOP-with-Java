
package reader.criteria;

public class LengthAtLeast implements Criterion {

    private int min;

    public LengthAtLeast(int min) {
        this.min = min;
    }
    
    @Override
    public boolean complies(String line) {
        if (line.isEmpty()) {
            return false;
        } 
      if(line.length() < this.min)
          return false;
      return true;
    }
    
}
