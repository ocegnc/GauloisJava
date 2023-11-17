public abstract class Humains {
    protected String nom;
    protected int force;

    public Humains(String nom, int force){
        this.nom=nom;
        this.force=force;
    }

    public abstract String rencontre(Humains h);

    public String getNom() {
        return nom;
    }

    public int getForce() {
        return force;
    }

    @Override
    public String toString() {
        return getClass().getName() + " : " + nom + ", force=" + force;
    }
}
