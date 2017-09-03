package structural.bridge.examplebook;

public class BridgePatternExample {

    public static void main(String[] args) {

        IColor greenColor = new GreenColor();
        AbstractShape triangle = new Triangle(1, greenColor);
        triangle.drawShape();

        IColor redColor = new RedColor();
        AbstractShape rectangle = new Rectangle(5, redColor);
        rectangle.drawShape();
    }
}
