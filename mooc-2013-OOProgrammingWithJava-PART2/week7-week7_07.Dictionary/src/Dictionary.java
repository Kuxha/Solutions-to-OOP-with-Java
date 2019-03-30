
import java.util.ArrayList;
import java.util.HashMap;

public class Dictionary {

    private HashMap<String, String> word;

    public Dictionary() {

        this.word = new HashMap<String, String>();
    }

    public String translate(String word) {

        if (this.word.containsKey(word)) {
            return this.word.get(word);
        }

        return null;

    }

    public void add(String word, String translation) {

        this.word.put(word, translation);
    }
    
    public int amountOfWords(){
    
        return this.word.size();
    
    }
    
     public ArrayList<String> translationList() {
     ArrayList<String> words = new ArrayList<String>();
     
       for (String key: this.word.keySet()) {
            
           words.add(key + " = " + this.word.get(key));
            
        }
       return words;
     
     }
    
}
