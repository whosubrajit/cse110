//9

import java.util.Scanner;
public class a3test9 {
  public static void main (String [] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter your age :");
    int age = scan.nextInt();
    System.out.println("Enter your payment : ");
    int pay = scan.nextInt();
    if (age>=18 && pay>=10000 && pay<=20000){
      System.out.println("Your tax amounts in " + (pay*0.05) + "Tk");
    }
    else if (age>=18 && pay>20000){
      System.out.println("Your tax amounts in " + (pay*0.1));
    }
   else {
      System.out.println("Your tax amounts in 0 Tk");
    }
    scan.close();
  }
}
