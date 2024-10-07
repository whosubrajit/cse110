import java.util.Scanner;
public class a5test7{
  public static void main(String [] args){
    Scanner scan  = new Scanner(System.in);
    System.out.print("Enter the height : ");
    int height = scan.nextInt();
    for (int i=1; i<=height; i++){
      for (int j=1; j<=(height-i); j++){
        System.out.print(" ");
      }
        for (int k=1; k<=2*i-1; k++){
          System.out.print(k + " ");
  }
  System.out.println();
    }
  }
}
    