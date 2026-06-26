class Animal{
    void move(){
        System.out.println("Animal sound");
    }
    void makeSound(){
        System.out.println("Aniaml sound");
    }
}
class Bird extends Animal{
    @Override 
    void move(){
        System.out.println(" birds fly");
    }
    @Override
    void makeSound(){
        System.out.println("Bird chrip");
    }
}
class Panthera extends Animal{
    @Override 
    void move(){
        System.out.println(" Panthera runs fast");
    }
    @Override
    void makeSound(){
        System.out.println("Panthera make Sound roars");
    }
}
class Poly6{
    public static void main(String[] args) {
        Animal a = new Bird();
        a.move();
        a.makeSound();
        Animal a1 = new Panthera();
        a1.move();
        a1.makeSound();
    }
}