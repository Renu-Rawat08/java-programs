

public class Search{
    public static void main(String[] args) {
     int[] arr={12,3,27,34,4,34,23}; 
     int target=34;
     boolean flag=false; 
     for (int i = 0; i < arr.length; i++) {
         if(arr[i]== target){
            flag=true;
            break;
         }
     }
     if(flag==true) System.out.println("traget exist in array");
     else System.out.println("traget does not exist in array");
    }
}