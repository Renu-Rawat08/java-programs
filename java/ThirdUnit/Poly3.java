class Shape{
    double calculateArea(){
        return 0;
    }
}
class Circle extends Shape{
    double radius = 5;
    @Override
     double calculateArea(){
        return 3.14*radius*radius;
    }
}
class Rectangle extends Shape{
    double l = 20;
    double b = 30;
    @Override
    double calculateArea(){
        return l*b;
    }
}
class Triangle extends Shape{
    double b = 5;
    double h = 10;
    @Override
    double calculateArea(){
        return b*h*0.5;
    }
}
class Poly3{
    public static void main(String[] args) {
        Shape s1 = new Circle();
       System.out.println("Circle Area = " + s1.calculateArea());  
        Shape s2= new Rectangle();
         System.out.println("Rectangle Area = " + s2.calculateArea()); 
        Shape s3 = new Triangle();
        System.out.println("Triangle Area = " + s3.calculateArea()); 

    }
}