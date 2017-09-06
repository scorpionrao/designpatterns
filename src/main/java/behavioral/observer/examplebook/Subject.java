package behavioral.observer.examplebook;

public abstract class Subject {

    ChangeManagerMediator changeManagerMediator = DAGChangeManager.getSingleton();

    void register(IObserver IObserver) {
        changeManagerMediator.register(this, IObserver);
    }

    void unregister(IObserver IObserver) {
        changeManagerMediator.unregister(this, IObserver);
    }

    void notifyObservers(int newValue) {
        changeManagerMediator.notifyObservers(newValue);
    }
}
