package structural.adapter.plugpoint;

public class ClientThreePinSocket {

    ClassAdapter classAdapter;

    public ClassAdapter getClassAdapter() {
        return classAdapter;
    }

    public ObjectAdapter getObjectAdapter() {
        return objectAdapter;
    }

    ObjectAdapter objectAdapter;

    ClientThreePinSocket(ClassAdapter classAdapter) {
        this.classAdapter = classAdapter;
    }

    ClientThreePinSocket(ObjectAdapter objectAdapter) {
        this.objectAdapter = objectAdapter;
    }

    public static void main(String[] args) {
        ClassAdapter classAdapter = new ClassAdapter();
        ClientThreePinSocket connection = new ClientThreePinSocket(classAdapter);
        System.out.println("Voltage - " + connection.getClassAdapter().getVoltage());

        ITwoPin iTwoPin = new TwoPinPlug();
        ObjectAdapter objectAdapter = new ObjectAdapter(iTwoPin);
        ClientThreePinSocket connection1 = new ClientThreePinSocket(objectAdapter);
        System.out.println("Voltage - " + connection1.getObjectAdapter().getVoltage());
    }
}
