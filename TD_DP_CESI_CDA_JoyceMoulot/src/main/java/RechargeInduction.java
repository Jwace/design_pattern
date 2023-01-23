public class RechargeInduction extends Component {

    public RechargeInduction(String nom, float prix, String codeProduit) {
        super(nom, prix, codeProduit);
    }

    @Override
    float getPrixTotal() {
        return 0;
    }
}
