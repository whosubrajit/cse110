//4

import java.util.Scanner;
public class a3test4 {
  public static void main (String [] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter a number :");
    int num1 = scan.nextInt();
    if (num1%5==0 && num1%7==0){
      System.out.println("Divisible by Both");
    }
    else if (num1%5==0) {
      System.out.println("Invalid: Divisible by 5 Only");
    }
    else if (num1%7==0) {
      System.out.println("Invalid: Divisible by 7 Only");
    }
    else {
      System.out.println("No");
    }
    scan.close();
  }
}
