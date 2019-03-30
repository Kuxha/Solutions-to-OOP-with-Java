
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Printer {

    private File file;

    public Printer(String filename) throws Exception {
        this.file = new File(filename);
    }

    public void printLinesWhichContain(String word) throws Exception {
        Scanner reader = new Scanner(this.file);

        while (reader.hasNextLine()) {

            String line = reader.nextLine();
            if (line.contains(word)) {
                System.out.println(line);
            }

        }
    }
}
