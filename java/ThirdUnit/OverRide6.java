class Animal{
    void eat(){
        System.out.println("animal eat food");
    }
}
class Dog extends  Animal{
    @Override
    void eat(){
        System.out.println("Dog eat meat");
    }
    void eat(String food) {
        System.out.println("Dog eats " + food);
    }
}
class OverRide6{
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
        d.eat("Biscuit");
    }
}