import java.util.Scanner;
public class MultiplyMatrix{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         System.out.println("enter rows and column of Matrix 1 : ");
       int row1=sc.nextInt();
       int col1=sc.nextInt();
        System.out.println("enterenter rows and column of Matrix 2: ");
        int row2 = sc.nextInt();
        int col2=sc.nextInt();
         System.out.println("enter matrix first: ");
        int [][] matrix1= new int[row1][col1];
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col1; j++) {
                matrix1[i][j]=sc.nextInt();
            }
        }  
       System.out.println("enter matrix second: ");
       int [][] matrix2= new int[row2][col2];
        for (int i = 0; i < row2; i++) {
            for (int j = 0; j < col2; j++) {
                matrix2[i][j]=sc.nextInt();
            }
        }  
        System.out.println("multiply matrix 1 and matrix2: ");
        int [][] multi= new int[row1][col2];
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col2; j++) {
                multi[i][j]=0;
                for (int k = 0; k < col1; k++) {
               multi[i][j]+=matrix1[i][k]*matrix2[k][j];
                }
               System.out.print(multi[i][j]+" ");
            }
            System.out.println();
        }
    }    
} 