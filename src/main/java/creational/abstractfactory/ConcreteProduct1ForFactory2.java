package creational.abstractfactory;

public class ConcreteProduct1ForFactory2 extends AbstractProduct1 {

    private ConcreteProduct1ForFactory2() {}

    public static ConcreteProduct1ForFactory2 createUsingFactoryMethod() {
        return new ConcreteProduct1ForFactory2();
    }
}
