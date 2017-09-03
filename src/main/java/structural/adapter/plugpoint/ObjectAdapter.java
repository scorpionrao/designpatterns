package structural.adapter.plugpoint;

public class ObjectAdapter {

    ITwoPin iTwoPin;

    ObjectAdapter(ITwoPin iTwoPin) {
        this.iTwoPin = iTwoPin;
    }

    int getVoltage() {
        return 2 * iTwoPin.getVoltage();
    }
}
