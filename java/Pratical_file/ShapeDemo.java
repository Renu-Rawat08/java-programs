
import java.util.Scanner;

class Shape{
    double getArea(){
        return 0;
    }
    double getPerimeter(){
        return 0;
    }
}
    class Circle extends Shape{
        double radius;

     Circle(double r) {
        radius = r;
    }
        double getArea(){
            return Math.PI*radius*radius;
        }
        double getPerimeter(){
            return 2*Math.PI*radius;
        }
    }
    class ShapeDemo{
        public static void main(String[] args) {
            Scanner sc =new Scanner(System.in);
            System.out.println("enter radius of circle  : ");
            double r = sc.nextDouble();
            Circle c = new Circle(r);
            System.out.println("Area of the circle : " + c.getArea());
            System.out.println("perimenter of the circle :" + c.getPerimeter());
        }
    }