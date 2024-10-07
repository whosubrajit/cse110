//4

import java.util.Scanner;
public class a4test4 {
  public static void main (String [] args){
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter an integer :");
    int N = scan.nextInt();
    System.out.println("Divisors of " +N+ " :");
    for (int i=1; i<=N; i++){
      if (N%i==0){
        System.out.println(i);
      }
    }
    scan.close();
  }
}
