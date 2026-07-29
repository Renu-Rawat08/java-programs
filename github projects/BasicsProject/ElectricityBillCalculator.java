import java.util.Scanner;

public class ElectricityBillCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter customer name: ");
        String name = sc.nextLine();

        System.out.print("Enter units consumed: ");
        int units = sc.nextInt();

        double billAmount;

        // Slab rates
        if (units <= 100) {
            billAmount = units * 5; // ₹5 per unit
        } else if (units <= 200) {
            billAmount = (100 * 5) + (units - 100) * 7; // ₹7 per unit after 100
        } else if (units <= 300) {
            billAmount = (100 * 5) + (100 * 7) + (units - 200) * 10; // ₹10 per unit after 200
        } else {
            billAmount = (100 * 5) + (100 * 7) + (100 * 10) + (units - 300) * 12; // ₹12 per unit after 300
        }

        System.out.println("\nElectricity Bill");
        System.out.println("Customer: " + name);
        System.out.println("Units Consumed: " + units);
        System.out.println("Total Bill: ₹" + billAmount);

        sc.close();
    }
}
