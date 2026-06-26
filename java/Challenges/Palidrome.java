import java.util.Scanner;

class Palidrome{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to checking Palidrome :");
        System.out.println("enter string to checking :");
        String str = sc.next();
        System.out.println("your string is " + 
                                 (isPalidrome(str)? " palidrome " 
                                                 : "not palidrome "));
        
    }
    public static boolean isPalidrome(String str) {
        if (str.length()<=1) {
            return true;
        }
        int lastpos = str.length()-1;
        if(str.charAt(0) != str.charAt(lastpos)){
            return false;
        }
        String newStr = str.substring(1,lastpos);
        return isPalidrome(newStr);
    }
}