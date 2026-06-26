import java.util.Scanner;
public class Transpose{
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
        System.out.println("transpose matrix: ");
        int [][] trans= new int[row][col];
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
               trans[i][j]=number[j][i];
               System.out.print(trans[i][j]+" ");
            }
            System.out.println();
        }
    }
}  