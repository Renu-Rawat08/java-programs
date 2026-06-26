abstract class Animal{
    abstract void eat();
}
class Dog extends Animal{
    @Override
   public void eat(){
        System.out.println("Dog eat()");
    }
}
class OverRide4{
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
    }
}