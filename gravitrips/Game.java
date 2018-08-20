package gravitrips;

public class Game {
    public static void main(String[] args) {
        int rows = 6;
        int columns = 6;

        Desk desk = new Desk(rows, columns);

        Player player1 = new AI(FieldValue.O);
        Player player2 = new Human(FieldValue.X);
        Player currentPlayer;

        //1

        currentPlayer = player1;
        currentPlayer.chip = ((AI) player1).chip;

        for (int i = 0; i < 9; i++) {
            int chosenColumnPlayer1 = currentPlayer.move();
            desk.changeDesk(chosenColumnPlayer1, currentPlayer.chip); // Допустим, игрок походил в 3 столбец крестиком
            desk.showDesk(desk);

            boolean finish = desk.checkWinner();
            boolean finishX = desk.checkWinnerByColumns();
            System.out.println();
            if (finishX == true) {
                System.out.println("X win");
            }

            if (finish == true) {
                System.out.println("O win");
            } else {
                System.out.println("O did not win");
            }
            if (currentPlayer == player1) {
                currentPlayer = player2;
                currentPlayer.chip = ((Human) player2).chip;
            } else {
                currentPlayer = player1;
                currentPlayer.chip = player1.chip;
            }

        }


////2
//        int chosenColumnPlayer2 = player2.move();
//        desk.changeDesk(chosenColumnPlayer2, ((AI) player2).chip);
//        desk.showDesk(desk);
//
//        finish = desk.checkWinner();
//        finishX = desk.checkWinnerByColumns();
//        System.out.println();
//        if (finishX == true) {
//            System.out.println("X win");
//        }
//
//        if (finish == true) {
//            System.out.println("O win");
//        } else {
//            System.out.println("O did not win");
//        }
//
//
////3
//        chosenColumnPlayer1 = player1.move();
//        desk.changeDesk(chosenColumnPlayer1, ((AI) player1).chip);
//        desk.showDesk(desk);
//
//        finish = desk.checkWinner();
//        finishX = desk.checkWinnerByColumns();
//        System.out.println();
//        if (finishX == true) {
//            System.out.println("X win");
//        }
//
//        if (finish == true) {
//            System.out.println("O win");
//        } else {
//            System.out.println("O did not win");
//        }
//
//
//        //4
//        chosenColumnPlayer2 = player2.move();
//        desk.changeDesk(chosenColumnPlayer2, ((AI) player2).chip);
//        desk.showDesk(desk);
//
//        finish = desk.checkWinner();
//        finishX = desk.checkWinnerByColumns();
//        System.out.println();
//        if (finishX == true) {
//            System.out.println("X win");
//        }
//
//        if (finish == true) {
//            System.out.println("O win");
//        } else {
//            System.out.println("O did not win");
//        }
//
//
//        //5
//        chosenColumnPlayer1 = player1.move();
//        desk.changeDesk(chosenColumnPlayer1, ((AI) player1).chip);
//        desk.showDesk(desk);
//
//        finish = desk.checkWinner();
//        finishX = desk.checkWinnerByColumns();
//        System.out.println();
//        if (finishX == true) {
//            System.out.println("X win");
//        }
//
//        if (finish == true) {
//            System.out.println("O win");
//        } else {
//            System.out.println("O did not win");
//        }
//
//        //6
//        chosenColumnPlayer2 = player2.move();
//        desk.changeDesk(chosenColumnPlayer2, ((AI) player2).chip);
//        desk.showDesk(desk);
//
//        finish = desk.checkWinner();
//        finishX = desk.checkWinnerByColumns();
//        System.out.println();
//        if (finishX == true) {
//            System.out.println("X win");
//        }
//
//        if (finish == true) {
//            System.out.println("O win");
//        } else {
//            System.out.println("O did not win");
//        }
//
//
//        //7
//        chosenColumnPlayer1 = player1.move();
//        desk.changeDesk(chosenColumnPlayer1, ((AI) player1).chip);
//        desk.showDesk(desk);
//
//        finish = desk.checkWinner();
//        if (finish == true) {
//            System.out.println("O win");
//        } else {
//            System.out.println("O did not win");
//        }
//
//        finishX = desk.checkWinnerByColumns();
//        System.out.println();
//        if (finishX == true) {
//            System.out.println("X win");
//        }
//
//
////8
//        chosenColumnPlayer2 = player2.move();
//        desk.changeDesk(chosenColumnPlayer2, ((AI) player2).chip);
//        desk.showDesk(desk);
//
//        finish = desk.checkWinner();
//        finishX = desk.checkWinnerByColumns();
//        System.out.println();
//        if (finishX == true) {
//            System.out.println("X win");
//        }
//
//        if (finish == true) {
//            System.out.println("O win");
//        } else {
//            System.out.println("O did not win");
//        }
//
//
////9
//        chosenColumnPlayer1 = player1.move();
//        desk.changeDesk(chosenColumnPlayer1, ((AI) player1).chip);
//        desk.showDesk(desk);
//
//
//        finish = desk.checkWinner();
//        finishX = desk.checkWinnerByColumns();
//        System.out.println();
//        if (finishX == true) {
//            System.out.println("X win");
//        }
//
//        if (finish == true) {
//            System.out.println("O win");
//        } else {
//            System.out.println("O did not win");
//        }
//        cycle {
//            player move
//            check( if true break) else
//            change player (human - ai)
//        }
    }

    public static int check() {
        return 0;
    }

}
