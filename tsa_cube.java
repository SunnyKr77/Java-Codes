import java.util.Scanner; 
public class tsa_cube {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter side of cube : ");
        // 6 * (side*side)

        float side = inp.nextFloat();

        float tsa = (6 * (side * side));
        System.out.println("The TSA of cube is : " + tsa);
        
    }
}
