import java.util.Scanner;

class Calulator{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number");
        int num1 = sc.nextInt();
        System.out.print("enter second number");
        int num2 = sc.nextInt();
        System.out.println("enter the opertion : ");
        String opertion = sc.next();

        int result = switch(opertion){
            case  "+"->num1+num2;
            case  "-"->num1-num2;
            case  "*"->num1*num2;
            case  "/"->num1/num2;
            default -> -1;  
        };
        System.out.println("your answer is :"+ result);
        
    }
}