
import java.util.Scanner;

public class BBB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter top: ");
        double top = sc.nextDouble();

        System.out.print("Enter bottom: ");
        double bottom = sc.nextDouble();

        System.out.print("Enter height: ");
        double height = sc.nextDouble();

        double area = (top + bottom) * height / 2;

        System.out.println("Area: " + area);
    }
}
