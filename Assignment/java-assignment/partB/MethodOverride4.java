class Animal{
    void sound(){
        System.out.println("Animals makes a sound");
    }
}
class Dog extends Animal{
    void sound(){
        System.out.println("dogs barks");
    }
}
class MethodOverride4{
    public static void main(String[] args) {
        Animal a = new Animal();
        a.sound();
        Dog d = new Dog();
        d.sound();
    }
}