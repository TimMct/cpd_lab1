package prob3;

import java.time.Clock;
import java.util.ArrayList;
import java.util.List;

public class Main {


    private static int min = 1;
    private static int max = 5;

    public static List<Document> generateRandomDocs(int clerkId){
        List<Document> docs = new ArrayList<Document>();
        int size = (int) ((Math.random() * (max - min)) + min);
        for(int i = 0; i < size; i++){
            docs.add(new Document("Doc#"+i+" of clerk#"+clerkId, (int) ((Math.random() * (max - min)) + min)));
        }
        return docs;
    }

    public static void main(String[] args) {


        DocumentQueue docs = new DocumentQueue();
        Thread printer = new Thread(new Printer(docs));
        List<Thread> clerks = new ArrayList<Thread>();

        Thread timer = new Thread(new Tiktok());


        // creez 8 thread-uri cu timpi de asteptare random
        // si fiecare thread (clerk) are un numar random de documente de printat
        for(int i = 0; i < 8; i++){
            clerks.add(new Thread(new Clerk(i, generateRandomDocs(i), docs)));
        }

        timer.start();
        printer.start();
        for (Thread clerk : clerks) {
            clerk.start();
        }



    }
}
