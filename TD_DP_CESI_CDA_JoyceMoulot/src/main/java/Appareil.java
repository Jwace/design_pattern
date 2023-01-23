import java.util.List;

public class Appareil extends Component {
    public String nom;
    public float prix;
    public String codeProduit;

    private List<Component> children;


    public Appareil(String nom, float prix, String codeProduit) {
        super(nom, prix, codeProduit);
        this.prix = prix;
        this.codeProduit = codeProduit;
    }


    @Override
    public float getPrixTotal() {
        int prixTotal = 0;

        for(Component cp : children) {
            prixTotal += cp.getPrixTotal();
        }
        return prixTotal;
    }

    public void add(Component component) {
        children.add(component);
    }

    public void remove(Component component) {
        children.remove(component);
    }
}
