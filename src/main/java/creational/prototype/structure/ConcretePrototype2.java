package creational.prototype.structure;

public class ConcretePrototype2 extends Prototype {
    Prototype prototype;

    protected Prototype clone() {
        return prototype;
    }
}
