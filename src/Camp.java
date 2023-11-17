import java.util.ArrayList;

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
}
