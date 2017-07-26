package creational.maze;

public abstract class MapSite {
    /** Triggered on concrete class - Door, Wall or Room, when player has to move */
    abstract void enter();
}
