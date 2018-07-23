package CTCo;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Insert a number for triangle's base: ");
        int n = Integer.valueOf(sc.nextLine());
        char s = '*';
        char[][] a = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = s;
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
    }
}
