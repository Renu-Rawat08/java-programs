import java.util.*;
class Checkeven41{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number : ");
        int n = sc.nextInt();
        switch (n%2) {
            case 0:
            System.out.println("Number is even");
            break;
            case 1: case -1:
            System.out.println("Number is odd");
            break;
            default:
            System.out.println("Number is invalid");

        }
    }
}