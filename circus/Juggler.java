package circus;

public class Juggler implements Performer, BiologicalSpecies {
    @Override
    public void perform() {
        // each class does anything it thinks
        // is appropriate to do in perform() method
        System.out.println("circus.Juggler is juggling");
    }

    @Override
    public void specy(){
        System.out.println("Juggler is a human.. I think");
    }
}
