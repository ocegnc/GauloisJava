import java.util.Random;

public class Gaulois extends Humains{
    private String metier;

    public Gaulois(String nom, String metier){
        super(nom, 1);
        this.metier=metier;
    }
    public Gaulois(String nom, int force, String metier){
        super(nom,force);
        this.metier=metier;
    }

    public String getMetier() {
        return metier;
    }

    @Override
    public Grade getGrade() {
        return null;
    }

    public String rencontre(Humains h){
        return "Bonjour je suis "+h.getNom()+"!\nBonjour "+h.getNom()+" moi c'est "+this.getNom()+"!";
    }

    public String toString(){
        return super.toString()+" , métier : "+metier+"\n";
    }


}

