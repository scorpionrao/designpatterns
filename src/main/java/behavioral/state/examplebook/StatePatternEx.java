package behavioral.state.examplebook;

public class StatePatternEx {

    public static void main(String[] args) {
        /* EXAMPLE 1 */
        /* only beginning state matters, rest is driven by the state */
        AvailableStatesProvidingNewBehavior.InBuiltOff inBuiltOff =
                new AvailableStatesProvidingNewBehavior.InBuiltOff();
        ElectronicEquipment context1 = new TV(inBuiltOff);
        /* turn inBuiltOff TV */
        context1.request();
        /* turn inBuiltOn TV */
        context1.request();

        /* EXAMPLE 2 */
        /* only beginning state matters, rest is driven by the state */
        AvailableStatesProvidingNewBehavior.InBuiltOn inBuiltOn =
                new AvailableStatesProvidingNewBehavior.InBuiltOn();
        ElectronicEquipment context2 = new MP3Player(inBuiltOn);
        /* turn inBuiltOn TV */
        context2.request();
        /* turn inBuiltOff TV */
        context2.request();

        /* EXAMPLE 3 */
        /* only beginning state matters, rest is driven by the state */
        AvailableStatesProvidingNewBehavior.RemoteControlOff remoteControlOff =
                new AvailableStatesProvidingNewBehavior.RemoteControlOff();
        ElectronicEquipment context3 = new TV(remoteControlOff);
        /* turn inBuiltOn TV by Remote */
        context3.request();
        /* turn inBuiltOff TV by Remote */
        context3.request();
    }
}
