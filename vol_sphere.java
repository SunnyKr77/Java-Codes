import java.util.Scanner;
import static java.lang.Math.*;

public class vol_sphere {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the radius : ");
        float radius = in.nextFloat();

        double pi = Math.PI;

        double volume = (4 * PI * radius * radius * radius)/3;
        System.out.println("The volume of Sphere is " + volume);
    }
}
