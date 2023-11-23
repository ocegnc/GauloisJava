public class Pirate extends Humains{
    public Pirate(String nom, int force){
        super(nom, force);
    }

    public String rencontre(Humains p){
        return "En garde moussaillon !";
    }

    public String toString(){
        return super.toString();
    }

    @Override
    public String getMetier() {
        return null;
    }

    @Override
    public Grade getGrade() {
        return null;
    }
}
