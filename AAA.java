import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[5];
        int sum = 0;
        int max, min;

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }

        max = numbers[0];
        min = numbers[0];

        for (int i = 0; i < 5; i++) {
            sum += numbers[i];

            if (numbers[i] > max) {
                max = numbers[i];
            }

            if (numbers[i] < min) {
                min = numbers[i];
            }
        }

        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);
        System.out.println("Total: " + sum);
        System.out.println("Average: " + (sum / 5.0));
    }
}