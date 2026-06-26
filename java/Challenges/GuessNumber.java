import java.util.Scanner;

class GuessNumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 5 , guess;  
        System.out.println("Welcome to number guessing game");
        do { 
            System.out.print("please guess the number between 0 to 10 :  ");
            guess = sc.nextInt();
        } while (num!=guess);
        System.out.println("you have sucessfully guess the number");
    }
}