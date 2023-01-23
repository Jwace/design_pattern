public class APile extends DecoratorComponent{

    public APile(Component component) {
        super(component);
    }

    @Override
    float getPrixTotal() {
        return 0;
    }

    @Override
    public String infosPrix() {
        return Component.infos() + "coûte xx euros";
    }
}
