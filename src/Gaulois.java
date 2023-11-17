import java.util.Random;

public class Gaulois extends Humains{
    private String metier;

    public Gaulois(String nom, String metier){
        super(nom, 1);
        this.metier=metier;
    }
    public Gaulois(){
        super("Obélix",15);
        this.metier="Tailleur de menhir";
    }

    public String toString(){
        return "Gaulois : "+super.toString()+" , métier : "+metier;
    }

    public String rencontre(){
        Random r=new Random();
        int i = r.nextInt(lesHabitants.size());
        Humains g = lesHabitants.get(i);
        return "Bonjour je suis "+nom+"\n Bonjour "+nom+" moi c'est "+g.getNom();
    }
}

