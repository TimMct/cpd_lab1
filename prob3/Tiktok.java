package prob3;

import static java.lang.Thread.sleep;

public class Tiktok implements Runnable {
    private static int time;
    @Override
    public void run() {
        while(true){
            try{
                System.out.println("time: "+time+" sec");
                time++;
                sleep(1000);
            }catch (InterruptedException e){
                System.out.println(e.getMessage());
            }
        }
    }
}
