
import java.util.Scanner;

class Passwordchecker{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to set your password");
        String password;
        do { 
            System.out.println("please enter your password :");
            password = sc.next();
        } while (!isValidPassword(password));
            System.out.println("thanks for entering your valid password");
    }
    public static boolean isValidPassword(String password){
        return password.length() > 6;   
    }
}