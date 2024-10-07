//13

import java.util.Scanner;
public class a3test13 {
  public static void main (String [] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Input the first number :");
    int n1 = scan.nextInt();
    System.out.print("Input the second number :");
    int n2 = scan.nextInt();
    System.out.print("Input the third number :");
    int n3 = scan.nextInt();
    if (n1==n2 && n2==n3){
      System.out.println("All three numbers are equal");
    }
    else if (n1!=n2 && n2!=n3 && n3!=n1) {
      System.out.println("All numbers are different");
    }
    else {
      System.out.println("Neither all are equal or different");
    }
    scan.close();
  }
}
 
//SUPPLEMENTARY SOLUTION OF THIS:
//if (n1==n2 && n2==n3){
//    System.out.println("All three numbers are equal");
//  }
// else if (n1==n2 && n2!=n3) {
//      System.out.println("Neither all are equal or different");
//    }
//    else if (n2==n3 && n1!=n2) {
//      System.out.println("Neither all are equal or different");
//    }
//    else if (n1==n3 && n2!=n3) {
//      System.out.println("Neither all are equal or different");
//    }
//    else {
//      System.out.println("All numbers are different");