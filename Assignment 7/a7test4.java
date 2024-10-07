import java.util.Scanner;
public class a7test4 {
  public static void main (String [] args){
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter the length of the array : ");
    int N = scan.nextInt();
    int [] array = new int [N];
    for (int i = 0; i<array.length; i++){
      System.out.println("Enter a number : ");
      array [i] = scan.nextInt();
    }
    System.out.println("Original Array :");
    for (int i = 0; i<array.length; i++){
      System.out.print(array[i] + " ");
    }
    System.out.println(" ");
    System.out.println("After modifying : ");
    for (int i = 0; i<array.length; i++){
      if (array [i] % 2 == 0){
        array[i] = 0;
      }
      else {
        array [i] = 1;
      }
      System.out.print(array[i] + " ");
    }
  }
}