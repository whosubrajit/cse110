//12

import java.util.Scanner;
public class a3test12 {
  public static void main (String [] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter the amount the customer need to pay(Taka) : ");
    int tkp = scan.nextInt();
    System.out.println("Enter the amount customer gave(Taka) : ");
    int tkg = scan.nextInt();
    int pay = tkp-tkg;
    int retu = tkg-tkp;
    if (tkp>tkg) {
      System.out.println("Please pay " + pay + " taka more.");
    }
    else if (tkg==tkp) {
      System.out.println("The returned amount is 0 taka.");
    }
    else {
      System.out.println("The returned amount is " + retu + " taka.");
      int tk100 = retu/100;
      System.out.println("100 taka note : " + tk100);
      retu = retu % 100;
      int tk50 = retu/50;
      System.out.println("50 taka note : " + tk50);
      retu = retu % 50;
      int tk20= retu/20;
      System.out.println("20 taka note : " + tk20);
      retu = retu % 20;
      int tk10= retu/10;
      System.out.println("10 taka note : " + tk10);
      retu = retu % 10;
      int tk5 = retu/5;
      System.out.println("5 taka note : " + tk5);
      retu = retu % 5;
      int tk2 = retu/2;
      System.out.println("2 taka note : " + tk2);
      retu = retu % 2;
      int tk1 = retu/1;
      System.out.println("1 taka note : " + tk1);
    }
    scan.close();
  }
}