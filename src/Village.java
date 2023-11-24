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

    public String combattre(ArrayList<Humains> lesRomains, Strategie1 s) {
        String mes ="";
        Iterator<Humains> it = lesRomains.iterator();
        while(it.hasNext()){
            Humains p=it.next();
            if (p.force != 0) {
                s.seBagarrer(lesRomains, this.lesHabitants);
            }else{
                mes = "la bataille est terminée";
            }
        }
        return mes;
    }
}
