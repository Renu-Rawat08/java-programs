class Student{

    int rollNumber = 12;
    String name = "renu";
    int marks = 90;
    void display(){
       System.out.println("Name = " + name);
       System.out.println("Rollnumber  = " +rollNumber );
       System.out.println("Marks = " + marks);
    }
    public static void main(String[] args) {
        Student s =new Student();
        s.display();
    }
}