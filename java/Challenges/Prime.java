import java.util.Scanner;

class Prime{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your number :");
        int n = sc.nextInt();
        System.out.println("your number is "+ (isprime(n)? "prime" :"not prime"));
        
    }

    public static boolean isprime(int n){
        for (int i = 2; i <=n; i++) {
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}