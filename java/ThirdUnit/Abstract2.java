abstract class Animal{
    abstract void eat();
     abstract void run();
    void sleep(){
        System.out.println("Animal is sleeping");
    }
}
class Dog extends Animal{
    void eat(){
        System.out.println("Animal eat");
    }
    void run(){
        System.out.println("Animal is running");
    }
}

abstract class Shape{
    String name;

    public Shape(String name) {
        this.name = name;
    }
    abstract double  calculate();
    void dispaly(){
        System.out.println("Shape: "+ name);
    }

}
class Circle extends Shape{
    double radius;

     Circle(double radius) {
        super("Circle");
        this.radius = radius;
    }
    @Override
    double  calculate(){
        return Math.PI*radius*radius;
    }
}
class Abstract2{
    public static void main(String[] args) {
        Dog d= new Dog();
        d.eat();
        d.sleep();
        d.run();
        Circle c = new Circle(20.0);
        c.dispaly();
        System.out.println("Area:"+ c.calculate());
    }
}