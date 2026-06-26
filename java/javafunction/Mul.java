import java.util.Arrays;
public class Mul{
    public static void main(String[] args) {
        int[] arr ={4,6,2,3};
        print(arr);
        Arrays.sort(arr);
        print(arr);
    }
    public static void print(String[] args) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]+" ");
        }
    }
}