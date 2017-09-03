package creational.builder.examplebook;

public interface IBuilder {
    void withBody();
    void withWheels();
    void withHeadLights();
    Product getProduct();
}
