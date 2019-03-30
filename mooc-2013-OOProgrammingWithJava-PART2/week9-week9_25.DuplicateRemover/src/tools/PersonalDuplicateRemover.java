package tools;

import java.util.HashSet;
import java.util.Set;

public class PersonalDuplicateRemover implements DuplicateRemover {

    private Set<String> character;
    private int duplicates;

    public PersonalDuplicateRemover() {

        this.character = new HashSet<String>();
        this.duplicates = 0;
    }

    public void add(String characterSring) {

        if (this.character.contains(characterSring)) {

            this.duplicates++;
        }

        this.character.add(characterSring);

    }

    public int getNumberOfDetectedDuplicates() {
        return this.duplicates;
    }

    public Set<String> getUniqueCharacterStrings() {

        return this.character;

    }

    public void empty() {

        this.character.clear();
        this.duplicates = 0;

    }
}
