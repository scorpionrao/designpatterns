package creational.maze;

public class Wall extends MapSite implements Cloneable{
    void enter() {
        System.out.println("Hurt your nose");
    }

    public Wall clone() throws CloneNotSupportedException {
        return (Wall) super.clone();
    }
}
