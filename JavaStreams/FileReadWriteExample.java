package JavaStreams;

import java.io.*;

public class FileReadWriteExample {
    public static void main(String[] args) {
        File sourceFile = new File("source.txt");
        File destFile = new File("destination.txt");

        if (!sourceFile.exists()) {
            System.out.println("Source file does not exist!");
            return;
        }

        try (FileInputStream fis = new FileInputStream(sourceFile);
             FileOutputStream fos = new FileOutputStream(destFile)) {

            int b;
            while ((b = fis.read()) != -1) {
                fos.write(b);
            }
            System.out.println("File copied successfully!");
        } catch (IOException e) {
            System.out.println("Error occurred: " + e.getMessage());
        }
    }
}
