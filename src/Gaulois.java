
public class Gaulois extends Humains{
    private String metier;

    public Gaulois(String nom, int force, String metier){
        super(nom, force);
        this.metier=metier;
    }

    public String toString(){
        return "Gaulois : "+super.toString()+" , métier : "+metier;
    }

    public String getNom(){
        return nom;
    }

    public String rencontre(Gaulois g){
        return "Bonjour je suis"+g.getNom()+" /n Bonjour "+g.getNom()+"moi c'est "+this.getNom();
    }
}

