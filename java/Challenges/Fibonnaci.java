import java.util.Scanner;

class Fibonnaci{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to printing fibonnaci series :");
        System.out.println("enter number of element to be prinited :");
        int n = sc.nextInt();
        for (int i = 1; i < n; i++) {
            System.out.println(fibonnaci1(i) +" ");
        }

    }
    public static int fibonnaci1(int position){
        System.out.print(".");
        if(position == 1){
            return 0;
        }
        if(position == 2){
            return 1;
        }
        return fibonnaci1(position-1) + fibonnaci1(position-2);
    }
}