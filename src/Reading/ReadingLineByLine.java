package Reading;

import java.io.*;
public class ReadingLineByLine {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new FileReader("src\\Reading\\note.txt"))){
       while(br.ready()){
        System.out.println(br.readLine());
       }
     } catch(IOException e){
       System.out.println(e.getMessage());
     }
    }
}
