import java.util.*;
class Palidrome30{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number :");
        int n = sc.nextInt();
        int r;
        int s=0;
        int original = n;
        while (n!=0) { 
            r=n%10;
            s=s*10+r;
            n=n/10; 
        }
    System.out.println("Reversed number : "+s);
    if(original==s)
    System.out.println("Number is Palidrome");
    else
    System.out.println("Number is  not Palidrome");
}
}