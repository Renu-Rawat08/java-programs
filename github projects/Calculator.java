import java.util.Scanner;

class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Enter first number: ");
            double num1 = sc.nextDouble();

            System.out.print("Enter second number: ");
            double num2 = sc.nextDouble();

            System.out.print("Choose operation (+,-,*,/ or q to quit): ");
            char op = sc.next().charAt(0);

            if (op == 'q') {
                System.out.println("Exiting calculator...");
                break;
            }

            double result = 0;
            switch (op) {
                case '+': result = num1 + num2; break;
                case '-': result = num1 - num2; break;
                case '*': result = num1 * num2; break;
                case '/':
                    if (num2 != 0) result = num1 / num2;
                    else {
                        System.out.println("Error: Division by zero!");
                        continue;
                    }
                    break;
                default:
                    System.out.println("Invalid operation!");
                    continue;
            }
            System.out.println(num1 + " " + op + " " + num2 + " = " + result);
        }

        sc.close();
    }
}