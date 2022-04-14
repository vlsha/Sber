package Entity;

import java.io.File;

public class CreateAndSaveTextDocument {

    private String nameFile; //Имя файла
    private String pathFile;//Путь к файлу
    private String typeFile; //Тип файла

    public CreateAndSaveTextDocument(String nameFile, String pathFile, String typeFile) {
        this.nameFile = nameFile;
        this.pathFile = pathFile;
        this.typeFile = typeFile;
    }

    public void createAndSaveFiles(){
        try {
            File file = new File(pathFile + "/" + nameFile + "." + typeFile);
            file.createNewFile();
            System.out.println("Create file");

        } catch (Exception e){
            System.out.println(e);
        }
    }

    public String getNameFile() {
        return nameFile;
    }

    public void setNameFile(String nameFile) {
        this.nameFile = nameFile;
    }

    public String getPathFile() {
        return pathFile;
    }

    public void setPathFile(String pathFile) {
        this.pathFile = pathFile;
    }

    public String getTypeFile() {
        return typeFile;
    }

    public void setTypeFile(String typeFile) {
        this.typeFile = typeFile;
    }
}
