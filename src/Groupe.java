import java.util.ArrayList;

public abstract class Groupe {
    protected ArrayList<Humains> lesHabitants;
    protected Humains chef;

    public Groupe(Humains chef){
        this.chef=chef;
        this.lesHabitants=new ArrayList<>();
        lesHabitants.add(chef);
    }

    public abstract void ajouter(Humains h);

    public String toString(){
        return "Le " + getClass().getName() + ", dont le chef est " + chef.getNom() + ", est composé de : \n" + lesHabitants;
    }
}
