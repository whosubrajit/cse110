import java.util.Scanner;
public class a5test4 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("How many test case do you want? : ");
    int N = scan.nextInt();
    for (int i = 1; i<=N; i++){
    System.out.print("Enter the number : ");
    int X = scan.nextInt();
    int Y = scan.nextInt();
    int sum = 0;
    int count = 0;
    if (X%2==0){
      X++;
    }
    while (count<Y){
      sum +=X;
      X= X+2;
      count +=1;
    }
    System.out.println(sum);
    }
  }
}