package creational.factorymethod.examplebook;

public class ConcreteFactory extends IAnimalFactory {

    public IAnimal getAnimal(String type) throws Exception {
        switch (type) {
            case "Duck":
                return new AnimalImplementors.Duck();
            case "Tiger":
                return new AnimalImplementors.Tiger();
            default:
                throw new Exception("Animal type : " + type + " cannot be instantiated");
        }
    }

    public static void main(String[] args) throws Exception {

        IAnimalFactory animalFactory = new ConcreteFactory();

        IAnimal duckType = animalFactory.getAnimal("Duck");
        duckType.speak();

        IAnimal tigerType = animalFactory.getAnimal("Tiger");
        tigerType.speak();

        IAnimal lionType = animalFactory.getAnimal("Lion");
        lionType.speak();
    }
}
