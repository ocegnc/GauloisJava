
public class Druide extends Gaulois {
    private int potionMin;
    private int potionMax;

    public Druide(String nom, int force, String metier, int potionMin, int potionMax){
        super(nom, force);
        this.metier="druide";
        this.potionMin=potionMin;
        this.potionMax=potionMax;
    }

    @Override
    public String toString() {
        return super.toString()+", potion minimum : "+potionMin+", potion maximale : "+potionMax;
    }


}

