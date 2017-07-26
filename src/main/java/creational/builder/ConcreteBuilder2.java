package creational.builder;

public class ConcreteBuilder2 implements IProductBuilder {

    private Product product;

    ConcreteBuilder2() {
        this.product = new Product();
    }

    public IProductBuilder setWheels(int wheels) {
        this.product.setWheels(wheels * 2);
        return this;
    }

    public IProductBuilder setColor(String color) {
        this.product.setColor("Bright " + color);
        return this;
    }

    public Product build() {
        return this.product;
    }
}
