package structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class RobotFactory {

    Map<String, IRobot> shapes = new HashMap<>();

    public int totalObjectsCreated() {
        return shapes.size();
    }

    public IRobot getRobotFromFactory(String robotCategoryKey) throws Exception {
        IRobot robotCategory = null;
        if(shapes.containsKey(robotCategoryKey)) {
            robotCategory = shapes.get(robotCategoryKey);
        } else {
            switch (robotCategoryKey) {
                case "small":
                    System.out.println("Creating new small robot");
                    robotCategory = new Robots.SmallRobot();
                    shapes.put("small", robotCategory);
                    break;
                case "large":
                    System.out.println("Creating new large robot");
                    robotCategory = new Robots.LargeRobot();
                    shapes.put("large", robotCategory);
                    break;
                default:
                    throw new Exception("Robot factory can create only small or large shapes");
            }
        }
        return robotCategory;
    }

    public IRobot getRefinedRobotFromFactory(String robotCategoryKey) throws Exception {
        IRobot robotCategory;
        if(shapes.containsKey(robotCategoryKey)) {
            robotCategory = shapes.get(robotCategoryKey);
        } else {
            switch (robotCategoryKey) {
                case "king":
                    System.out.println("Creating new king robot");
                    robotCategory = new Robots.Robot("king");
                    shapes.put("king", robotCategory);
                    break;
                case "queen":
                    System.out.println("Creating new queen robot");
                    robotCategory = new Robots.Robot("queen");
                    shapes.put("queen", robotCategory);
                    break;
                default:
                    throw new Exception("Robot factory can create only king or queen shapes");
            }
        }
        return robotCategory;
    }
}
