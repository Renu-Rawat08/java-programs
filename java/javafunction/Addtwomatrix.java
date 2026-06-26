import java.util.Scanner;
public class Addtwomatrix{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         System.out.println("enter rows: ");
       int row=sc.nextInt();
        System.out.println("enter column: ");
        int col=sc.nextInt();
         System.out.println("enter matrix first: ");
        int [][] matrix1= new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix1[i][j]=sc.nextInt();
            }
        }  
       System.out.println("enter matrix second: ");
       int [][] matrix2= new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix2[i][j]=sc.nextInt();
            }
        }  
            int [][] sum = new int[row][col];
            System.out.println("sum of matrix1 and matrix2 is : ");
           for (int i = 0; i < row; i++) {
             for (int j = 0; j < col; j++) {
               sum [i][j] =matrix1[i][j]+matrix2[i][j];
                System.out.print(sum[i][j]+" ");
            }
             System.out.println();
         }
            int [][] diff = new int[row][col];
            System.out.println("difference of matrix1 and matrix2 is : ");
           for (int i = 0; i < row; i++) {
             for (int j = 0; j < col; j++) {
               diff [i][j] =matrix1[i][j]-matrix2[i][j];
                System.out.print(diff[i][j]+" ");
            }
             System.out.println();
         }
         System.out.println("transpose matrix 1: ");
        int [][] trans= new int[row][col];
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
               trans[i][j]=matrix1[j][i];
               System.out.print(trans[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("multiply matrix 1 and matrix2: ");
        int [][] multi= new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                multi[i][j]=0;
                for (int k = 0; k < col; k++) {
               multi[i][j]+=matrix1[i][k]*matrix2[k][j];
                }
               System.out.print(multi[i][j]+" ");
            }
            System.out.println();
        }
    }    
} 