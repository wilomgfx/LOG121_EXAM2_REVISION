package exercice_c2;

/******************************************************
 Cours:   LOG121
 Session: E2017
 Groupe: 01


 Projet: Laboratoire #2
 Étudiant(e)s: William Cantin


 Professeur : Vincent Lacasse
 Nom du fichier: Tache.java
 Date créé: 2017-07-28
 Date dern. modif. GIT
 *******************************************************
 Historique des modifications
 *******************************************************
 Voir git
 *******************************************************/
public class Tache extends Noeud {

    private int effort = 0;

    public Tache(int effort) {
        this.effort = effort;
    }

    @Override
    public int getEffort() {
        return effort;
    }

    @Override
    public void accept(Visiteur visiteur) {
        visiteur.visit(this);
    }

    @Override
    public String toString() {
        return "Tache{" +
                "effort=" + effort +
                ", nom='" + nom + '\'' +
                '}';
    }
}
