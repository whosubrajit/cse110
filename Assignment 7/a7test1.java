import java.util.Scanner;
public class a7test1 {
  public static void main (String [] args){
    Scanner scan = new Scanner(System.in);
    System.out.println("How many numbers do you want? : ");
    int N = scan.nextInt();
    int [] array = new int [N];
    for (int index = 0; index<array.length; index++){
      System.out.println("Enter a number : ");
      array [index] = scan.nextInt();
    }
    System.out.println("The elements of the array are:");
        for (int index = 0; index<array.length; index++) 
        {
            System.out.println(index + ": " + array[index]);
        }
        
        System.out.print("Enter another number: ");
        int anot = scan.nextInt();
        int [] newArray = new int[N + 1];
        for (int i = 0; i < N; i++) 
        {
            newArray[i] = array[i]; //notun array te input er jonne
        }
        newArray[N] = anot;
        
        System.out.println("After resizing the array:");
        for (int i = 0; i<newArray.length; i++) {
            System.out.print(newArray[i] + " ");
        }
  }
}