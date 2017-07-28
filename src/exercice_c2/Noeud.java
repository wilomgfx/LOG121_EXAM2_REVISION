package exercice_c2;

/******************************************************
 Cours:   LOG121
 Session: E2017
 Groupe: 01


 Projet: Laboratoire #2
 Étudiant(e)s: William Cantin


 Professeur : Vincent Lacasse
 Nom du fichier: Noeud.java
 Date créé: 2017-07-28
 Date dern. modif. GIT
 *******************************************************
 Historique des modifications
 *******************************************************
 Voir git
 *******************************************************/
public abstract class Noeud {
    protected String nom;

    public abstract int getEffort();
    public abstract void accept(Visiteur visiteur);

    public String getNom() {
        return nom;
    }
}
