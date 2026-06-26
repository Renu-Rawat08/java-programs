abstract class Animal{
    abstract void eat();
    void sleep(){
        System.out.println("Animal is sleeping");
    }
}
class Dog extends Animal{
    void eat(){
        System.out.println("Animal eat");
    }
}
class Abstract1{
    public static void main(String[] args) {
        Dog d= new Dog();
        d.eat();
        d.sleep();
    }
}