interface Shape{
    void  area(){
        System.out.println("shape");
    }
}
class Circle implements Shape{
    double radius;

    public Circle(double radius) {
        radius = r;
    }
    
    void area(){
    double result = Math.PI*radius*radius;
    System.out.println("Circle area = " + result);
}
}
class Rectangle implements Shape{
    int lenght;
    int breadth;

    public Rectangle() {
        lenght = lenght;
        breadth = breadth;
    }
    
    void area(){
        double result = lenght*breadth;
System.out.println("Rectangle area = " + result);
}
}

class Interface{
    public static void main(String[] args) {
       Circle c= new Circle();
       c.area();
       Rectangle r = new Rectangle();
       r.area(); 
    }
}