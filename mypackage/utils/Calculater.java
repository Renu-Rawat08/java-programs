package mypackage.utils;
import mypackage.geometry.Circle;
import mypackage.geometry.Rectangle;
class Calculater{
    public static void main(String[] args) {
        Circle cir = new Circle(5.5);
        Rectangle rect = new Rectangle(10,5);

        double cirArea = Math.PI * Math.pow(cir.radius,2);
        double rectArea = rect.length * rect.breadth;

        System.out.printf("area of circle is : %f , area of rectangleN is : %f",
        cirArea , rectArea);

    }
}
