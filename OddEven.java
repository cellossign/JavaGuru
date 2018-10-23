//(T2/2) Count odd and even numbers in a stream (stream ends by 0) [01.html, 22nd slide]

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        System.out.println("Shas budet mnogo cifr.");
        Scanner scanner = new Scanner(System.in);
        int a = 1; //vvodit polzovatelj potom
        int i = 0; // Even amount.
        int j = 0;//Odd amount

        while (a != 0) {
            System.out.println("");
            System.out.print("Input a number: ");
            a = Integer.valueOf(scanner.nextLine());
            if (a == 0) break;
            if (a % 2 == 0) {
                i++;
            }
            if (a % 2 != 0) {
                j++;
            }
            System.out.println("Even numbers now: " + i + "\n" + "Odd numbers now: " + j);
        }
        System.out.println("Even numbers' amount : " + i);
        System.out.println("Odd numbers' amount: " + j);
    }
}
