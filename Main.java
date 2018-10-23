import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*System.out.println("Hello world!");
        System.out.println("Enter you name");
        Scanner scanner = new Scanner(System.in);
        // Read a line
        String enteredLine = scanner.nextLine();
        System.out.println("Your name is: "+ enteredLine);
        scanner.close(); //peremennaja.metod
        Random r = new Random ();
        int n = r.nextInt(2);
        if (n>=0){ // v settingsah kakaja-to ficha lega...
            System.out.println(n+" – Yes");
        } else {
            System.out.println(n+ " - No");
        }
        */
        Random r = new Random();
        int n = r.nextInt(30);
        int m = r.nextInt(30);
        int l = r.nextInt(30);
        /*int n,m,l;
        n=10;
        m=7;
        l=40;*/
        System.out.println("n = " + n);
        System.out.println("m = " + m);
        System.out.println("l = " + l);

        if (m > n) {
            if (m > l) {
                System.out.println("m is biggest " + m);
            } else { //if (m<l)
                System.out.println("l is biggest " + l);
            }
        } else { // if (n<m)
            if (n > l) {
                System.out.println("n is biggest " + n);
            } else { // if (n<l)
                System.out.println("l is biggest " + l);
            }
        }
    }
}
