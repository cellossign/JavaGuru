// (T2/3') Program lets human guess a number [01.html, 22nd slide]

import java.util.Random;
import java.util.Scanner;

public class Guess {
    public static void main(String[] args) {
        Random r = new Random();
        int n = r.nextInt(100);
        int a = -1; // vvedet poljzovatelj
        int i = 0;
        Scanner scanner = new Scanner(System.in);
        while (a != n) {
            i++;
            System.out.print("Input a number: ");
            a = Integer.valueOf(scanner.nextLine());
            if (n > a) {
                System.out.println("Chislo dolzhno bit' bol'she. ");
            } else if (n < a) {
                System.out.println("Chislo dolzhno bit' men'she. ");
            }
        }
        scanner.close();
        System.out.println("Pozdravljaem! vi ugadali za " + i + " iteraciji");
        System.out.println("n = " + n);
        System.out.println("a = " + a);
    }
}
