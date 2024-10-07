//8

import java.util.Scanner;
public class a3test8 {
  public static void main (String [] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter your ID :");
    int id = scan.nextInt();
    int sess = (id / 100000) % 10;
    int year = id / 1000000;
    String sos;
    if (sess == 1) {
      sos = "Spring";
      System.out.println("Student Joined BRAC in " + sos + " " + year);
    }
    else if (sess == 2) {
      sos = "Fall";
      System.out.println("Student Joined BRAC in "  + sos + " " + year);
    }
    else if (sess == 3) {
      sos = "Summer";
      System.out.println("Student Joined BRAC in " + sos + " " + year);
    }
    else {
      System.out.println("This ID is invalid");
    }
    scan.close();
  }
}
