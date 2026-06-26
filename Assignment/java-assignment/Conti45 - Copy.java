import java.util.*;
class Conti45{
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int num;
       int sum = 0;
       while (true) { 
           System.out.print("Enter a number : ");
           num = sc.nextInt();
           if(num == 0 ){
            break;
           }
           if (num<0) {
               continue;
           }
           sum = sum + num;
       }
       System.out.println("Sum of positive number : "+ sum);
       }
   } 