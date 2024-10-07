import java.util.Scanner;
public class a7test7 {
  public static void main (String [] args){
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter the length of the array : ");
    int N = scan.nextInt();
    int [] array = new int [N];
    for (int i = 0; i<array.length; i++){
      System.out.println("Enter a number : ");
      array [i] = scan.nextInt();
    }
    System.out.print("Input array : ");
    for (int i = 0; i<array.length; i++){
     System.out.print(array [i] + " ");
    }
    
    System.out.println (" ");
    System.out.println ("New Array : ");
    for (int i = 0; i<array.length; i++){
      boolean doublenaki = false;
      for (int j = 0; j<i; j++){
        if (array[i]==array[j]){
          doublenaki = true;
          break;
        }
      }
      if (doublenaki == false){
      System.out.print(array[i] + " " );
      }
    }
  }
}