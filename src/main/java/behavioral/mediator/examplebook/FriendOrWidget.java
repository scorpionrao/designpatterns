package behavioral.mediator.examplebook;

public abstract class FriendOrWidget {

    protected Mediator mediator;
    protected String name;

    FriendOrWidget(Mediator mediator) {
        this.mediator = mediator;
    }

    public void changeOrSent(String message) {
        mediator.send(this, message);
    }

    public void notify(String message) {
        System.out.println(this.getClass().getSimpleName() + " notified " + message);
    }
}
