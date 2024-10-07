//11

import java.util.Scanner;
public class a4test11a {
  public static void main (String [] args){
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter an integer : ");
    int N = scan.nextInt();
    boolean flag = false;
    int sum = 0;
    for (int i=2; i<N; i++){
      if (N%2==0){
        flag = true;
      }
    }
    if (flag == false){
      System.out.println(N + " is a prime number.");
    }
    else {
      System.out.println(N + " is not a prime number.");
    }
    for (int i = 1; i<N; i++) {
      if (N%i==0){
        sum = sum + i;
      }
    }
      if (sum==N){
          System.out.println(N + " is a perfect number.");
        }
        else {
          System.out.println(N + " is not a perfect number.");
        }
      }
    }
