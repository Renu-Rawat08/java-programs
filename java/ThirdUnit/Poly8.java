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
class Cylinder extends Shape{
    double r = 5;
    double h = 10;
    void draw(){
        System.out.println("Shape = Cylinder");
    }
    @Override
    double calculateArea(){
        return 2*3.14*r*h+2*3.14*r*r;
    }
}
class Poly8{
    public static void main(String[] args) {
        Shape s1 = new Circle();
        s1.draw();
       System.out.println("Circle Area = " + s1.calculateArea());  
        Cylinder s2= new Cylinder();
        s2.draw();
        System.out.println("Surface area of cylinder = " + s2.calculateArea());
        
    }
}