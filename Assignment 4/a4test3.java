//3

import java.util.Scanner;
public class a4test3 {
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.print("Enter a number: ");
            int N = scan.nextInt();
            if (N < 0) {
                System.out.println();
                break;
            }
            int sq = (int) Math.pow(N, N);
            System.out.println( N + " ^ " + N + " = " + sq);
        }
        scan.close();
    }
}
