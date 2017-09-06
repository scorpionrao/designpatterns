package behavioral.state.examplebook;

public abstract class ElectronicEquipment {

    State state;

    public ElectronicEquipment(State state) {
        this.state = state;
    }

    void setState(State state) {
        this.state = state;
    }

    /* State pattern    - Context behavior depends on current state. Client specifies beginning state */
    /* Strategy pattern - Context behavior depends on client setting. Client specifies strategy at server load time */
    void request() {
        this.state.handle(this);
    }
}
