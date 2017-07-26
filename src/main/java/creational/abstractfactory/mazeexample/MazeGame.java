package creational.abstractfactory.mazeexample;

import creational.maze.Direction;
import creational.maze.Door;
import creational.maze.Maze;
import creational.maze.Room;

public class MazeGame {

    Maze createMaze(MazeFactory mazeFactory) {
        Maze aMaze = mazeFactory.MakeMaze();
        Room room1 = mazeFactory.MakeRoom(1);
        Room room2 = mazeFactory.MakeRoom(2);
        Door theDoor = mazeFactory.MakeDoor(room1, room2);

        aMaze.addRoom(room1);
        aMaze.addRoom(room2);

        room1.setSide(Direction.North, mazeFactory.MakeWall());
        room1.setSide(Direction.East, theDoor);
        room1.setSide(Direction.South, mazeFactory.MakeWall());
        room1.setSide(Direction.West, mazeFactory.MakeWall());

        room2.setSide(Direction.North, mazeFactory.MakeWall());
        room2.setSide(Direction.East, mazeFactory.MakeWall());
        room2.setSide(Direction.South, mazeFactory.MakeWall());
        room2.setSide(Direction.West, theDoor);

        return aMaze;
    }

    public static void main(String[] args) {
        Maze maze1 = new MazeGame().createMaze(new MazeFactory());
        Maze maze2 = new MazeGame().createMaze(new EnchantedMazeFactory());
        Maze maze3 = new MazeGame().createMaze(new BombedMazeFactory());
    }
}
