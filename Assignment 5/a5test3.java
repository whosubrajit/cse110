import java.util.Scanner;
public class a5test3 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);    
    while (true) {
      System.out.print("Enter an even & positive number : ");
      int N = scan.nextInt();
      int div = 0;
      if (N % 2 != 0) {
        System.out.println("Odd number isn't accepted. Bye! ");
        break;
      }
      
      if (N > 0) {
        for (int i = 1; i <= N; i++) {
          if (N % i == 0) {
            div++;
          }
        }
        System.out.println(N + " has " +  + div + " divisors");
      }
    }
    scan.close();
  }
}
