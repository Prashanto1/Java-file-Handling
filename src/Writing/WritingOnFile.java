package Writing;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WritingOnFile {
    public static void main(String[] args) {
        try (BufferedWriter br = new BufferedWriter(new FileWriter("src/Writing/note1.txt"))) {
            br.write("Hare krishna");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
