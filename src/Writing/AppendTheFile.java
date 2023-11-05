package Writing;

import java.io.FileWriter;
import java.io.IOException;

public class AppendTheFile {
    public static void main(String[] args) {
        try(FileWriter fw = new FileWriter("src\\Writing\\note1.txt", true)){
       fw.write("Hello world \n");
       fw.write("im prashant here is my name");

     } catch(IOException e){
       System.out.println(e.getMessage());
     }

    }
}
// check the file after executing the program