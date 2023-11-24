import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class Strategie1 implements Stratégie{

    public String affronter(Humains r, Humains g) {
        int rForce = r.getForce();
        int gForce = g.getForce();
        rForce -= gForce/6;
        gForce -= rForce;
        g.setForce(gForce);
        r.setForce(rForce);
        System.out.println("Le romain "+r.getNom()+" se prend une baffe");
        return "Le romain"+r.getNom()+" se prend une baffe";
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

    public int sommeForce(ArrayList<Humains> lesRomains){
        int somme = 0;
        for (Humains r : lesRomains){
            somme+=r.getForce();
        }
        return somme;
    }

    public void distribution(ArrayList<Humains> lesGaulois){
        Random r = new Random();
        int p = r.nextInt(getDruide(lesGaulois).potionMin, getDruide(lesGaulois).potionMax);
        for(Humains g : lesGaulois){
            if(g.getForce()<5){
                g.setForce(g.getForce()+p);
            }
        }
    }

    public Druide getDruide(ArrayList<Humains> lesGaulois){
        for(Humains g : lesGaulois){
            if(g instanceof Druide)
                return (Druide) g;
        }
        return null;
    }
    public void seBagarrer(ArrayList<Humains> lesRomains, ArrayList<Humains> lesGaulois) {
        Iterator<Humains> it;
        Iterator<Humains> it2;
        Random r = new Random();
        do {
            it2 = lesRomains.iterator();
            while (it2.hasNext()) {

                Humains romain = it2.next();
                if (romain.getGrade() == Grade.chef) {
                    it2.next();
                }

                int g = r.nextInt(lesGaulois.size());
                if (lesGaulois.get(g).getMetier().equals("chef") || lesGaulois.get(g).getMetier().equals("druide")) {
                    g = r.nextInt(lesGaulois.size());
                }
                affronter(romain, lesGaulois.get(g));
                distribution(lesGaulois);
            }
        }while (sommeForce(lesRomains) >= 0) ;
    }
}
