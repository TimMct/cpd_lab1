package prob3;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class Documents {

    public Queue<String> queue = new ConcurrentLinkedQueue<String>();
    private static int nr = 0;

    public synchronized void elaborateDoc(String name){

//        System.out.println("before "+name);
        System.out.println(name+" elaborated a new doc.");
        queue.add(name);
        nr++;
//        System.out.println("after "+name);
//        try{
//            wait();
//        }catch(Exception e){
//            System.out.println(e.getMessage());
//        }
//        notifyAll();
    }


    public String printDoc(){
        String firstDoc = queue.poll();
//
//        try{
//            wait();
//        }catch(Exception e){
//            System.out.println(e.getMessage());
//        }
//        notifyAll();

        return firstDoc;
    }


}
