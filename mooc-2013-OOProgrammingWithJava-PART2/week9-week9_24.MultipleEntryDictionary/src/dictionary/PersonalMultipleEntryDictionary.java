package dictionary;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PersonalMultipleEntryDictionary implements MultipleEntryDictionary {

    private Map<String, Set<String>> translations;

    public PersonalMultipleEntryDictionary() {
        this.translations = new HashMap<String, Set<String>>();

    }

    public void add(String word, String entry) {

        if (!this.translations.containsKey(word)) {

            this.translations.put(word, new HashSet<String>());

        }

        this.translations.get(word).add(entry);

    }

    public Set<String> translate(String word) {
        try {
            return this.translations.get(word);
        } catch (Exception e) {
            return null;
        }
    }

    public void remove(String word) {
        try {
            this.translations.remove(word);
        } catch (Exception e) {

        }

    }
}
