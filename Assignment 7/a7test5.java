import java.util.Scanner;
public class a7test5 {
  public static void main (String [] args){
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter the length of the array : ");
    int N = scan.nextInt();
    int [] array = new int [N];
    for (int i = 0; i<array.length; i++){
      System.out.println("Enter a number : ");
      array [i] = scan.nextInt();
    }
    System.out.println ("Enter the number you need : ");
    int number = scan.nextInt();
    boolean flag = false;
    int found = 0;
    for (int i = 0; i<array.length; i++){
      if (array [i] == number){
        flag = true;
        found = i;
        break;
      }
    }
    if (flag==true){
      System.out.println (number + " is at index " + found);
      }
    else {
        System.out.println ("Element not  found");
      }
  }
}