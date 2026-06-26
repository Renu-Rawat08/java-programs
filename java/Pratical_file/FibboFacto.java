import java.util.Scanner;

class FibboFacto{
    public static void fibIteration(int n){
            int a = 0 ,b= 1;
            System.out.println("Fibonnaci series (Iteration) : ");
            for (int i = 0; i < n; i++) {
                System.out.print(a+" ");
                int next = a+b;
                a = b;
                b = next;
            }
            System.out.println();
        }

        public static int FibRecursion(int n){
            if(n<=1){
            return n;
            }
            return FibRecursion(n-1)+FibRecursion(n-2);
        }

        public static int FactIteration(int n){
            int result=1;
            for (int i = 1; i <= n; i++) {
                result *= i;
            }
            return result;
        }

        public static long FactRecursion(int n){
            if(n==0||n==1){
                return 1;
            }
            return n * FactRecursion(n-1);
        }
        
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number :");
        int n = sc.nextInt();
        // fibonacci
        fibIteration(n);
        System.out.println("Fibonnaci series (Recursive) : ");
        for (int i = 0 ; i < n ; i++){
         System.out.print(FibRecursion(i) + " ");
        }
        System.out.println(); 
        // factorial   
         System.out.println("Factorial (Iteration) : " + FactIteration(n));
        System.out.println("Factorial (Recursive) : " + FactRecursion(n));
        sc.close();  
    } 
}
