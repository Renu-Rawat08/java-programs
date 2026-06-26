class Employee{
    double calculateSalary(){
        return 0;
    }
}
class Manager extends Employee{
    double salary = 60000;
    @Override
    double calculateSalary(){
        return salary;
    }
}
class Programmer extends Employee{
    double salary = 40000;
    @Override
    double calculateSalary(){
        return salary;
    }
}
class Poly4{
    public static void main(String[] args) {
        Employee e = new Manager();
        System.out.println("Manager Salary = " +e.calculateSalary());
        Employee e1 = new Programmer();
          System.out.println("Programmer Salary = " +e1.calculateSalary());
    }
}