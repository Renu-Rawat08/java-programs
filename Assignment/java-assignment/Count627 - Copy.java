import java.util.*;
class Count627{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number :");
        int n = sc.nextInt();
        int add=0;
        // int r;
        while (n!=0) { 
            n=n/10;
            //  r=n%10;
             add ++;
        }
    System.out.println(add);
}
}