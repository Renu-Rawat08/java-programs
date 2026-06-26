class Animal{
    String spieces = "generic animal";
    void eat(){
        System.out.println("this animal is eating");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("the dog is barking");
    }
}
class SingleInherit1{
    public static void main(String[] args) {
       Dog d = new Dog();
       d.eat();
       d.bark();
       System.out.println("spieces :"+d.spieces);
}
}