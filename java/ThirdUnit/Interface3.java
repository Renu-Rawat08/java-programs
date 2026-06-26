interface  ParentInterface{
    void ParentMethod();
}
interface childInterface extends ParentInterface{
    void childMethod();
}
class DemoClass implements childInterface{
    @Override
    public void ParentMethod(){
        System.out.println("implementatyion of parent method");
    }
    @Override
    public void childMethod(){
        System.out.println("implementation of child method");
    }
} 
class Interface3{
    public static void main(String[] args) {
        DemoClass d= new DemoClass();
        d.ParentMethod();
        d.childMethod();
    }
}