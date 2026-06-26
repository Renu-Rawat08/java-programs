import java.util.Scanner;

class Maxarray{
    public static void main(String[] args) {
        System.out.println("Welcome to finding the maximum :");
        int []arr = arrayutility.inputArray();  
        int max = Integer.MAX_VALUE;
        for(int num : arr){
            if(max<num){
                max = num;
            }
        }    
        System.out.println("Maximum number :  " + max);  
    }
}