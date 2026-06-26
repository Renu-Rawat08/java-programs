interface  Animal{
    void eat();
    }
class Dog implements   Animal{
    @Override
    public void eat(){
        System.out.println("Dog eat()");
    }
    public void eat(String type){
        System.out.println("Dog eat slowly "+ type);
    }
}
class OverRide8{
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
        d.eat("meat");
    }
}