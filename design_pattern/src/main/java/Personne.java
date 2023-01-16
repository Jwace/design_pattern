public abstract class Personne implements Evaluable { // Classe abstraite : on ne peut pas créer une nouvelle instance de Personne

    private String nom;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    // public abstract int evaluation(); -> Remplacée par l'interface Evaluable, avec interface, chaque classe donne sa propre version de la méthode evaluation
}
