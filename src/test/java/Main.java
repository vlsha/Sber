import Entity.CreateAndSaveTextDocument;
import Entity.SearchFile;
import Entity.WritePathFileTextDoc;

import java.io.IOException;

public class Main {

    public static void main(String[] args){
        CreateAndSaveTextDocument cstd = new CreateAndSaveTextDocument("val",
                "/home/vlsha/IdeaProjects/Sber/testDir", "txt");
        cstd.createAndSaveFiles();

        SearchFile sf = new SearchFile("val.txt","/home/vlsha/IdeaProjects/Sber/testDir/");
        System.out.println(sf.SearchFile());


        WritePathFileTextDoc wpftd = new WritePathFileTextDoc(sf.SearchFile(), sf.SearchFile());
        wpftd.writePathFile();
    }
}
