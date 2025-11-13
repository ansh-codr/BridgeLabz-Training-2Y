package assignment16;

import java.io.File;
import java.io.IOException;

public class FileHandler {
    public FileHandler(String fileName) throws IOException {
        File file = new File(fileName);
        if (!file.exists()) {
            throw new IOException("File not found: " + fileName);
        }
        System.out.println("File loaded successfully");
    }
}
