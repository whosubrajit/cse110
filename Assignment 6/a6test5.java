import java.util.Scanner;
public class a6test5 {
public static void main(String[] args) {
  Scanner scan = new Scanner(System.in);
  System.out.print("Enter a string: ");
  String ogstr = scan.nextLine();
  int vowels = 0;
  int cons = 0;
  for (int i = 0; i < ogstr.length(); i++) {
    char c = ogstr.charAt(i);
    if (c >= 'A' && c <= 'Z') {
      c += 32;
    }
    if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
      vowels++;
    }
    else if (c >= 'a' && c <= 'z') {
      cons++;
    }
  }
  if (vowels % 3 == 0 && cons % 5 == 0) {
    System.out.println("Aaarr! Me Plunder!!");
  } else {
    System.out.println("Blimey! No Plunder!!");
  }
}
}
