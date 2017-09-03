package creational.singleton.examplebook;

public class MakeACaptain {

    private static MakeACaptain _captain;

    private MakeACaptain(){}

    public static synchronized MakeACaptain getCaptain() {
        if(_captain == null) {
            _captain = new MakeACaptain();
            System.out.println("New captain selected for our team");
        } else {
            System.out.println("You already have captain");
        }
        return _captain;
    }

    public static void main(String[] args) {
        MakeACaptain mac1 = MakeACaptain.getCaptain();
        MakeACaptain mac2 = MakeACaptain.getCaptain();
        if(mac1 == mac2) {
            System.out.println("c1 and c2 are same instance");
        }
    }
}
