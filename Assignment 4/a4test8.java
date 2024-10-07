//8

import java.util.Scanner;
public class a4test8 {
  public static void main (String [] args){
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter a positive integer : ");
    int N = scan.nextInt();
    for (int i = 1; i<=N; i++){
      if (i%5==0 && i%3!=0){
        System.out.println(i);
      }
    }
    scan.close();
  }
}