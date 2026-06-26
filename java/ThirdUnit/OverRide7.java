class Animal{
    protected void eat(){
        System.out.println("animal eat()");
    }
}
class Dog extends  Animal{
    @Override
    public void eat(){
        System.out.println("Dog eat()");
    }
}
class OverRide7{
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
    }
}