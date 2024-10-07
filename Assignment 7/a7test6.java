import java.util.Scanner;
public class a7test6 {
  public static void main (String [] args){
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter the length of the array : ");
    int N = scan.nextInt();
    double [] array = new double [N];
    for (int i = 0; i<array.length; i++){
      System.out.println("Enter a number : ");
      array [i] = scan.nextDouble();
    }
    double maxmin = array [0];
    double max = 0;
    double min = 0;
    double sum = 0;
    int index = 0;
    for (int i = 0; i<array.length; i++){
      if (array[i]>maxmin){
        max = array [i];
        index = i;
      }
      if (array[i]<maxmin){
        min = array [i];
        index = i;
      }
      sum += array [i];
    }
    System.out.println("Maximum element "+ max + " found at index "+ index);
    System.out.println("Minimum element "+ min + " found at index "+ index);
    System.out.println("Summation : " + sum);
    double average = sum/N;
    System.out.println("Average " + average);
  }
}  
    