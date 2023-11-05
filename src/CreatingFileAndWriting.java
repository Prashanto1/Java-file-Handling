import Writing.WritingOnFile;

import java.io.File;
import java.io.IOException;
import java.io.FileWriter;

public class CreatingFileAndWriting {
    public static void main(String[] args) {

        // Creating new file
        try{
            File fo = new File("src/new-file.txt");
            fo.createNewFile();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }

        //Writing On that File
        try(FileWriter fw = new FileWriter("src/new-file.txt", true)){
       fw.write("Hello world \n");
       fw.write("im prashant here is my name");

     } catch(IOException e){
       System.out.println(e.getMessage());
     }
    }
}
