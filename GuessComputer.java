// (T2/3) Program guesses a number [01.html, 22nd slide]

import java.util.Random;
import java.util.Scanner;

public class GuessComputer {
    public static void main(String[] args) {
        int i = 0;
        String a;
        Random r = new Random();
        int n = r.nextInt(10);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Imagine your number (1-10). Now, programm will guess it. Type 'Enter'" + "\n");
        String u = String.valueOf(scanner.nextLine());
        do {
            i++;
            System.out.println("My number is " + n + ". Did I guess?");
            System.out.println("Please type 'Yes' or '>' if your number is more,");
            System.out.println("or '<' if your number is less." + "\n");
            a = String.valueOf(scanner.nextLine()); //
            if (a.equals("<")) {
                System.out.println("I didn't guess! :)" + "\n");
                n = r.nextInt(n);
            } else if (a.equals(">")) {
                int edge = n; //edge
                n = r.nextInt(10);
                do {
                    if (n <= edge)
                        n = r.nextInt(10);
                }
                while (!(n > edge));
            } else if (a.equals("Yes")) {
                System.out.println("I guessed!! " + "\n");
                break;
            }
        } while (!a.equals("Yes"));
        scanner.close();
        System.out.println("I guessed by " + i + " iterations");
        System.out.println("Your number was= " + n);
    }
}
