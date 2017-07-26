package creational.abstractfactory;

public class Client {
    public static void main(String[] args) {
        new Client().processFactory(new ConcreteFactory1());
        new Client().processFactory(new ConcreteFactory2());
    }

    void processFactory(AbstractFactory factory) {
        AbstractProduct1 abstractProduct1 = factory.createProduct1();
        System.out.println("Product1 - " + abstractProduct1.getClass().getSimpleName());
        AbstractProduct2 abstractProduct2 = factory.createProduct2();
        System.out.println("Product2 - " + abstractProduct2.getClass().getSimpleName());
    }
}
