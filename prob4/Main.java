package prob4;

public class Main {

    public static void main(String[] args) {
        String commonString = "This is the string...";

        Thread lr = new Thread(new Left2Right(new StringWrapper(commonString)));
        Thread rl = new Thread(new Right2Left(new StringWrapper(commonString)));

        lr.start();
        rl.start();

    }


}
