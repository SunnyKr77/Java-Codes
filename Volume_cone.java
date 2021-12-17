import java.util.Scanner; 
import static java.lang.Math.*; 

public class Volume_cone{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter radius of cone : ");
        float rad = in.nextFloat();

        System.out.print("Enter height of cone : ");
        float height = in.nextFloat();

        double pi = Math.PI;

        double area = (pi * rad * rad * (height/3));
        System.out.println("The volume of cone is : " + area);

    }
}