class Parent{
   Parent(){
    System.out.println("Parent constructor called");
    }
 }
 class Student extends Parent {
   Student(){
     super();
      System.out.println("student constructor called");
   }
 }
class InheritanceCons{
    public static void main(String[] args) {
        Student s = new  Student();
    }
}