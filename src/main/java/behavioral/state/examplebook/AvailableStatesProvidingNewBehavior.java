package behavioral.state.examplebook;

public class AvailableStatesProvidingNewBehavior {

    public static class InBuiltOff implements State {
        @Override
        public void handle(ElectronicEquipment context) {
            System.out.println("I am in InBuiltOff state. Setting InBuiltOn now");
            context.setState(new InBuiltOn());
        }
    }

    public static class InBuiltOn implements State {
        @Override
        public void handle(ElectronicEquipment context) {
            System.out.println("I am in InBuiltOn state. Setting InBuiltOff now");
            context.setState(new InBuiltOff());
        }
    }

    /* Remote control should implement the interface understood by the equipment */
    public static class RemoteControlOff implements State {
        @Override
        public void handle(ElectronicEquipment context) {
            System.out.println("I am in InBuiltOff state. Setting InBuiltOn through Remote now");
            context.setState(new RemoteControlOn());
        }
    }

    /* Remote control should implement the interface understood by the equipment */
    public static class RemoteControlOn implements State {
        @Override
        public void handle(ElectronicEquipment context) {
            System.out.println("I am in InBuiltOn state. Setting InBuiltOff through Remote now");
            context.setState(new RemoteControlOff());
        }
    }
}
