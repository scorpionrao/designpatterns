package creational.abstractfactory.mazeexample;

import creational.maze.Room;
import creational.maze.Wall;

/** Both Abstract Factory and Concrete Factory */
public class BombedMazeFactory extends MazeFactory {

    @Override
    Room MakeRoom(int num) {
        return new RoomWithABomb(num);
    }

    Spell castSpell() {
        return new Spell();
    }

    @Override
    Wall MakeWall() {
        return new BombedWall();
    }

    public static class BombedWall extends Wall {

    }

    public class RoomWithABomb extends Room {

        public RoomWithABomb(int roomNumber) {
            super(roomNumber);
        }
    }
}
