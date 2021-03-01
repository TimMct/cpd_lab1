package prob3;

import static java.lang.Thread.sleep;

public class Printer implements Runnable{

    Documents docs;


    public Printer(Documents docs) {
        this.docs = docs;
    }

    @Override
    public void run() {

//        try {
//            sleep(10000);
//        }catch (InterruptedException e) {
//        }


        //aici trebuie while
        while(true){
            if(!docs.queue.isEmpty()) {
                System.out.println("Printing doc: " + docs.printDoc());
            }
        }
    }
}
