//TASK 13
public class test13 {
  public static void main(String[]args){
    int hours = 5;
    int mins = 56;
    int sec = 23;
    int dis = 24301202; // Student ID
    
    int dist = dis% 100000; // last 4 digits of distance
    double distk = dist / 1000.00 ; // distance in kmeters
    double distm = dist/ 1609.00 ; // distance in miles
    double minm = mins/ 60.0 ; // mins in seconds
    double secm = sec/ 3600.0; // seconds in hours
    double time = hours + minm + secm; // total time
      
    double velo1 = distk/time ;
    double velo2 = distm/time ;
    
    System.out.println("Your velocity in km/h is " + velo1);
    System.out.println("Your velocity in miles/h is " + velo2);
 }
}