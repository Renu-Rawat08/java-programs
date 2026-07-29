import java.util.Scanner;

class AtmSimulation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double balance = 1000.0; // initial balance
        int choice;

        System.out.println("Welcome to the ATM!");

        do {
            System.out.println("\nATM Menu:");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Your balance: ₹" + balance);
                    break;
                case 2:
                    System.out.print("Enter deposit amount: ₹");
                    double deposit = sc.nextDouble();
                    balance += deposit;
                    System.out.println("₹" + deposit + " deposited successfully.");
                    break;
                case 3:
                    System.out.print("Enter withdrawal amount: ₹");
                    double withdraw = sc.nextDouble();
                    if (withdraw <= balance) {
                        balance -= withdraw;
                        System.out.println("₹" + withdraw + " withdrawn successfully.");
                    } else {
                        System.out.println("Insufficient balance!");
                    }
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);

        sc.close();
    }
}
