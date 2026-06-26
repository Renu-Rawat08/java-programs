import java.util.Scanner;
public class Atmmenu{
    public static void main(String[] args) {
        double balance=5000;
        Scanner sc =new Scanner(System.in);
        boolean isrunning=true;

        while(isrunning){
            System.out.println("1. check balance");
            System.out.println("2. deposit");
            System.out.println("3. withrawal");
            System.out.println("4. exit");
            System.out.println("choose an option");
            int choice = sc.nextInt();
            
            switch (choice) {
                case 1 :
                    System.err.println("Your current balence is:");
                    break;
                case 2:
                    System.out.println("Enter amount to deposit:");
                    double dep = sc.nextDouble();
                    if(dep>0)
                    {balance+=dep;
                     System.out.println("Succesfully deposit $"+dep);;
                     }
                    else 
                    System.out.println("Error:Invalid deposit amount");
                    break;
                 case 3:
                    System.out.println("Enter amount to withdrawal:");
                    double draw = sc.nextDouble();
                    if(draw>0 && draw<=balance)
                    {
                        balance-=draw;
                        System.out.println("Succesfully withdrawal $"+draw);
                        }
                    else System.out.println("Error:Invalid amount");
                     break;
                case 4:
                    System.out.println("Thank you");
                    isrunning=false;
                    break;
                default:
                   System.out.println("");
            }
        }
        sc.close();
    }
}
