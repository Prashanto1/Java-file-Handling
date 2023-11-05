package Writing;

import java.io.OutputStreamWriter;
import java.io.IOException;
public class WritingOnConsole {
    public static void main(String[] args) {
        try(OutputStreamWriter osw = new OutputStreamWriter(System.out)){
       osw.write("Hello world");
       osw.write(96);
       osw.write(10);
       osw.write('A');
       osw.write('\n');
       char[] arr = "hello world".toCharArray();
       osw.write(arr);
      // osw.write(🧑‍💻);
     } catch(IOException e){
       System.out.println(e.getMessage());
     }
    }
}
