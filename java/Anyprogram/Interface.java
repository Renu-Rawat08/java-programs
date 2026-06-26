public class Interface{
    public static void main(String[] args) {
        Car car = new   ElectricCar();
        car.Start();
        car.acccelarate();
        car.breake();
    }
}
interface   Car {
    void Start();
    void acccelarate();
      void breake();
}

class FuelCar implements  Car{
    @Override
    public void Start(){
        System.out.println("fuel car is started");
    }
     @Override
    public void acccelarate(){
        System.out.println("fuel car is accelarated");
    }
     @Override
    public void breake(){
        System.out.println("fuel car is brake");
    }
}

class ElectricCar implements  Car{
     @Override
    public void Start(){
        System.out.println("fuel car is started");
    }
     @Override
public  void acccelarate(){
    System.out.println("electriv car is accelarated");
    }
    @Override
   public  void breake(){
        System.out.println("electriv car is brake");
    }
}
