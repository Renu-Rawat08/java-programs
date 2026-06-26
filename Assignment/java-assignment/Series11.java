import java.util.*;
class Series11{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number:");
        int n = sc.nextInt();
        double sum =0;
        for (int i = 1; i <=n; i++) {
          sum = Math.pow(i, i);
        }
        System.out.println(sum);
    }
}