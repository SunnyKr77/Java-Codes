import java.util.Scanner;

public class Case{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //String fruit = input.next();

        // if (fruit.equals("mango")) {
        //     System.out.println("King of Fruit");
        // }

        // switch (fruit) {
        //     case "Mango" ->
        //         System.out.println("King of Fruits");
                
        //     case "Apple" ->
        //         System.out.println("Sweet fruit");
    
        //     case "Orange" ->
        //         System.out.println("Round fruit");
                
        //     default ->
        //         System.out.println("Enter valid fruit");

        int day = input.nextInt();
        // switch (day) {
        //     case 1 -> System.out.println("Monday");
        //     case 2 -> System.out.println("Tuesday");
        //     case 3 -> System.out.println("Wed");
        //     case 4 -> System.out.println("Thu");
        //     case 5 -> System.out.println("Fri");
        //     case 6 -> System.out.println("Sat");
        //     case 7 -> System.out.println("Sun");
        // }

        switch(day) {
            case 1,2,3,4,5 -> System.out.println("Weekday");
            case 6,7 -> System.out.println("Weekend");
        }

    
                
    }
}
