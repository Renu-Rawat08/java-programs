class Shape{
    double getArea(){
        return 0;
    }
    double getPerimeter(){
        return 0;
    }
}
class Circle extends Shape{
    double radius = 5;
    @Override
     double getArea(){
        return 3.14*radius*radius;
    }
    double getPerimeter(){
        return 2*3.14*radius;
    }
}
class Rectangle extends Shape{
    double l = 20;
    double b = 30;
    @Override
    double getArea(){
        return l*b;
    }
     double getPerimeter(){
        return 2*(l+b);
    }
}
class Triangle extends Shape{
    double b = 5;
    double h = 10;
    @Override
    double getArea(){
        return b*h*0.5;
    }
}
class Poly5{
    public static void main(String[] args) {
        Shape s1 = new Circle();
       System.out.println("Circle Area = " + s1.getArea()); 
        System.out.println("Circle Perimeter = " + s1.getPerimeter()); 
        Shape s2= new Rectangle();
         System.out.println("Rectangle Area = " + s2.getArea()); 
          System.out.println("Circle Perimeter = " + s2.getPerimeter());
        Shape s3 = new Triangle();
        System.out.println("Triangle Area = " + s3.getArea());
    }
}