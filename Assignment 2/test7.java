//TASK 7
public class test7 {
    public static void main(String[] args) {
        long min = 3456789;
        int mid = 60 * 24; //mins in day
        int miy = mid * 365; //mins in year
      
        long totalyear = min / miy;
        long rmin = min % miy; //remaining minutes
        long totalday = rmin / mid;

        System.out.println(min + " minutes is approximately " + totalyear + " years and " + totalday + " days");
    }
}