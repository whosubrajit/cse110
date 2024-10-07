import java.util.Scanner;
public class a7test8 {
  public static void main (String [] args){
    Scanner scan = new Scanner(System.in);
    System.out.println("Please enter the length of array 1 ");
    int N = scan.nextInt();
    int [] array = new int [N];
    for (int i = 0; i<array.length; i++){
      System.out.println("Please enter the elements of the arr1:");
      array [i] = scan.nextInt();
    }
    System.out.println("Please enter the length of array 2 ");
    int A = scan.nextInt();
    int [] array2 = new int [A];
    for (int i = 0; i<array2.length; i++){
      System.out.println("Please enter the elements of the arr2:");
      array2[i] = scan.nextInt();
    }
    boolean milse = false;
    //int count = 0;
    for (int i = 0; i<array2.length; i++){
      for (int j = 0; j<array.length; j++){
        if (array[i]==array2[i]){
          milse = true;
        }
      }
    }
      if (milse == true){
        System.out.println("Array 2 is a subset of Array 1");
      }
      else {
        System.out.println("Array 2 is not a subset of Array 1.");
      }
  }
}
        