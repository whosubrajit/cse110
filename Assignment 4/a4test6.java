6//

import java.util.Scanner;
public class a4test6 {
  public static void main (String [] args){
    Scanner scan = new Scanner(System.in);
    System.out.println("Input number of terms: ");
    int N = scan.nextInt();
    int sum = 0;
    System.out.println("The odd numbers are: ");
    for (int i = 0; i < N; i++){
      int a = 2*i+1;
      System.out.println(a);
      sum = sum + a;
    }
    System.out.println("The Sum of odd Natural Numbers up to " + N + " terms is: " + sum);
    scan.close();
  }
}
