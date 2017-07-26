package creational.abstractfactory;

/** Introducing new product is tedious - requires extending this interface and all sub classes implementing it */
public abstract class AbstractFactory {

    abstract AbstractProduct1 createProduct1();
    abstract AbstractProduct2 createProduct2();
}
