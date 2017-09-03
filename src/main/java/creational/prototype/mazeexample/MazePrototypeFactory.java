package creational.prototype.mazeexample;

import creational.abstractfactory.mazeexample.BombedMazeFactory;
import creational.abstractfactory.mazeexample.EnchantedRoom;
import creational.abstractfactory.mazeexample.MazeFactory;
import creational.abstractfactory.mazeexample.MazeGame;
import creational.abstractfactory.mazeexample.Spell;
import creational.maze.Door;
import creational.maze.Maze;
import creational.maze.Room;
import creational.maze.Wall;

public class MazePrototypeFactory extends MazeFactory implements Cloneable {

    private Maze _prototypeMaze;
    private Room _prototypeRoom;
    private Wall _prototypeWall;
    private Door _prototypeDoor;

    MazePrototypeFactory(Maze maze, Wall wall, Room room, Door door) {
        this._prototypeMaze = maze;
        this._prototypeWall = wall;
        this._prototypeRoom = room;
        this._prototypeDoor = door;
    }

    public Maze MakeMaze() throws CloneNotSupportedException{
        return this._prototypeMaze.clone();
    }

    public Wall MakeWall() throws CloneNotSupportedException{
        return this._prototypeWall.clone();
    }

    public Door MakeDoor(Room room1, Room room2) throws CloneNotSupportedException{
        Door door = this._prototypeDoor.clone();
        door.initialize(room1, room2);
        return door;
    }

    public static void main(String[] args) {
        Room room1 = new Room(1);
        Room room2 = new Room(2);
        MazePrototypeFactory factory = new MazePrototypeFactory(new Maze(), new Wall(), room1, new Door(room1, room2));
        Maze mazeGame = new MazeGame().createMaze(factory);

        Room room3 = new EnchantedRoom(1, new Spell());
        MazePrototypeFactory bombedMazeFactory = new MazePrototypeFactory(new Maze(),
                new BombedMazeFactory.BombedWall(),
                room3,
                new Door(room1, room2));

    }

}
