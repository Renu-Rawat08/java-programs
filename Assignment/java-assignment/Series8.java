import java.util.*;
class Series8{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number:");
        int n = sc.nextInt();
        int num=5;
        int f = 10;
        for (int i = 1; i < n; i++) {
            if(i%2==0){
                System.out.print(num+" ");
                num=num+10;
            }
            else{
                System.out.print(f+" ");
                f=f+50;
            
            }
        }
    }
}