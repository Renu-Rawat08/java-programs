import java.util.*;
class Findmonth42{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the month  no(1-12):");
        int month = sc.nextInt();
        System.out.print("enter year :");
        int year = sc.nextInt();
        switch (month){
            case 1: case 3: case 5: case 7: case 8: case 10: case 12 :
                System.out.println("Number of days = 31");
                break;
            case 4: case 6: case 9: case 11:
                System.out.println("Number of days = 30") ;
                break;
            case 2:
                if ((year%4 == 0 && year%100 != 0)||(year%400 == 0)) {
                    System.out.println("Number of days = 29");
                }
                else{
                    System.out.println("Number of days = 28");
                }
                break;
            default:
                System.out.println("invalid month");
        }
    }
}