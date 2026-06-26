public class Ascend{
    public static void main(String[] args) {
       int[] x={10,3,8,7};
       System.out.println(x[2]);
       change(x); 
        System.out.println(x[2]);
    }
    public static void change(int[] y){
        y[2]=55;
    }
}