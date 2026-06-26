import java.util.Scanner;
class Student{
    String usn, name , branch;
    String phone;
    double percentage;
    void getData(Scanner sc){
        System.out.print("enter USN : ");
        usn = sc.next();
        System.out.print("enter Name : ");
        name = sc.next();
        System.out.print("enter Branch : ");
        branch = sc.next();
        System.out.print("enter Phone : ");
        phone = sc.next();
        System.out.print("enter Percentage : ");
        percentage = sc.nextDouble();
        System.out.println();
    }
    void display(){
        System.out.println(usn + "\t" + name + "\t" + branch +"\t"+ phone +"\t"+ percentage);
    }
}
class StudentDemo{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
            System.out.println("enter number of student  : ");
            int n = sc.nextInt();
            Student[] s = new Student[n];
            for (int i = 0; i < n; i++) {
                s[i]= new Student();
                System.out.println("enter details of student  : " + (i+1));
                s[i].getData(sc);
            }
            System.out.println("\nUSN\tNAME\tBRANCH\tPHONE\tPERCENTAGE");
            for (int i = 0; i < n; i++) {
                s[i].display();
            }
    }
}