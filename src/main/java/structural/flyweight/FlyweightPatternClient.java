package structural.flyweight;

import java.util.Random;

public class FlyweightPatternClient {
    public static void main(String[] args) throws Exception {
        //original();
        refined();
    }

    private static void refined() throws Exception {
        RobotFactory myFactory = new RobotFactory();
        IRobot shape;
        for(int i = 0; i < 3; i++) {
            shape = myFactory.getRefinedRobotFromFactory("king");
            shape.setColor(getRandomColor());
            shape.print();
        }
        int numOfDistinctRobots = myFactory.totalObjectsCreated();
        System.out.println("Distinct Robot objects created till now = " + numOfDistinctRobots);

        /* */
        for(int i = 0; i < 3; i++) {
            shape = myFactory.getRefinedRobotFromFactory("queen");
            shape.setColor(getRandomColor());
            shape.print();
        }
        numOfDistinctRobots = myFactory.totalObjectsCreated();
        System.out.println("Finally Robot objects created till now = " + numOfDistinctRobots);
    }

    private static void original() throws Exception {

        RobotFactory myFactory = new RobotFactory();
        IRobot shape = myFactory.getRobotFromFactory("small");
        shape.print();
        for(int i = 0; i < 2; i++) {
            shape = myFactory.getRobotFromFactory("small");
            shape.print();
        }
        int numOfDistinctRobots = myFactory.totalObjectsCreated();
        System.out.println("Distinct Robot objects created till now = " + numOfDistinctRobots);

        /* */
        for(int i = 0; i < 2; i++) {
            shape = myFactory.getRobotFromFactory("large");
            shape.print();
        }
        numOfDistinctRobots = myFactory.totalObjectsCreated();
        System.out.println("Finally Robot objects created till now = " + numOfDistinctRobots);
    }

    public static String getRandomColor() {
        Random r = new Random();
        int random = r.nextInt(20);
        if(random % 2 == 0) {
            return "red";
        } else {
            return "green";
        }
    }
}
