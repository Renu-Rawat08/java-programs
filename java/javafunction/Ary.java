import java.util.Scanner;
public class Ary{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int[] x={5,-6,56,23,-45};
        // System.out.println(x.length);
        // for (int i = 0; i <x.length; i++) {
    //       System.out.print(x[i]+" ");
    //input
    // int[] x = new int[7];
    // for ( int i =0; i <=7; i++) {
    //     x[i] = sc.nextInt();
    // }
    // //print
    //  for (int i = 0; i <=7; i++) {
    //        System.out.print(2*(x[i])+" ");
    //      }
    System.out.println("enter array size:");
    int n= sc.nextInt();
    int[]ar=new int[n];
    System.out.println("enter elements:");
    for (int i = 0; i <n; i++) 
        ar[i]= sc.nextInt();
    for (int i = 0; i <n; i++) 
         System.out.print(-1*ar[i]+" "); 

    }
}