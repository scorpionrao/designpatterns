package creational.factorymethod.examplebook;

public abstract class IAnimalFactory {

    public abstract IAnimal getAnimal(String type) throws Exception;
}
