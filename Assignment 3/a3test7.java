//7

import java.util.Scanner;
public class a3test7 {
  public static void main (String [] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter a number :");
    int num = scan.nextInt();
    if (num>=5){
      System.out.println("Output : " + (3*(num*num)+2));
    }
    else if (num>=0 && num<2){
      System.out.println("Output : " + (num+1));
    }
    else if (num>=2 && num<5){
      System.out.println("Output : " + ((num*num)- 1));
    }
    else {
      System.out.println("Output : " + (2*num)); // num < 0
    }
    scan.close();
    }
}
