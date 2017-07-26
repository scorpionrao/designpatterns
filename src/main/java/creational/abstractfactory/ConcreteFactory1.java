package creational.abstractfactory;

/**
 * Only single instance of this class should exist in runtime.
 * Implement this as Singleton pattern
 **/

/**
 * Can be implemented using Prototype pattern
 * It can store products and clone them as required.
 **/

/**
 * A variation of Prototype approach is to initialize a collection of products instead of ConcreteFactory
 * to avoid subclassing to represent each combination of classes.
 */

/**
 * A scenario where there is a single abstraction for concrete products,
 * we can pass a parameter (class identifier, integer or string) in the createMethod(productIdentifier).
 * Unsafe - The client cannot make subclass level assumptions
 */
class ConcreteFactory1 extends AbstractFactory {

    // we can add a dependency to get data from DB or file or randomly generate

    // Can represent a factory of objects for each OS or Browser

    AbstractProduct1 createProduct1() {
        return ConcreteProduct1ForFactory1.createUsingFactoryMethod();
    }

    AbstractProduct2 createProduct2() {
        return ConcreteProduct2ForFactory1.createUsingFactoryMethod();
    }
}
