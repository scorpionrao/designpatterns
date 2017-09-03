package structural.bridge.examplebook;

public class Triangle extends AbstractShape {

    int size;

    Triangle(int size, IColor color) {
        super(color);
        this.size = size;
    }

    // implementor specific. if implementor interface changes, this has to change
    void drawShape() {
        System.out.println("Drawing Triangle");
        this.color.addColor();
    }

    // abstraction specific.
    void modifyShape(int increment) {
        this.size = this.size * increment;
        drawShape();
    }
}
