package behavioral.memento.examplebook;

public class Memento {

    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return this.state;
    }

    public static void main(String[] args) {
        Originator originator = new Originator();
        originator.setState("First state");

        // holding old state
        Caretaker caretaker = new Caretaker();
        caretaker.setMemento(originator.createMemento());

        // changing state
        originator.setState("Second state");

        // restore saved state
        originator.revert(caretaker.getMemento());
    }
}
