
import java.util.Arrays;
import java.util.Scanner;
public class SortedNames{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         System.out.println("enter number of names : ");
       int n=sc.nextInt();
       sc.nextLine();
       String names[] = new String[n];
       System.out.println("enters names :");
       for (int i = 0; i < n; i++) {
           names[i] = sc.nextLine();
       }
       Arrays.sort(names);
       System.out.println("Names in ascending order :");
       for (int i = 0; i < n; i++) {
           System.out.println(names[i]);
       }
    }
}