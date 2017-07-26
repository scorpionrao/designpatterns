package creational.abstractfactory.mazeexample;

import creational.maze.Room;

/** Both Abstract Factory and Concrete Factory */
public class EnchantedMazeFactory extends MazeFactory {

    @Override
    Room MakeRoom(int num) {
        return new EnchantedRoom(num, castSpell());
    }

    Spell castSpell() {
        return new Spell();
    }
}
