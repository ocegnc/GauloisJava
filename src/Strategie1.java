import java.util.ArrayList;

public class Strategie1 implements Stratégie{

    public String affronter(Humains r, Humains g) throws Exception {
        String mes = "";
        int rForce = r.getForce();
        int gForce = g.getForce();
        rForce -= gForce/6;
        gForce -= rForce;
        return "Le romain se prend une baffe";
    }

    public String seBagarrer(ArrayList<Romain> lesRomains, ArrayList<Gaulois> lesGaulois) throws Exception{
        for (int i = 0; i < lesRomains.size(); i++) {
            do{
                //  distribution();
                Humains romain = lesRomains.get(i);
                Humains gaulois = lesGaulois.get(i);
                if (gaulois.getMetier().equals("chef") || gaulois.getMetier().equals("druide") || romain.getGrade()==Grade.chef) {
                    lesGaulois.remove(gaulois);
                    lesRomains.remove(romain);
                }
                else {
                    affronter(romain, gaulois);
                }
            } while(estTerminee()==false);
        }
        return "La bataille est terminée !";
    }
}
