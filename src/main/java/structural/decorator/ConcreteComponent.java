package structural.decorator;

public class ConcreteComponent extends Component {

    @Override
    void doJob(){
        System.out.println("Text View component. I am closed for modification");
    }

    public static void main(String[] args) {
        Component component = new ConcreteComponent();

        AbstractDecorator decorator1 = new Decorators.ConcreteDecorator1();
        decorator1.setTheComponent(component);
        decorator1.doJob();

        AbstractDecorator decorator2 = new Decorators.ConcreteDecorator2();
        decorator2.setTheComponent(component);
        decorator2.doJob();
    }
}
