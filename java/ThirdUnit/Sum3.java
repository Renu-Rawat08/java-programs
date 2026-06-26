class Sum3{
    void add(int age , String Name ){
        System.out.println("Name = " + Name + "age = " + age);
    }
    void add(String Name , int marks){
        System.out.println("Name = " + Name + "marks = " + marks);
    }
    public static void main(String[] args) {
        Sum3 s = new Sum3();
        s.add(19,"renu");
        s.add("riya",90);
    }
}