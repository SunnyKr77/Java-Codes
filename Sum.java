import java.util.Scanner; 
public class Sum {
    public static void main(String[] args) {
        sum();
    }

    static void sum() {
        Scanner input = new Scanner (System.in);

        System.out.print("Enter num 1: ");
        int num1 = input.nextInt();

        System.out.print("Enter num 2: ");
        int num2 = input.nextInt();
        
        int sum = num1 + num2;
        System.out.println("The sum is " + sum);
    }
}
