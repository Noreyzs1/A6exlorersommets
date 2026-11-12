import java.util.ArrayList;

public class Sommet {
    private ArrayList<Sommet> s;
    private int id;
    private boolean explore;
    public Sommet(int id){
        explore = false;
        this.id = id;
        this.s=new ArrayList<>();
    }

    public void relier_sommet(Sommet s){
        this.s.add(s);
    }

    public boolean est_il_explore(){
        return explore;
    }

    public void est_explore(){
        explore=true;
    }

    public ArrayList<Sommet> get_voisins(){
        return s;
    }

}
