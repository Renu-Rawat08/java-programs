abstract class Animal{
    abstract void eat();
}
interface Pet{
    void sound();
}
class Dog extends Animal implements Pet{
    @Override
    void eat(){
        System.out.println("Dog eat()");
    }
    @Override
    public void sound(){
        System.out.println("Pet sound cute");
    }
}
class OverRide5{
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
        d.sound();
    }
}