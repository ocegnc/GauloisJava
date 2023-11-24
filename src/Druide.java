import java.util.Random;

public class Druide extends Gaulois {
    protected int potionMin;
    protected int potionMax;

    public Druide(String nom, int force, int potionMin, int potionMax){
        super(nom, force, "druide");
        this.potionMin=potionMin;
        this.potionMax=potionMax;
    }

    public int produirePotion() {
        Random random = new Random();
        return random.nextInt(potionMax - potionMin + 1) + potionMin;
    }

    @Override
    public String toString() {
        return super.toString()+", potion minimum : "+potionMin+", potion maximale : "+potionMax;
    }


}

