package creational.abstractfactory;

public class ConcreteProduct2ForFactory1 extends AbstractProduct2 {

    private ConcreteProduct2ForFactory1() {}

    public static ConcreteProduct2ForFactory1 createUsingFactoryMethod() {
        return new ConcreteProduct2ForFactory1();
    }
}
