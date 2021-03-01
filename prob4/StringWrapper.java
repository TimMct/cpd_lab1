package prob4;

public class StringWrapper {

    private String theString;

    private int pointRight;
    private int pointLeft;


    public StringWrapper(String theString) {
        this.theString = theString;
        this.pointLeft = 0;
        this.pointRight = theString.length() - 1;
    }

    public char read2Left(){
        if(pointLeft < theString.length())
            return theString.charAt(pointLeft++);
        else
            return 0;
    }

    public char read2Right(){
        if(pointRight >= 0)
            return theString.charAt(pointRight--);
        else
            return 0;
    }


}
