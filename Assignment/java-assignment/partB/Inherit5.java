class Parent{
    String name;
    int age;
    int height;

    public Parent(String name , int age , int height ) {
        this.name=name;
        this.age = age;
        this.height = height;
    }
    void displayInfo(){
        System.out.println("Name :" + name + " Age :" + age + " Height :" + height);
    }
    
}
class Student extends Parent{
    int studentId;

    public Student() {
        super("Renu",18, 5);
        this.studentId = studentId;
    }
    void study(){
        System.out.println(name + " is currently studying.");
    }
    void displayStudentInfo(){
        displayInfo();
        System.out.println("Student Id : " +studentId );
    }
}
class Inherit5{
    public static void main(String[] args) {
       Student s = new Student();
       s.displayStudentInfo();
       s.study();
    }
}