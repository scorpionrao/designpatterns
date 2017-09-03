package creational.factorymethod.examplebook;

public class AnimalImplementors {

    static class Duck implements IAnimal {

        public void speak() {
            System.out.println("Pack-pack");
        }
    }

    static class Tiger implements IAnimal {

        public void speak() {
            System.out.println("Roar-roar");
        }
    }
}
