package creational.abstractfactory;

public class ConcreteProduct2ForFactory2 extends AbstractProduct2 {

    private ConcreteProduct2ForFactory2() {}

    public static ConcreteProduct2ForFactory2 createUsingFactoryMethod() {
        return new ConcreteProduct2ForFactory2();
    }
}
