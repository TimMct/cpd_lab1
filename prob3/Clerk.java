package prob3;

import static java.lang.Thread.sleep;

public class Clerk implements Runnable{

    private Documents docs;
    private int pause;
    private int id;


    public Clerk(int id, int pause, Documents docs) {
        this.id = id;
        this.pause = pause;
        this.docs = docs;
    }

    @Override
    public void run() {


        try {
            docs.elaborateDoc("Clerk"+id);

            sleep(pause*1000);
        }catch (InterruptedException e){
            System.out.println(e.getMessage());
        }


    }
}
