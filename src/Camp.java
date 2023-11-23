import java.util.ArrayList;
import java.util.Random;

public class Camp extends Groupe{
    Camp(Humains chefR){
        super((Romain) chefR);
    }

    public void ajouter(Humains r){
        lesHabitants.add((Romain) r);
    }

    public String toString(){
        return super.toString();
    }

    public String rencontre(Romain r){
        Random n=new Random();
        int i = n.nextInt(lesHabitants.size());
        return lesHabitants.get(i).rencontre(r);
    }
}
