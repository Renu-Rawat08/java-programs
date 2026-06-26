class Sum{
    int Add(int a , int b){
        return a+b;
    }
    int Add(int a, int b,int c){
        return a+b+c;
    }
    void display(){
        System.out.println("Addtion = " + Add(2, 4));
        System.out.println("Addtion = " + Add(2, 4,9));
        
    }
}
class Const2{
    public static void main(String[] args) {
        Sum s =new Sum();
        s.display();
    }
}