public class Inheritance{
    public static void main(String[] args) {
        Engeeringstudent es=new Engeeringstudent ();
        es.markattencence();
        es.ATTendlab();

    }
}

class student{
     String Name;
     int age;
     private void markattencence(){
        System.out.println("ATTendece mark");
     }
}
class Engeeringstudent extends student{
    void ATTendlab(){
         System.out.println("ATTendece lab");
    }
}