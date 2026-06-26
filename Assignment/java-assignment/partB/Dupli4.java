class Student{
    
    String name;
    int age;
    String course;
    public Student(String n , int a , String c) {
        name=n;
        age=a;
        course=c;
    }

    public Student(Student s) {
        name = s.name;
        age = s.age;
        course = s.course;
    }
    
    void display(){
         System.out.println("Student name = " + name);
        System.out.println("Student age = " + age);
         System.out.println("Student name = "+  course);
        System.out.println("");
    }
}
class Dupli4{
    public static void main(String[] args) {
         Student s1 = new Student("renu", 18 ,"BCA");
         Student s2 = new Student(s1);
         System.out.println("Original Object : ");
        s1.display();
        System.out.println("Duplicate Object : ");
        s2.display();
    }
}