import java.util.Scanner;
public class a5test1 {
  public static void main (String [] args){
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter a positive integer : ");
    int N = scan.nextInt();
    int i = 2;
    int counter = 0;
    System.out.println(i);
    while (counter <= N){
        if (N%2==0){
          System.out.println(i + " ");
          i++;
          counter++;
        }
    }
  }
}
      