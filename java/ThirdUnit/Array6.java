import java.util.Scanner;

class Array6{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size = ");
        int n = sc.nextInt();
        int []a ;
        for (int i =1; i <= n  ; i++){
        System.out.println("Element of array ="+ i + " " );
    }
     System.out.println("Reverse order array : ");
     for(int i = n ;i > 0;i--){
        System.out.print(i +" ");
     }
}
}