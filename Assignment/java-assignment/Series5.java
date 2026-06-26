import java.util.*;
class Series5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number:");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int c = i*i*i;
            System.out.print(c+" ");
        }
    }
}