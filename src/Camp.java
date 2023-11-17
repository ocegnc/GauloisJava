import java.util.ArrayList;

public class Camp extends Groupe{
    private ArrayList<Romain> lesRomains;
    Camp(Humains chefR){
        super((Romain) chefR);
        lesRomains=new ArrayList<>();
    }

    public void ajouter(Humains r){
        lesRomains.add((Romain) r);
    }

    public String toString(){
        return super.toString();
    }
}
