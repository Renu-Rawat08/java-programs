class Sum1{
    void add(String name ){
        System.out.println("Name "+ name);
    }
    void add(String name , int age){
       System.out.println("Name " + name + "age = " + age);
    }
    public static void main(String[] args) {
        Sum1 s = new Sum1();
        s.add("renu " ,19);
        s.add("riya");
    }
}