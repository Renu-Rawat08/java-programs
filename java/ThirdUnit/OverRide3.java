interface  Animal{
    void eat();
    }
class Dog implements   Animal{
    @Override
    public void eat(){
        System.out.println("Dog eat()");
    }
}
class OverRide3{
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
    }
}