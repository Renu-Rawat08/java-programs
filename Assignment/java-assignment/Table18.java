import java.util.*;
class Table18{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number :");
        int n = sc.nextInt();
        for (int i = 0; i <= 10; i++) {
            System.out.println(n+"*"+i+"="+(n*i));
        }
    }
}