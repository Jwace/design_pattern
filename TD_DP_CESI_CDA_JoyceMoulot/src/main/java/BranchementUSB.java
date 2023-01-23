public class BranchementUSB extends Component{

    public BranchementUSB(String nom, float prix, String codeProduit) {
        super(nom, prix, codeProduit);
    }

    @Override
    float getPrixTotal() {
        return 0;
    }
}
