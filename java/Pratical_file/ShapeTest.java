
import java.util.Scanner;

abstract class Shape{
    int a , b;
    abstract void printArea();
}
class Rectangle extends Shape{

    public Rectangle( int length , int breadth) {
        a = length;
        b= breadth;
    }
    void printArea(){
        System.out.println("Area of Rectangle = "+ (a*b));
    }
    
}
class Triangle extends Shape{

    public Triangle ( int base , int height) {
        a = base;
        b= height;
    }
    void printArea(){
        System.out.println("Area of Triangle = "+ (0.5*a*b));
    }
    
}
class Circle extends Shape{

    public Circle( int radius) {
        a = radius;
      
    }
    void printArea(){
        System.out.println("Area of circle = "+ (Math.PI*a*a));
    }
    
}

class ShapeTest{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter length and breadth of rectangle : ");
        int l = sc.nextInt();
        int br = sc.nextInt();
        Rectangle r = new Rectangle(l,br);
        r.printArea();

        System.out.println("enter base and height of triangle : ");
        int b = sc.nextInt();
        int h = sc.nextInt();
        Triangle  t  = new Triangle(b,h);
        t.printArea();
        System.out.println("enter radius of circle : ");
        int rad = sc.nextInt();
        Circle c  = new Circle(rad);
        c.printArea();
        }
} 