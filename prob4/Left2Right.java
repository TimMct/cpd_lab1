package prob4;

import static java.lang.Thread.sleep;

public class Left2Right implements Runnable {

    private StringWrapper stringWrapper;

    public Left2Right(StringWrapper stringWrapper) {
        this.stringWrapper = stringWrapper;
    }

    @Override
    public void run() {
        while(true){
            try{
                char c = stringWrapper.read2Right();
                if(c == 0)
                    break;
                System.out.println("Left 2 right: "+c);
                sleep(1000);
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
    }
}
