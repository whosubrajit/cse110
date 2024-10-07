//9

import java.util.Scanner;
public class a4test9 {
  public static void main (String [] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter the num : ");
    int num = scan.nextInt();
    int count = 0;
    int temp = num;
    while (temp!=0){
      temp= temp/10;
      count = count + 1;
    }
    System.out.println("Total digits = " +count);
    scan.close();
  }
}