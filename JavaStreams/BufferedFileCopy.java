package JavaStreams;

import java.io.*;

public class BufferedFileCopy {
    public static void main(String[] args) {
        File source = new File("largefile.dat");
        File dest = new File("largefile_copy.dat");

        // Using Buffered Streams
        long startTime = System.nanoTime();
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(source));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(dest))) {

            byte[] buffer = new byte[4096];
            int bytesRead;
            while ((bytesRead = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, bytesRead);
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        long endTime = System.nanoTime();
        System.out.println("Buffered copy time: " + (endTime - startTime) + " ns");
    }
}

