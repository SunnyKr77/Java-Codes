import java.util.Scanner; 

public class pro_sum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        
        int product = 1;
        int temp = num;
        while(num > 0) {
            int rem = num % 10;
            num /= 10;
            product = product * rem;
        }
        //System.out.println(product);

        //System.out.println(temp);

        int sum = 0;
        while (temp > 0) {
            int rem = temp % 10;
            temp /= 10;
            sum = sum + rem;
        }
        //System.out.println(sum);

        System.out.println(product - sum);
    }    
}
