package creational.abstractfactory;

/** Use Factory method pattern to create instances of this product  */
public class ConcreteProduct1ForFactory1 extends AbstractProduct1 {

    private ConcreteProduct1ForFactory1() {}

    public static ConcreteProduct1ForFactory1 createUsingFactoryMethod() {
        return new ConcreteProduct1ForFactory1();
    }
}
