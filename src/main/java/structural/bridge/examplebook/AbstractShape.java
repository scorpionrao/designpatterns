package structural.bridge.examplebook;

public abstract class AbstractShape {

    IColor color;

    AbstractShape(IColor color) {
        this.color = color;
    }

    // use implementation specific for color
    abstract void drawShape();
    // use abstraction specific for altering shape
    abstract void modifyShape(int increment);
}
