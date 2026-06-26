class Except{
    public static void main(String[] args) {
        try {
            int a = 10/0;
        } catch (ArithmeticException e) {
            System.out.println("Airthmetic exception it will not divde");
        } catch(Exception e){
            System.out.println("General Exception");
        }
        finally{
            System.out.println("vlock executed");
        }
    }
}