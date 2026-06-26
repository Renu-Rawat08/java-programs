import java.util.Scanner;

class Sum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to finding occurence");
        int[] numarr = Array.utility.inputArray();

        int sums =0;
        for(int num : numarr){
            if (num<0) {
                continue;
            }
                sums+=sums;
        }   
        System.out.println("the positive number is: " + sums); 
        }
     
    }