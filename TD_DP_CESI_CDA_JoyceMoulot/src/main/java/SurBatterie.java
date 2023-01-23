public class SurBatterie extends Component {

    public SurBatterie(String nom, float prix, String codeProduit) {
        super(nom, prix, codeProduit);
    }

    @Override
    float getPrixTotal() {
        return 0;
    }
}
