package behavioral.observer.examplebook;

public class SimpleChangeManager extends ChangeManagerMediator {

    @Override
    public void notifyObservers(int newValue) {
        for(Subject subject : map.keySet()) {
            for(IObserver observer : map.get(subject)) {
                observer.update(newValue);
            }
        }

    }

    private static SimpleChangeManager simpleChangeManager = new SimpleChangeManager();

    private SimpleChangeManager() {}

    public static SimpleChangeManager getSingleton() {
        return simpleChangeManager;
    }
}
