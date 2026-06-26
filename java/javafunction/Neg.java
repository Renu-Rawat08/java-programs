import java.util.Arrays;
public class Neg{
    public static  void main(String[]ars){
        int[] x={4,1,7,3,4};
        print(x);
        Arrays.sort(x);
        print(x);
    }
    public static void print(int[] x) {
       for (int i = 0; i < x.length; i++) {
           System.out.println(x[i]+" ");
       }
       System.out.println(" ");
    }
}