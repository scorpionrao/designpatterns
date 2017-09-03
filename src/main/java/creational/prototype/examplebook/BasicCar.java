package creational.prototype.examplebook;

import java.util.Random;

public abstract class BasicCar implements Cloneable {

    public String modelName;
    public int price;

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public static int setPrice() {
        return new Random().nextInt(100000);
    }

    public BasicCar clone() throws CloneNotSupportedException {
        return (BasicCar) super.clone();
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        BasicCar nano_base = new Nano("Green Nano");
        nano_base.price = 100000;

        BasicCar bc1 = nano_base.clone();
        bc1.price = nano_base.price + BasicCar.setPrice();
        System.out.println("Car is: " + bc1.modelName + " and it's price is " + bc1.price);

        BasicCar ford_basic = new Ford("Ford Yellow");
        ford_basic.price = 500000;

        BasicCar bc2 = ford_basic.clone();
        bc2.price = ford_basic.price + BasicCar.setPrice();
        System.out.println("Car is: " + bc2.modelName + " and it's price is " + bc2.price);
    }
}
