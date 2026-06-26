import java.util.*;
class Quadratic16{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number A :");
        double a = sc.nextDouble();
        System.out.println("enter number b :");
        double b = sc.nextDouble();
        System.out.println("enter number c :");
        double c = sc.nextDouble();
        double sum = (b*b)-(4*a*c);
        double root1 , root2;
        root1 = (+b+ Math.sqrt(sum))/(2*a);
        root2 = (-b+ Math.sqrt(sum))/(2*a);
         System.out.println("The roots are " + root1 +" and "+root2);
    }
    }