import java.util.Scanner; 

public class Fibonacci_o {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        int t1 = 0;
        int t2 = 1;
        int count = 2;

        while(count <= num) {
            int temp = t2;
            t2 = t1 + t2;
            t1 = temp;
            count++;
            System.out.print(t2 + " ");
        }
        
    }    
}
