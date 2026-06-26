
import java.util.Scanner;

public class Loop{
    public static void main(String[] args) {
        System.out.println("enter day no.");
        Scanner sc=new Scanner(System.in);
        int day=sc.nextInt();
        switch (day) {
            case 1 -> System.out.println("sunday");
            case 2 -> System.out.println("monday");
            case 3 -> System.out.println("tuesday");
            case 4 -> System.out.println("wednesday");
            case 5 -> System.out.println("thrusday");
            case 6 -> System.out.println("friday");
            case 7 -> System.out.println("satruday");
            default -> throw new AssertionError();
        }
    }
}