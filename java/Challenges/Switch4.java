import java.util.Scanner;

class Switch4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your marks");
        int marks= sc.nextInt();
        String category = marks > 80 ? "high" : (marks > 50 ? "moderate" : "low");
        System.out.println("your category is "+ category);
        
    }
}