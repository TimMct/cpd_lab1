package prob2;

import java.io.FileWriter;
import java.io.IOException;

public class Writer implements Runnable{

    private String fileName;

    public Writer(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void run() {
        try(FileWriter fileWriter = new FileWriter(fileName)) {
            String fileContent = "This is a sample text.";
            fileWriter.write(fileContent);
            fileWriter.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
