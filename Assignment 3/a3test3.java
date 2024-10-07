//3

import java.util.Scanner;
public class a3test3 {
  public static void main (String [] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter two numbers :");
    int num1 = scan.nextInt();
    int num2 = scan.nextInt();
    System.out.println("Enter your operator (+, -, *, /) :");
    String operator = scan.next();
    
    if (operator.equals("+")){
      System.out.println(num1+num2);
    }
    else if (operator.equals("-")){
      System.out.println(num1-num2);
    }
    else if (operator.equals("*")){
      System.out.println(num1*num2);
    }
    else{
      System.out.println(num1/num2);
    }
    scan.close();
  }
}