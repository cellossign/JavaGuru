// "Greatest out of stream of numbers (ended by 0)" [01.html, 21st slide]

import java.util.Scanner;
public class Maximum {
    public static void main(String[] args) {
        System.out.println("Shas budet mnogo cifr. Postavjte '0', chtobi zakonchitj");
        int a = -1; //vvodit polzovatelj potom
        int max = 0; // naiboljshee. V nachale ono nolj.

        Scanner scanner = new Scanner(System.in);
        while (a!=0) {
            System.out.print("Input a number: ");
            a = Integer.valueOf(scanner.nextLine());
            if (a > max) {
                max = a;
            }
            if (a==0) break;
        }

        scanner.close();
        System.out.println("Last number: " + a);
        System.out.println("Greatest out of stream of numbers is: " + max);
    }
}
