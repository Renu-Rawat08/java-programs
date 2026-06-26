
import java.util.Scanner;

class GuessingGame{
    int random;
    GuessingGame(){
        random = (int) Math.ceil(Math.random()*100);
    }
    int guess(int GuessNumber){
        return GuessNumber - random;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GuessingGame game = new GuessingGame();
        System.out.println("Welcome to the guessing game  , guess the number between 1 to 100 : ");
        int guess;
        int result;
        do { 
            System.out.println("Guess the number : ");
            guess = sc.nextInt();
            result = game.guess(guess);
            if(result == 0){
                System.out.println("congrats , your guess is correct .");
            }else if(result<0){
                System.out.println(" please guess higher number ");
            }else{
                System.out.println("please guess lower number");
            }
        } while (result!=0);
    }
}