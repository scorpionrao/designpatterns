package creational.maze;

public class Door extends MapSite {

    Room room1;
    Room room2;
    boolean _isOpen;

    public Door(Room room1, Room room2) {
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
}
