package prob3;

import static java.lang.Thread.sleep;

public class Printer implements Runnable{

    DocumentQueue docs;

    public Printer(DocumentQueue docs) {
        this.docs = docs;
    }

    @Override
    public void run() {
        Document dummyDoc;
        while(true){
            if(!docs.queue.isEmpty()) {
                dummyDoc = docs.printDoc();
                System.out.println("Printing " + dummyDoc.getName() + " takes "+dummyDoc.getTime2Elaborate()+" sec.");
            }
        }
    }
}
