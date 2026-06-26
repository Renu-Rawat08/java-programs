interface  Animal{
    void eat();
    void sound();

}
class Dog implements Animal{
    @Override
    public void sound(){
        System.out.println("the dogs says : woff woff");
    }
    @Override
    public void eat(){
        System.out.println("the dogs eat : bones of chickesns");
    }
} 
class Interface1{
    public static void main(String[] args) {
        Dog d= new Dog();
        d.eat();
        d.sound();
    }
}