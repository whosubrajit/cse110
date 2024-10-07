import java.util.Scanner;
public class a6test2 {
public static void main(String[] args) {
  Scanner scan = new Scanner(System.in);
  System.out.print("Enter a string : ");
  String ogstr = scan.nextLine();
  String rvstr = "";
    for (int i = ogstr.length() - 1; i >= 0; i--) {
    rvstr += ogstr.charAt(i);
    }
    if (ogstr.equals(rvstr)){
      System.out.println("true");
    }
    else{
      System.out.println("false");
    }
 }
}
    