import java.util.*;
class Bill29{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter units of charges:");
        double n = sc.nextDouble();
        double amount;
        if(n<=50){
            amount = (0.50*n)+(20/100);
            System.out.println("the total electricity bill is"+amount);
        } 
        else if (n>=50&&n<=150) {
            amount = (0.75*n)+(20/100);
            System.out.println("the total electricity bill is"+amount);
        }
        else if (n>=150&&n<=250) {
            amount = (1.20*n)+(20/100);
            System.out.println("the total electricity bill is"+amount);
        }
        else  {
            amount = (1.50*n)+(20/100);
            System.out.println("the total electricity bill is"+amount);
        }
    }
}