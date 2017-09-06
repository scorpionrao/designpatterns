package behavioral.observer.examplebook;

public class ConcreteIObservers {

    public static class ConcreteIObservers1 implements IObserver {
        @Override
        public void update (int value){
            System.out.println(this.getClass().getSimpleName() + " - Flag value changed in subject = " + value);
        }
    }

    public static class ConcreteIObservers2 implements IObserver {
        @Override
        public void update (int value){
            System.out.println(this.getClass().getSimpleName() + " - Flag value changed in subject = " + value);
        }
    }
}
