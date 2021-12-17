import java.util.Scanner; 

public class Vol_prism {
    public static void main(String[] args) {
        // Formula = Area of base * height (For triangular prism)
        Scanner inp = new Scanner(System.in);

        System.out.print("Enter base of prism ");
        float base = inp.nextFloat();

        System.out.print("Enter length of prism ");
        float length = inp.nextFloat();

        System.out.print("Enter height of prism ");
        float height = inp.nextFloat();

        float area = (base * length);

        float volume = (area * height);
        System.out.println("The volume of prism is " + volume);
    }    
}
