package creational.builder;

/**
 * The builder abstraction - hides the representation and internal structure of the product and assembly process
 */
public interface IProductBuilder {

    Product build();

    IProductBuilder setColor(final String color);

    IProductBuilder setWheels(final int wheels);
}
