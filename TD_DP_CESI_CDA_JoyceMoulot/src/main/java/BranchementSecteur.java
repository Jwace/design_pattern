public class BranchementSecteur extends Component {

    public BranchementSecteur(String nom, float prix, String codeProduit) {
        super(nom, prix, codeProduit);
    }

    @Override
    float getPrixTotal() {
        return 0;
    }
}
