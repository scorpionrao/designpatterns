package creational.builder.examplebook;

public class Car implements IBuilder {

    private Product product = new Product();

    public void withBody() {
        product.add("Car Body");
    }

    public void withWheels() {
        product.add("Car Wheels");
    }

    public void withHeadLights() {
        product.add("Car Head Lights");
    }

    public Product getProduct() {
        return product;
    }
}
