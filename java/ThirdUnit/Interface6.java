interface Calculate{
    static void add(int a , int b){
        System.out.println("addition "+ a +"+" + b + " is" + ( a+b));
    }
    static void multiply(int a , int b){
        System.out.println("Multiplication "+ a +"*" + b + " is" + (a*b));
    }
}
public class Interface6{
    public static void main(String[] args) {
        Calculate.add(4,4);
        Calculate.multiply(5,4);
    }
}