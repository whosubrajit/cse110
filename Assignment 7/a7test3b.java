import java.util.Scanner;
public class a7test3b {
  public static void main (String [] args){
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter the length of the array : ");
    int len = scan.nextInt();
    int [] array = new int [len];
    for (int i = 0; i<array.length; i++){
      System.out.println("Enter a number : ");
      array [i] = scan.nextInt();
    }
    System.out.println("Reversed using the original array : ");
    for (int i = 0; i<len/2; i++){
      int temp = array [i];
      array [i] = array [len-1-i];
      array [len-1-i] = temp;
    }
    for (int i = 0; i<len; i++){
      System.out.print(array [i] + " ");
    }
  }
}