class Array4{
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("Array = ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        int  sum = 0;
        double avg;
        System.out.println("Sum of Array = " );
        for (int i = 0; i < arr.length; i++) {
         sum = sum+arr[i];  
        }
        avg = sum/arr.length;
         System.out.println(sum); 
         System.out.println("Average of array value : " + avg); 
}
}