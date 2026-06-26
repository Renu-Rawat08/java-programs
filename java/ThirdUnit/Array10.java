class Array10{
    public static void main(String[] args) {
        int arr[]={23,45,67,34,78};
        System.out.println("Array = ");
        for (int i = 0; i <= arr.length; i++) {
            System.out.print(i+" ");
        
        } System.out.println();
        System.out.println("odd Array Elements = ");
        for (int i = 0; i <= arr.length; i++) {
            if(i%2==0)
            System.out.print(i +" ");
        }
    }
}