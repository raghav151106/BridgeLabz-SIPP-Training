package JavaStreams;

import java.io.*;

public class ImageByteArrayExample {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("original.jpg");
             ByteArrayOutputStream baos = new ByteArrayOutputStream()) {

            byte[] buffer = new byte[1024];
            int bytesRead;

            // Read image to byte array
            while ((bytesRead = fis.read(buffer)) != -1) {
                baos.write(buffer, 0, bytesRead);
            }

            byte[] imageBytes = baos.toByteArray();

            // Write byte array to new file
            try (FileOutputStream fos = new FileOutputStream("copy.jpg")) {
                fos.write(imageBytes);
            }

            System.out.println("Image copied successfully!");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
