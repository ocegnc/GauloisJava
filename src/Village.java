import java.util.ArrayList;
import java.util.Random;

public class Village extends Groupe implements Startégie {

    public Village(Humains chefG){
        super((Gaulois) chefG);
    }

    public String toString() {
        return super.toString();
    }

    public void ajouter(Humains g){
        lesHabitants.add((Gaulois) g);
    }

    public String rencontre(Gaulois g){
        Random r=new Random();
        int i = r.nextInt(lesHabitants.size());
        return lesHabitants.get(i).rencontre(g);
    }

/*    public String bataille1(Camp c) throws Exception {
        String mes = "";
        String result = "";
        while (estTerminee(c)==false) {
            for (Humains (Romain) r : c.lesHabitants) {
                for (Humains (Gaulois) g : lesHabitants) {
                    if (g.getMetier().equals("chef") && g.getMetier().equals("druide")) throw new Exception("Le chef et les druides ne combattent pas");
                    int rForce = r.getForce();
                    int gForce = g.getForce();
                    mes = "Le romain se prend une baffe";
                    rForce -= (1/6)*gForce;
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
    */
}
