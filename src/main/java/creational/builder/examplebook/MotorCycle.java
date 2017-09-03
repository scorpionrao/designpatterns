package creational.builder.examplebook;

public class MotorCycle implements IBuilder {

    private Product product = new Product();

    public void withBody() {
        product.add("MotorCycle Body");
    }

    public void withWheels() {
        product.add("MotorCycle Wheels");
    }

    public void withHeadLights() {
        product.add("MotorCycle Head Lights");
    }

    public Product getProduct() {
        return product;
    }
}
