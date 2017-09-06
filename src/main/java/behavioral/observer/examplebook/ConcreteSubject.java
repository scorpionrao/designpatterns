package behavioral.observer.examplebook;

public class ConcreteSubject extends Subject {

    int flag;

    void setFlag(int flag) {
        this.flag = flag;
        System.out.println("Flag value = " + flag);
        notifyObservers(flag);
    }

    int getFlag() {
        return flag;
    }

    public static void main(String[] args) {

        IObserver IObserver1 = new ConcreteIObservers.ConcreteIObservers1();
        IObserver IObserver2 = new ConcreteIObservers.ConcreteIObservers2();

        ConcreteSubject subject = new ConcreteSubject();

        subject.register(IObserver1);
        subject.register(IObserver2);

        subject.setFlag(5);
        subject.setFlag(25);
        subject.unregister(IObserver1);
        subject.setFlag(50);
    }
}
