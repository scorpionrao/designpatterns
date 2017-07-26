package creational.abstractfactory.widgetexample;

public abstract class WidgetFactory {
    abstract Scrollbar createScrollBar();
    abstract Window createWindow();
}
