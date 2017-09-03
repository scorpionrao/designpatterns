package structural.decorator;

public abstract class AbstractDecorator extends Component {

    protected Component component;

    void setTheComponent(Component component) {
        this.component = component;
    }

    void doJob() {
        if(component != null) {
            component.doJob();
        }
    }
}
