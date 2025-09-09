package Exception;

import java.io.*;

public class TryWithResourcesExample {
    public static void main(String[] args) {
        // Try-with-resources ensures automatic closing
        try (BufferedReader br = new BufferedReader(new FileReader("info.txt"))) {
            String firstLine = br.readLine();
            System.out.println("First line: " + firstLine);
        } catch (IOException e) {
            System.out.println("Error reading file");
        }
    }
}
