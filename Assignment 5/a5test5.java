import java.util.Scanner;
public class a5test5{
  public static void main(String [] args){
    Scanner scan  = new Scanner(System.in);
    System.out.print("Enter the length : ");
    int len = scan.nextInt();
    System.out.print("Enter the width : ");
    int wid = scan.nextInt();
    for (int i = 1; i <= wid; i++){
    for (int j = 1; j <= len; j++){
        System.out.print(j);
      }
      System.out.println();
    }
  }
}