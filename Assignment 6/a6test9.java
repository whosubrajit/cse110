import java.util.Scanner;
public class a6test9 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a Password : ");
    String password = sc.nextLine();
    boolean flag = false;
        if (password.length() < 8) {
            flag = false;
        }
        boolean capital = false;
        boolean small = false;
        boolean digit = false;
        boolean chars = false;

        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                capital = true;
            }
            else if (c >= 'a' && c <= 'z') {
                small = true;
            }
            else if (c >= '0' && c <= '9') {
                digit= true;
            }
            else if (!(c >= 'A' && c <= 'Z') && !(c >= 'a' && c <= 'z') && !(c >= '0' && c <= '9')) {
                chars = true;
            }
        }
        if (capital && small && digit && chars ==true){
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
    }
}