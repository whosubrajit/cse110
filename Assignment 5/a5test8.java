import java.util.Scanner;
public class a5test8{
  public static void main(String [] args){
    Scanner scan  = new Scanner(System.in);
    System.out.print("Start : ");
    int start = scan.nextInt();
    System.out.print("End : ");
    int end = scan.nextInt();
    int temp ;
    int idk;
    int sum = 0;
    System.out.print("Armstrong Numbers : ");
    for(int i = start; i <= end; i++){
      temp = i;
      while(temp > 0){
        idk = temp % 10;
        sum = sum + (idk * idk * idk);
        temp = temp / 10;
      }
      if(sum == i){
        System.out.print(i+" ");
      }
      sum = 0;
    }
  }
}
    