// (T2/3) Program guesses a number [01.html, 22nd slide]

import java.util.Random;
import java.util.Scanner;

public class ComputerGuessesTheNumber {
    public static void main(String[] args) {
        int i = 0;
        String a;
        Random r = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Imagine your number (1-100). Now, programm will guess it. Type 'Enter'" + "\n");
        String u = String.valueOf(scanner.nextLine());
        int low = 0;
        int high = 100;
        int n = r.nextInt(high);
        do {
            i++;
            System.out.println("My number is " + n + ". Did I guess?");
            System.out.println("Please type 'Yes' or '>' if your number is more,");
            System.out.println("or '<' if your number is less.");
            System.out.println();
            a = String.valueOf(scanner.nextLine());

            if (a.equals("<")) {
                System.out.println("I didn't guess! :)" + "\n");
                high = n;
                n = r.nextInt(high);
                do {
                    if (n <= low) {
                        n = r.nextInt(high);
                    }
                }
                while (n <= low);

            } else if (a.equals(">")) {
                System.out.println("I didn't guess! :)" + "\n");
                low = n;
                n = r.nextInt(high);
                do {
                    if (n <= low)
                        n = r.nextInt(high);
                }
                while (n <= low);

            } else if ((a.equals("Yes")) || (a.equals("yes"))) {
                System.out.println("I guessed!! ");
                break;
            }
        } while (!a.equals("Yes"));
        scanner.close();

        System.out.println("I guessed by " + i + " iterations");
        System.out.println("Your number was " + n);
    }
}
