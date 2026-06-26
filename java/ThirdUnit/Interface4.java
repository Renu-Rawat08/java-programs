interface Animal{
    void sound();

    default void sleep(){
        System.out.println("aniaml is sleeping");
    }
}
class Dog implements Animal{
    public void sound(){
        System.out.println("Dog barks");
    }
}
class Cat implements Animal{
    public void sound(){
        System.out.println("cat meow");
    }
    public void sleep(){
        System.out.println("cat sleep on the sofa");
    }
}
class Interface4{
    public static void main(String[] args) {
        Dog d = new Dog();
        Cat c = new Cat();
        d.sleep();
        d.sound();
        System.out.println();
        c.sound();
        c.sleep();
    }
}