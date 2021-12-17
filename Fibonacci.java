import java.util.Scanner; 
public class Fibonacci {
    public static void main(String[] args) {
        int t1 = 0;
        int t2 = 1;
        int count = 2;
        
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        
        while (count <= num) {
            int temp = t2;
            t2 = t1 + t2;
            t1 = temp;
            count++;
            System.out.println(t2);
        }
    }
}
