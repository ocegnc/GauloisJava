import java.util.ArrayList;

public class Village extends Groupe {

    public Village(Humains chef){
        super((Gaulois) chef);
        this.lesHabitants=new ArrayList<Humains>();
    }


    public String toString() {
        return "Le village est composé de : "+lesHabitants+"dont le chef est "+(Gaulois) chef;
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

    /*public String bataille1(camp c){

    }*/
}
