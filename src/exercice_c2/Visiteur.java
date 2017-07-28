package exercice_c2;

/******************************************************
 Cours:   LOG121
 Session: E2017
 Groupe: 01


 Projet: Laboratoire #2
 Étudiant(e)s: William Cantin


 Professeur : Vincent Lacasse
 Nom du fichier: Visiteur.java
 Date créé: 2017-07-28
 Date dern. modif. GIT
 *******************************************************
 Historique des modifications
 *******************************************************
 Voir git
 *******************************************************/
public interface Visiteur {
    public void visit(Tache t);
    public void visit(Ensemble e);
}
