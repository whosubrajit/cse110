import java.util.Scanner;
public class a6test8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String ogstr = scan.nextLine();
        String backup = "";
        int count = 0;
        for (int i = 0; i < ogstr.length(); i++) {
            int n = ogstr.charAt(i);
            if (!(n >= 65 && n <= 90) && !(n >= 97 && n <= 122)) {
                backup += (char) n;  
            } else {
                if (count % 2 == 0) {
                    if (n >= 65 && n <= 90) {
                        n += 32; 
                    }
                } else {
                    if (n >= 97 && n <= 122) {
                        n -= 32; 
                    }
                }
                char m = (char) n;
                backup += m; 
                count++; 
            }
        }
        System.out.println(backup);
    }
}
