class Array1{
    public static void main(String[] args) {
        int arr[] = {12,34,43,32,21};
        int max = arr[0];
        for(int  i = 0 ; i<arr.length ; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
         System.out.println("largest = " + max); 
    }
}