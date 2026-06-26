class Sum2{
    void add(String Name ,int age){
        System.out.println("Name = " + Name + "age = " + age);
    }
    void add(String Name , double marks){
        System.out.println("Name = " + Name + "marks = " + marks);
    }
    public static void main(String[] args) {
        Sum2 s = new Sum2();
        s.add("renu",19);
        s.add("riya",90.4);
    }
}