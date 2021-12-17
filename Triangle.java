import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);

        System.out.print("Enter base: ");
        float base = in.nextFloat();

        System.out.print("Enter height: ");
        float height = in.nextFloat();

        System.out.println("Area of triangle is: " + (0.5 * (base * height)));
    }
}
