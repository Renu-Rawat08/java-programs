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
class Puppy extends Dog{
    void weep(){
         System.out.println("the puppy is weeping");
    }
}
class MultiInherit2{
    public static void main(String[] args) {
       Puppy p = new Puppy();
       p.eat();
       p.bark();
       p.weep();
       System.out.println("spieces :"+p.spieces);
}
}