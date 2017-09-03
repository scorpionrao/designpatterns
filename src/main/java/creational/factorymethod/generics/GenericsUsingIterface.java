package creational.factorymethod.generics;

public class GenericsUsingIterface<T> {

    Factory<T> _factory;

    GenericsUsingIterface(Factory factory) {
        this._factory = factory;
    }

    public T factory() {
        return _factory.factory();
    }

    public static void main(String[] args) {
        Bar bar = new Bar();
        GenericsUsingIterface<Bar> genericsUsingIterface = new GenericsUsingIterface<Bar>(bar);
        genericsUsingIterface.factory();
    }
}
