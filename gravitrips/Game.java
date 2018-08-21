package gravitrips;

public class Game {
    public static void main(String[] args) {
        int rows = 6;
        int columns = 6;

        Desk desk = new Desk(rows, columns);

        Player player1 = new AI(FieldValue.O);
        Player player2 = new Human(FieldValue.X);
        Player currentPlayer;

        currentPlayer = player1;
        currentPlayer.chip = ((AI) player1).chip;

        boolean winRows = false;
        boolean winColumns = false;
        boolean isFull = false;
        boolean finish = false;


        int countChances = 1;
        while (finish == false) {

            int chosenColumnPlayer1 = currentPlayer.move();

            if (desk.fields[0][chosenColumnPlayer1 - 1] == FieldValue._) {
                countChances = 1;
                desk.changeDesk(chosenColumnPlayer1, currentPlayer.chip);
                desk.showDesk(desk);

                winRows = desk.checkWinner();
                winColumns = desk.checkWinnerByColumns();

                System.out.println();
                if ((winColumns) || (winRows)) {
                    finish = true;
                    System.out.println("Game over. " + currentPlayer.chip + " wins");
                    break;
                }

                isFull = desk.checkIfIsFull(desk);
                if (isFull) {
                    finish = true;
                    System.out.println("Game over. Nobody wins");
                    break;
                }

                if (currentPlayer == player1) {
                    currentPlayer = player2;
                    currentPlayer.chip = ((Human) player2).chip;
                } else {
                    currentPlayer = player1;
                    currentPlayer.chip = player1.chip;
                }
            } else {
                System.out.println("This column is full. Please, choose an other column");
                countChances++;
            }
            if (countChances > 7) {
                System.out.println("Oh, it's enough!..");
                finish = true;
                break;
            }
        }
    }

    public static int check() {
        return 0;
    }

}
