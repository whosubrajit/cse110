//6

import java.util.Scanner;
public class a3test6 {
  public static void main (String [] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter an integer :");
    int inter = scan.nextInt();
    if (inter>0 && inter%2==0){
      System.out.println("Number is positive and even");
    }
    else if (inter>0 && inter%2!=0){
      System.out.println("Number is positive and odd");
    }
    else if (inter==0){
      System.out.println("Number is zero");
    }
    else {
      System.out.println("Number is negative");
    }
    scan.close();
  }
}
