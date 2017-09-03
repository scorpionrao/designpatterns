package behavioral.command;

public class ReceiverOrServerOrDocument implements IDomainCommandDependencyAtClassLevel {

    String name;

    ReceiverOrServerOrDocument(String name) {
        this.name = name;
    }

    public void performUndo(){
        System.out.println("Undo performed");
    }

    public void performRedo(){
        System.out.println("Redo performed");
    }

    public void performOpen() {
        System.out.println("Open performed");
    }

    public void center() {
        System.out.println("Center performed");
    }

    public void normalSize() {
        System.out.println("Normal size transformation performed");
    }

}
