import java.util.Scanner;

class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Principal: ");
        double P = sc.nextDouble();

        System.out.print("Enter Rate of Interest: ");
        double R = sc.nextDouble();

        System.out.print("Enter Time (in years): ");
        double T = sc.nextDouble();

        double SI = (P * R * T) / 100;
        System.out.println("Simple Interest = " + SI);
    }
}
