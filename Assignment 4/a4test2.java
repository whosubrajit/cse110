//2

import java.util.Scanner;
public class a4test2 {
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("How many numbers do you want to calculate? : ");
        int N = scan.nextInt();
        int sum = 0;
        System.out.print("Input the " + N + " numbers: ");
        for (int i = 1; i <= N; i++){
          int num = scan.nextInt();
          sum = sum + num; // Adding the numbers
        }
        double average = sum / N;
        System.out.println("The sum of " + N + " no is: " + sum);
        System.out.println("The Average is: " + average);
        scan.close();
    }
}