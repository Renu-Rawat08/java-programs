import java.util.*;
class Sumseries9{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a value:");
        int n = sc.nextInt();
        double sum = 0;
        for (int i = 1; i < n; i++) {
                sum += Math.pow(i, i);
        }
                System.out.print("Sum of series : "+(long)sum);
            
    }
}