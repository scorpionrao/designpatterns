package behavioral.mediator.examplebook;
public class Chatters {
    public static class Friend1OrWidget1 extends FriendOrWidget {
        Friend1OrWidget1(Mediator mediator, String name) {
            super(mediator);
            this.name = name;
        }
    }
    public static class Friend2OrWidget2 extends FriendOrWidget {
        Friend2OrWidget2(Mediator mediator, String name) {
            super(mediator);
            this.name = name;
        }
    }
    public static class BossOrWidget3 extends FriendOrWidget {
        BossOrWidget3(Mediator mediator, String name) {
            super(mediator);
            this.name = name;
        }
    }
}