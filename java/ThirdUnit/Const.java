class Rectangle{
    int lenght;
    int breadth;

    public Rectangle() {
    }

    public Rectangle(int lenght, int breadth) {
        this.lenght = lenght;
        this.breadth = breadth;
    }
    
    void display(){
        System.out.println("Area of the rectangle = "+ lenght*breadth);
    }
}

class Const{
    public static void main(String[] args) {
        Rectangle r =new Rectangle(12,23);
        r.display();
    }
}