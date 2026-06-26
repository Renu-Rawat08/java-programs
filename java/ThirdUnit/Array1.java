class Array1{
    public static void main(String[] args) {
        int arr[] = {23,5,67,20,3,79,3,70,2};
        System.out.println("Array = ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println("Ascending order Array = ");
        for (int i =0; i < arr.length-1; i++) {
            for(int j = 0;j< arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
            int temp = arr[j];
            arr[j]=arr[j+1];
             arr[j+1]=temp;
        }
    }
}
System.out.println("Array in ascending order:");
        for (int num : arr) {
            System.out.print(num + " ");
}
}
}