import java.util.Random;

public class ArrayOddEven {
    public static void main(String[] args) {
        final int SIZE = 10;
        int[] numbers = new int[SIZE];
        System.out.println("The array is:" + "\n");
        Random r = new Random();
        int i = 0, even = 0, odd = 0;
        for (i = 0; i < SIZE; i++) {
            numbers[i] = r.nextInt(10);
            System.out.println((i + 1) + ". number is " + numbers[i]);
        }

        for (i = 0; i < SIZE; i++) {
            if (numbers[i] % 2 == 0) {
                even++;
            }
            if (numbers[i] % 2 != 0) {
                odd++;
            }
        }
        System.out.println();
        System.out.println("Even numbers' amount : " + even);
        System.out.println("Odd numbers' amount: " + odd);
    }
}
