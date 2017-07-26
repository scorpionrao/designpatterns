package creational.abstractfactory.widgetexample;

public class MotifWidgetFactory extends WidgetFactory {
    Scrollbar createScrollBar() {
        return new MotifScrollBar();
    }

    Window createWindow() {
        return new MotifWindow();
    }
}
