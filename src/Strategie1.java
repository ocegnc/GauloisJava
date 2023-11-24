import java.util.ArrayList;
import java.util.Iterator;

public class Strategie1 implements Stratégie{

    public String affronter(Humains r, Humains g) {
        int rForce = r.getForce();
        int gForce = g.getForce();
        rForce -= gForce/6;
        gForce -= rForce;
        return "Le romain se prend une baffe";
    }

    /*private boolean estTerminee(){
        boolean v = true;
        for (Humains r : lesRomains){
            if (r.force!=0){//au moins 1 romain a de la force donc bataille pas termine
                v = false;
            }
        }
        return v;
    }*/

    public void seBagarrer(ArrayList<Humains> lesRomains, ArrayList<Humains> lesGaulois) {
        Iterator<Humains> it = lesGaulois.iterator();
        Iterator<Humains> it2 = lesRomains.iterator();
                while(it2.hasNext()){
                    Humains gaulois=it.next();
                    Humains romain=it2.next();
                    if (gaulois.getMetier().equals("chef") || gaulois.getMetier().equals("druide") || romain.getGrade() == Grade.chef) {
                        it.remove();
                        it2.remove();
                    } else {
                        affronter(romain, gaulois);
                    }
                }


    }
}
