import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int empID = input.nextInt();
        String dept = input.next();

        switch (empID) {
            case 1 -> System.out.println("Sunny kr");
            case 2 -> System.out.println("Sukuna");
            case 3 -> {
                switch (dept) {
                    case "IT" -> System.out.println("IT Dept");
                    case "Management" -> System.out.println("Managemnt Dept");
                    default -> System.out.println("No dept");
                }
            }
            default -> System.out.println("Wrong Entry");
        }
    }
}