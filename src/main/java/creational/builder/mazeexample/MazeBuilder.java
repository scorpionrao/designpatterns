package creational.builder.mazeexample;

import creational.maze.Maze;
import creational.maze.Room;

public abstract class MazeBuilder {

    /** variety where all are void methods. Instead of build() --> getMaze() */
    abstract MazeBuilder BuildRoom(int roomNumber);
    abstract MazeBuilder BuildDoor(Room roomFrom, Room roomTo);
    Maze getMaze() {
        throw new UnsupportedOperationException();
    }
}
