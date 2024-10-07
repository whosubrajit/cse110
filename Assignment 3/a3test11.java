//11

import java.util.Scanner;
public class a3test11 {
  public static void main (String [] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter the three lengths :");
    int l1 = scan.nextInt();
    int l2 = scan.nextInt();
    int l3 = scan.nextInt();
    if (l1 == l2 && l2==l3){
      System.out.println("This is a Equilateral triangle");
    }
    else if (l1==l2 || l2==l3 || l1==l3){
      System.out.println("This is a Isosceles triangle");
    }
    else {
      System.out.println("This is a Scalene triangle");
    }
    scan.close();
  }
}
