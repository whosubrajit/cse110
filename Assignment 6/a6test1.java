import java.util.Scanner;
public class a6test1 {
public static void main(String[] args) {
  Scanner scan = new Scanner(System.in);
  System.out.print("Enter a string : ");
  String ogstr = scan.nextLine();
  String rvstr = "";
  for (int i=0; i<ogstr.length(); i++){
    char c = ogstr.charAt(i);
    if (c >='a' && c<='z'){
      c -= 32;
    }
    System.out.println(c);
  }
}
}