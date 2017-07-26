package creational.abstractfactory.widgetexample;

public class Client {

    public static void main(String[] args) {
        WidgetFactory factory1 = new MotifWidgetFactory();
        Scrollbar scrollbar1 = factory1.createScrollBar();

        // --> "MotifScrollBar"
        // --> Client does not have to know the class of the object to create
        System.out.println(scrollbar1.getClass().getSimpleName());
    }
}
