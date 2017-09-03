package creational.factorymethod.motivation;

public class MyApplication extends Application {
    Product createProduct() {
        return new MyProduct();
    }

    Product createProduct(int productIdentifer) {
        if(productIdentifer == 0) {
            return new SpecialProduct();
        } else {
            return createProduct();
        }
    }

    void newProduct() {

    }

    void openProduct() {

    }
}
