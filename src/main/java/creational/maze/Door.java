package creational.maze;

public class Door extends MapSite implements Cloneable {

    Room room1;
    Room room2;
    boolean _isOpen;

    public Door(Room room1, Room room2) {
        this.room1 = room1;
        this.room2 = room2;
    }

    public void initialize(Room room1, Room room2) {
        this.room1 = room1;
        this.room2 = room2;
    }

    void enter() {

    }

    boolean isOpen() {
        return _isOpen;
    }
    void setOpen(boolean isOpen) {
        this._isOpen = isOpen;
    }

    public Door clone() throws CloneNotSupportedException{
        return (Door) super.clone();
    }
}
