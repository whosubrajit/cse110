//5

import java.util.Scanner;
public class a3test5 {
  public static void main (String [] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter the year :");
    int year = scan.nextInt();
    if (year%400==0){
      System.out.println(year + " is a leap year");
    }
    else if (year%100==0) {
      System.out.println(year + " is not a leap year"); // cant be leap year if divisible by 100 but not by 400, too! 
    }
    else if (year%4==0) {
      System.out.println(year + " is a leap year");
    }
    else {
      System.out.println(year + " is not a leap year");
    }    
    scan.close();
  }
}