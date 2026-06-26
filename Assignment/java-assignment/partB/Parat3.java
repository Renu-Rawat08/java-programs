class Student{
    
    String name;
    int age;
    String course;
    public Student(String n , int a , String c) {
        name=n;
        age=a;
        course=c;
    }
    void display(){
         System.out.println("Student name=" + name);
        System.out.println("Student age=" + age);
         System.out.println("Student name"+  course);

    }
}
class Parat3{
    public static void main(String[] args) {
        Student s1 = new Student("renu", 18 ,"BCA");
        s1.display();
    }
}