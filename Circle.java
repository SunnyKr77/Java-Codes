import java.util.Scanner; 

public class Circle {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);

        System.out.print("Enter Radius: ");
        int r = in.nextInt();
        float pie = 3.14f;

        System.out.println("Area of Circle "+ (pie * (r*r)));
    }    
}
