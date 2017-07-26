package creational.builder;

import java.util.List;

public class ManagingDirector1 {

    private List<IProductBuilder> builders;

    public ManagingDirector1(final List<IProductBuilder> builders) {
        this.builders = builders;
    }

    public Product createUsingBuilderPattern() {
        Product product =  builders.get(0).setWheels(4)
                .setColor("Red")
                .build();

        // I can do more with other builders and build a complex object

        return product;
    }
}
