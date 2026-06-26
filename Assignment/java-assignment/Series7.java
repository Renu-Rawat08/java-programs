import java.util.*;
class Series7{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number:");
        int n = sc.nextInt();
        int num=1;
        for (int i = 0; i < n; i++) {
            if(i%2==0){
                System.out.print(-num+" ");
            }
            else{
            System.out.print(num+" ");
            }
            num=num+3;
        }
    }
}