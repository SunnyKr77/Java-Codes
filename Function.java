import java.util.Scanner;

public class Function {
    public static void main(String[] args) {
    //    int ans = sum2();
    //    System.out.println(ans);
        int ans = sum3(20, 30);
        System.out.println(ans);
    }

    static int sum3(int a, int b) {
        int sum = a + b;
        return sum;
    }

    // static int sum2() {
    //     Scanner input = new Scanner (System.in);

    //     System.out.print("Enter num 1: ");

    //     int num1 = input.nextInt();
    //     System.out.print("Enter num 2: ");

    //     int num2 = input.nextInt();
    //     int sum = num1 + num2;

    //     return sum;
    // }

    // static void sum() {
    //     Scanner input = new Scanner (System.in);

    //     System.out.print("Enter num 1: ");
    //     int num1 = input.nextInt();

    //     System.out.print("Enter num 2: ");
    //     int num2 = input.nextInt();
        
    //     int sum = num1 + num2;
    //     System.out.println("The sum is " + sum);
    // }
}
