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
        return "Le village est composé de : \n" + lesHabitants + "\n dont le chef est " + chef;
    }
}
