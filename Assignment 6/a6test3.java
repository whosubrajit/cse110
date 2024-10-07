import java.util.Scanner;
public class a6test3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String ogstr = scan.nextLine();
        String backup = "";

        for (int i = 0; i < ogstr.length(); i++) { 
            char c = ogstr.charAt(i);
            if (c == '-' || c == ',') {
                System.out.println();
            } 
            else {
                System.out.print(c);
            }
        }
    }
}
