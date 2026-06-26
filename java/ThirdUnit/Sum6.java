class Sum6{
    void add(int a, int b ){
        System.out.println("Integer add  = "+ a+b);
    }
    void add(double a , double b){
        System.out.println("Double add = " + a+b);
    }
    void add(int a, int b, int c){
        System.out.println(" add = " + (a+b+c));
    }
    void add(String name){
        System.out.println("Name = " + name);
    }
    public static void main(String[] args) {
        Sum6 s = new Sum6();
        s.add(19,5);
        s.add(5,90);
        s.add(2, 4, 6);
        s.add("naina");
    }
}