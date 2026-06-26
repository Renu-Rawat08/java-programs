class Car{
    private String Name;
    public String getName(){
        return Name;
    }
    public void setName(String Name){
        this.Name = Name;
    }
}
class Encap2{
    public static void main(String[] args) {
        Car car = new Car();
        car.setName("Honda");
         System.out.println(car.getName());
    }
}