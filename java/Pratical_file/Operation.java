
import java.util.Scanner;

class AddSub{
    int a , b ;

    void getData(int x ,int y){
        a = x ;
        b = y;
    }
    void add(){
        System.out.println("Addition : " +(a+b));
    }
    void sub(){
        System.out.println("subyragd : "+(a-b));
    }
    static  class MulDiv extends AddSub{
        void multiply(){
            System.out.println("multipu : "+(a*b));
        }
        void div(){
            if(b!=0){
            System.out.println("divis : "+(a/b)); 
            }else{
                 System.out.println("division not possible(divide by 0 ) ");
            }
        }
        class Operation{
            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                MulDiv obj = new MulDiv(); 
                System.out.println("enter two number : ");
                int x =sc.nextInt();
                 int y =sc.nextInt();
                 obj.getData(x,y);
                 obj.add();
                 obj.sub();
                 obj.multiply();
                 obj.div();
            }
        }
    }
}