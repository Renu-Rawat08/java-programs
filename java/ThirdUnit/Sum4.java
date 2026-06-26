class Sum4{
    private void add(int age , String Name ){
        System.out.println("Name = " + Name + "age = " + age);
    }
    public void add(String Name , int marks){
        System.out.println("Name = " + Name + "marks = " + marks);
    }
    protected void add(String Name , int marks ,int age){
        System.out.println("Name = " + Name + "marks = " + marks + "age = "+age);
    }
    public static void main(String[] args) {
        Sum4 s = new Sum4();
        s.add(19,"renu");
        s.add("riya",90);
        s.add("naina" , 89, 20);
    }
}