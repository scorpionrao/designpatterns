package creational.abstractfactory.mazeexample;

import creational.maze.Door;
import creational.maze.Room;

public class EnchantedRoom extends Room {
    public EnchantedRoom(int num, Spell spell) {
        super(num);
    }

    public Door MakeDoor(Room room1, Room room2) {
        return new DoorNeedingSpell(room1, room2);
    }
}
