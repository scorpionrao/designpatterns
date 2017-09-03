package structural.adapter.plugpoint;

public class ClientTwoPinSocket {

    TwoPinPlug twoPinPlug;

    ClientTwoPinSocket(TwoPinPlug twoPinPlug) {
        this.twoPinPlug = twoPinPlug;
    }

    public static void main(String[] args) {
        TwoPinPlug twoPinPlug = new TwoPinPlug();
        ClientTwoPinSocket connection = new ClientTwoPinSocket(twoPinPlug);
    }
}
