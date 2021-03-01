package prob2;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Reader implements Runnable{

    private int id;
    private String fileName;

    public Reader(int id, String fileName) {
        this.id = id;
        this.fileName = fileName;
    }

    @Override
    public synchronized void run() {
        try(FileReader fileReader = new FileReader(fileName)) {
            int ch;
            String tabs;
            do{
                tabs = "";
                ch = fileReader.read();

                //ca sa le diferentiez vizual pun tab-uri in fata print
                for(int i = 0; i < id; i++){
                    tabs+="\t";
//                    System.out.print("\t");
                }

                System.out.println(tabs+"Reader#"+id+" read char \'"+(char)ch+"\'");
            }while(ch != -1);

            fileReader.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
