import java.util.ArrayList;

public class Strategie2 implements Stratégie{

    public void groupeGaulois(ArrayList<Humains> lesGaulois){
        ArrayList<Humains> groupe1 = new ArrayList<>();
        ArrayList<Humains> groupe2 = new ArrayList<>();
        ArrayList<Humains> groupe3 = new ArrayList<>();
        ArrayList<Humains> groupe4 = new ArrayList<>();

        for(Humains g : lesGaulois){
            if(g.getForce()<5){
                groupe1.add(g);
            }
            if(g.getForce()>5 && g.getForce()<10){
                groupe2.add(g);
            }
            if(g.getForce()>10 && g.getForce()<15){
                groupe3.add(g);
            }
            if(g.getForce()>15){
                groupe4.add(g);
            }
        }
    }

    public void seBagarrer(ArrayList<Humains> lesRomains, ArrayList<Humains> lesGaulois) {
    }
}
