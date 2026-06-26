public class Tor{
    public static void main(String[] args) {
        Student s1 = new Student("renu",20,102,"simt");
        System.out.println(s1.name);
        System.out.println(s1.age);
        System.out.println(s1.rollno);
        System.out.println(s1.College);
         Student s2 = new Student("riya",12,42,"simt");
        System.out.println(s2.name);
        System.out.println(s2.age);
        System.out.println(s2.rollno);
        System.out.println(s2.College);

    }
}
class Student{
    String name ;
    int age;
    int rollno;
    String College;

    Student(String n ,int a ,int rn ,String c){
        name=n;
        age=a;
        rollno=rn;
        College=c;
    }
    void marksAttendence() {
        System.out.println("Attendence markedby "+ name);
    }
}