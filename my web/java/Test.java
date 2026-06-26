class MyException extends Exception{

     MyException(String msg) {
    super(msg);
    }
}
class Test{
    public static void main(String[] args) {
        try {
            throw new 
            MyException("CUstomer Exepition");
        } catch (MyException e) {
        System.out.println(e.getMessage());
        }
    }
}