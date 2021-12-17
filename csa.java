import java.util.Scanner;
import static java.lang.Math.*; 

public class csa {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double pi = Math.PI;
            // 2*pi*rh = csa of cylinder
        System.out.print("Enter radius : ");
        float radius = in.nextFloat();

        System.out.print("Enter height : ");
        float height = in.nextFloat();

        double curve_sa = (2 * pi * radius * height);
        System.out.println("The CSA of cylinder is : " + curve_sa);
    }
}
