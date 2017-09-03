package creational.singleton;

import java.util.HashMap;
import java.util.Map;

public class Singleton {

    private static Singleton _instance;

    Singleton() {
        System.out.println("Constructing will be attempted once ...");
    }

    public static Singleton getSingleton() {
        if(_instance == null) {

            /**
             * alternate approach
             *
             *  String name = getEnv("client_google");
             *
             *  This gives the freedom to change the name from a props file without changing the code
             *
             */
            String name = null;
            _instance = _registry.get(name);

            // lazy initialization
            //_instance = new Singleton();


        }
        return _instance;
    }

    // Singleton Registry
    private static Map<String, Singleton> _registry = new HashMap<String, Singleton>();

    public void registerSingleton(String name, Singleton singleton) {
        _registry.put(name, singleton);
    }

    public void lookUp(String name) {
        // data structure = hashmap --> lookup is O(1).
        // data structure = linkedhashmap --> lookup is O(N).
        // data structure = sorted set --> lookup is O(log N).
        _registry.get(name);
    }


    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getSingleton();
        Singleton singleton2 = Singleton.getSingleton();
        Singleton singleton3 = Singleton.getSingleton();

    }
}
