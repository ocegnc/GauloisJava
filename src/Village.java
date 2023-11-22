import java.util.ArrayList;
import java.util.Random;

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

    public String rencontre(Gaulois g){
        Random r=new Random();
        int i = r.nextInt(lesHabitants.size());
        lesHabitants.get(i).rencontre(g);
    }

    public String bataille1(Camp c) throws Exception {
        String mes = "";
        String result = "";
        while (estTerminee(c)==false) {
            for (Humains (Romain) r : c.lesHabitants) {
                for (Humains (Gaulois) g : lesHabitants) {
                    if (g.getMetier().equals("chef") && g.getMetier().equals("druide") throw new Exception("Le chef et les druides ne combattent pas");
                    int rForce = r.getForce();
                    int gForce = g.getForce();
                    mes = "Le romain se prend une baffe";
                    rForce -= (1 / 6) * gForce;
                    gForce -= rForce;
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
