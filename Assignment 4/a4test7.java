//7

import java.util.Scanner;
public class a4test7 {
  public static void main (String [] args){
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter Number : ");
    int N = scan.nextInt();
    int sum = N;
    System.out.println("Sum = " + sum);
    for ( int i = 1; i<10; i++){
      System.out.println("Enter Number : ");
      int num = scan.nextInt();
      sum = sum + num;
      System.out.println("Sum = " + sum);
    }
  scan.close();
  }
}