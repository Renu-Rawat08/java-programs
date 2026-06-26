class Counter1{
    static int  count = 0;

    public Counter1() {
        count++;
    }
    public static void main(String[] args) {
        Counter1 obj1 = new Counter1();
        Counter1 obj2 = new Counter1();
        Counter1 obj3 = new Counter1();
        Counter1 obj4 = new Counter1();
        System.out.println(" Total object created = " + Counter1.count );
    }
}