//10

import java.util.Scanner;
public class a3test10 {
  public static void main (String [] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter three float numbers :");
    float f1 = scan.nextFloat();
    float f2 = scan.nextFloat();
    float f3 = scan.nextFloat();
    float max;
    if (f1>f2 && f2>f3) {
      max = f1;
    }
    else if (f2>f1 && f1>f3) {
      max = f2;
    }
    else {
      max = f3;
    }
    System.out.println ("Maximum number is : " + max);
    float min;
    if (f1<f2 && f1<f3) {
      min = f1;
    }
    else if (f2<f1 && f2<f3){
      min = f2;
    }
    else {
      min = f3;
    }
    System.out.println ("Minimum number is : " + min);
    scan.close();
  }
}
