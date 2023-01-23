public abstract class Component {

    public String nom;
    public float prix;
    public String codeProduit;

    public Component(String nom, float prix, String codeProduit) {
        this.nom = nom;
        this.prix = this.prix;
        this.codeProduit = this.codeProduit;
    }

    abstract float getPrixTotal();

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public float getPrix() {
        return prix;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }

    public String getCodeProduit() {
        return codeProduit;
    }

    public void setCodeProduit(String codeProduit) {
        this.codeProduit = codeProduit;
    }
}
