import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {

        // Village de Gaulois

        Gaulois abraracourcix = new Gaulois("Abraracourcix","chef" );
        Gaulois agecanonix = new Gaulois("Agecanonix","retraité" );
        Gaulois assurancetourix = new Gaulois("Assurancetourix","barde" );
        Gaulois bonemine = new Gaulois("Bonemine","femme du chef" );
        Gaulois asterix = new Gaulois("Astérix","héros" );
        Gaulois obelix = new Gaulois("Obélix",15, "tailleur de menhir" );
        Gaulois cetautomatix = new Gaulois("Cétautomatix","forgeron" );
        Gaulois tragicomix = new Gaulois("Tragicomix","beau gosse" );
        Gaulois ordralbabetix = new Gaulois("Ordralbabétix","poissonnier" );
        Gaulois falbala = new Gaulois("Falbala","fiancée" );
        Gaulois panoramix = new Gaulois("Panoramix","druide" );

        Village village = new Village(abraracourcix);

        village.ajouter(agecanonix);
        village.ajouter(assurancetourix);
        village.ajouter(bonemine);
        village.ajouter(asterix);
        village.ajouter(obelix);
        village.ajouter(cetautomatix);
        village.ajouter(tragicomix);
        village.ajouter(ordralbabetix);
        village.ajouter(falbala);
        village.ajouter(panoramix);

        System.out.println(village);
        System.out.println(village.rencontre(abraracourcix));

        // Camp de Romains

        Romain  caiusObtus = new Romain("Caius Obtus", 1, Grade.chef);
        Romain  brutus = new Romain("Brutus",1, Grade.centurion);
        Romain  briseradius = new Romain("Briseradius", 1, Grade.legionnaire);
        Romain  caligulaMinus = new Romain("Caligula Minus", 1, Grade.legionnaire);
        Romain  chorus = new Romain("Chorus", 1, Grade.centurion);
        Romain  milexcus = new Romain("Milexcus", 1, Grade.legionnaire);

        Camp babaorum = new Camp(caiusObtus);

        babaorum.ajouter(brutus);
        babaorum.ajouter(briseradius);
        babaorum.ajouter(caligulaMinus);
        babaorum.ajouter(milexcus);
        babaorum.ajouter(chorus);

        System.out.println(babaorum);
        System.out.println(babaorum.rencontre(caiusObtus));
        System.out.println(babaorum.rencontre(milexcus));

        ArrayList<Humains> lesRomains = babaorum.getLesHabitants();
        ArrayList<Humains> lesGaulois = village.getLesHabitants();
        Bataille bataille = new Bataille(lesGaulois, lesRomains);

        System.out.println(bataille.strategieUne());

    }
}