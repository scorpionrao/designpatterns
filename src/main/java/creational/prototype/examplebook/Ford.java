package creational.prototype.examplebook;

public class Ford extends BasicCar {

    public String modelName;

    public Ford(String modelName) {
        this.modelName = modelName;
    }

    @Override
    public BasicCar clone() throws CloneNotSupportedException {
        return (Ford) super.clone();
    }
}
