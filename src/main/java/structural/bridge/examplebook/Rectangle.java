package structural.bridge.examplebook;

public class Rectangle extends AbstractShape {

    int size;
    Rectangle(int size, IColor color) {
        super(color);
        this.size = size;
    }

    // implementation specific
    void drawShape() {
        System.out.println("Drawing Rect");
        this.color.addColor();
    }

    // abstraction specific
    void modifyShape(int increment) {
        this.size = this.size * increment;
        drawShape();
    }
}
