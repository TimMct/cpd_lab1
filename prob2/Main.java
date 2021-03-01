package prob2;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

// pt reader si writer m-am inspirat de aici: https://stackabuse.com/reading-and-writing-files-in-java/


public class Main {

    public static String fileName = "theFile.txt";


    public static void main(String[] args) {
        try {
            File theFile = new File(fileName);
            theFile.createNewFile();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        List<Thread> readers = new ArrayList<Thread>();
        for(int i = 0; i < 4; i++){
            readers.add(new Thread(new Reader(i, fileName)));
        }
        Thread writer = new Thread(new Writer(fileName));

        writer.start();
        for(Thread reader : readers){
            reader.start();
        }


    }

}
