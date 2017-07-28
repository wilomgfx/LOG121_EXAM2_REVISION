package exercice_c2;

import java.util.ArrayList;
import java.util.List;

/******************************************************
 Cours:   LOG121
 Session: E2017
 Groupe: 01


 Projet: Laboratoire #2
 Étudiant(e)s: William Cantin


 Professeur : Vincent Lacasse
 Nom du fichier: Ensemble.java
 Date créé: 2017-07-28
 Date dern. modif. GIT
 *******************************************************
 Historique des modifications
 *******************************************************
 Voir git
 *******************************************************/
public class Ensemble extends Noeud {

    private List<Noeud> list = new ArrayList<>();

    public void add(Noeud noeud) {
        list.add(noeud);
    }

    @Override
    public int getEffort() {
        int total = 0;
        for(Noeud n : list){
            total += n.getEffort();
        }
        return total;
    }

    @Override
    public void accept(Visiteur visiteur) {
        visiteur.visit(this);
        for(Noeud n : list){
            n.accept(visiteur);
        }
    }

    @Override
    public String toString() {
        return "Ensemble{" +
                "list=" + list +
                ", nom='" + nom + '\'' +
                '}';
    }
}
