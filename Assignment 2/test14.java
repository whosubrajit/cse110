14.
 public class test14 {
  public static void main(String[]args){
    
    double a = 8.0;   
    double b = 3.0;
    double h = a/2; 
    double s = Math.sqrt((h*h)+(b*b));
    double area = (3*Math.sqrt(3)/2)*s*s;
    double circumference = 6*s;
    
    System.out.println("The calculated area of the Hexagon is= "+area);
    System.out.println("The calculated circumference of the Hexagon is= "+circumference);
 }
}