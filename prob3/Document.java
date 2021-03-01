package prob3;

public class Document {

    private String name;
    private int time2Elaborate;

    public Document(String name, int time2Elaborate) {
        this.name = name;
        this.time2Elaborate = time2Elaborate;
    }

    public String getName() {
        return name;
    }

    public int getTime2Elaborate() {
        return time2Elaborate;
    }
}
