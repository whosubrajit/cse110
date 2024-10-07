import java.util.Scanner;
public class a7test2 {
  public static void main (String [] args){
    Scanner scan = new Scanner(System.in);
    System.out.println("How many numbers do you want? : ");
    int n = scan.nextInt();
    int [] array = new int [n];
    System.out.println("Enter the numbers : ");
    for (int i = 0; i < n; i++) {
      array [i] = scan.nextInt();
    }
    System.out.println("Before removing duplicates:");
    for (int i = 0; i < array.length; i++){
      System.out.print(array [i] + " ");
    }
    System.out.println(" ");
    System.out.println("After replacing duplicates with 0:");
    for (int i = 0; i < array.length; i++){
      for (int j = 0; j < i; j++){
        if (array[i]==array[j]){
          array[i]=0;
          break;
        }
      }
      System.out.print(array[i] + " ");
    }
  }
}
    
    