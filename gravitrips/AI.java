package gravitrips;

import java.util.Random;

public class AI extends Player {
    public FieldValue chip;

    public AI(FieldValue chip) {
        this.chip = chip;
    }

    @Override
    public int move() {
        Random r = new Random();
        int random;
        int chosenColumn = r.nextInt(6);

        System.out.println("AI: " + (chosenColumn + 1) + ". column");
        return (chosenColumn + 1);
    }
}
