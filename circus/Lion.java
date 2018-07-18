package circus;

public class Lion implements Performer, BiologicalSpecies, Legs {
    @Override
    public void perform() {
        System.out.println("Lion is jumping through rings of fire");
    }

    @Override
    public void specy() {
        System.out.println("Lion is an animal");
    }

    @Override
    public void legsCount() {
        System.out.println("Lian is Legs are 4");
    }
}
