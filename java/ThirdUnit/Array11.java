class Array11{
    public static void main(String[] args) {
        int arr[]={12,34,59,45,22};
         System.out.println("Array = ");
        for (int i = 0; i <= arr.length; i++) {
            System.out.print(i+" ");
        }
            System.out.println("");
            System.out.println("Sum of odd number");
            int sum =0;
            for (int i = 0; i < arr.length; i++) {
              if(i%2!=0)
              sum = sum + arr[i];  
            }
            System.out.print( sum + " ");
    }
}