class Student{
    String name;
    int age;
    Student(){
        name="renu";
        age=18;
        System.out.println("no argument passed");
    }

void display(){
    System.out.println("Student name"+  name);
     System.out.println("Student age"+  age);
}
}
public class Const1{
    public static void main(String args[]){
        Student s1 = new Student();
        s1.display();
    }
}