package creational.prototype.structure;

public class Client {

    Prototype _prototype;

    Client(Prototype _prototype) {
        this._prototype = _prototype;
    }

    protected Prototype clone() {
        return _prototype.clone();
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Prototype prototype = new ConcretePrototype1();
        System.out.println(new Client(prototype).clone());
    }
}
