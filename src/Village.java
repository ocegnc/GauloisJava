import java.util.ArrayList;

public class Village extends Groupe {
    private ArrayList<Humains> lesGaulois;

    public Village(Humains chef){
        super((Gaulois) chef);
        this.lesGaulois=new ArrayList<Humains>();
    }

    @Override
    public String toString() {
        return "Le village est composé de : "+lesGaulois+"dont le chef est "+(Gaulois) chef;
    }

    public void ajouter(Humains g){
        lesGaulois.add((Gaulois) g);
    }

    public void distribution(int potion){
        for(Humains g : lesGaulois){
            if(g.getForce()<5){
                g.force += potion;
            }
        }
    }

    /*public String bataille1(camp c){

    }*/
}
