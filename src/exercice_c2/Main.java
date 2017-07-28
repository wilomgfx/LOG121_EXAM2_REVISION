package exercice_c2;

import java.util.Iterator;

/******************************************************
 Cours:   LOG121
 Session: E2017
 Groupe: 01


 Projet: Laboratoire #2
 Étudiant(e)s: William Cantin


 Professeur : Vincent Lacasse
 Nom du fichier: Main.java
 Date créé: 2017-07-28
 Date dern. modif. GIT
 *******************************************************
 Historique des modifications
 *******************************************************
 Voir git
 *******************************************************/
public class Main {
    public static void main(String[] args) {
        ListeDeTachesDePlusDe listeDeTachesDePlusDe = new ListeDeTachesDePlusDe(5);
        Tache tache1 = new Tache(1);
        Tache tache2 = new Tache(3);
        Tache tache3 = new Tache(6);
        Tache tache4 = new Tache(7);
        Tache tache5 = new Tache(10);
        Ensemble ensemble1 = new Ensemble();
        ensemble1.add(tache1);
        ensemble1.add(tache3);
        ensemble1.add(tache4);
        ensemble1.add(tache5);
        Ensemble ensemble2 = new Ensemble();
        ensemble2.add(tache2);
        listeDeTachesDePlusDe.visit(tache1);
        listeDeTachesDePlusDe.visit(tache2);
        listeDeTachesDePlusDe.visit(tache3);
        listeDeTachesDePlusDe.visit(tache4);
        listeDeTachesDePlusDe.visit(tache5);
        listeDeTachesDePlusDe.visit(ensemble1);
        listeDeTachesDePlusDe.visit(ensemble2);
        Iterator<String> it = listeDeTachesDePlusDe.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
