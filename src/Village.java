import java.util.ArrayList;

public class Village extends Groupe {

    public Village(Humains chefG){
        super((Gaulois) chefG);
    }


    public String toString() {
        return super.toString();
    }

    public void ajouter(Humains g){
        lesHabitants.add((Gaulois) g);
    }

    public void distribution(int potion){
        for(Humains g : lesHabitants){
            if(g.getForce()<5){
                g.force += potion;
            }
        }
    }

    public String bataille1(Camp c){

    }
}
