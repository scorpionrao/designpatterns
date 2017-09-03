package creational.prototype.examplebook;

public class Nano extends BasicCar {

    public String modelName;

    public Nano(String modelName) {
        this.modelName = modelName;
    }

    @Override
    public BasicCar clone() throws CloneNotSupportedException {
        return (Nano) super.clone();
    }
}
