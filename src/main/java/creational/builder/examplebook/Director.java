package creational.builder.examplebook;

public class Director {

    IBuilder myBuilder;
    public void construct(IBuilder iBuilder) {
        myBuilder = iBuilder;
        myBuilder.withBody();
        myBuilder.withWheels();
        myBuilder.withHeadLights();
    }

    public static void main(String[] args) {
        System.out.println("Builder Pattern");
        Director director = new Director();
        IBuilder carBuilder = new Car();
        IBuilder motorBuilder = new MotorCycle();

        director.construct(carBuilder);
        Product p1 = carBuilder.getProduct();
        p1.show();

        director.construct(motorBuilder);
        Product p2 = motorBuilder.getProduct();
        p2.show();
    }
}
