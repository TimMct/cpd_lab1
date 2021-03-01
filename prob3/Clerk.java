package prob3;

import java.util.List;

import static java.lang.Thread.sleep;

public class Clerk implements Runnable{

    private DocumentQueue docs;
    private int pause;
    private List<Document> docs2Elaborate;
    private int id;


    public Clerk(int id, List<Document> docs2Elaborate, DocumentQueue docs) {
        this.id = id;
        this.docs2Elaborate = docs2Elaborate;
        this.docs = docs;
    }

    @Override
    public void run() {
        for(Document tempDoc : this.docs2Elaborate){
            docs.elaborateDoc(id, tempDoc);
        }
    }
}
