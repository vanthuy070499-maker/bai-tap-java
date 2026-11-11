
import java.util.Scanner;

public class CCC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = sc.nextLine();

        System.out.print("Enter height (m): ");
        double height = sc.nextDouble();

        System.out.print("Enter weight (kg): ");
        double weight = sc.nextDouble();

        double bmi = weight / (height * height);

        bmi = Math.round(bmi * 10) / 10.0;

        System.out.println("Name: " + name);
        System.out.println("BMI: " + bmi);

        if (bmi < 18) {
            System.out.println("Too thin");
        } else if (bmi <= 25) {
            System.out.println("Normal");
        } else {
            System.out.println("Obese");
        }
    }
}
