abstract class Vechile{
    abstract void start();
    void fuel(){
        System.out.println("Vechile usues fuel");
    }
    void stop(){
        System.out.println("Vechile stopped !");
    }
}
class Car extends Vechile{
    void start(){
        System.out.println("Car start with a key");
    }
    @Override
    void fuel(){
        System.out.println("Vechile usues petrol");
    }
}
class Abstract4{
    public static void main(String[] args) {
        Car c =new Car();
        c.start();
        c.fuel();
        c.stop();
    }
}