import java.util.*;
class Temp12{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a degree in farenheit : ");
        double f = sc.nextDouble();
        double c = ((f-32)*5)/9;
        System.out.println(f + " degree fahrenheit is equal to "+ c + " in celsius");
    }
}