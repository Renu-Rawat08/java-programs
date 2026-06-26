class Student{
    String name;
    int age;
    String rollno;
    String house;


    public Student(String name ,int age , String rollno , String house){
        this.name = name;
        this.age = age;
        this.rollno = rollno;
        this.house = house;
    }

    @Override
    public String toString(){
        return "Student Details : {name : "+ name 
        +", age :"+ age 
        +" , roll number : "+ rollno
        +" , house :"+ house+ "}";
    }
    public static void main(String[] args) {
        Student stu = new Student( "renu" , 
         20 ,"001" ,"shivsnji");
        System.out.println(stu);
    }
}