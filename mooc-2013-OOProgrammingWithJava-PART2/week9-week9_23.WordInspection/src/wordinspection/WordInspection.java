package wordinspection;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WordInspection {

    private Scanner reader;
    private List<String> words;
    private final String vowels = "aeiouyäö";

    public WordInspection(File file) throws Exception {

        this.words = new ArrayList<String>();
        this.reader = new Scanner(file, "UTF-8");
          while (this.reader.hasNextLine()) {
            this.words.add(this.reader.nextLine());
        }
    }

    public int wordCount() throws FileNotFoundException {

        return this.words.size();
    }

    public List<String> wordsContainingZ() {

        ArrayList<String> reqStr = new ArrayList<String>();
        for (String word : this.words) {
            if (word.contains("z")) {
                reqStr.add(word);
            }
        }
        return reqStr;
    }

    public List<String> wordsEndingInL() {

        ArrayList<String> reqStr = new ArrayList<String>();
        for (String word : this.words) {

            if (word.endsWith("l")) {
                reqStr.add(word);
            }
        }
        return reqStr;

    }

    public List<String> palindromes() {

        ArrayList<String> reqStr = new ArrayList<String>();

        for (String word : this.words) {
            String reverse = "";
            for (int i = word.length() - 1; i >= 0; i--) {
                reverse = reverse + word.charAt(i);
            }
            
            if(reverse.equals(word))
                reqStr.add(word);

        }
        return reqStr;

    }
    
     public List<String> wordsWhichContainAllVowels(){
        List<String> returnedString = new ArrayList<String>();
        for(String word : words){
            if(containsAllVowels(word)){
                returnedString.add(word);
            }
        }
        return returnedString;
    }
    
    private boolean containsAllVowels(String word){
        for(char vowel : this.vowels.toCharArray()){
            if(!word.contains(""+vowel)){
                return false;
            }
        }
        return true;
    }

}
