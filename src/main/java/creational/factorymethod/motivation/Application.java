package creational.factorymethod.motivation;

import java.util.ArrayList;
import java.util.List;

public abstract class Application {

    List<Product> productList = new ArrayList<Product>();

    abstract Product createProduct();

    void newProduct() {
        Product product = createProduct();
        productList.add(product);
        product.open();
    }

    abstract void openProduct();
}
