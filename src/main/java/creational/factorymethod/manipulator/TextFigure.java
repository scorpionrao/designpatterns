package creational.factorymethod.manipulator;

public class TextFigure extends Figure {
    Manipulator createManipulator() {
        return new TextManipulator();
    }
}
