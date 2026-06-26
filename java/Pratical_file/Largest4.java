import java.util.*;

class Largest4{
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int num , max= 0;
             System.out.println("enter how many numbers :");
            int n = sc.nextInt();

            System.out.println("enter the numbers :");
            for (int i = 0; i < n; i++) {
                num=sc.nextInt();
                if(num>max){
                    max = num;
                }
            }
            
            System.out.println("largest number is "+ max);
        }
}