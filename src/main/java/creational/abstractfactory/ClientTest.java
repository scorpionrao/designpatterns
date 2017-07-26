package creational.abstractfactory;

import org.junit.Assert;
import org.junit.Test;

public class ClientTest {

    @Test
    public void testFactory1() {
        AbstractFactory factory = new ConcreteFactory1();

        AbstractProduct1 abstractProduct1 = factory.createProduct1();
        System.out.println(abstractProduct1.getClass().getSimpleName());
        Assert.assertTrue(abstractProduct1 instanceof ConcreteProduct1ForFactory1);

        AbstractProduct2 abstractProduct2 = factory.createProduct2();
        System.out.println(abstractProduct2.getClass().getSimpleName());
        Assert.assertTrue(abstractProduct2 instanceof ConcreteProduct2ForFactory1);
    }

    @Test
    public void testFactory2() {
        AbstractFactory factory = new ConcreteFactory2();

        AbstractProduct1 abstractProduct1 = factory.createProduct1();
        System.out.println(abstractProduct1.getClass().getSimpleName());
        Assert.assertTrue(abstractProduct1 instanceof ConcreteProduct1ForFactory2);

        AbstractProduct2 abstractProduct2 = factory.createProduct2();
        System.out.println(abstractProduct2.getClass().getSimpleName());
        Assert.assertTrue(abstractProduct2 instanceof ConcreteProduct2ForFactory2);
    }
}
