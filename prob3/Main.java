package prob3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        int min = 1;//sec
        int max = 5;

        Documents docs = new Documents();
        Thread printer = new Thread(new Printer(docs));
        List<Thread> clerks = new ArrayList<Thread>();

        for(int i = 0; i < 8; i++){
            clerks.add(new Thread(new Clerk(i, (int) ((Math.random() * (max - min)) + min), docs)));
        }

        printer.start();
        for (Thread clerk : clerks) {
            clerk.start();
        }



    }
}
