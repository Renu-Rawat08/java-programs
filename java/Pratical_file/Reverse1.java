
import java.util.Scanner;

class Reverse1{
    static void Reverse1(int arr [] , int n){
        System.out.println("array in reverwse order : ");
        for (int i = n-1 ; i >= 0; i--) {
            System.out.println(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number : ");
        int n = sc.nextInt();
        int arr[]= new  int[n];
        System.out.println("enter " + n + "elements:");
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        Reverse1(arr, n);
    }
}