import java.util.*;
class Leap17{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter year :");
        int year = sc.nextInt();
        if(year%4==0)
         System.out.print("year is leap year");
        else System.out.println("year is not  leap year");
    }
}