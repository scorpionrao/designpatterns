package creational.factorymethod.generics;

public class Bar implements Factory {
    Bar(){
        System.out.print("Constructing...");
    }

    public Bar factory() {
        return new Bar();
    }
}
