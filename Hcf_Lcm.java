import java.util.Scanner; 
public class Hcf_Lcm {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        float principal, rate, time;

        System.out.print("Enter principal: ");
        principal = in.nextFloat();

        System.out.print("Enter Interest rate: ");
        rate = in.nextFloat();

        System.out.print("Enter time period: ");
        time = in.nextFloat();

        float simple_interest = (principal*rate*time)/100;
        System.out.println("Simple interest is " + simple_interest);
        
        float amount = (principal + simple_interest);
        System.out.println("Total amount is " + amount);
    }
}
