import java.util.*;
class Salary29{
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Gender (m/f):");
        char gender = sc.next().charAt(0);
         System.out.println("Enter year of service :");
        int service = sc.nextInt();
        System.out.println("Enter qualification g for graduation and p for post-graduation:");
        char qual = sc.next().charAt(0);
        int Salary=0;
        if(gender=='M'||gender=='m'){
            if(service>=10||qual=='p'||qual=='P')
            Salary=15000;
            else if(service>=10||qual=='g'||qual=='G')
            Salary=10000;
            else if(service<10||qual=='p'||qual=='P')
            Salary=10000;
            else if(service<10||qual=='g'||qual=='G')
            Salary=7000;
        }
        if(gender=='F'||gender=='f'){
            if(service>=10||qual=='p'||qual=='P')
            Salary=12000;
            else if(service>=10||qual=='g'||qual=='G')
            Salary=9000;
            else if(service<10||qual=='p'||qual=='P')
            Salary=10000;
            else if(service<10||qual=='g'||qual=='G')
            Salary=6000;
        }
        System.out.println("Salary is "+ Salary);
     }
}
