package behavioral.observer.examplebook;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public abstract class ChangeManagerMediator {

    Map<Subject, LinkedList<IObserver>> map = new LinkedHashMap<>();

    public void register(Subject subject, IObserver observer) {
        List<IObserver> list = map.get(subject);
        if(list != null) {
            list.add(observer);
        } else {
            LinkedList<IObserver> newList = new LinkedList<>(Arrays.asList(observer));
            map.put(subject, newList);
        }
    }

    public void unregister(Subject subject, IObserver observer) {
        List<IObserver> list = map.get(subject);
        if(list != null) {
            list.remove(observer);
        }
    }

    public abstract void notifyObservers(int newValue);
}
