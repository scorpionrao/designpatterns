package behavioral.memento.examplebook;

public class Originator {

    private String state;
    Memento memento;

    public void setState(String state) {
        this.state = state;
        System.out.println("State at present: " + state);
    }

    public Memento createMemento() {
        memento = new Memento(state);
        return memento;
    }

    // back to old state
    public void revert(Memento memento) {
        System.out.println("Restoring...");
        state = memento.getState();
        System.out.println("State after restoration: " + state);
    }
}
