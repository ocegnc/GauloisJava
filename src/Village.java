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

    private boolean estTerminee(Camp c){
        boolean v = true;
        for (Humains r : c.lesHabitants){
            if (r.force!=0){//au moins 1 romain a de la force donc bataille pas termine
                v = false;
            }
        }
        return v;
    }

    public String bataille1(Camp c){
        String mes = "";
        String result = "";
        while (estTerminee(c)==false) {
            for (Humains r : c.lesHabitants) {
                for (Humains g : lesHabitants) {
                    if (g.metier != "chef" && g.metier && "druide") {
                        mes = "Le romain se prend une baffe";
                        r.force -= (1 / 6) * g.force;
                        g.force -= r.force;
                    }
                }
            }
        }
        result = "La bataille est terminée";
        return mes + result;
    }

    public String bataille2(Camp c){
        for(Humains g : lesHabitants){
            if (g.force < 5){

            }
            if (g.force>=5 && g.force<10){

            }
            if (g.force >= 10 && g.force < 15) {

            }
            if (g.force>=15){

            }
        }

    }
}
