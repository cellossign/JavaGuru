import java.util.Random;

public class ArrayOfRandomNumbers {
    public static void main(String[] args) {
        final int SIZE = 10;
        int[] numbers = new int[SIZE];
        System.out.println("The array is:" + "\n");
        Random r = new Random();
        for (int i = 0; i < SIZE; i++) {
            numbers[i] = r.nextInt(10);
            System.out.println((i + 1) + ". number: " + numbers[i]);
        }
    }
}