 class Book {
    private String title;
    private String author;
    private int pages;

    public void read(){

     }

     public Book(String title, String author, int pages) {
         this.title = title;
         this.author = author;
         this.pages = pages;
     }

     @Override
     public String toString() {
         return "Book{" +
                 "title='" + title + '\'' +
                 ", author='" + author + '\'' +
                 ", pages=" + pages +
                 '}';
     }
 }
