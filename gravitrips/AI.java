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
        int chosenColumn = r.nextInt(5)+1;
        System.out.println();

        System.out.println("AI: "+chosenColumn+". column");
        return chosenColumn;
    }
}
