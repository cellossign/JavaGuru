package gravitrips;

import java.util.Scanner;

public class Human extends Player {
    public FieldValue chip;

    public Human(FieldValue chip) {
        this.chip = chip;
    }

    @Override
    public int move() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose column from 1 to 6");
        int chosenColumn = sc.nextInt();
        System.out.println("Human: " + chosenColumn + " .column");
        //System.out.println();
        sc.close();
        return chosenColumn;
    }
}
