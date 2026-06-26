class Sum5{
    int  add(int a, int b){
       return a+b;
    }
    double add(double a ,double b){
       return a+b;
    }
    public static void main(String[] args) {
        Sum5 s = new Sum5();
       System.out.println("Integer sum is " + s.add(3, 5));
       System.out.println("Double sum is " + s.add(3.5, 5.7));
    }
}