package creational.abstractfactory.mazeexample;

import creational.maze.Door;
import creational.maze.Room;

public class DoorNeedingSpell extends Door {
    public DoorNeedingSpell(Room room1, Room room2) {
        super(room1, room2);
    }
}
