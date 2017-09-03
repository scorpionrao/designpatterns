package creational.factorymethod.generics;

/** How to instantiate a Bar in Generics<Bar> using parameter-less constructor */
public class Generic<T> {

    Class<T> clazz;

    Generic(Class<T> clazz) {
        this.clazz = clazz;
    }

    public T factoryMethod() throws InstantiationException, IllegalAccessException {
        return clazz.newInstance();
    }

    public static void main(String[] args) throws IllegalAccessException, InstantiationException {
        Generic<Bar> generic = new Generic<Bar>(Bar.class);
        // This creates an in-memory object without filling the instances variables of Bar to be retrieved from DB.
        generic.factoryMethod();
    }
}
