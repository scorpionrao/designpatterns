package creational.builder;

public class Product {
    private int wheels;
    private String color;

    public Product() {
    }

    public String getColor() {
        return color;
    }

    public void setColor(final String color) {
        this.color = color;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(final int wheels) {
        this.wheels = wheels;
    }

    @Override
    public String toString() {
        return "Product [wheels = " + wheels + ", color = " + color + "]";
    }
}