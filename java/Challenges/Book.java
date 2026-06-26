

class Book{
        static int totalnoofbooks;

        String author;

        String title;

        String isbn;

        boolean isborrowed;

        static {
            totalnoofbooks = 0;
        }
        {
            totalnoofbooks++;
        }
        Book(String isbn, String title, String author){
            this.isbn = isbn;
            this.title = title;
            this.author = author;
        }

     Book(String isbn) {
        this(isbn, title:"unkonwn", author:"unknown");
    }
      static int gettotalnoofbooks(){
        return  totalnoofbooks;
      }  
      void borrowBook(){
        this.isborrowed = true;{
            if(isborrowed){
            System.out.println("Book is borrowed ");
        }
        else{
            this.isborrowed = true;
            System.out.println("enjoy the book");
        }
      }
}
        void returnBook(){
            if(isborrowed){
                this.isborrowed = false;
                System.out.println("hope you enjoyed , please leave a review");
            }
            else{
                System.out.println("this book alredy in the library");
            }
        }
            public static void main(String[] args){
                Book designofthings = new Book(isbn:"1", title:"degign",author:"author");
                Book myBook = new Book(isbn:"2");
                System.out.println(Book.gettotalnoofbooks());
                designofthings.borrowBook();
                myBook.borrowBook();
                designofthings.borrowBook();
                designofthings.returnBook();
                designofthings.returnBook();
            }
}