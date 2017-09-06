package behavioral.mediator.examplebook;

public class ConcreteMediator extends Mediator {

    private FriendOrWidget friend1OrWidget1;
    private FriendOrWidget friend2OrWidget2;
    private FriendOrWidget bossOrWidget3;

    public void setFriend1OrWidget1(FriendOrWidget friendOrWidget) {
        this.friend1OrWidget1 = friendOrWidget;
    }

    public void setFriend2OrWidget2(FriendOrWidget friendOrWidget) {
        this.friend2OrWidget2 = friendOrWidget;
    }

    public void setBossOrWidget3(FriendOrWidget friendOrWidget) {
        this.bossOrWidget3 = friendOrWidget;
    }

    @Override
    void send(FriendOrWidget friendOrWidget, String message) {
        if(friendOrWidget == this.friend1OrWidget1) {
            this.friend2OrWidget2.notify(message);
            this.bossOrWidget3.notify(friendOrWidget.name + " sends message to " + this.friend2OrWidget2.name);
        } else if (friendOrWidget == this.friend2OrWidget2) {
            this.friend1OrWidget1.notify(message);
            this.bossOrWidget3.notify(friendOrWidget.name + " sends message to " + this.friend1OrWidget1.name);
        } else if (friendOrWidget == this.bossOrWidget3) {
            this.friend1OrWidget1.notify(message);
            this.friend2OrWidget2.notify(message);
        }
    }

    public static void main(String[] args) {
        ConcreteMediator concreteMediator = new ConcreteMediator();
        FriendOrWidget friend1OrWidget1 = new Chatters.Friend1OrWidget1(concreteMediator, "A1");
        FriendOrWidget friend2OrWidget2 = new Chatters.Friend2OrWidget2(concreteMediator, "A2");
        FriendOrWidget bossOrWidget3 = new Chatters.BossOrWidget3(concreteMediator, "B");

        concreteMediator.setFriend1OrWidget1(friend1OrWidget1);
        concreteMediator.setFriend2OrWidget2(friend2OrWidget2);
        concreteMediator.setBossOrWidget3(bossOrWidget3);

        friend1OrWidget1.changeOrSent("message1");
        friend2OrWidget2.changeOrSent("message2");
        bossOrWidget3.changeOrSent("bossMessage");
    }
}
