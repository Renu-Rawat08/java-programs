import java.util.Scanner;
public class Pro{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter arry size:");
        int n = sc.nextInt();
        System.out.println("enter elements:");
         int[] ar = new int[n];
         int mul=1;
        for (int i = 0; i < n; i++) {
            ar[i]=sc.nextInt();
            System.out.print(ar[i]+" ");
        }
        for (int i = 0; i < n; i++) {
            mul*=ar[i];
        }
            System.out.println(" sum of array elements:");
            System.out.println(mul);
    }
}