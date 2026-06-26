import java.util.Scanner;

class Switch3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();
        int result = n>=0 ? n:-n;
        System.out.println("absoulate value is :" + result);
    }
}