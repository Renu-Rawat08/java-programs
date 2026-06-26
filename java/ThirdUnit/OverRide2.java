class Animal{
    void eat(){
        System.out.println("animal eat()");
    }
}
class Dog extends  Animal{
    @Override
    void eat(){
        super.eat();
        System.out.println("Dog eat()");
    }
}
class OverRide2{
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
    }
}