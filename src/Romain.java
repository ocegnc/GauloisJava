public class Romain extends Humains{
    private Grade grade;

    public Romain(String nom, int force, Grade grade){
        super(nom, force);
        this.grade=grade;
    }

    public Grade getGrade() {
        return grade;
    }

    public String rencontre(Humains h){
        String rep = "";
        if(this.getGrade().equals(Grade.legionnaire)){
            rep = "Je te salue " + ((Romain) h).getGrade() + h.getNom() + ", je suis " + this.getNom();
        }
        if(this.getGrade().equals(Grade.centurion)){
            if(((Romain) h).getGrade().equals(Grade.chef)){
                rep = "Je te salue " + ((Romain) h).getGrade() + " " + h.getNom() + ", je suis " + this.getNom();
            } else {
                rep = "C'est à moi à te saluer " + this.getGrade() + " " + this.getNom() + ", je suis " + h.getNom();
            }
        } else {
            rep = "C'est à moi à te saluer " + this.getGrade() + " " + this.getNom() + ", je suis " + h.getNom();
        }
        return rep;
    }

    public String toString(){
        return super.toString() + ", grade=" + getGrade() + "\n";
    }

    public String getMetier(){
        return null;
    }
}
