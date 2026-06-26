public class Demo{
    public static void main(String[] args) {
        Student s1 = new Student();
         Student s2 = new Student();

         s1.name ="Renu";
         s1.age=19;
         s1.rollno=34;
         s1.College="simt";

        s2.name ="riya";
        s2.age=20;
        s2.rollno=67;
        s2.College="simt";
   
        s1.marksAttendence();
        s2.marksAttendence();

        s1.print();
        s2.print();
    }
}
class Student{
    String name ;
    int age;
    int rollno;
    String College;

    void marksAttendence() {
        System.out.println("Attendence markedby"+ name);
    }

    void print(){
        System.out.println(name+" , "+ age +" , "+ rollno +" ,"+College);
    }
}