package creational.maze;

public class MazeGame {

    /**
     * Changing layout means changing this method
     * Not conducive to add new components
     * @return
     */

    /**
    FACTORY METHOD
     - remove constructor calls and add methods to create components.
     - override create components in sub classes.
     ABSTRACT FACTORY
     - createMaze(Object) - Object has the knowledge to create components.
     - pass in new objects.
     BUILDER
     - createMaze(Object), if Object (builder) has complete knowledge of building maze itself,
     - use inheritance to change parts of maze or way maze is built.
     PROTOTYPE
     - createMaze(roomPrototype, wallPrototype, doorPrototype)
     - copy prototype and add to the maze.
     - send different prototypes and create different mazes.
     SINGLETON
     - ensures there is only one maze per game.
     */
    Maze createMaze() {

        Maze aMaze = new Maze();
        Room room1 = new Room(1);
        Room room2 = new Room(2);
        Door theDoor = new Door(room1, room2);

        aMaze.addRoom(room1);
        aMaze.addRoom(room2);

        room1.setSide(Direction.North, new Wall());
        room1.setSide(Direction.East, theDoor);
        room1.setSide(Direction.South, new Wall());
        room1.setSide(Direction.West, new Wall());

        room2.setSide(Direction.North, new Wall());
        room2.setSide(Direction.East, new Wall());
        room2.setSide(Direction.South, new Wall());
        room2.setSide(Direction.West, theDoor);

        return aMaze;
    }



}
