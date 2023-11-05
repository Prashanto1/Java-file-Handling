package Reading;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class ReadingFromUserTyped {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
       System.out.println("you typed: "+ br.readLine());
     } catch(IOException e){
       System.out.println(e.getMessage());
     }
    }
}
