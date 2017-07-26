package creational.abstractfactory.mazeexample;

import creational.maze.Door;
import creational.maze.Maze;
import creational.maze.Room;
import creational.maze.Wall;

public class MazeFactory {

    Maze MakeMaze () {
        return new Maze();
    }
    Wall MakeWall () {
        return new Wall();
    }
    Room MakeRoom (int num) {
        return new Room(num);
    }
    Door MakeDoor (Room room1, Room room2) {
        return new Door(room1, room2);
    }
}
