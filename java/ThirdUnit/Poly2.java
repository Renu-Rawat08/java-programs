class Vechile{
    void speedUp(){
        System.out.println("minimum Vechile speed is 60km/hr");
    }
}
class Car extends Vechile{
    @Override
    void speedUp(){
        System.out.println("Car speed 40km/hr");
    }
}
class Bicycle extends Vechile{
    @Override
    void speedUp(){
        System.out.println("Bicycle speed 60km/hr");
    }
}

class Poly2{
    public static void main(String[] args) {
        Vechile v = new Car();
         Vechile v1 = new Bicycle();
         v.speedUp();
         v1.speedUp();
    }
}