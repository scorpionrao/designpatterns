package structural.decorator;

public class Decorators {

    public static class ConcreteDecorator1 extends AbstractDecorator {

        @Override
        void doJob() {
            super.doJob();
            System.out.println("Job - Decorator. I am concrete decorator 1");
        }
    }

    public static class ConcreteDecorator2 extends AbstractDecorator{

        @Override
        void doJob() {
            super.doJob();
            System.out.println("Job - Decorator. I am concrete decorator 2");
        }
    }
}
