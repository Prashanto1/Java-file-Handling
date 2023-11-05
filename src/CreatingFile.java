import java.io.File;
import java.io.IOException;

public class CreatingFile {
    public static void main(String[] args) {
        try{
            File fo = new File("src/new-file.txt");
            fo.createNewFile();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }


    }
}
