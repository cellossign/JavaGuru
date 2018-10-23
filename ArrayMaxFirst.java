import java.util.Random;

public class ArrayMaxFirst {
    public static void main(String[] args) {
        final int SIZE = 10;
        int[] numbers = new int[SIZE];
        int i = 0, max=0;
        Random r = new Random();
        System.out.println("The array is:" + "\n");
        for (i = 0; i < SIZE; i++) {
            numbers[i] = r.nextInt(20);
            System.out.println((i + 1) + ". number: " + numbers[i]);
        }
        for (i = 0; i < SIZE; i++) {
            if (numbers[i] > max)
                max = numbers[i];
        }

        System.out.println("Greatest number is " + max);
        System.out.println();
        numbers[0]=max;
        System.out.println("Now the array is:" + "\n");
        for (i = 0; i < SIZE; i++) {
            System.out.println((i + 1) + ". number: " + numbers[i]);
        }

    }
}
