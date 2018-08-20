package gravitrips;

public class Desk {
    private int rows, columns;
    public FieldValue[][] fields;

    public Desk(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;

        this.fields = new FieldValue[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                fields[i][j] = FieldValue._;
            }
        }
    }

    public boolean checkWinner() {
        int count = 1;
        boolean won = false;
        for (int i = 0; i < 6; i++) {
            count = 1;
            for (int j = 0; j < 5; j++) {
                if ((fields[i][j] == fields[i][j + 1])
                        &&
                        ((fields[i][j] == FieldValue.O) || (fields[i][j] == FieldValue.X))
                        ) {
                    count++;
                }
            }
        }
        //System.out.println("podrjad: " + count);
        if (count >= 4) {
            won = true;
        }
        return won;
    }

    public boolean checkWinnerByColumns() {
        int count = 1;
        boolean won = false;
        for (int i = 0; i < 5; i++) {
            count = 1;
            for (int j = 0; j < 5; j++) {
                if ((fields[j][i] == fields[j][i + 1])
                        &&
                        ((fields[j][i] == FieldValue.O) || (fields[j][i] == FieldValue.X))
                        ) {
                    count++;
                }
            }
        }
       // System.out.println("podrjad columns: " + count);
        if (count >= 4) {
            won = true;
        }
        return won;
    }


    public FieldValue[][] changeDesk(int column, FieldValue chip) {

        for (int i = (columns - 1); i >= 0; i--) {
            //continue;
            if (fields[i][column - 1] == FieldValue._) {
                fields[i][column - 1] = chip;
                break;
            } else {
                continue;
            }
        }
        return fields;
    }


    public static void showDesk(Desk desk) {
        //просто распечатка результата
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print(desk.fields[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }

}
