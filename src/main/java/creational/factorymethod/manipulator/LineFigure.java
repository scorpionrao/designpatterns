package creational.factorymethod.manipulator;

public class LineFigure extends Figure {
    Manipulator createManipulator() {
        return new LineManipulator();
    }
}
