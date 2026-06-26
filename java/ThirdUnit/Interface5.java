interface Shape{
    void draw();
    void area();
}
class Circle implements Shape{
    public void draw(){
        System.out.println("Drawing circle");
    }
    public void area(){
        double r = 5;
        System.out.println("Area of Circle is "+ (3.14*r*r));
    }
}
class Rectangle implements Shape{
    public void draw(){
        System.out.println("Drawing Rectangle");
    }
    public void area(){
        int l =10;
        int b=20;
        System.out.println("Area of Rectangle is " + (l*b));
    }
}
class Interface5{
    public static void main(String[] args) {
        Circle c =new Circle();
        c.draw();
        c.area();
        Rectangle r = new Rectangle();
        r.draw();
        r.area();
    }
}