import java.util.ArrayList;

public abstract class Groupe {
    private ArrayList<Humains> lesHumains;
    private Humains chef;

    public Groupe(Humains chef){
        this.chef=chef;
        this.lesHumains=new ArrayList<Humains>();
    }

    public abstract void ajouter(Humains h);

    public String toString(){

        for(Humains h : lesHumains){
            h.toString();
        }
        return null;
    }
}
