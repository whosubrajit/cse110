import java.util.Scanner;
public class a7test3a {
  public static void main (String [] args){
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter the length of the array : ");
    int len = scan.nextInt();
    int [] array = new int [len];
    for (int i = 0; i<array.length; i++){
      System.out.println("Enter a number : ");
      array [i] = scan.nextInt();
    }
    int [] reve = new int [len];
    for (int i = 0; i<len; i++){
      reve [i] = array [len-1-i];
    }
    
    System.out.println("Reversed using a new array : ");
    for (int i = 0; i<len; i++){
      System.out.print(reve [i] + " ");;
    }
  }
}
    