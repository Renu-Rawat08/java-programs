class Sum{
    void add(int a, int b){
        System.out.println("Add " + (a+b));
    }
    void add(double a , double b){
        System.out.println("Add " + (a+b));
    }
    public static void main(String[] args) {
        Sum s = new Sum();
        s.add(4,5);
        s.add(4.5,5);
    }
}