package structural.adapter.plugpoint;

public class ClassAdapter extends TwoPinPlug {
    @Override
    public int getVoltage() {
        return 2 * super.getVoltage();
    }
}
