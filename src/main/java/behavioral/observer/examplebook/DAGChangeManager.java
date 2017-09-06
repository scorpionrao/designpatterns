package behavioral.observer.examplebook;

import java.util.LinkedHashSet;
import java.util.Set;

public class DAGChangeManager extends ChangeManagerMediator {

    @Override
    public void notifyObservers(int newValue) {
        Set<IObserver> observerSet = new LinkedHashSet<>();
        for(Subject subject : map.keySet()) {
            for(IObserver observer : map.get(subject)) {
                observerSet.add(observer);
            }
        }

        for(IObserver observer : observerSet) {
            observer.update(newValue);
        }

    }

    private static DAGChangeManager dagChangeManager = new DAGChangeManager();

    private DAGChangeManager() {}

    public static DAGChangeManager getSingleton() {
        return dagChangeManager;
    }
}
