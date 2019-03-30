
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FileManager {

    private File file;

    public List<String> read(String file) throws FileNotFoundException {

        this.file = new File(file);

        List<String> lines = new ArrayList<String>();
        Scanner reader = new Scanner(this.file);
        while (reader.hasNextLine()) {

            lines.add(reader.nextLine());

        }
        return lines;
    }

    public void save(String file, String text) throws IOException {
     FileWriter writer = new FileWriter(file);
     writer.write(text);
     writer.close();
    
    }

    public void save(String file, List<String> texts) throws IOException {
    FileWriter writer = new FileWriter(file,true);
    for(String text:texts){
    
    
    writer.write(text);
    writer.write("\n");
    
    }
    writer.close();
    
    }
}
