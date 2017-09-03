package structural.flyweight;

public class Robots {

    public static class SmallRobot implements IRobot {
        @Override
        public void print() {
            System.out.println("This is a small robot");
        }

        @Override
        public void setColor(String color) {
            throw new UnsupportedOperationException();
        }
    }

    public static class LargeRobot implements IRobot {
        @Override
        public void print() {
            System.out.println("This is a large robot");
        }

        @Override
        public void setColor(String color) {
            throw  new UnsupportedOperationException();
        }
    }

    static class Robot implements IRobot {

        // intrinsic - stored in flyweight pool. independent of context. can be persisted.
        String robotType;

        // extrinsic - not stored in flyweight pool. context passed by client. computed.
        String colorOfRobot;

        public Robot(String robotType) {
            this.robotType = robotType;
        }
        public void setColor(String colorOfRobot) {
            this.colorOfRobot = colorOfRobot;
        }
        public void print() {
            System.out.println("This is a " + robotType + " type robot with " + colorOfRobot + " color");
        }
    }
}
