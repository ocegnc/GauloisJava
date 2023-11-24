import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class Village extends Groupe {

    public Village(Humains chefG) {
        super((Gaulois) chefG);
    }

    public String toString() {
        return super.toString();
    }

    public void ajouter(Humains g) {
        lesHabitants.add((Gaulois) g);
    }

    public String rencontre(Gaulois g) {
        Random r = new Random();
        int i = r.nextInt(lesHabitants.size());
        return lesHabitants.get(i).rencontre(g);
    }



    public String combattre(ArrayList<Humains> lesRomains, StratEnum s) {
        String mes ="";
        if(s==StratEnum.strategie1){
            Strategie1 s1 = new Strategie1();
            s1.seBagarrer(lesRomains, this.lesHabitants);
        }else{
            Strategie2 s2 = new Strategie2();
            s2.seBagarrer(lesRomains, this.lesHabitants);
        }
        mes = "la bataille est terminée";
        return mes;
    }
}
