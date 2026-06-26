class Student{
    String name;
    int age;
    Student(String n) {
        name = n;
        age = 18;
    }
    Student(){
        name = "renu";
         age = 18;
    }
    Student(String n , int a){
        name = n;
        age = a;
    }
    void display(){
        System.out.println("Student name"+  name);
        System.out.println("Student age"+  age);
        System.out.println();
    }
}
class Over2{
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("riya",18);
        Student s3 = new Student("reena");
    s1.display();
    s2.display();
    s3.display();
    }
}