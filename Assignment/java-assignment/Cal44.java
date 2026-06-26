import java.util.*;
class Cal44{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the two numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("menu for choice : ");
        System.out.println("1. addition ");
        System.out.println("1. subtraction ");
        System.out.println("1. multiplication ");
        System.out.println("1. division ");
        System.out.println("enter your choice : ");
        int choice = sc.nextInt();
        switch ( choice) {
                 case 1:
                System.out.println(a+b);
                break;
                 case 2:
                System.out.println(a-b);
                break;
                 case 3:
                System.out.println(a*b);
                break;
                 case 4:
                System.out.println(a/b);
                break;
        }
    }
}
