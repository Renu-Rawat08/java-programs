import java.util.Scanner;

class StudentMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks of 5 subjects: ");
        int s1 = sc.nextInt();
        int s2 = sc.nextInt();
        int s3 = sc.nextInt();
        int s4 = sc.nextInt();
        int s5 = sc.nextInt();

        int total = s1 + s2 + s3 + s4 + s5;
        double percentage = (double) total / 5;

        System.out.println("Total Marks = " + total);
        System.out.println("Percentage = " + percentage + "%");

        if (percentage >= 60) {
            System.out.println("Grade: First Division");
        } else if (percentage >= 45) {
            System.out.println("Grade: Second Division");
        } else if (percentage >= 33) {
            System.out.println("Grade: Third Division");
        } else {
            System.out.println("Grade: Fail");
        }
    }
}
