class Animal{
    void sound(){
        System.out.println("Animal sound");
    }
}
class Dog extends Animal{
    @Override
    void sound(){
        System.out.println("Dog sounds");
    }
}
class Cat extends Animal{
    @Override
    void sound(){
        System.out.println("cat sounds");
    }
}

public class Poly1{
    public static void main(String[] args) {
        Animal a = new Dog();
        a.sound();
         Animal a1 = new Cat();
        a1.sound();
    }
}