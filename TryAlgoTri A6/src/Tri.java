import java.util.ArrayList;

public class Tri {
    private final ArrayList<Sommet> liste_sommets = new ArrayList<>();
    private ArrayList<Sommet> liste_sommets_explores;
    private ArrayList<Sommet> liste_sommets_vus;

    public Tri(){
         liste_sommets_explores = new ArrayList<>();
         liste_sommets_vus = new ArrayList<>();
    }

    public void ajouter_sommet(Sommet s ){
        liste_sommets.add(s);
    }

    public void explorer_sommets(int index){
        Sommet sbuffer;
        liste_sommets_vus.add(liste_sommets.get(index));
        while (!liste_sommets_vus.isEmpty()){
            sbuffer = liste_sommets_vus.get(0);
            sommet_explore(sbuffer);
        }
    }
    void sommet_explore(Sommet s){
        s.est_explore();
        liste_sommets_vus.removeFirst();
        liste_sommets_explores.add(s);
        for (Sommet stemp : s.get_voisins() ){
            if (!stemp.est_il_explore() && !liste_sommets_vus.contains(stemp)) {
                liste_sommets_vus.add(stemp);
            }
        }

    }



}
