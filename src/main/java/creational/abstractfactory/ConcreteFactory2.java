package creational.abstractfactory;

/** Only single instance of this class should exist in runtime. Implement this as Singleton pattern */
class ConcreteFactory2 extends AbstractFactory {
    AbstractProduct1 createProduct1() {
        return ConcreteProduct1ForFactory2.createUsingFactoryMethod();
    }

    AbstractProduct2 createProduct2() {
        return ConcreteProduct2ForFactory2.createUsingFactoryMethod();
    }
}
