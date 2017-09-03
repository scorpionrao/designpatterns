package creational.factorymethod.structure;

public abstract class Creator {

    Product product;

    abstract Product factoryMethod();

    void anOperation() {
        this.product = factoryMethod();
    }
}
