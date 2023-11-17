import java.util.ArrayList;

public class Village {
    private ArrayList<Gaulois> lesGaulois;
    private String chef;

    public Village(ArrayList<Gaulois> lesGaulois, String chef){
        this.lesGaulois=lesGaulois;
        this.chef=chef;
    }

    @Override
    public String toString() {
        return "Le village est composé de : "+lesGaulois+"dont le chef est "+chef;
    }

    public void ajouter(Gaulois g){
        lesGaulois.add(g);
    }
}
