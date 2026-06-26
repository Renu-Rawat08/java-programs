import java.util.*;
class Adddigit13{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter an integer between 0 and 1000 :");
        int n = sc.nextInt();
        int r , sum=0;
        while(n!=0){
            r=n%10;
            sum=r+sum;
            n=n/10;
        }
        System.out.println("The sum of all digits in"+n+"is"+sum);
    }
}