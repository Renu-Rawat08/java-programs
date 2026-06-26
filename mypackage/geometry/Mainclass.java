public class Libraries{
    private String itemId;
    private title ;
    private String author;

    public void checkout(){
        System.out.println("checkout");
    }
    public void returnItem(){
        System.out.println("Returning the item");
    }

}

    public class DVD extends Libraries{
        private int durationInSec;
    }
     public class Magazine extends Libraries{
        private int issueNumber;
    }
     public class Book extends Libraries{
        private String ISBN;
    }
class Mainclass{

}