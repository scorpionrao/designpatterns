package creational.builder.mazeexample;

import creational.maze.Maze;
import creational.maze.Room;

public class MazeGame {

    Maze createMaze(MazeBuilder builder) {
        return builder.BuildRoom(1)
                .BuildRoom(2)
                .BuildDoor(new Room(1), new Room(2))
                .getMaze();
    }

    Maze createComplexMaze(MazeBuilder builder) {
        return builder.BuildRoom(1)
                .BuildRoom(1001)
                .BuildDoor(new Room(1), new Room(1001))
                .getMaze();
    }
}
