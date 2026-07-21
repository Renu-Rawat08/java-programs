import java.util.Scanner;
 
    class Factorial {
    // Recursive method to calculate factorial
    static int fact(int n) {
        if (n == 0 || n == 1) {
            return 1; // base case
        } else {
            return n * fact(n - 1); // recursive case
        }
    }
      public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        int result = fact(n); // call factorial method
        System.out.println("The factorial of " + n + " is: " + result);
    }
}