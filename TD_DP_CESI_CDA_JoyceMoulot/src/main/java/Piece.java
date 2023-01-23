public class Piece extends Component {
    //public String nom;
    //public float prix;
    //public String codeProduit;

    public Piece(String nom, float prix, String codeProduit) {
        super(nom, prix, codeProduit);
        this.prix = prix;
        this.codeProduit = codeProduit;
    }


    @Override
    public float getPrixTotal() {
        return this.prix;
    }

}
