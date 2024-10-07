//5

import java.util.Scanner;
public class a4test5 {
  public static void main (String [] args){
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter your desired input :");
    int N = scan.nextInt();
    int count1 = 0;
    int count2 = 0;
    for (int i=1; i<=N; i++){
      System.out.println("Enter number " + i + ":");
      int num = scan.nextInt();
      if (num>=0){
        count1 += 1;
      }
      else {
        count2 +=1;
      }
    }
    System.out.println(count1 + " Non-negative Numbers");
    System.out.println(count2 + " Negative Numbers");
    scan.close();
  }
}