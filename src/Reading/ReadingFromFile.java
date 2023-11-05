package Reading;

import java.io.FileReader;
import java.io.IOException;
public class ReadingFromFile {
    public static void main(String[] args) {
        try(FileReader fr = new FileReader("src\\Reading\\note.txt")){
       int letters = fr.read();
       while(fr.ready()){
         System.out.print( (char) letters);
         letters = fr.read();
      }
      // isr.close();
       System.out.println();
     } catch (IOException e){
       System.out.println(e.getMessage());
     }
    }
}
