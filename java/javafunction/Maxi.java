import java.util.Scanner;
public class Maxi{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter arry size:");
        int n = sc.nextInt();
        System.out.println("enter elements:");
         int[] ar = new int[n];
        for (int i = 0; i < n; i++) {
            ar[i]=sc.nextInt();
            System.out.print(ar[i]+" ");
        }
        int max = ar[0];
        // ar[n]++;
        for (int i = 0; i < n; i++) {
            if(ar[i]<max) max=ar[i];
        }
         System.out.println("largest no of array is");  
         System.out.println(max); 
    }
}