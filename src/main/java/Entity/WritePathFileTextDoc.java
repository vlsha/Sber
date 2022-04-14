package Entity;

import java.nio.file.Files;
import java.nio.file.Path;

public class WritePathFileTextDoc {

    private String pathFile;
    private String textFile;

    public WritePathFileTextDoc(String pathFile, String textFile) {
        this.pathFile = pathFile;
        this.textFile = textFile;
    }

    public void writePathFile(){
        try {
            Files.writeString(Path.of(pathFile), textFile);

        } catch (Exception e){
            System.out.println(e);
        }
    }
}
