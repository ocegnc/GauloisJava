public class Vaisseau extends Groupe{

    Vaisseau(Humains chefP){
        super(chefP);
    }

    public void ajouter(Humains p){
        lesHabitants.add((Pirate) p);
    }

}
