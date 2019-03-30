package reader.criteria;

public class EndsWithQuestionOrExclamationMark implements Criterion {

    @Override
    public boolean complies(String line) {
        if (line.isEmpty()) {
            return false;
        } 
        int n = line.length()-1;
        if (line.charAt(n) == '?' || line.charAt(n) == '!') {

            return true;
        }
        return false;
    }

}
