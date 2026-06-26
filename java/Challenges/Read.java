import java.util.Scanner;

class Read{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to finding occurence");
        while (true) { 
            System.out.println("enter your command :");
            String command = sc.next();
            if(command.equals("exit")){
                break;
            }
        }
     
    }
}