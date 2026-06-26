abstract class University{
    Static void rules(){
        System.out.println("student must follow rule and regulation of college");
    }
    abstract void department();
}
class Student extends University{
    void department(){
        System.out.println("student belong to cs department");
    }
}
public class Abstract3{
    public static void main(String[] args) {
        University.rules();
        Student s =new Student();
        s.department();
    }
}