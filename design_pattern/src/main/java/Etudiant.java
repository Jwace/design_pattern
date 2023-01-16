public class Etudiant extends Personne {

    private int noteGlobale;

    public int getNoteGlobale() {
        return noteGlobale;
    }

    public void setNoteGlobale(int noteGlobale) {
        this.noteGlobale = noteGlobale;
    }

    @Override
    public int evaluation() { // nécessaire car Interface Evaluable avec méthode evaluation implémenté dans Personne
        return 0;
    }
}
