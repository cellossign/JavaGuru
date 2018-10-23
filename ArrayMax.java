import java.util.Random;

public class ArrayMax {
    public static void main(String[] args) {
        final int SIZE = 10;
        int[] numbers = new int[SIZE];
        int i = 0;
        System.out.println("The array is:" + "\n");
        Random r = new Random();
        for (i = 0; i < SIZE; i++) {
            numbers[i] = r.nextInt(20);
            System.out.println((i + 1) + ". number: " + numbers[i]);
        }

        int max = 0;
        for (i = 0; i < SIZE; i++) {
            if (numbers[i] > max)
                max = numbers[i];
        }
        System.out.println();
        System.out.println("The greatest number is " + max);
    }
}
