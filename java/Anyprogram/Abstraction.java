public class Abstraction{
    public static void main(String[] args) {
        Car car = new FuelCar();
        car.Start();
        car.acccelarate();
        car.breake();
    }
}

abstract class  Car {
    void Start(){
        System.out.println("car started");
    }
   abstract  void acccelarate();
   abstract  void breake();
}

class FuelCar extends Car{
    @Override
    void acccelarate(){
        System.out.println("fuel car is accelarated");
    }
    @Override
    void breake(){
        System.out.println("fuel car is brake");
    }
}

class ElectricCar extends Car{
    @Override
 void acccelarate(){
    System.out.println("electriv car is accelarated");
    }
    @Override
    void breake(){
        System.out.println("electriv car is brake");
    }
}
