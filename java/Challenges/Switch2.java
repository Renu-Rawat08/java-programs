import java.util.Scanner;

class Switch2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();
        String result =n%2 == 0 ? "even":"odd";
        System.out.println("Your number is : "+result );
    }
}