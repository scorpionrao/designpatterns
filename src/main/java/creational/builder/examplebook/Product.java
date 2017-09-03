package creational.builder.examplebook;

import java.util.LinkedList;
import java.util.List;

public class Product {

    // We can use any data structure
    private List<String> parts;

    public Product() {
        parts = new LinkedList<String>();
    }

    public void add(String part) {
        parts.add(part);
    }

    public void show() {
        System.out.println("Complete Product");
        for(String part : parts) {
            System.out.println(part);
        }
    }
}
