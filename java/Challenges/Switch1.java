
import java.util.Scanner;

class Switch1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("finding minimum");
        System.out.println("enter first number");
        int num1 = sc.nextInt();
        System.out.print("enter second number");
        int num2 = sc.nextInt();
        Switch1 ternary = new Switch1();
        int min  = ternary.min(num1,num2);
        System.out.println("minimum number is :"+ min);
    }

    public int min(int num1 , int num2){
        return num1 < num2 ? num1 : num2;
        // if(num1<num2){
        //     return num1;
        // }
        //     else{
        //         return num2;
        //     }
    }
}