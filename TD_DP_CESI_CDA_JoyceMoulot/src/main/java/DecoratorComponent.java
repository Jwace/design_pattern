public class DecoratorComponent extends Component{

    protected Component component;
    public DecoratorComponent(Component component) {
        this.component = component;
    }
}
