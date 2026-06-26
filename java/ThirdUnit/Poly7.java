class Shape{
    void draw(){
        System.out.println("Shape draw");
    }
    double calculateArea(){
       return 0;
    }
}
class Circle extends Shape{
    double radius = 5;
    @Override
    void  draw(){
       System.out.println("Shape = Circle");
    }
    @Override
     double calculateArea(){
        return 3.14*radius*radius;
    }
}
class Square extends Shape{
    double s = 20;
    @Override
    void  draw(){
       System.out.println("Shape = Rectangle");
    }
    @Override
    double calculateArea(){
        return s*s;
    }
}
class Triangle extends Shape{
    double b = 5;
    double h = 10;
    void draw(){
        System.out.println("Shape = Triangle");
    }
    @Override
    double calculateArea(){
        return b*h*0.5;
    }
}
class Poly7{
    public static void main(String[] args) {
        Shape s1 = new Circle();
        s1.draw();
       System.out.println("Circle Area = " + s1.calculateArea());  
        Shape s2= new Square();
        s2.draw();
        System.out.println("Square area = " + s2.calculateArea());
        Shape s3 = new Triangle();
        s3.draw();
        System.out.println("Triangle Area = " + s3.calculateArea());
    }
}