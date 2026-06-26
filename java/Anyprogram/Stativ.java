public class Stativ{
    public static void main(String[] args) {
        A a = new B();
        a.fun();
    }
}
class A {
    static void fun(){
        System.out.println("hello");
    }
}
class B extends A {
    static void fun() {
        System.out.println("bye");
    }
}