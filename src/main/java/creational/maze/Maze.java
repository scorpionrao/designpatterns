package creational.maze;

import java.util.ArrayList;
import java.util.List;

public class Maze implements Cloneable {

    List<Room> rooms = new ArrayList();

    Room roomNumber(int roomNumber) {
        // the search based on room number could be - linear search, binary search, hash table, or a simple array.
        return null;
    }

    public void addRoom(Room room) {

    }

    public Maze clone() throws CloneNotSupportedException {
        return (Maze) super.clone();
    }
}
