import java.util.ArrayList;
import java.util.List;

public class Bataille {

    private ArrayList<Humains> lesGaulois;
    private ArrayList<Humains> lesRomains;

    public Bataille(ArrayList<Humains> lesGaulois, ArrayList<Humains> lesRomains){
        this.lesGaulois=lesGaulois;
        this.lesRomains=lesRomains;
    }

    private boolean estTerminee(){
        boolean v = true;
        for (Humains r : lesRomains){
            if (r.force!=0){//au moins 1 romain a de la force donc bataille pas termine
                v = false;
            }
        }
        return v;
    }

  /*  public void distribution(){
        Druide druide = lesGaulois.;
        for(Humains g : lesGaulois){
            if(g.getForce()<5){
                g.force += druide.produirePotion();
            }
        }
    }
   */

    public String strategieUne() throws Exception {
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

    public String affronter(Humains r, Humains g) throws Exception {
        String mes = "";
        int rForce = r.getForce();
        int gForce = g.getForce();
        rForce -= gForce/6;
        gForce -= rForce;
        return "Le romain se prend une baffe";
    }

}
