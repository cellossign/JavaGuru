package circus;

import java.lang.reflect.Array;
import java.util.List;

public class Circus {
    public static void main(String[] args) {
        Clown clown = new Clown();
        act(clown);

        act(new Juggler());
        act(new Lion());

        tellSpecy(clown);


        tellSpecy (new BiologicalSpecies(){
            @Override
            public void specy {
                System.out.println("Clown has 2 legs");
            }
        });
    }

    public static void tellSpecy(BiologicalSpecies performer) {
        performer.specy();
    }

    private static void act(Performer performer) {//propisivaem metod, k-rij na osnove
        // argumenta Performer vizivaet metod Performera

        performer.perform();
    }
    public static void legs(Legs performer) {
        performer.legsCount();
    }
}
