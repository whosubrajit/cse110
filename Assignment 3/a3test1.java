//1

import java.util.Scanner;
public class a3test1 {
  public static void main (String [] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter three numbers :");
    int num1 = scan.nextInt();
    int num2 = scan.nextInt();
    int num3 = scan.nextInt();
    int largest = 0;
    if (num1>num2 && num2>num3){
      largest = num1;
    System.out.println("Largest Number : " + largest);
  }
    else if (num2>num1 && num1>num3) {
       largest = num2;
      System.out.println("Largest Number : " + num2);
    }
    else {
      largest = num3;
      System.out.println("Largest Number : " + num3);
    }
    scan.close();
  }
}