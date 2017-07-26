package creational.builder;

public class ConcreteBuilder1 implements IProductBuilder {

    private Product product;

    ConcreteBuilder1() {
        this.product = new Product();
    }

    public IProductBuilder setWheels(int wheels) {
        this.product.setWheels(wheels);
        return this;
    }

    public IProductBuilder setColor(String color) {
        this.product.setColor(color);
        return this;
    }

    public Product build() {
        return this.product;
    }
}
