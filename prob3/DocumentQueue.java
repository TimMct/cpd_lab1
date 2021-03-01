package prob3;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

import static java.lang.Thread.sleep;

public class DocumentQueue {

    public Queue<Document> queue = new ConcurrentLinkedQueue<Document>();
    private static int nr = 0;

    public synchronized void elaborateDoc(int id, Document doc){
        try{
            System.out.println("Clerk#"+id+" elaborated "+doc.getName());
            queue.add(doc);
            nr++;
            sleep(doc.getTime2Elaborate()*1000);
        }catch(InterruptedException e){
            System.out.println(e.getMessage());
        }
    }


    public Document printDoc(){
        Document currentDoc = queue.poll();
        return currentDoc;
    }


}
