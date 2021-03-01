package prob4;

import static java.lang.Thread.sleep;

public class Right2Left implements Runnable{

    private StringWrapper stringWrapper;

    public Right2Left(StringWrapper stringWrapper) {
        this.stringWrapper = stringWrapper;
    }

    @Override
    public void run() {
        while(true){
            try{
                char c = stringWrapper.read2Left();
                if(c == 0)
                    break;
                System.out.println("\tRight 2 left: "+c);
                sleep(1000);
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
    }
}
