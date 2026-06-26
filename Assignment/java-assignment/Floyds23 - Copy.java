import java.util.*;
class Floyds23{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of row:");
        int row = sc.nextInt();
        int sum=0;
        for (int i = 1; i <=row; i++) {
           for (int j = 1; j <= i; j++) {
                sum = sum+1;
               System.out.print(sum+" ");
           }
           System.out.println(" ");
        }
    }
}