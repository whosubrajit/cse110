import java.util.Scanner;
public class a6test6 {
public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter a sentence : ");
    String sent = scan.nextLine();
    String word = "";
    String ulta = "";
    int length = sent.length();     
    for (int j = length- 1; j>= 0; j--) {
      char rvchar = sent.charAt(j);
      if (rvchar == ' ') {
        ulta = word + " " + ulta;
        word = "";
       } 
      else {
        word = rvchar + word;
            }
       }
       ulta = word + " " + ulta;
        System.out.println(ulta.trim());
    }
}
