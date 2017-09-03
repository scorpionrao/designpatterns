package creational.factorymethod.structure;

public class StandardCreator extends ConcreteCreator {

    Product product;

    StandardCreator(Product product) {
        this.product = product;
    }

    Product getProduct() {
        return product;
    }
}
