//2
import java.util.Scanner;
public class a5test2 {
public static void main(String[] args) {
  Scanner scan = new Scanner(System.in);
  System.out.print("The value of N: ");
  int N = scan.nextInt();
  if (N <= 0) {
    System.out.println("Invalid input");
  }
  int y = 0;
  for (int i = 1; i <= N;i++) {
    int sum = 0;
    for (int j =1;j <= i; j++){
      sum= sum+ j;
    }
    y = y- sum;
  }
  System.out.println("The value of y: " + y);
 }
}