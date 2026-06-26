class Array16{
    public static void main(String[] args) {
        int arr[]={3,12,21,11};
        System.out.println("Array = {3,12,21,11}");
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            boolean isPrime = true;
            if(num<=1){
                isPrime=false;
            }else{
                for (int j = 2; j <= num/2; j++) {
                    if(num%j == 0){
                        isPrime = false;
                        break;
                    }
                }
            }
            if(isPrime){
                System.out.println(num + "- Prime");
            }else{
               System.out.println(num + "- Not Prime"); 
            }
        }
    }
}