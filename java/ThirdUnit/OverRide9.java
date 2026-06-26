class  Animal{
    void eat(){
        System.out.println("animal eat ");
    }
    }
class Dog extends   Animal{
    @Override
    public void eat(){
        System.out.println("Dog eat()");
    }
    public void eat(String type){
        System.out.println("Dog eat slowly "+ type);
    }
}
class OverRide9{
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
        d.eat("meat");
    }
}