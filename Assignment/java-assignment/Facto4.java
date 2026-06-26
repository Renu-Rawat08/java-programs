import java.util.*;
class Facto{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number:");
        int n = sc.nextInt();
        int facto = 1;
        for (int i = 1; i <=n; i++) {
            facto  = facto*i;
        }

            System.out.print("factorial of the numberis :"+facto);
    }
}