import java.util.Scanner; 
 
public class Greet_Para{
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.print("Enter yout name: ");
        String name = in.next();

        String personalised = myGreet(name);
        System.out.println(personalised);
    }

    static String myGreet(String name) {
        String message = "Hello " + name;
        return message;
    }
}