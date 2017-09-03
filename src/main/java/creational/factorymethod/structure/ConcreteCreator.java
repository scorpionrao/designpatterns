package creational.factorymethod.structure;

public class ConcreteCreator extends Creator {

    Product factoryMethod() {
        return new ConcreteProduct();
    }

    void anOperation() {

    }
}
