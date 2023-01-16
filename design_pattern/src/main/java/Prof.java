import java.util.*;

public class Prof extends Personne {

    private int[] listeNote = new int[10];
    private List<Etudiant> listeEtudiant = new ArrayList<>();

    public void ajoutEtudiant(Etudiant... etudiants) { // ... permet d'ajouter plusieurs étudiants
        listeEtudiant.addAll(Arrays.asList(etudiants));

        // listEtudiant.addAll(Arrays.asList(etudiants)); ou la boucle for en dessous = la même chose
        // for(Etudiant etudiant : etudiants) {
        //    listEtudiant.add(etudiant);
        //}
    }

    public void info() {
        System.out.println("Il a " + listeEtudiant.size() + " sur " + Ecole.getInstance().listeEtudiant.size() + "étudiants.");
    }

    @Override
    public int evaluation() {

        int somme = 0;
        for (int note : listeNote) {
            somme += note;
        }

        return somme/listeNote.length;
    }
}
