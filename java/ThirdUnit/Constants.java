public class Constants{
    public static final double PI = 3.14159;

    public static double calculateArea(double radius){
        return PI*radius*radius;
    }
    public static void main(String[] args) {
        double radius= 5.0;
        double area = calculateArea(radius);
        System.out.println("Radius = "+ radius);
        System.out.println("PI constant = "+ PI);
        System.out.println("Area of the circle = " + area);
    }
}