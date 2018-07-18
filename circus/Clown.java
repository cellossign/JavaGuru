package circus;

public class Clown implements Performer, BiologicalSpecies, Legs {
    @Override //must be overriden due to circus.Performer implementation
    public void perform() {
        System.out.println("Clown is walking a tightrope");
    }

    @Override
    public void specy() {

        System.out.println("Clown is a human");
    }

    @Override
    public void legsCount() {
        System.out.println("Clown has 2 legs");
    }
}
