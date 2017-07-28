package exercice_c2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/******************************************************
 Cours:   LOG121
 Session: E2017
 Groupe: 01


 Projet: Laboratoire #2
 Étudiant(e)s: William Cantin


 Professeur : Vincent Lacasse
 Nom du fichier: ListeDeTachesDePlusDe.java
 Date créé: 2017-07-28
 Date dern. modif. GIT
 *******************************************************
 Historique des modifications
 *******************************************************
 Voir git
 *******************************************************/
public class ListeDeTachesDePlusDe implements Visiteur, Iterable<String> {

    private int effort = 0;

    private List<String> list = new ArrayList<>();

    public ListeDeTachesDePlusDe(int effort) {
        this.effort = effort;
    }

    @Override
    public void visit(Tache t) {
        if(t.getEffort() > effort){
            list.add(t.toString());
        }
    }

    @Override
    public void visit(Ensemble e) {
        if(e.getEffort() > effort){
            list.add(e.toString());
        }
    }

    @Override
    public Iterator<String> iterator() {
        return list.iterator();
    }
}
