public class Demo4{
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("renu");
         Student S3 = new Student("riya",12);
        Student s4 = new Student("rEENA",20,134);
        Student s5 = new Student("HRENMA",35,102,"simt");
    }
}
class Student {
    String name ;
    int age;
    int rollno;
    String College;

     Student() {
        this(name:"unknown",age:0,rollno:0,College:"unkoown");
        System.out.println("i am first constructor");
    }

    Student(String name){
       this(name, age:0, rollno:0, College:null);
       System.out.println("i am two constructor");
    }

    Student(String name,int age){
       this(name,age,rollno:0,College:null);
       System.out.println("i am third constructor");
    }

    Student(String name,int age,int rollno){
       this(name, age, rollno, College:"unknown");
       System.out.println("i am fourth constructor");
    }
    Student(String name,int age,int rollno,String College){
       this.name=name;
        this.age=age;
        this.rollno=rollno;
        this.College=College;
    }
    void marksAttendence() {
        System.out.println("Attendence markedby "+ name);
    }
}