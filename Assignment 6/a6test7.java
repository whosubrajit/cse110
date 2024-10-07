import java.util.Scanner;
public class a6test7 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a string: ");
    String input1 = sc.nextLine();
    System.out.print("Enter another string: ");
    String input2 = sc.nextLine();
    String notcom = "";
    boolean flag = false;
    for (int i = 0; i<input1.length(); i++){
        for (int j = 0; j<input2.length(); j++){
              if (input1.charAt(i)==input2.charAt(j)){
                flag = true;
            }
        }
    if (flag == false){
        notcom = notcom + input1.charAt(i);
    }
    flag = false;
        }
    for (int k = 0; k<input2.length(); k++){
        for (int l = 0; l<input1.length(); l++){
            if (input2.charAt(k)==input1.charAt(l)){
                flag = true;
               } 
                }
            if (flag==false){
                notcom = notcom + input2.charAt(k);
           }
            flag = false;
            }
            String upper = "";
            for (int m=0; m<notcom.length(); m++){
            int convert = (int) notcom.charAt(m);
            if (convert>=97 && convert<=122){
                convert -= 32;
                }
                upper = upper+(char)convert;
            }
            System.out.print("Not Common : " + upper);
        }
    }