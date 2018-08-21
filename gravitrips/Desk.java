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
        int score=0;
        boolean won = false;

        for (int i = 0; i < 6; i++) {
            count = 1;
            for (int j = 0; j < 5; j++) {
                if ((fields[i][j] == fields[i][j + 1])
                        &&
                        ((fields[i][j] == FieldValue.O) || (fields[i][j] == FieldValue.X))
                        ) {
                    count++;
                    System.out.println("the same in " + (i + 1) + " row: " + count);
                    if (count > 3) {
                        score = count;
                    }
                } else {
                    count = 1;
                }
            }
            if (score > 3) {
                won = true;
                break;
            }
        }
        return won;
    }

    public boolean checkWinnerByColumns() {
        int count = 1;
        int score=0;
        boolean won = false;
        for (int j = 0; j < 6; j++) {
            count = 1;
            for (int i = 0; i < 5; i++) {
                if ((fields[i][j] == fields[i + 1][j])
                        &&
                        ((fields[i][j] == FieldValue.O) || (fields[i][j] == FieldValue.X))
                        ) {
                    count++;
                    System.out.println("The same in " + (j + 1) + " column: " + count);
                    if (count > 3) {
                        score = count;
                    }
                } else {
                    count = 1;
                }
            }
            if (score > 3) {
                won = true;
                break;
            }
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

    public static boolean checkIfIsFull(Desk desk) {
        boolean isFull = true;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (desk.fields[i][j] == FieldValue._) {
                    isFull = false;
                    break;
                }
                ;
            }
        }
        return isFull;
    }

    public static void showDesk(Desk desk) {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print(desk.fields[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }


    public boolean checkWinnerByDiagonal() {
        boolean won = false;

        for (int i = 5; i > 2; i--) {
            for (int j = 0; j < 3; j++) {
                if (((fields[i][j] == fields[i - 1][j + 1]) &&
                        (fields[i][j] == fields[i - 2][j + 2]) &&
                        (fields[i][j] == fields[i - 3][j + 3]))
                        &&
                        ((fields[i][j] == FieldValue.O) || (fields[i][j] == FieldValue.X))
                        ) {
                    System.out.println("the same are in diagonal [" + (i - 2) + "][" + (j + 4) + "]");
                    won = true;
                }//else {count=1;}
            }
            for (int j = 3; j < 6; j++) {
                if (((fields[i][j] == fields[i - 1][j - 1]) &&
                        (fields[i][j] == fields[i - 2][j - 2]) &&
                        (fields[i][j] == fields[i - 3][j - 3]))
                        &&
                        ((fields[i][j] == FieldValue.O) || (fields[i][j] == FieldValue.X))
                        ) {
                    System.out.println("the same are in diagonal [" + (i - 2) + "][" + (j - 3) + "]");
                    won = true;
                }
            }
        }
        return won;
    }
}
