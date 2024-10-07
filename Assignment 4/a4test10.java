//10

import java.util.Scanner;
public class a4test10 {
  public static void main (String [] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter the num : ");
    int num = scan.nextInt();
    int count = 0;
    int temp = num;
    int digit;
    while (temp>0){
      temp = temp/10;
      count = count + 1;
    }
    int form = (int) Math.pow(10,(count-1));
    while (form > 0) {
            digit = num / form;
            System.out.print(digit);
            num = num % form;
            form = form / 10;
            if (form > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        scan.close();
    }
}
