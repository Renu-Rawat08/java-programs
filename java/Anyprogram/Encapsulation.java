public class Encapsulation{
    public static void main(String[] args) {
        BankAccount ba = new  BankAccount();
        ba.deposit(500);
         ba.withdrawa(300);
        System.out.println(ba.getbalance()); 
    }
}
class BankAccount{
    private  double  balance;
    public void deposit(int amount){
        balance+=amount;
    }
    public void withdrawa(int amount){
        balance-=amount;
    }
    // getters
    public double getbalance(){
        return balance;
    }
}

class student{
   private  String Name;
   private  int rollno;
    private int age;
    private String college;

    public student( String Name , int rollno , int age, String college) {
        this.Name=Name;
        this.age=age;
        this.rollno=rollno;
        this.college=college;
    }
    public String getname(){
        return Name;
    }
    public void  setname(String Name){
        this.Name = Name;
    }
    public String getcollege(){
       return college;
    }
    public void  setcollege(String college){
        this.college = college;
    }
}