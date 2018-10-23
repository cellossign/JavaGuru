public class cheakArray {
    public static void main(String[] args) {
        int rows = 6;
        int columns = 6;

        String[][] fields = new String[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                fields[i][j] = "_";
            }
        }

        for (int i = (columns - 1); i > 0; i--) {
            for (int j = 0; j < 6; j++) {
                fields[1][j] = "O";
                //break;
            }
        }
        for (int i = (columns - 1); i > 0; i--) {
            fields[i][3 - 1] = "X";
            //break;
        }




        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print("[" + i + "][" + j + "]");
                System.out.print(fields[i][j] + "\t\t");
            }
            System.out.println();
        }

        int count = 1;
        boolean won = false;
        for (int j = 0; j < 6; j++) {
            count = 1;
            for (int i = 0; i < 5; i++) {
                if ((fields[i][j] == fields[i+1][j])
                        &&
                        ((fields[i][j] == "O") || (fields[i][j] == "X"))
                        ) {
                    count++;
                    System.out.println("podrjad in columns: " + count);
                }else {count=1;}
            }
            if (count >= 4) {
                won = true;
            }
        }

        for (int i = 0; i < 6; i++) {
            count = 1;
            for (int j = 0; j < 5; j++) {
                if ((fields[i][j] == fields[i][j + 1])
                        &&
                        ((fields[i][j] == "O") || (fields[i][j] == "X"))
                        ) {
                    count++;
                }else {count=1;}
            }
            if (count > 3) {
                won = true;
                break;
            }
        }
        System.out.println("podrjad in rows: " + count);
    }
}
