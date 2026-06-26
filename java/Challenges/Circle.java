
import java.util.Scanner;

class Circle{
    double radius;

    Circle(double radius){
        this.radius = radius;
    }
    double getCircumference(){
            return 2 * radius * Math.PI;
    }
    double getArea(){
            return  Math.PI * Math.pow(radius,2);
    }

    @Override
    public String toString(){
        return "circle Props : radius : " + radius
         +",Circumference :" + getCircumference()
         +", Area :"+ getArea();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("welcome to world of circle\n ");
        System.out.println("Plase enter your radius: ");
        double radius = sc.nextDouble();
        Circle circle = new Circle(radius);
        System.out.println(circle); 

    }
}