import java.util.ArrayList;

public abstract class Groupe {
    private ArrayList<Humains> lesHabitants;
    private Humains chef;

    public Groupe(Humains chef){
        this.chef=chef;
        this.lesHabitants=new ArrayList<Humains>();
    }

    public abstract void ajouter(Humains h);

    public String toString(){
        return "Le village est composé de : \n" + lesHabitants + "\n dont le chef est " + chef;
    }
}
