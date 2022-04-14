package Entity;

import java.io.File;

public class SearchFile {

    private String nameFile;
    private String pathFile;

    public SearchFile(String nameFile, String pathFile) {
        this.nameFile = nameFile;
        this.pathFile = pathFile;
    }

    public String SearchFile(){
        File dir = new File(pathFile);

        String[] flist = dir.list();
        if(flist == null){
            System.out.println("Empty directory");
        }
        else {
            for (String filename : flist) {
                if (filename.equalsIgnoreCase(nameFile)) {
                    System.out.println(filename + " found");
                    return pathFile + filename;
                }
            }
        }
        return "";
    }
}
