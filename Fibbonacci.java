import java.util.Scanner;
 
    class Fibbonacci {
    // Recursive method to calculate fibbonaci
    static int fib(int n) {
        if (n == 0 || n == 1) {
            return 1; // base case
        } else {
            return n + fib(n - 1); // recursive case
        }
    }
      public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        int result = fib(n); // call factorial method
        System.out.println("The fibbonaci series sum  of " + n + " is : " + result);
    }
}