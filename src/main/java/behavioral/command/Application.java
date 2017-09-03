package behavioral.command;

import java.util.ArrayList;
import java.util.List;

public class Application {

    List<ReceiverOrServerOrDocument> list = new ArrayList<>();

    String askUserForName() {
        System.out.println("Asking user for name");
        return "NewDocumentName";
    }

    void addDocument(ReceiverOrServerOrDocument receiverOrServerOrDocument) {
        System.out.println("Added document to application");
        list.add(receiverOrServerOrDocument);
    }
}
