import java.util.Scanner;
public class Twodarray{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         System.out.println("enter rows: ");
       int row=sc.nextInt();
        System.out.println("enter column: ");
        int col=sc.nextInt();
         System.out.println("enter matrix: ");
        int [][] number= new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                number[i][j]=sc.nextInt();
            }
        }  
        System.out.println("enter no.which found: ");
        int x=sc.nextInt();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if(number[i][j]==x) 
                System.out.println( "x number found at index("+i+","+j+")");
            }
        }  
        //   for (int i = 0; i < row; i++) {
            // for (int j = 0; j < col; j++) {
            //    System.out.print(number[i][j]+" ");
            // 
            // }
            // System.out.println();
        // }    
        } 
    }