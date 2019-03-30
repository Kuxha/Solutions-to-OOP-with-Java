package reader.criteria;

import java.util.List;
import java.util.ArrayList;

public class AtLeastOne implements Criterion {

    private Criterion[] criteria;

    public AtLeastOne(Criterion... criterion) {
        this.criteria = criterion;
    }

    @Override
    public boolean complies(String line) {
        for (Criterion criterion : criteria) {
            if (criterion.complies(line)) {
                return true;
            }
        }

        return false;
    }

}
