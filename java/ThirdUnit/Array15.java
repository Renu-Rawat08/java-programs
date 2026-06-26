import java.util.Scanner;

class Array15{
    public static void main(String[] args) {
        int []arr={10,20,30,40,50};
        int search;
        boolean found = false;

        Scanner sc = new Scanner(System.in);

        System.out.println("Array = {10,20,30,40,50}");
        System.out.println("Search Array Elements = ");
        search = sc.nextInt();

        for (int i = 0; i < arr.length; i++) {
           if(arr[i] == search){
            found = true;
            System.out.println("Element is found in the postion = " +( i+1));
            System.out.println("Element is found in the index = " + i);
            break;
           }
        }
        if(!found){
            System.out.println("Element not found");
        }
        sc.close();
    }
}