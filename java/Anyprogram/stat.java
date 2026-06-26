public class stat{
    public static void main(String[]args){
        student s1 = new student("renu",19,21);
        student s2 = new student("riya",29,34);
        // student.College ="simt";
        System.out.println(s1.Name+","+s1.Age+","+s1.Rollno+","+s1.College+","+s1.grade);
         System.out.println(s2.Name+","+s2.Age+","+s2.Rollno+","+s2.College+","+s2.grade);
    }
}
class student {
    String Name;
    int Age;
    int Rollno;
    static String College;
    static int grade;

     student( String name,int age, int rollno) {
        this.Name = name;
        this.Age = age;
        this.Rollno = rollno;


    }
    static{
        College="simt";
        grade=7;
    }
}