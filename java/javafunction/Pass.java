public class Pass{
    public static void main(String[] args) {
        int []arr={4,3,2,3,23,3};
        print(arr);
        for (int i = 0; i < arr.length; i++) {
            if(i%2==1) arr[i]*=2;
            else arr[i]*= 10;
        }
        print(arr);
    }
    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]+" ");
        }
        System.out.println();
    }
}