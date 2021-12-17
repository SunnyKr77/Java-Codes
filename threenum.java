import java.util.Scanner;

public class threenum {
  public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);

    // for(int i = 1; i<=3; i++){
    //  int num1 = input.nextInt(); 
    // }
    
    int num1 = input.nextInt();
    int num2 = input.nextInt();
    int num3 = input.nextInt();

// ----------------------- //

    // if(num1 > num2){
    //   if(num1 > num3){
    //     System.out.println("Num 1 is largest");
    //   }
    // }
    // else if(num2 > num3){
    //     System.out.println("Num 2 is largest");
    //   }
    // else{
    //   System.out.println("Num 3 is largest");
    // }

// --------------------- //

  // int max = num1;

  // if(num2 > max){
  //   max = num2;
  // }
  // if(num3 > max){
  //   max = num3;
  // }

  // System.out.println(max);

// ----------------------- //

  int max = Math.max(num3 , Math.max(num1, num2));

  System.out.println(max + " is largest");

  
   }
}