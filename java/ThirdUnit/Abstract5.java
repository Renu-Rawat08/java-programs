abstract class Vechile{
    abstract void start();
    void fuel(){
        System.out.println("Vechile usues fuel");
    }
}
 abstract class Farari extends Vechile{
    abstract void stop();
        @Override
    void start(){
        System.out.println("Farari start with a key");
    }
}
class Bmw extends Farari{
    @Override
     void stop(){
        System.out.println("BMW stopped !");
    }
}
class Abstract5{
    public static void main(String[] args) {
        Bmw c =new Bmw();
        c.start();
        c.stop();
        c.fuel();
    }
}