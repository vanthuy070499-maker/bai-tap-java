
import java.util.Scanner;

public class AAA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter height (m): ");
        double height = sc.nextDouble();

        double cm = height * 100;

        System.out.println("Height is " + (int)cm + " cm");
    }
}
