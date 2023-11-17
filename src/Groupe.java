import java.util.ArrayList;

public abstract class Groupe {
    protected ArrayList<Humains> lesHabitants;
    protected Humains chef;

    public Groupe(Humains chef){
        this.chef=chef;
        this.lesHabitants=new ArrayList<Humains>();
    }

    public abstract void ajouter(Humains h);

    public String toString(){

        for(Humains h : lesHabitants){
            h.toString();
        }
        return null;
    }
}
